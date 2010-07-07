var $j = jQuery.noConflict();

$j(document).ready(function() {
	$j('div.submit a').click(function() {
		$j(this).parents('form.telecomLogin').submit();
	});
});