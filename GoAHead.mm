<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1563261125829" ID="ID_553393869" MODIFIED="1563264259416" TEXT="JAVA">
<node CREATED="1563261271907" ID="ID_292334834" MODIFIED="1563261279085" POSITION="right" TEXT="&#xc2e4;&#xd589;">
<node CREATED="1563264196315" ID="ID_1904869286" MODIFIED="1563264315532" TEXT="&#xd504;&#xb85c;&#xc138;&#xc2a4;&#xb97c; &#xad00;&#xb9ac;&#xd558;&#xb294;  &#xc8fc;&#xccb4;&#xb294;  &#xbb34;&#xc5c7;&#xc77c;&#xae4c;"/>
</node>
<node CREATED="1563261451699" ID="ID_485923402" MODIFIED="1563261731938" POSITION="left" TEXT="GC">
<node CREATED="1563261459351" ID="ID_487047386" MODIFIED="1563261531689" TEXT="mark">
<arrowlink DESTINATION="ID_1319730105" ENDARROW="Default" ENDINCLINATION="52;0;" ID="Arrow_ID_1338652939" STARTARROW="None" STARTINCLINATION="52;0;"/>
</node>
<node CREATED="1563261463739" ID="ID_1692078256" MODIFIED="1563261523442" TEXT="sweep">
<arrowlink DESTINATION="ID_1477031713" ENDARROW="Default" ENDINCLINATION="48;0;" ID="Arrow_ID_712481781" STARTARROW="None" STARTINCLINATION="48;0;"/>
</node>
</node>
<node CREATED="1563261407868" ID="ID_1780973625" MODIFIED="1563261417349" POSITION="left" TEXT="Memory">
<node CREATED="1563261423394" ID="ID_1319730105" MODIFIED="1563261531688" TEXT="stack">
<linktarget COLOR="#b0b0b0" DESTINATION="ID_1319730105" ENDARROW="Default" ENDINCLINATION="52;0;" ID="Arrow_ID_1338652939" SOURCE="ID_487047386" STARTARROW="None" STARTINCLINATION="52;0;"/>
</node>
<node CREATED="1563261427132" ID="ID_1477031713" MODIFIED="1563261523442" TEXT="heap">
<linktarget COLOR="#b0b0b0" DESTINATION="ID_1477031713" ENDARROW="Default" ENDINCLINATION="48;0;" ID="Arrow_ID_712481781" SOURCE="ID_1692078256" STARTARROW="None" STARTINCLINATION="48;0;"/>
<node CREATED="1563261750864" ID="ID_1162636476" MODIFIED="1563261755409" TEXT="immutable"/>
</node>
</node>
<node CREATED="1563261438958" ID="ID_1283450466" MODIFIED="1563520120535" POSITION="right" TEXT="JVM">
<node CREATED="1563519008363" ID="ID_1601492322" LINK="https://yaboong.github.io/java/2018/06/09/java-garbage-collection/" MODIFIED="1563519270630" TEXT="1. &#xac1c;&#xbc1c;&#xc790; &#xbe14;&#xb85c;&#xadf8;"/>
<node CREATED="1563519029893" ID="ID_1715041611" LINK="https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html&#x3163;" MODIFIED="1563519304989" TEXT="2. oracle document"/>
<node CREATED="1563518991413" ID="ID_1519789068" LINK="https://www.udemy.com/java-memory-management/?ranMID=39197&amp;ranEAID=je6NUbpObpQ&amp;ranSiteID=je6NUbpObpQ-82nb1k9C5MkCiKz1O8xvxA&amp;LSNPUBID=je6NUbpObpQ" MODIFIED="1563519228632" TEXT="3. Udemy &#xac15;&#xc88c;"/>
<node CREATED="1563519338102" ID="ID_1767116878" MODIFIED="1563519346445" TEXT="&#xcd94;&#xac00; &#xacf5;&#xbd80; : metaspace"/>
<node CREATED="1563520010385" ID="ID_906947592" LINK="https://www.holaxprogramming.com/2013/07/20/java-jvm-gc/" MODIFIED="1563520030283" TEXT="1. &#xac1c;&#xbc1c;&#xc790; &#xbe14;&#xb85c;&#xadf8;">
<node CREATED="1563520125183" ID="ID_217926980" MODIFIED="1563520148654" TEXT="GC &#xc0ac;&#xc774;&#xc988; &#xc124;&#xc815; &#xc6d0;&#xb9ac;"/>
<node CREATED="1563520135542" ID="ID_267125004" MODIFIED="1563520144421" TEXT="GC &#xc0ac;&#xc774;&#xc988; &#xd29c;&#xb2dd; &#xbc29;&#xbc95;"/>
</node>
</node>
<node CREATED="1563264221820" ID="ID_654720323" MODIFIED="1563518899995" POSITION="right" TEXT="Thread">
<node CREATED="1563264229000" ID="ID_595412430" MODIFIED="1563264247222" TEXT="&#xc774;&#xb860;&#xc801;&#xc73c;&#xb85c;&#xb294; &#xc54c;&#xace0; &#xc788;&#xc73c;&#xb098;  &#xc2e4;&#xccb4;&#xb97c; &#xc9c1;&#xc811; &#xbcf4;&#xace0; &#xc2f6;&#xb2e4; &#xc804;&#xccb4;&#xc801;&#xc778; &#xadf8;&#xb9bc;&#xc744; &#xbaa8;&#xb974;&#xaca0;&#xb2e4;"/>
<node CREATED="1563518901924" ID="ID_1954922651" LINK="https://brunch.co.kr/@springboot/126" MODIFIED="1563519392998" TEXT="1. &#xac1c;&#xbc1c;&#xc790; &#xbe14;&#xb85c;&#xadf8;"/>
<node CREATED="1563518920260" ID="ID_397345981" MODIFIED="1563518985190" TEXT="2. &#xb77c;&#xc774;&#xbe0c; &#xc11c;&#xbe44;&#xc2a4; &#xc6b4;&#xc601; &#xc2dc; &#xd65c;&#xc6a9; &#xbc29;&#xbc95;">
<node CREATED="1563518937369" ID="ID_1011257225" MODIFIED="1563518943920" TEXT="&#xc815;&#xc0c1;&#xc774; &#xc544;&#xb2cc; &#xd504;&#xb85c;&#xc138;&#xc2a4;&#xb97c; &#xbd84;&#xc11d;"/>
<node CREATED="1563518947175" ID="ID_1793608836" MODIFIED="1563518968789" TEXT="ThreadDump &#xc0ac;&#xc6a9; &#xbc29;&#xbc95;"/>
</node>
</node>
<node CREATED="1563264260766" ID="ID_1012005886" MODIFIED="1563264262483" POSITION="left" TEXT="&#xb3d9;&#xae30;&#xd654;">
<node CREATED="1563264264197" ID="ID_1949235926" MODIFIED="1563264290550" TEXT="Thread&#xc640; &#xb9c8;&#xce5c;&#xac00;&#xc9c0;&#xb85c; &#xc2e4;&#xc81c;&#xb85c; &#xbcf4;&#xace0; &#xc2f6;&#xb2e4;  StrringBufffer&#xac00; &#xb3d9;&#xae30;&#xd654;&#xac00; &#xc9c0;&#xc6d0;&#xb41c;&#xb2e4;&#xb294;&#xac8c; &#xbb34;&#xc2a8; &#xc758;&#xbbf8; &#xc778;&#xc9c0; &#xbaa8;&#xb974;&#xaca0;&#xb530;"/>
</node>
</node>
</map>
