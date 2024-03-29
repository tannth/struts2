jQuery.fn.liveSearch = function(b) {
	var a = jQuery.extend({
		url : "http://www.google.com/",
		id : "live-search-results",
		duration : 400,
		typeDelay : 200,
		loadingClass : "loading",
		onSlideUp : function() {
		}
	}, b);
	var c = jQuery("#" + a.id);
	if (!c.length) {
		c = jQuery('<div id="' + a.id + '"></div>').appendTo("#search-bar")
				.hide().slideUp(0);
		jQuery(document.body).click(
				function(e) {
					var d = jQuery(e.target);
					if (!(d.is("#" + a.id) || d.parents("#" + a.id).length || d
							.is("input"))) {
						c.slideUp(a.duration, function() {
							a.onSlideUp()
						})
					}
				})
	}
	return this.each(function() {
		var d = jQuery(this).attr("autocomplete", "off");
		var e = parseInt(c.css("paddingLeft"), 10)
				+ parseInt(c.css("paddingRight"), 10)
				+ parseInt(c.css("borderLeftWidth"), 10)
				+ parseInt(c.css("borderRightWidth"), 10);
		d.focus(function() {
			if (this.value !== "") {
				if (c.html() == "") {
					this.lastValue = "";
					d.keyup()
				} else {
					c.slideDown(a.duration)
				}
			}
		}).keyup(function() {
			if (this.value != this.lastValue) {
				d.addClass(a.loadingClass);
				var f = this.value;
				if (this.timer) {
					clearTimeout(this.timer)
				}
				this.timer = setTimeout(function() {
					jQuery.get(a.url + f, function(i) {
						d.removeClass(a.loadingClass);
						if (i.length && f.length) {
							var h = d.offset();
							var g = {
								left : h.left,
								top : h.top,
								width : d.outerWidth(),
								height : d.outerHeight()
							};
							g.topNHeight = g.top + g.height;
							g.widthNShit = g.width - e;
							c.css({
								position : "absolute",
								width : g.widthNShit + "px"
							});
							c.html(i).slideDown(a.duration)
						} else {
							c.slideUp(a.duration, function() {
								a.onSlideUp()
							})
						}
					})
				}, a.typeDelay);
				this.lastValue = this.value
			}
		})
	})
};