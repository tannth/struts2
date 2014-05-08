<script type="text/javascript" src="js/tablesorter.js"></script>
<script type="text/javascript" src="js/tablesorter-pager.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				/* Table Sorter */
				$("#sort-table").tablesorter({
					widgets : [ 'zebra' ],
					headers : {
						// assign the secound column (we start counting zero) 
						0 : {
							// disable it by setting the property sorter to false 
							sorter : false
						},
						// assign the third column (we start counting zero) 
						6 : {
							// disable it by setting the property sorter to false 
							sorter : false
						}
					}
				})

				.tablesorterPager({
					container : $("#pager")
				});

				$(".header").append(
						'<span class="ui-icon ui-icon-carat-2-n-s"></span>');

			});

	/* Check all table rows */

	var checkflag = "false";
	function check(field) {
		if (checkflag == "false") {
			for (i = 0; i < field.length; i++) {
				field[i].checked = true;
			}
			checkflag = "true";
			return "check_all";
		} else {
			for (i = 0; i < field.length; i++) {
				field[i].checked = false;
			}
			checkflag = "false";
			return "check_none";
		}
	}
</script>

<div class="hastable">

	<%@taglib prefix="s" uri="/struts-tags"%>

	<div id="buttonsCustom">
		<div class="addbutton">

			<s:a cssClass="btn ui-state-default ui-corner-all"
				cssStyle="padding-left: 20px; width: 30px; height: 12px;">
				<span
					style="left: 0.2em; position: absolute; top: 2px; padding: 2px 20px 5px 20px;">Add</span>
			</s:a>
		</div>
	</div>


	<s:form name="myform" class="pager-form" method="post" theme="simple">
		<table id="sort-table">
			<thead>
				<tr>
					<th><input type="checkbox" value="check_none"
						onclick="this.value=check(this.form.list)" class="submit" /></th>
					<th>Last Name</th>

					<th>Email</th>
					<th>Address</th>
					<th>Phone</th>

					<th style="width: 128px">Options</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="listEmployee" status="listStatus">
					<tr>
						<td class="center"><input type="checkbox" value="1"
							name="list" class="checkbox" /></td>
						<td><s:property value="lastName" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="address" /></td>
						<td><s:property value="phone" /></td>
						<td><a id="modal_confirmation_link"
							class="btn_no_text btn ui-state-default ui-corner-all tooltip"
							title="Edit this example" href="#"> <span
								class="ui-icon ui-icon-wrench"></span>
						</a> <a class="btn_no_text btn ui-state-default ui-corner-all tooltip"
							title="Favourite this example" href="#"> <span
								class="ui-icon ui-icon-heart"></span>
						</a> <a class="btn_no_text btn ui-state-default ui-corner-all tooltip"
							title="Add to shopping card example" href="#"> <span
								class="ui-icon ui-icon-cart"></span>
						</a> <a class="btn_no_text btn ui-state-default ui-corner-all tooltip"
							title="Delete this example" href="#"> <span
								class="ui-icon ui-icon-circle-close"></span>
						</a></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		<div id="pager">
			<a class="btn_no_text btn ui-state-default ui-corner-all first"
				title="First Page" href="#"> <span
				class="ui-icon ui-icon-arrowthickstop-1-w"></span>
			</a> <a class="btn_no_text btn ui-state-default ui-corner-all prev"
				title="Previous Page" href="#"> <span
				class="ui-icon ui-icon-circle-arrow-w"></span>
			</a> <input type="text" class="pagedisplay" /> <a
				class="btn_no_text btn ui-state-default ui-corner-all next"
				title="Next Page" href="#"> <span
				class="ui-icon ui-icon-circle-arrow-e"></span>
			</a> <a class="btn_no_text btn ui-state-default ui-corner-all last"
				title="Last Page" href="#"> <span
				class="ui-icon ui-icon-arrowthickstop-1-e"></span>
			</a> <select class="pagesize">
				<option value="10" selected="selected">10 results</option>
				<option value="20">20 results</option>
				<option value="30">30 results</option>
				<option value="40">40 results</option>
			</select>
		</div>
	</s:form>
	<div class="clear"></div>
</div>


<div id="dialog" title="Employee Insert">
	<s:include
		value="/WEB-INF/pages/components/forms/employee/form_createemployee.jsp" />
</div>

<div id="modal_confirmation" title="An example modal title ?">

	<p>
		<span class="ui-icon ui-icon-alert"
			style="float: left; margin: 0 7px 20px 0;"></span>Ut enim ad minim
		veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex
		ea commodo consequat.
	</p>

</div>

