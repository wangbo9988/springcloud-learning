# 爬取拉勾网-互联网行业相关招聘信息
相关技术：
  1、利用requests库对相关信息进行提取
  2、通过控制爬取速率来防止触动反爬机制
  3、利用matplotlib、pandas进行数据可视化分析
  
使用指南：
  1、使用前需安装相关Python库：pandas、matplotlib、requests、xlwt（版本最新版即可）
  2、数据爬取：启动运行test1.py脚本即可爬取相关数据，爬取到的数据会以Excel文件存储到项目目录下的Excel_test.xls文件中
  3、数据可视化分析，启动相应脚本文件即可查看由Excel_test.xls文件中的数据分析得出的相关可视化图：
      展示学历要求占比图：启动运行Education.py
      展示各学历对应薪资相关分析数据：启动运行Education_pay.py
      展示工作经验要求相关分析数据：启动运行Job_Experience.py
      展示工作经验-平均月薪分布图：启动运行Job_Pay.py
      展示城市-平均月薪分布图：启动运行Job_City.py
      
未来计划：
  1、目前只实现了对互联网行业这一固定职位的数据爬取，后期预计实现可在脚本运行时自定义需要搜索的职位。
  2、预计以后会在爬取时实现职位筛选：如薪资待遇、工作地点等进行筛选。
      
  
