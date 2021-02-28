public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8413\ub19c\ube23\u71ae\ud36e\ubff1 {
    public void \u8413\ub19c\ube23\u71ae\ud36e\ubff1(\u36d3\u9033\u6b0d\u983f\u8d90.\u5fe1\u8258\u7bad\u960f\u392e\ua6bd p0, org.w3c.dom.Element p1) {
        var_5_100 : Element
        var_6_125 : NodeList
        var_7_14E : int
        var_8_174 : Element
        var_6_1E4 : Element
        var_7_1FC : String
        var_8_214 : String
        var_12_288 : GZIPInputStream
        var_13_295 : int
        var_14_2B3 : int
        var_15_312 : int
        var_16_37F : \u92ff\u93a2\ua068\ub83f\u7043\uf9c5
        var_9_3FE : IOException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1)
            putfield:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u6c56\u69d9\uc3e3\ua562\u88c5\u6cfe, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1, p0:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd)
            putfield:String(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u3c25\ud36e\ufcaf\u4d85\uc9f6\u9033, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1, invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(-27504), ldc:int(26984)))))
            putfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u071d\ub70c\u7bad\u4f52\ubff1\uc84e, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1, invokestatic:int(Integer::parseInt, invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(9216), ldc:int(9217))))))
            putfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8350\u6d99\u1833\ubefe\u3bc9\u7006, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1, invokestatic:int(Integer::parseInt, invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(-24558), ldc:int(-24560))))))
            putfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1, multianewarray:int[][][](int[][][].class, getfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u071d\ub70c\u7bad\u4f52\ubff1\uc84e, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), getfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8350\u6d99\u1833\ubefe\u3bc9\u7006, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), xor:int(ldc:int(16910), ldc:int(16909))))
            var_5_100 = checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, invokeinterface:NodeList(Element::getElementsByTagName, p1:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(18467), ldc:int(847)))), and:int(ldc:int(14043), ldc:int(-32768))))
            
            if (cmpne:boolean(var_5_100:Element, aconstnull:Element())) {
                var_6_125 = invokeinterface:NodeList(Element::getElementsByTagName, var_5_100:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(116), ldc:int(11660))))
                
                if (cmpne:boolean(var_6_125:NodeList, aconstnull:NodeList())) {
                    putfield:Properties(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u12b2\u2dcc\u7873\ubefe\ubff1\u392e, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1, initobject:Properties(Properties::<init>))
                    var_7_14E = and:int(ldc:int(-15370), ldc:int(15369))
                    
                    while (cmplt:boolean(var_7_14E:int, invokeinterface:int(NodeList::getLength, var_6_125:NodeList))) {
                        var_8_174 = checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, var_6_125:NodeList, var_7_14E:int))
                        invokevirtual:Object(Properties::setProperty, getfield:Properties(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u12b2\u2dcc\u7873\ubefe\ubff1\u392e, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), invokeinterface:String(Element::getAttribute, var_8_174:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(-6071), ldc:int(1958)))), invokeinterface:String(Element::getAttribute, var_8_174:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(1029), ldc:int(1024)))))
                        inc:int(var_7_14E, ldc:int(1))
                    }
                }
            }
            
            var_6_1E4 = checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, invokeinterface:NodeList(Element::getElementsByTagName, p1:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(25646), ldc:int(343)))), and:int(ldc:int(12715), ldc:int(-15340))))
            var_7_1FC = invokeinterface:String(Element::getAttribute, var_6_1E4:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(1591), ldc:int(10383))))
            var_8_214 = invokeinterface:String(Element::getAttribute, var_6_1E4:Element, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(633), ldc:int(3080))))
            
            if (logicaland:boolean(invokevirtual:boolean(String::equals, var_7_1FC:String, loadelement:String[expected:Object](getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(438), ldc:int(447)))), invokevirtual:boolean(String::equals, var_8_214:String, loadelement:String[expected:Object](getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(8718), ldc:int(22939)))))) {
                try {
                    var_12_288 = initobject:GZIPInputStream(GZIPInputStream::<init>, initobject:ByteArrayInputStream[expected:InputStream](ByteArrayInputStream::<init>, invokespecial:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u4cd9\u983f\u4f52\uff55\u946b\u12cb, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1, invokevirtual:char[](String::toCharArray, invokevirtual:String(String::trim, invokeinterface:String(Node::getNodeValue, invokeinterface:Node(Node::getFirstChild, var_6_1E4:Element[expected:Node])))))))
                    var_13_295 = and:int(ldc:int(-6164), ldc:int(6163))
                    
                    while (cmplt:boolean(var_13_295:int, getfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8350\u6d99\u1833\ubefe\u3bc9\u7006, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1))) {
                        var_14_2B3 = and:int(ldc:int(-11084), ldc:int(2889))
                        
                        while (cmplt:boolean(var_14_2B3:int, getfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u071d\ub70c\u7bad\u4f52\ubff1\uc84e, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1))) {
                            var_15_312 = or:int(or:int(or:int(or:int(and:int(ldc:int(2739), ldc:int(-6848)), invokevirtual:int(InflaterInputStream::read, var_12_288:GZIPInputStream[expected:InflaterInputStream])), shl:int(invokevirtual:int(InflaterInputStream::read, var_12_288:GZIPInputStream[expected:InflaterInputStream]), ldc:int(8))), shl:int(invokevirtual:int(InflaterInputStream::read, var_12_288:GZIPInputStream[expected:InflaterInputStream]), ldc:int(16))), shl:int(invokevirtual:int(InflaterInputStream::read, var_12_288:GZIPInputStream[expected:InflaterInputStream]), ldc:int(24)))
                            
                            if (cmpeq:boolean(var_15_312:int, ldc:int(0))) {
                                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), var_14_2B3:int), var_13_295:int), and:int(ldc:int(17692), ldc:int(-17725)), ldc:int(-1))
                                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), var_14_2B3:int), var_13_295:int), and:int(ldc:int(6161), ldc:int(421)), and:int(ldc:int(16469), ldc:int(-18518)))
                                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), var_14_2B3:int), var_13_295:int), xor:int(ldc:int(16389), ldc:int(16391)), and:int(ldc:int(-2821), ldc:int(2820)))
                            }
                            else {
                                var_16_37F = invokevirtual:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5(\u5fe1\u8258\u7bad\u960f\u392e\ua6bd::\u0800\u5f50\u99f7\u9af2\ud217\ucef1, p0:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd, var_15_312:int)
                                
                                if (cmpne:boolean(var_16_37F:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, aconstnull:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5())) {
                                    storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), var_14_2B3:int), var_13_295:int), and:int(ldc:int(25289), ldc:int(-27386)), getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u927d\u5db4\u7bad\u9255\u69d9\u4bc8, var_16_37F:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
                                    storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), var_14_2B3:int), var_13_295:int), xor:int(ldc:int(-28600), ldc:int(-28599)), sub:int(var_15_312:int, getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u7c6b\ubded\u40a9\u16f6\u8d98\u51fa, var_16_37F:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)))
                                }
                                
                                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), var_14_2B3:int), var_13_295:int), xor:int(ldc:int(96), ldc:int(98)), var_15_312:int)
                            }
                            
                            inc:int(var_14_2B3, ldc:int(1))
                        }
                        
                        inc:int(var_13_295, ldc:int(1))
                    }
                    
                    return:void()
                }
                catch (java.io.IOException var_9_3FE) {
                    invokestatic:void(\u983f\ubefe\ua562\u9a18\uae87\u34df::\ub102\u7e3f\u960f\u7873\u0c95\u4bc8, var_9_3FE:IOException[expected:Throwable])
                    athrow(initobject:\u1833\u4179\u9255\u8aa5\u7006\u8258(\u1833\u4179\u9255\u8aa5\u7006\u8258::<init>, loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(128), ldc:int(139)))))
                }
                
                athrow(initobject:\u1833\u4179\u9255\u8aa5\u7006\u8258(\u1833\u4179\u9255\u8aa5\u7006\u8258::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(782), ldc:int(124)))), var_7_1FC:String), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(8460), ldc:int(8449)))), var_8_214:String), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(18534), ldc:int(18536)))))))
            }
            
            athrow(initobject:\u1833\u4179\u9255\u8aa5\u7006\u8258(\u1833\u4179\u9255\u8aa5\u7006\u8258::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(782), ldc:int(124)))), var_7_1FC:String), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(8460), ldc:int(8449)))), var_8_214:String), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(18534), ldc:int(18536)))))))
        }
        
        goto(Label_0006)
    }
    
    public int \u88c5\u1833\uc246\uc9f6\u52d3\u8258(int p0, int p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(loadelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p0:int), p1:int), xor:int(ldc:int(1152), ldc:int(1154))))
        }
        
        goto(Label_0006)
    }
    
    public void \uc29a\u3e2a\u960f\u3d4b\uc229\u5f50(int p0, int p1, int p2) {
        var_4_61 : int
        var_6_76 : \u92ff\u93a2\ua068\ub83f\u7043\uf9c5
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_61 = and:int(ldc:int(1245900358), ldc:int(1583075098))
            
            if (cmpne:boolean(p2:int, ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(2138530322))
                var_6_76 = invokevirtual:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5(\u5fe1\u8258\u7bad\u960f\u392e\ua6bd::\u0800\u5f50\u99f7\u9af2\ud217\ucef1, getfield:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u6c56\u69d9\uc3e3\ua562\u88c5\u6cfe, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p2:int)
                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p0:int), p1:int), and:int(ldc:int(15411), ldc:int(-15924)), getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u927d\u5db4\u7bad\u9255\u69d9\u4bc8, var_6_76:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p0:int), p1:int), xor:int(ldc:int(-32767), ldc:int(-32768)), sub:int(p2:int, getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u7c6b\ubded\u40a9\u16f6\u8d98\u51fa, var_6_76:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)))
                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p0:int), p1:int), and:int(ldc:int(8194), ldc:int(1154)), p2:int)
            }
            else {
                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p0:int), p1:int), and:int(ldc:int(23185), ldc:int(-24218)), ldc:int(-1))
                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p0:int), p1:int), xor:int(ldc:int(-20479), ldc:int(-20480)), and:int(ldc:int(4755), ldc:int(-4828)))
                storeelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p0:int), p1:int), and:int(ldc:int(16962), ldc:int(4142)), and:int(ldc:int(2266), ldc:int(-27867)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\u34df\ucb79\u7d52\uceb8\u2dcc(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, int p7, int p8) {
        var_10_61 : int
        var_12_6A : int
        var_13_8C : \u92ff\u93a2\ua068\ub83f\u7043\uf9c5
        var_14_95 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_10_61 = and:int(ldc:int(-957420681), ldc:int(1148890621))
            var_12_6A = and:int(ldc:int(-5259), ldc:int(5258))
            
            loop {
                var_10_61 = and:int(var_10_61:int, ldc:int(1955299131))
                
                if (cmpge:boolean(var_12_6A:int, invokevirtual:int(\u5fe1\u8258\u7bad\u960f\u392e\ua6bd::\u0b8e\ud158\u92ff\uc87f\u3711\ud7e8, getfield:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u6c56\u69d9\uc3e3\ua562\u88c5\u6cfe, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1)))) {
                    looporswitchbreak()
                }
                
                var_13_8C = aconstnull:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5()
                var_14_95 = and:int(ldc:int(1223), ldc:int(-1224))
                
                while (cmplt:boolean(var_14_95:int, p4:int)) {
                    if (cmpge:boolean(add:int(p2:int, var_14_95:int), ldc:int(0))) {
                        if (cmpge:boolean(add:int(p3:int, p5:int), ldc:int(0))) {
                            if (cmplt:boolean(add:int(p2:int, var_14_95:int), getfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u071d\ub70c\u7bad\u4f52\ubff1\uc84e, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1))) {
                                if (cmplt:boolean(add:int(p3:int, p5:int), getfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8350\u6d99\u1833\ubefe\u3bc9\u7006, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1))) {
                                    if (cmpeq:boolean(loadelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), add:int(p2:int, var_14_95:int)), add:int(p3:int, p5:int)), and:int(ldc:int(8790), ldc:int(-8791))), var_12_6A:int)) {
                                        if (cmpeq:boolean(var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, aconstnull:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5())) {
                                            var_13_8C = invokevirtual:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5(\u5fe1\u8258\u7bad\u960f\u392e\ua6bd::\uc9f6\ub18d\u97e6\uc2bd\u0a06\u5bc4, getfield:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u6c56\u69d9\uc3e3\ua562\u88c5\u6cfe, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), var_12_6A:int)
                                            invokevirtual:void(\ua6bd\u9255\u624e\ub8be\uc910\u3e75::\uc9f6\u40a9\ucb79\u494c\ua562\uf995, getfield:\ua6bd\u9255\u624e\ub8be\uc910\u3e75(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u12b2\ucb79\u6d69\ud158\u120d\ucfaf, var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
                                        }
                                        
                                        invokevirtual:void(\ua6bd\u9255\u624e\ub8be\uc910\u3e75::\uae87\u5140\u3c25\u8640\u88c5\u67d0, getfield:\ua6bd\u9255\u624e\ub8be\uc910\u3e75(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u12b2\ucb79\u6d69\ud158\u120d\ucfaf, var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), add:int(p0:int, mul:int(var_14_95:int, p7:int)), sub:int(add:int(p1:int, mul:int(p5:int, p8:int)), sub:int(getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u873d\u494c\u1187\u759a\u4492\u392e, var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), p8:int)), invokevirtual:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ubcb0\ub70c\u7049\u6fb0\u6435\u9255, var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, loadelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), add:int(p2:int, var_14_95:int)), add:int(p3:int, p5:int)), xor:int(ldc:int(16419), ldc:int(16418)))), invokevirtual:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ubf56\u7330\u74b1\u62da\u6c52\u4c2b, var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, loadelement:int(loadelement:int[](loadelement:int[][](getfield:int[][][](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u385b\ub1b9\u8d90\ucb79\u3dd3\u156b, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), add:int(p2:int, var_14_95:int)), add:int(p3:int, p5:int)), xor:int(ldc:int(-32760), ldc:int(-32759)))))
                                    }
                                }
                            }
                        }
                    }
                    
                    inc:int(var_14_95, ldc:int(1))
                }
                
                if (p6:boolean) {
                    if (cmpne:boolean(var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, aconstnull:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5())) {
                        invokevirtual:void(\ua6bd\u9255\u624e\ub8be\uc910\u3e75::\uc2e8\ubded\u16f6\u3a62\u7006\u7006, getfield:\ua6bd\u9255\u624e\ub8be\uc910\u3e75(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u12b2\ucb79\u6d69\ud158\u120d\ucfaf, var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
                        var_13_8C = aconstnull:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5()
                    }
                    
                    invokevirtual:void(\u5fe1\u8258\u7bad\u960f\u392e\ua6bd::\u5140\u92ff\u516c\u960f\u8d90\u4cd9, getfield:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u6c56\u69d9\uc3e3\ua562\u88c5\u6cfe, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1), p5:int, add:int(p5:int, p3:int), getfield:int(\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u5140\u5db4\u8389\u7873\u9a18\u97e6, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1))
                }
                
                if (cmpne:boolean(var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, aconstnull:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5())) {
                    invokevirtual:void(\ua6bd\u9255\u624e\ub8be\uc910\u3e75::\uc2e8\ubded\u16f6\u3a62\u7006\u7006, getfield:\ua6bd\u9255\u624e\ub8be\uc910\u3e75(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u12b2\ucb79\u6d69\ud158\u120d\ucfaf, var_13_8C:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
                }
                
                inc:int(var_12_6A, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private byte[] \u4cd9\u983f\u4f52\uff55\u946b\u12cb(char[] p0) {
        var_2_5F : int
        var_4_62 : int
        var_5_6B : int
        var_2_2FE : int
        var_6_1AC : byte[]
        var_7_1B5 : int
        var_8_1BE : int
        var_9_1C7 : int
        var_10_1D0 : int
        stack_315_0 : int [generated]
        var_2_314 : int
        var_11_315 : int
        var_8_331 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_5F = and:int(ldc:int(1577263861), ldc:int(-547370164))
        var_4_62 = arraylength:int(p0:char[])
        var_5_6B = and:int(ldc:int(1129), ldc:int(-17514))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1084304194))
                goto(Label_0560)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(275470695))
                goto(Label_0487)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0364)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0276)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2121896009))
                
                if (cmplt:boolean(var_5_6B:int, arraylength:int(p0:char[]))) {
                    if (cmpgt:boolean(loadelement:char(p0:char[], var_5_6B:int), and:int(ldc:int(17151), ldc:int(9471)))) {
                        goto(Label_0487)
                    }
                    
                    if (cmpge:boolean(loadelement:byte(getstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e), loadelement:char(p0:char[], var_5_6B:int)), ldc:byte(0))) {
                        goto(Label_0560)
                    }
                    
                    goto(Label_0487)
                }
            }
            
            Label_0172:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1286838987))
                goto(Label_0560)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1783481066))
                goto(Label_0487)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0364)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(324402364))
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1615613091))
                var_5_6B = mul:int(div:int(var_4_62:int, and:int(ldc:int(20), ldc:int(17964))), and:int(ldc:int(39), ldc:int(17555)))
                
                if (cmpeq:boolean(rem:int(var_4_62:int, xor:int(ldc:int(6195), ldc:int(6199))), xor:int(ldc:int(1809), ldc:int(1810)))) {
                    inc:int(var_5_6B, ldc:int(2))
                }
            }
            
            Label_0276:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(499608731))
                goto(Label_0560)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0487)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-322665226))
                    goto(Label_0172)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-2001819454))
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(2133310582))
                
                if (cmpeq:boolean(rem:int(var_4_62:int, xor:int(ldc:int(-24031), ldc:int(-24027))), xor:int(ldc:int(16), ldc:int(18)))) {
                    inc:int(var_5_6B, ldc:int(1))
                }
            }
            
            Label_0364:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1353583070))
                goto(Label_0560)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0276)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-897901199))
                    goto(Label_0172)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                loopcontinue()
            }
            
            Label_0487:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(134217728)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0364)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1383714353))
                    goto(Label_0276)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0172)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-32041490))
                inc:int(var_4_62, ldc:int(-1))
            }
            
            Label_0560:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-512230545))
                goto(Label_0487)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-256063985))
                goto(Label_0364)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0276)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(64)), ldc:int(0))) {
                loopcontinue()
            }
            
            var_2_5F = and:int(var_2_5F:int, ldc:int(1049314915))
            inc:int(var_5_6B, ldc:int(1))
        }
        
        var_2_2FE = and:int(var_2_5F:int, ldc:int(-1620733981))
        var_6_1AC = newarray:byte[](byte.class, var_5_6B:int)
        var_7_1B5 = and:int(ldc:int(-13323), ldc:int(13322))
        var_8_1BE = and:int(ldc:int(-23342), ldc:int(21289))
        var_9_1C7 = and:int(ldc:int(29745), ldc:int(-31794))
        var_10_1D0 = and:int(ldc:int(13436), ldc:int(-13693))
        
        loop {
            if (cmplt:boolean(var_10_1D0:int, arraylength:int(p0:char[]))) {
                if (cmple:boolean(loadelement:char(p0:char[], var_10_1D0:int), xor:int(ldc:int(17219), ldc:int(17340)))) {
                    goto(Label_0737)
                }
                
                stack_315_0 = ldc:int(-1)
                goto(Label_0783)
            }
            
            Label_0665:
            
            if (cmpne:boolean(and:int(var_2_2FE:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0737)
            }
            
            if (cmpne:boolean(and:int(var_2_2FE:int, ldc:int(64)), ldc:int(0))) {
                var_2_2FE = and:int(var_2_2FE:int, ldc:int(-1085297563))
                
                if (cmpne:boolean(var_9_1C7:int, arraylength:int(var_6_1AC:byte[]))) {
                    athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), and:int(ldc:int(4623), ldc:int(18751)))), var_9_1C7:int), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(-31480), ldc:int(-31464)))), arraylength:int(var_6_1AC:byte[])), loadelement:String(getstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b), xor:int(ldc:int(-32746), ldc:int(-32761)))))))
                }
            }
            
            Label_0694:
            
            if (cmpne:boolean(and:int(var_2_2FE:int, ldc:int(268435456)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_2FE:int, ldc:int(134217728)), ldc:int(0))) {
                    return:byte[](var_6_1AC:byte[])
                }
                
                goto(Label_0665)
            }
            
            Label_0737:
            
            if (cmpne:boolean(and:int(var_2_2FE:int, ldc:int(524288)), ldc:int(0))) {
                var_2_2FE = and:int(var_2_2FE:int, ldc:int(1300482493))
                goto(Label_0694)
            }
            
            if (cmpeq:boolean(and:int(var_2_2FE:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0665)
            }
            
            var_2_2FE = and:int(var_2_2FE:int, ldc:int(2130962806))
            stack_315_0 = loadelement:byte[expected:int](getstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e), loadelement:char[expected:int](p0:char[], var_10_1D0:int))
            Label_0783:
            var_2_314 = and:int(var_2_2FE:int, ldc:int(2136566351))
            var_11_315 = stack_315_0:int
            
            if (cmpge:boolean(var_11_315:int, ldc:int(0))) {
                var_8_331 = shl:int(var_8_1BE:int, ldc:int(6))
                inc:int(var_7_1B5, ldc:int(6))
                var_8_1BE = or:int(var_8_331:int, var_11_315:int)
                
                if (cmpge:boolean(var_7_1B5:int, ldc:int(8))) {
                    inc:int(var_7_1B5, ldc:int(-8))
                    storeelement:byte(var_6_1AC:byte[], postincrement:int(1, var_9_1C7:int), i2b:byte(and:int(shr:int(var_8_1BE:int, var_7_1B5:int), xor:int(ldc:int(-32560), ldc:int(-32721)))))
                }
            }
            
            var_2_2FE = and:int(var_2_314:int, ldc:int(-1631486760))
            inc:int(var_10_1D0, ldc:int(1))
        }
    }
    
    static {
        var_0_405 : int
        expr_6E : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_133_0 : byte[] [generated]
        stack_382_0 : byte[] [generated]
        stack_418_0 : byte[] [generated]
        stack_46C_0 : byte[] [generated]
        stack_4DB_0 : byte[] [generated]
        var_5_35B : int
        var_3_360 : byte[]
        var_6_361 : int
        var_0_39C : int
        expr_382 : byte [generated]
        stack_3CB_2 : byte [generated]
        stack_39F_0 : byte [generated]
        expr_418 : byte [generated]
        expr_9D : int [generated]
        var_2_D3 : byte[]
        expr_D7 : int [generated]
        var_3_45A : byte[]
        var_6_45B : int
        expr_106 : int [generated]
        var_0_519 : int
        var_3_13F : String
        stack_33D_0 : String[] [generated]
        expr_151 : String[] [generated]
        var_4_351 : int
        var_4_536 : int
        var_4_56F : int
        var_4_5BF : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_405 = and:int(ldc:int(-113300431), ldc:int(-221249969))
        expr_6E = arraylength:int(stack_9B_0 = stack_9D_0 = stack_D3_0 = stack_D5_0 = stack_104_0 = stack_106_0 = stack_133_0 = stack_382_0 = stack_418_0 = stack_46C_0 = stack_4DB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("J0Js1v4FLwdXCgcv/R3Lv9UzLwADBv4MCr7L9UExAf4MyxX6/7C5aUw42MMBCCwC9QHWBwMoAAz/7sIB/gQQEvpg+zOR+du/djA+iQPNH+9H7wMCvALoBhAQOu0FAc7/AjT9vTG9AeA0OAH/IeoF2AD+Awb+zP/+OxQPxewIM9DtbTcQv88A4yn9Hcv/0jf3Aw34/e8MBBUF/voD/AbuFuoK8Q1yBP6HEvQH8Q31CfcX6QHrBhD9/ewc/QHpAwQQ/f1cfByTjfFsBQyR82G7uz8=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_5_35B = expr_6E:int
        var_3_360 = newarray:byte[](byte.class, expr_6E:int)
        var_6_361 = expr_6E:int
        Label_0867:
        
        while (cmpeq:boolean(and:int(var_0_405:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_405:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1009)
            }
            
            var_0_39C = and:int(var_0_405:int, ldc:int(-74492859))
            var_6_361 = add:int(var_6_361:int, ldc:int(-1))
            expr_382 = stack_3CB_2 = loadelement(stack_382_0, var_6_361)
            
            if (cmplt:boolean(add:int(add:int(var_6_361:int, ldc:int(3)), neg:int(var_5_35B:int)), ldc:int(0))) {
                stack_3CB_2 = stack_39F_0 = add:byte(expr_382:byte, loadelement:byte(var_3_360:byte[], add:int(var_6_361:int, ldc:int(3))))
                goto(Label_0943)
            }
            
            Label_0911:
            
            if (cmpeq:boolean(and:int(var_0_39C:int, ldc:int(8)), ldc:int(0))) {
                var_0_39C = and:int(var_0_39C:int, ldc:int(-19987139))
                stack_3CB_2 = stack_39F_0 = add:byte(expr_382:byte, ldc:byte(3))
            }
            
            Label_0943:
            
            if (cmpne:boolean(and:int(var_0_39C:int, ldc:int(512)), ldc:int(0))) {
                var_0_39C = and:int(var_0_39C:int, ldc:int(1204157722))
                goto(Label_0911)
            }
            
            var_0_405 = and:int(var_0_39C:int, ldc:int(1401918487))
            storeelement:byte(var_3_360:byte[], var_6_361:int, stack_3CB_2:byte)
            
            if (cmpne:boolean(var_6_361:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D3_0 = stack_D5_0 = stack_104_0 = stack_106_0 = stack_133_0 = stack_382_0 = stack_418_0 = stack_46C_0 = stack_4DB_0 = var_3_360:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1203)
        Label_1009:
        
        while (cmpne:boolean(and:int(var_0_405:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_405:int, ldc:int(64)), ldc:int(0))) {
                var_0_405 = and:int(var_0_405:int, ldc:int(-1436712799))
                goto(Label_0867)
            }
            
            var_0_405 = and:int(var_0_405:int, ldc:int(1453317469))
            var_6_361 = add:int(var_6_361:int, ldc:int(-1))
            expr_418 = loadelement:byte(stack_418_0:byte[], var_6_361:int)
            storeelement:byte(var_3_360:byte[], var_6_361:int, xor:int(or:int(and:int(shl:int(expr_418:byte, xor:int(ldc:int(10290), ldc:int(10294))), ldc:int(-16)), and:int(shr:int(expr_418:byte[expected:int], and:int(ldc:int(388), ldc:int(28245))), ldc:int(15))), ldc:int(4)))
            
            if (cmpne:boolean(var_6_361:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D3_0 = stack_D5_0 = stack_104_0 = stack_106_0 = stack_133_0 = stack_382_0 = stack_418_0 = stack_46C_0 = stack_4DB_0 = var_3_360:byte[]
            goto(Label_0162)
        }
        
        Label_1203:
        
        while (cmpne:boolean(and:int(var_0_405:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_405:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0867)
            }
            
            var_0_405 = and:int(var_0_405:int, ldc:int(-948976353))
            var_6_361 = add:int(var_6_361:int, ldc:int(-1))
            storeelement:byte(var_3_360:byte[], var_6_361:int, add:byte(loadelement:byte(stack_4DB_0:byte[], var_6_361:int), ldc:byte(118)))
            
            if (cmpne:boolean(var_6_361:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D3_0 = stack_D5_0 = stack_104_0 = stack_106_0 = stack_133_0 = stack_382_0 = stack_418_0 = stack_46C_0 = stack_4DB_0 = var_3_360:byte[]
            goto(Label_0267)
        }
        
        var_0_405 = and:int(var_0_405:int, ldc:int(1579285029))
        goto(Label_1009)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_405:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_405:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_405:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_405 = and:int(var_0_405:int, ldc:int(-1329707534))
        }
        else {
            var_0_405 = and:int(var_0_405:int, ldc:int(1117762653))
            expr_9D = arraylength:int(stack_9D_0:byte[])
            
            if (cmpne:boolean(expr_9D:int, ldc:int(0))) {
                var_5_35B = expr_9D:int
                var_3_360 = newarray:byte[](byte.class, expr_9D:int)
                var_6_361 = expr_9D:int
                goto(Label_1009)
            }
        }
        
        Label_0162:
        
        if (cmpeq:boolean(and:int(var_0_405:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_405:int, ldc:int(262144)), ldc:int(0))) {
            var_0_405 = and:int(var_0_405:int, ldc:int(463624371))
        }
        else {
            if (cmpne:boolean(and:int(var_0_405:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_405 = and:int(var_0_405:int, ldc:int(1732217900))
                goto(Label_0115)
            }
            
            var_0_405 = and:int(var_0_405:int, ldc:int(-25215267))
            var_2_D3 = stack_D3_0:byte[]
            expr_D7 = add:int(arraylength:int(stack_D5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_3_45A = newarray:byte[](byte.class, expr_D7:int)
                var_6_45B = expr_D7:int
                
                loop {
                    var_0_405 = and:int(var_0_405:int, ldc:int(1229956709))
                    var_6_45B = add:int(var_6_45B:int, ldc:int(-1))
                    storeelement:byte(var_3_45A:byte[], var_6_45B:int, add:int(shl:int(loadelement:byte(stack_46C_0:byte[], var_6_45B:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_D3:byte[], add:int(var_6_45B:int, xor:int(ldc:int(4100), ldc:int(4101)))), ldc:int(4)), and:int(ldc:int(10591), ldc:int(559)))))
                    
                    if (cmpne:boolean(var_6_45B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_D3_0 = stack_D5_0 = stack_104_0 = stack_106_0 = stack_133_0 = stack_382_0 = stack_418_0 = stack_46C_0 = stack_4DB_0 = var_3_45A:byte[]
            }
        }
        
        Label_0220:
        
        if (cmpne:boolean(and:int(var_0_405:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_405:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_0_405:int, ldc:int(524288)), ldc:int(0))) {
                var_0_405 = and:int(var_0_405:int, ldc:int(1917711174))
                goto(Label_0115)
            }
            
            var_0_405 = and:int(var_0_405:int, ldc:int(1549743427))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_5_35B = expr_106:int
                var_3_360 = newarray:byte[](byte.class, expr_106:int)
                var_6_361 = expr_106:int
                goto(Label_1203)
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_0_405:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_405:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_405 = and:int(var_0_405:int, ldc:int(-625726334))
            goto(Label_0162)
        }
        
        if (cmpeq:boolean(and:int(var_0_405:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_519 = and:int(var_0_405:int, ldc:int(-426803997))
            var_3_13F = initobject:String(String::<init>, stack_133_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_33D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4498), ldc:int(8223)))
            expr_151 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(6280), ldc:int(6298)))
            storeelement:String(expr_151:String[], and:int(ldc:int(1070), ldc:int(26638)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(-32008), ldc:int(26887)), xor:int(ldc:int(9244), ldc:int(9217))))
            storeelement:String(expr_151:String[], and:int(ldc:int(8214), ldc:int(4752)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(4151), ldc:int(4138)), xor:int(ldc:int(1125), ldc:int(1101))))
            storeelement:String(expr_151:String[], and:int(ldc:int(6677), ldc:int(1489)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(650), ldc:int(674)), xor:int(ldc:int(177), ldc:int(152))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(28673), ldc:int(28684)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(105), ldc:int(11323)), xor:int(ldc:int(4125), ldc:int(4151))))
            storeelement:String(expr_151:String[], and:int(ldc:int(111), ldc:int(25231)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(24634), ldc:int(4142)), and:int(ldc:int(9813), ldc:int(2395))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(24595), ldc:int(24600)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(28753), ldc:int(2135)), xor:int(ldc:int(-29660), ldc:int(-29621))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(4652), ldc:int(4640)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(14703), ldc:int(111)), xor:int(ldc:int(24953), ldc:int(25072))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(21026), ldc:int(21035)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(14475), ldc:int(1161)), xor:int(ldc:int(8294), ldc:int(8425))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(10248), ldc:int(10240)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(9826), ldc:int(9965)), xor:int(ldc:int(-32241), ldc:int(-32107))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(515), ldc:int(517)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(12475), ldc:int(2266)), and:int(ldc:int(5278), ldc:int(8638))))
            storeelement:String(expr_151:String[], and:int(ldc:int(775), ldc:int(5311)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(4709), ldc:int(4859)), xor:int(ldc:int(1154), ldc:int(1060))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(523), ldc:int(513)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(8358), ldc:int(4863)), and:int(ldc:int(25002), ldc:int(4330))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(16592), ldc:int(16594)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(5399), ldc:int(5565)), and:int(ldc:int(17596), ldc:int(2737))))
            storeelement:String(expr_151:String[], and:int(ldc:int(19856), ldc:int(-32669)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(5108), ldc:int(17584)), and:int(ldc:int(180), ldc:int(10999))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(10277), ldc:int(10278)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(180), ldc:int(18620)), and:int(ldc:int(190), ldc:int(20926))))
            storeelement:String(expr_151:String[], and:int(ldc:int(4111), ldc:int(17204)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(-32651), ldc:int(-32565)), xor:int(ldc:int(1194), ldc:int(1132))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(16389), ldc:int(16384)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(1990), ldc:int(214)), and:int(ldc:int(459), ldc:int(27339))))
            storeelement:String(expr_151:String[], and:int(ldc:int(6209), ldc:int(929)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(9163), ldc:int(4315)), and:int(ldc:int(982), ldc:int(25808))))
            putstatic:String[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u8709\u385b\u12b2\u4c04\u4e72\u3d4b, expr_151:String[])
            putstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e, newarray:byte[](byte.class, xor:int(ldc:int(186), ldc:int(442))))
            var_4_351 = and:int(ldc:int(12402), ldc:int(-12403))
            
            while (cmplt:boolean(var_4_351:int, and:int(ldc:int(8473), ldc:int(6950)))) {
                storeelement:byte(getstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e), var_4_351:int, ldc:byte(-1))
                inc:int(var_4_351, ldc:int(1))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_519:int, ldc:int(256)), ldc:int(0))) {
                    var_0_519 = and:int(var_0_519:int, ldc:int(1983897132))
                    goto(Label_1429)
                }
                
                if (cmpne:boolean(and:int(var_0_519:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_519 = and:int(var_0_519:int, ldc:int(-1736825993))
                }
                else {
                    var_0_519 = and:int(var_0_519:int, ldc:int(-251716183))
                    var_4_536 = ldc:int(65)
                    
                    while (cmple:boolean(var_4_536:int, ldc:int(90))) {
                        storeelement:byte(getstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e), var_4_536:int, i2b:byte(sub:int(var_4_536:int, ldc:int(65))))
                        inc:int(var_4_536, ldc:int(1))
                    }
                }
                
                Label_1367:
                
                if (cmpeq:boolean(and:int(var_0_519:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_519:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_519 = and:int(var_0_519:int, ldc:int(-764432855))
                    var_4_56F = ldc:int(97)
                    
                    while (cmple:boolean(var_4_56F:int, ldc:int(122))) {
                        storeelement:byte(getstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e), var_4_56F:int, i2b:byte(sub:int(add:int(ldc:int(26), var_4_56F:int), ldc:int(97))))
                        inc:int(var_4_56F, ldc:int(1))
                    }
                }
                
                Label_1429:
                
                if (cmpeq:boolean(and:int(var_0_519:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_519 = and:int(var_0_519:int, ldc:int(-619890493))
                    goto(Label_1367)
                }
                
                if (cmpeq:boolean(and:int(var_0_519:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_519 = and:int(var_0_519:int, ldc:int(1468733396))
            }
            
            var_4_5BF = ldc:int(48)
            
            while (cmple:boolean(var_4_5BF:int, ldc:int(57))) {
                storeelement:byte(getstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e), var_4_5BF:int, i2b:byte(sub:int(add:int(ldc:int(52), var_4_5BF:int), ldc:int(48))))
                inc:int(var_4_5BF, ldc:int(1))
            }
            
            storeelement:byte(getstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e), ldc:int(43), ldc:byte(62))
            storeelement:byte(getstatic:byte[](\u8413\ub19c\ube23\u71ae\ud36e\ubff1::\u416d\u6c52\u494c\u3c25\u6d99\u839e), ldc:int(47), ldc:byte(63))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \uceb8\u8d90\u3d64\u3dd3\u392e\u6b5f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67A : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_685 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_67A = and:int(ldc:int(76995686), ldc:int(1404550895))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8413\ub19c\ube23\u71ae\ud36e\ubff1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(262144)), ldc:int(0))) {
            var_3_67A = and:int(var_3_67A:int, ldc:int(503111031))
            var_5_80 = and:int(ldc:int(-9672), ldc:int(9670))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18721), ldc:int(18720)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_67A:int, ldc:int(-1901797393))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(16929), ldc:int(16928)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(8516), ldc:int(8517)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_67A = and:int(var_3_D0:int, ldc:int(1421645492))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(5349), ldc:int(257)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(785481698))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1452142691))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-340804547))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0546)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-727424669))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-5573346))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-374231728))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-799427133))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1125854170))
                        var_11_E1 = and:int(ldc:int(13362), ldc:int(-13363))
                        goto(Label_1535)
                    }
                    
                    Label_0546:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(2008209627))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1052783170))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1073455284))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-645073498))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(2023709910))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1521284807))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1012998171))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0688:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1169667110))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1548291210))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(21897546))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(963373719))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1099816734))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(448566647))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1321281878))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(396262335))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1833358800))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1807275123))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1584024474))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(4449), ldc:int(17545))
                                goto(Label_1139)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1473049059))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1784688043))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(152361699))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1575625162))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1287104795))
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(836758117))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(972259695))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-324094660))
                        var_11_E1 = and:int(ldc:int(-2511), ldc:int(2510))
                    }
                    
                    Label_1139:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1252597752))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1502518540))
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(157572877))
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(586462526))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1161203217))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(828854751))
                            goto(Label_1139)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-880117847))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1148803563))
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1473214063))
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1201988361))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1859114805))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-2043580370))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1631936248))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1469593845))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67A = and:int(var_3_67A:int, ldc:int(229095348))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_685 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(153873203))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-2102438770))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1319128233))
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1005365689))
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1544569097))
                        var_17_685 = add:int(var_16_10F:int, xor:int(ldc:int(329), ldc:int(328)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67A = and:int(var_3_67A:int, ldc:int(-1212688964))
                
                if (cmple:boolean(var_5_80 = var_17_685:int, sub:int(var_6_87:int, xor:int(ldc:int(-15856), ldc:int(-15855))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
