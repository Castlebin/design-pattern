# plantuml

Mac 上使用 plantuml，需要先安装 graphviz：
    
    brew install graphviz

可能会提示什么 freetype 、webp 等 安装失败

哪个失败单独先安装哪个，然后再重试(一堆依赖，麻烦)

    brew install freetype 
    brew install webp 
    # 批量一下吧
    brew install netpbm gts pkg-config libpthread-stubs xorgproto libxau libxdmcp libxcb libx11 libxext libxrender lzo pixman cairo gdk-pixbuf fribidi gobject-introspection graphite2 icu4c harfbuzz pango librsvg m4 libtool
    
    
    