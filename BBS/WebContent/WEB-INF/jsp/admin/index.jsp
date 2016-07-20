<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>BBS论坛管理平台</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/res/ext/resources/css/ext-all.css" />
<!-- GC -->
<!-- LIBS -->
<script type="text/javascript" src="${pageContext.request.contextPath }/res/ext/adapter/ext/ext-base.js">
	
</script>
<!-- ENDLIBS -->
<script type="text/javascript" src="${pageContext.request.contextPath }/res/ext/ext-all.js">
	
</script>

<script type="text/javascript" src="${pageContext.request.contextPath }/res/ext/ext-lang-zh_CN.js">
	
</script>
<style type="text/css">
html, body {
	font: normal 12px verdana;
	margin: 0;
	padding: 0;
	border: 0 none;
	overflow: hidden;
	height: 100%;
}

.empty .x-panel-body {
	padding-top: 0;
	text-align: center;
	font-style: italic;
	color: gray;
	font-size: 11px;
}

.x-btn button {
	font-size: 14px;
}

.x-panel-header {
	font-size: 14px;
}
</style>

<script type="text/javascript">
	Ext.onReady( function() {
		//Ext.Msg.alert('ext','welcome you!');
		var addPanel = function(btn, event) {
			var n;
			n = tabPanel.getComponent(btn.id);
			if(n) {
				tabPanel.setActiveTab(n);
				return;
			}
			n = tabPanel.add( {
				id : btn.id,
				title : btn.text,
				html : '<iframe width=100% height=100% src=' + btn.id + ' />',
				closable : 'true'
			});
			tabPanel.setActiveTab(n);
		}

		var item1 = new Ext.Panel( {
			title : '版块管理',
			//html : '&lt;empty panel&gt;',
			cls : 'empty',
			items : [ 
				new Ext.Button({
					id : 'Category-list',
					text : '版块列表',
					width : '100%',
					listeners : {
						click : addPanel
					}

				}),

				new Ext.Button({
					id : 'Category-addInput',
					text : '添加版块',
					width : '100%',
					listeners : {
						click : addPanel
					}

				})

				]
		});

		var item2 = new Ext.Panel( {
			title : '用户管理',
			html : '&lt;empty panel&gt;',
			cls : 'empty'
		});

		var item3 = new Ext.Panel( {
			title : '帖子管理',
			html : '&lt;empty panel&gt;',
			cls : 'empty'
		});

		var item4 = new Ext.Panel( {
			title : '宣传栏管理',
			html : '&lt;empty panel&gt;',
			cls : 'empty'
		});

		var item5 = new Ext.Panel( {
			title : '权限管理',
			html : '&lt;empty panel&gt;',
			cls : 'empty'
		});

		var accordion = new Ext.Panel( {
			region : 'west',
			margins : '5 0 5 5',
			split : true,
			width : 210,
			layout : 'accordion',
			items : [ item1, item2, item3, item4, item5 ]
		});

		var tabPanel = new Ext.TabPanel( {
			region : 'center',
			enableTabScroll : true,
			deferredRender : false,
			activeTab : 0,
			items : [ {
				title : 'index',
				html : '<h1>欢迎使用BBS论坛管理平台！</h1><br/><h1>本平台由E-Kunt开发。</h1>'
			} ]
		});

		var viewport = new Ext.Viewport( {
			layout : 'border',
			items : [ accordion, tabPanel ]
		});

	});
</script>
</head>
<body>

	<!-- EXAMPLES -->
</body>
</html>
