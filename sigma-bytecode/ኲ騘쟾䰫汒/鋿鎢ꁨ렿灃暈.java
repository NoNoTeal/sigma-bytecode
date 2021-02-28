public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u92ff\u93a2\ua068\ub83f\u7043\uf9c5 {
    public void \u92ff\u93a2\ua068\ub83f\u7043\uf9c5(\u36d3\u9033\u6b0d\u983f\u8d90.\u5fe1\u8258\u7bad\u960f\u392e\ua6bd p0, org.w3c.dom.Element p1, boolean p2) {
        var_6_F2 : String
        var_7_17D : Exception
        var_7_1DE : String
        var_8_1F5 : String
        var_9_259 : String
        var_10_2A1 : String
        var_12_300 : Element
        var_13_318 : String
        var_14_31F : \u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330
        var_15_337 : String
        var_16_3DA : NodeList
        var_17_3E7 : int
        var_18_40D : Element
        var_19_435 : int
        var_20_442 : Properties
        var_22_481 : NodeList
        var_23_48E : int
        var_24_4B4 : Element
        
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
        invokespecial:Object(Object::<init>, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)
        putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ub18d\u8709\u2dcc\u3bc9\ube23\u647c, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, ldc:int(2147483647))
        putfield:HashMap(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u183a\uc229\u0c95\u8d98\u9af2, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, initobject:HashMap(HashMap<K, V>::<init>))
        putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u6ec6\u0b8e\uc2bd\u69d9\u8350\u1833, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, and:int(ldc:int(-14531), ldc:int(14530)))
        putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ub102\u74b1\u446c\uc29a\u873d\u8d90, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, and:int(ldc:int(-2179), ldc:int(2178)))
        putfield:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u9937\u5245\u8753\ucef1\u8d90\u836c, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, p0:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd)
        putfield:String(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u71f1\uc84e\u88c5\u759a\u071d\ua6bd, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(26496), ldc:int(-26601)))))
        putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u7c6b\ubded\u40a9\u16f6\u8d98\u51fa, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokestatic:int(Integer::parseInt, invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(24641), ldc:int(24640))))))
        var_6_F2 = invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(17168), ldc:int(17170))))
        
        if (logicaland:boolean(cmpne:boolean(var_6_F2:String, aconstnull:String()), logicalnot:boolean(invokevirtual:boolean(String::equals, var_6_F2:String, loadelement:String[expected:Object](getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(12355), ldc:int(3075))))))) {
            try {
                p1 = invokeinterface:Element(Document::getDocumentElement, invokevirtual:Document(DocumentBuilder::parse, invokevirtual:DocumentBuilder(DocumentBuilderFactory::newDocumentBuilder, invokestatic:DocumentBuilderFactory(DocumentBuilderFactory::newInstance)), invokestatic:InputStream(\u3dd3\u76bc\u4f4a\u494c\ubded\u600f::\u97b7\u72f1\u7e3f\u7006\u8258\uc2bd, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u5fe1\u8258\u7bad\u960f\u392e\ua6bd::\u51b2\ub83f\u5bc4\ub113\u67d0\u3d64, p0:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd)), loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(4497), ldc:int(4501)))), var_6_F2:String)))))
            }
            catch (java.lang.Exception var_7_17D) {
                invokestatic:void(\u983f\ubefe\ua562\u9a18\uae87\u34df::\ub102\u7e3f\u960f\u7873\u0c95\u4bc8, var_7_17D:Exception[expected:Throwable])
                athrow(initobject:\u1833\u4179\u9255\u8aa5\u7006\u8258(\u1833\u4179\u9255\u8aa5\u7006\u8258::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(23), ldc:int(8205)))), getfield:String(\u5fe1\u8258\u7bad\u960f\u392e\ua6bd::\u718f\uc3e3\u1833\u88c5\u9033\u647c, getfield:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u9937\u5245\u8753\ucef1\u8d90\u836c, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))), loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(10124), ldc:int(71)))), var_6_F2:String))))
            }
        }
        
        var_7_1DE = invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(16406), ldc:int(4775))))
        var_8_1F5 = invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(1031), ldc:int(11015))))
        
        if (logicalor:boolean(cmpeq:boolean(invokevirtual:int(String::length, var_7_1DE:String), ldc:int(0)), cmpeq:boolean(invokevirtual:int(String::length, var_8_1F5:String), ldc:int(0)))) {
            athrow(initobject:\u1833\u4179\u9255\u8aa5\u7006\u8258(\u1833\u4179\u9255\u8aa5\u7006\u8258::<init>, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(20), ldc:int(28)))))
        }
        
        putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u527a\u965f\u62da\uc238\uc29a\u6b5f, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokestatic:int(Integer::parseInt, var_7_1DE:String))
        putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u873d\u494c\u1187\u759a\u4492\u392e, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokestatic:int(Integer::parseInt, var_8_1F5:String))
        var_9_259 = invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(16652), ldc:int(16645))))
        
        if (logicaland:boolean(cmpne:boolean(var_9_259:String, aconstnull:String()), logicalnot:boolean(invokevirtual:boolean(String::equals, var_9_259:String, loadelement:String[expected:Object](getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(4171), ldc:int(515))))))) {
            putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u6ec6\u0b8e\uc2bd\u69d9\u8350\u1833, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokestatic:int(Integer::parseInt, var_9_259:String))
        }
        
        var_10_2A1 = invokeinterface:String(Element::getAttribute, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(25605), ldc:int(25615))))
        
        if (logicaland:boolean(cmpne:boolean(var_10_2A1:String, aconstnull:String()), logicalnot:boolean(invokevirtual:boolean(String::equals, var_10_2A1:String, loadelement:String[expected:Object](getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(-8064), ldc:int(-8061))))))) {
            putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ub102\u74b1\u446c\uc29a\u873d\u8d90, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokestatic:int(Integer::parseInt, var_10_2A1:String))
        }
        
        var_12_300 = checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, invokeinterface:NodeList(Element::getElementsByTagName, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(264), ldc:int(259)))), and:int(ldc:int(-4647), ldc:int(4646))))
        var_13_318 = invokeinterface:String(Element::getAttribute, var_12_300:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(3073), ldc:int(3075))))
        var_14_31F = aconstnull:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330()
        var_15_337 = invokeinterface:String(Element::getAttribute, var_12_300:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(2079), ldc:int(2067))))
        
        if (logicaland:boolean(cmpne:boolean(var_15_337:String, aconstnull:String()), cmpgt:boolean(invokevirtual:int(String::length, var_15_337:String), ldc:int(0)))) {
            var_14_31F = initobject:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::<init>, invokestatic:int(Integer::parseInt, var_15_337:String, ldc:int(16)))
        }
        
        if (p2:boolean) {
            invokevirtual:void(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ubded\u7043\u5654\uf94d\ub8be\u385b, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, initobject:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u5fe1\u8258\u7bad\u960f\u392e\ua6bd::\u51b2\ub83f\u5bc4\ub113\u67d0\u3d64, p0:\u5fe1\u8258\u7bad\u960f\u392e\ua6bd)), loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(2100), ldc:int(8718)))), var_13_318:String)), and:int[expected:boolean](ldc:int(20742), ldc:int(-20743)), xor:int(ldc:int(-31935), ldc:int(-31933)), var_14_31F:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330))
        }
        
        var_16_3DA = invokeinterface:NodeList(Element::getElementsByTagName, p1:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(2351), ldc:int(2338))))
        var_17_3E7 = and:int(ldc:int(-25812), ldc:int(25811))
        
        while (cmplt:boolean(var_17_3E7:int, invokeinterface:int(NodeList::getLength, var_16_3DA:NodeList))) {
            var_18_40D = checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, var_16_3DA:NodeList, var_17_3E7:int))
            var_19_435 = add:int(invokestatic:int(Integer::parseInt, invokeinterface:String(Element::getAttribute, var_18_40D:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(8462), ldc:int(1070))))), getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u7c6b\ubded\u40a9\u16f6\u8d98\u51fa, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
            var_20_442 = initobject:Properties(Properties::<init>)
            var_22_481 = invokeinterface:NodeList(Element::getElementsByTagName, checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, invokeinterface:NodeList(Element::getElementsByTagName, var_18_40D:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(1134), ldc:int(1121)))), and:int(ldc:int(-11192), ldc:int(8247)))), loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(2130), ldc:int(17944))))
            var_23_48E = and:int(ldc:int(30080), ldc:int(-30085))
            
            while (cmplt:boolean(var_23_48E:int, invokeinterface:int(NodeList::getLength, var_22_481:NodeList))) {
                var_24_4B4 = checkcast:Element(org.w3c.dom.Element.class, invokeinterface:Node[expected:Element](NodeList::item, var_22_481:NodeList, var_23_48E:int))
                invokevirtual:Object(Properties::setProperty, var_20_442:Properties, invokeinterface:String(Element::getAttribute, var_24_4B4:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), and:int(ldc:int(-17601), ldc:int(17600)))), invokeinterface:String(Element::getAttribute, var_24_4B4:Element, loadelement:String(getstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179), xor:int(ldc:int(26633), ldc:int(26648)))))
                inc:int(var_23_48E, ldc:int(1))
            }
            
            invokevirtual:Properties(HashMap<Integer, Properties>::put, getfield:HashMap(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u183a\uc229\u0c95\u8d98\u9af2, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), initobject:Integer(Integer::<init>, var_19_435:int), var_20_442:Properties)
            inc:int(var_17_3E7, ldc:int(1))
        }
    }
    
    public int \uafe7\u946b\u93a2\u927d\u64ab\u52d3() {
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
            return:int(getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u527a\u965f\u62da\uc238\uc29a\u6b5f, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
        }
        
        goto(Label_0006)
    }
    
    public int \ub70c\u6cfe\u7bad\u3bc9\u4c04\u9af2() {
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
            return:int(getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u873d\u494c\u1187\u759a\u4492\u392e, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
        }
        
        goto(Label_0006)
    }
    
    public int \u3bc9\uff55\uae87\u93a2\u5f50\u6198() {
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
            return:int(getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u6ec6\u0b8e\uc2bd\u69d9\u8350\u1833, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
        }
        
        goto(Label_0006)
    }
    
    public int \ua3b4\u8350\u071d\uf995\u7ce1\u6c52() {
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
            return:int(getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ub102\u74b1\u446c\uc29a\u873d\u8d90, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5))
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u7043\u5654\uf94d\ub8be\u385b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c p0) {
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
            putfield:\ua6bd\u9255\u624e\ub8be\uc910\u3e75(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u12b2\ucb79\u6d69\ud158\u120d\ucfaf, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, initobject:\ua6bd\u9255\u624e\ub8be\uc910\u3e75(\ua6bd\u9255\u624e\ub8be\uc910\u3e75::<init>, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c, getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u527a\u965f\u62da\uc238\uc29a\u6b5f, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u873d\u494c\u1187\u759a\u4492\u392e, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u6ec6\u0b8e\uc2bd\u69d9\u8350\u1833, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ub102\u74b1\u446c\uc29a\u873d\u8d90, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)))
            putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u4f52\u494c\u8350\u6b0d\u36d3\u40a9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokevirtual:int(\ua6bd\u9255\u624e\ub8be\uc910\u3e75::\u8308\u6b5f\uf9c5\uceb8\uc4d2\u5245, getfield:\ua6bd\u9255\u624e\ub8be\uc910\u3e75(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u12b2\ucb79\u6d69\ud158\u120d\ucfaf, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)))
            putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ud36e\u7ce1\ub18d\uae87\u8640\u67e9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokevirtual:int(\ua6bd\u9255\u624e\ub8be\uc910\u3e75::\u12cb\u839e\u8c8a\u3bd6\u385b\u7d52, getfield:\ua6bd\u9255\u624e\ub8be\uc910\u3e75(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u12b2\ucb79\u6d69\ud158\u120d\ucfaf, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)))
            
            if (cmple:boolean(getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u4f52\u494c\u8350\u6b0d\u36d3\u40a9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), ldc:int(0))) {
                putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u4f52\u494c\u8350\u6b0d\u36d3\u40a9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, xor:int(ldc:int(25604), ldc:int(25605)))
            }
            
            if (cmple:boolean(getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ud36e\u7ce1\ub18d\uae87\u8640\u67e9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), ldc:int(0))) {
                putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ud36e\u7ce1\ub18d\uae87\u8640\u67e9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, xor:int(ldc:int(16392), ldc:int(16393)))
            }
            
            putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ub18d\u8709\u2dcc\u3bc9\ube23\u647c, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, sub:int(add:int(mul:int(getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u4f52\u494c\u8350\u6b0d\u36d3\u40a9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ud36e\u7ce1\ub18d\uae87\u8640\u67e9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)), getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u7c6b\ubded\u40a9\u16f6\u8d98\u51fa, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)), and:int(ldc:int(147), ldc:int(5221))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Properties \u93a2\u5f50\ud12e\uf9c5\u16f6\u873d(int p0) {
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
            return:Properties(checkcast:Properties(java.util.Properties.class, invokevirtual:Properties(HashMap<K, Properties>::get, getfield:HashMap(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u183a\uc229\u0c95\u8d98\u9af2, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5), initobject:Integer[expected:Object](Integer::<init>, p0:int))))
        }
        
        goto(Label_0006)
    }
    
    public int \ubcb0\ub70c\u7049\u6fb0\u6435\u9255(int p0) {
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
            return:int(rem:int(p0:int, getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u4f52\u494c\u8350\u6b0d\u36d3\u40a9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)))
        }
        
        goto(Label_0006)
    }
    
    public int \ubf56\u7330\u74b1\u62da\u6c52\u4c2b(int p0) {
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
            return:int(div:int(p0:int, getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u4f52\u494c\u8350\u6b0d\u36d3\u40a9, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)))
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\u3bd6\ubf56\u97b7\u3dd3\ua6bd(int p0) {
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
            putfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ub18d\u8709\u2dcc\u3bc9\ube23\u647c, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\u7af6\u8709\ub6ab\u7af6\u446c(int p0) {
        var_2_61 : int
        stack_9A_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(188313782), ldc:int(-484322985))
            
            if (logicaland:boolean(cmpge:boolean(p0:int, getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u7c6b\ubded\u40a9\u16f6\u8d98\u51fa, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)), cmple:boolean(p0:int, getfield:int(\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\ub18d\u8709\u2dcc\u3bc9\ube23\u647c, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5)))) {
                stack_9A_0 = and:int(ldc:int(8453), ldc:int(4105))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1020973161))
                stack_9A_0 = and:int(ldc:int(19568), ldc:int(-19569))
            }
            
            return:boolean(stack_9A_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_36E : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_392_0 : byte[] [generated]
        stack_3E6_0 : byte[] [generated]
        stack_455_0 : byte[] [generated]
        stack_4AC_0 : byte[] [generated]
        var_4_359 : int
        var_3_35E : byte[]
        var_5_35F : int
        expr_392 : byte [generated]
        var_0_4A2 : int
        expr_4AC : byte [generated]
        stack_4DC_2 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_3D4 : byte[]
        var_5_3D5 : int
        expr_D9 : int [generated]
        expr_112 : int [generated]
        var_3_154 : String
        stack_352_0 : String[] [generated]
        expr_166 : String[] [generated]
        
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
        var_0_36E = and:int(ldc:int(728520233), ldc:int(-74868792))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_392_0 = stack_3E6_0 = stack_455_0 = stack_4AC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("0+Lu7aH4y/3lMu7l5Vf4mOPp5uXl5VE5mvqtKOetlDDn4Dnhl6f4k/Lk4eXq5e06kPb4rOjmkOrm5fboUSlW6OUx6zOZp+zok+InolKghOkgLDCI+ungVyKcguDh9eTTrDz67pDglePl+Djp5+Jd5fqe9z/nkfDr7+q2iuaSlyH7VffwWvE8lJri5eCg9Cnm4CZS9efq9yqQl1Lo5/PsNpD2uKuY4OErPuHmlZeT5efh6uvmkfHm5eH2muTj6efx6+Dl5+ef8uvr6/OY5+f37/Dv4Juf5+GY5OXh6Pzg4+D8muLg7pDm5ejw+eTl4uqQ4vjt4Pru6v/ol/T4nHdEQX5FVQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_359 = expr_6E:int
        var_3_35E = newarray:byte[](byte.class, expr_6E:int)
        var_5_35F = expr_6E:int
        Label_0865:
        
        while (cmpeq:boolean(and:int(var_0_36E:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_36E = and:int(var_0_36E:int, ldc:int(-302695314))
                goto(Label_1069)
            }
            
            var_0_36E = and:int(var_0_36E:int, ldc:int(-83255313))
            var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
            expr_392 = loadelement:byte(stack_392_0:byte[], var_5_35F:int)
            storeelement:byte(var_3_35E:byte[], var_5_35F:int, xor:int(or:int(and:int(shl:int(expr_392:byte, xor:int(ldc:int(20546), ldc:int(20550))), ldc:int(-16)), and:int(shr:int(expr_392:byte[expected:int], and:int(ldc:int(4318), ldc:int(16900))), ldc:int(15))), ldc:int(53)))
            
            if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_392_0 = stack_3E6_0 = stack_455_0 = stack_4AC_0 = var_3_35E:byte[]
            goto(Label_0115)
        }
        
        var_0_36E = and:int(var_0_36E:int, ldc:int(-1989342141))
        goto(Label_1156)
        Label_1069:
        
        while (cmpeq:boolean(and:int(var_0_36E:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0865)
            }
            
            var_0_36E = and:int(var_0_36E:int, ldc:int(1931204329))
            var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
            storeelement:byte(var_3_35E:byte[], var_5_35F:int, add:byte(loadelement:byte(stack_455_0:byte[], var_5_35F:int), ldc:byte(74)))
            
            if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_392_0 = stack_3E6_0 = stack_455_0 = stack_4AC_0 = var_3_35E:byte[]
            goto(Label_0222)
        }
        
        var_0_36E = and:int(var_0_36E:int, ldc:int(-1329348935))
        Label_1156:
        
        while (cmpeq:boolean(and:int(var_0_36E:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_36E:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_36E = and:int(var_0_36E:int, ldc:int(9002746))
                goto(Label_0865)
            }
            
            var_0_4A2 = and:int(var_0_36E:int, ldc:int(-1423133366))
            var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
            expr_4AC = loadelement:byte(stack_4AC_0:byte[], var_5_35F:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_35F:int, ldc:int(5)), neg:int(var_4_359:int)), ldc:int(0))) {
                var_0_4A2 = and:int(var_0_4A2:int, ldc:int(2013240989))
                stack_4DC_2 = add:byte(expr_4AC:byte, ldc:byte(5))
            }
            else {
                stack_4DC_2 = add:byte(expr_4AC:byte, loadelement:byte(var_3_35E:byte[], add:int(var_5_35F:int, ldc:int(5))))
            }
            
            var_0_36E = and:int(var_0_4A2:int, ldc:int(-1411573765))
            storeelement:byte(var_3_35E:byte[], var_5_35F:int, stack_4DC_2:byte)
            
            if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_392_0 = stack_3E6_0 = stack_455_0 = stack_4AC_0 = var_3_35E:byte[]
            goto(Label_0279)
        }
        
        goto(Label_1069)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(8192)), ldc:int(0))) {
            var_0_36E = and:int(var_0_36E:int, ldc:int(133458459))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_36E:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(64)), ldc:int(0))) {
            var_0_36E = and:int(var_0_36E:int, ldc:int(894595636))
        }
        else {
            var_0_36E = and:int(var_0_36E:int, ldc:int(793400572))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_3D4 = newarray:byte[](byte.class, expr_A9:int)
                var_5_3D5 = expr_A9:int
                
                loop {
                    var_0_36E = and:int(var_0_36E:int, ldc:int(2078932024))
                    var_5_3D5 = add:int(var_5_3D5:int, ldc:int(-1))
                    storeelement:byte(var_3_3D4:byte[], var_5_3D5:int, add:int(shl:int(loadelement:byte(stack_3E6_0:byte[], var_5_3D5:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_3D5:int, xor:int(ldc:int(-28667), ldc:int(-28668)))), ldc:int(4)), and:int(ldc:int(16911), ldc:int(2223)))))
                    
                    if (cmpne:boolean(var_5_3D5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_392_0 = stack_3E6_0 = stack_455_0 = stack_4AC_0 = var_3_3D4:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_36E:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(64)), ldc:int(0))) {
                var_0_36E = and:int(var_0_36E:int, ldc:int(-98453768))
                goto(Label_0115)
            }
            
            var_0_36E = and:int(var_0_36E:int, ldc:int(-1154867496))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_359 = expr_D9:int
                var_3_35E = newarray:byte[](byte.class, expr_D9:int)
                var_5_35F = expr_D9:int
                goto(Label_1069)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(256)), ldc:int(0))) {
            var_0_36E = and:int(var_0_36E:int, ldc:int(-1564971632))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_36E:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_36E = and:int(var_0_36E:int, ldc:int(-403706858))
                goto(Label_0115)
            }
            
            var_0_36E = and:int(var_0_36E:int, ldc:int(-1148445639))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_4_359 = expr_112:int
                var_3_35E = newarray:byte[](byte.class, expr_112:int)
                var_5_35F = expr_112:int
                goto(Label_1156)
            }
        }
        
        Label_0279:
        
        if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_36E:int, ldc:int(131072)), ldc:int(0))) {
            var_0_36E = and:int(var_0_36E:int, ldc:int(-284495633))
            goto(Label_0174)
        }
        
        if (cmpeq:boolean(and:int(var_0_36E:int, ldc:int(8)), ldc:int(0))) {
            var_0_36E = and:int(var_0_36E:int, ldc:int(-1928253424))
            goto(Label_0115)
        }
        
        var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_352_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(147), ldc:int(129)))
        expr_166 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16438), ldc:int(1491)))
        storeelement:String(expr_166:String[], and:int(ldc:int(4099), ldc:int(1783)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-13876), ldc:int(13874)), and:int(ldc:int(-9392), ldc:int(9389))))
        storeelement:String(expr_166:String[], and:int(ldc:int(1101), ldc:int(10404)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-7123), ldc:int(7058)), and:int(ldc:int(5681), ldc:int(5))))
        storeelement:String(expr_166:String[], and:int(ldc:int(9100), ldc:int(24)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(10507), ldc:int(4325)), xor:int(ldc:int(9437), ldc:int(9309))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(-32508), ldc:int(-32511)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(160), ldc:int(450)), and:int(ldc:int(10415), ldc:int(21753))))
        storeelement:String(expr_166:String[], and:int(ldc:int(173), ldc:int(16401)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(-26615), ldc:int(-26464)), xor:int(ldc:int(4442), ldc:int(4587))))
        storeelement:String(expr_166:String[], and:int(ldc:int(1678), ldc:int(4175)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(2050), ldc:int(2227)), xor:int(ldc:int(48), ldc:int(131))))
        storeelement:String(expr_166:String[], and:int(ldc:int(18459), ldc:int(4239)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(10675), ldc:int(191)), xor:int(ldc:int(-31203), ldc:int(-31067))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(264), ldc:int(258)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(6072), ldc:int(184)), xor:int(ldc:int(6698), ldc:int(6804))))
        storeelement:String(expr_166:String[], and:int(ldc:int(-23532), ldc:int(23275)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(2302), ldc:int(29119)), xor:int(ldc:int(146), ldc:int(80))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(-31485), ldc:int(-31476)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(16579), ldc:int(1218)), and:int(ldc:int(495), ldc:int(3276))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(4496), ldc:int(4480)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(4300), ldc:int(9420)), xor:int(ldc:int(4264), ldc:int(4220))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(20739), ldc:int(20737)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(16477), ldc:int(16521)), xor:int(ldc:int(1303), ldc:int(1485))))
        storeelement:String(expr_166:String[], and:int(ldc:int(617), ldc:int(28829)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(4570), ldc:int(18650)), xor:int(ldc:int(17295), ldc:int(17262))))
        storeelement:String(expr_166:String[], and:int(ldc:int(3087), ldc:int(685)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(1265), ldc:int(8421)), and:int(ldc:int(3557), ldc:int(24831))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(1092), ldc:int(1091)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(-15278), ldc:int(-15177)), and:int(ldc:int(25855), ldc:int(3055))))
        storeelement:String(expr_166:String[], and:int(ldc:int(28038), ldc:int(4734)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(568), ldc:int(727)), and:int(ldc:int(248), ldc:int(18938))))
        storeelement:String(expr_166:String[], and:int(ldc:int(4108), ldc:int(18572)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(766), ldc:int(12537)), and:int(ldc:int(16637), ldc:int(10495))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(30), ldc:int(15)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(18888), ldc:int(18741)), and:int(ldc:int(18214), ldc:int(2306))))
        putstatic:String[](\u92ff\u93a2\ua068\ub83f\u7043\uf9c5::\u600f\u6ec6\u93a2\uff55\u8258\u4179, expr_166:String[])
    }
    
    public void \ub70c\ubcb0\u4daf\ubff1\u8753\u3bd6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_644 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_64F : int
        
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
        var_3_644 = and:int(ldc:int(-1516041156), ldc:int(-1477723554))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ff\u93a2\ua068\ub83f\u7043\uf9c5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
            var_3_644 = and:int(var_3_644:int, ldc:int(-173585380))
            var_5_81 = and:int(ldc:int(-21901), ldc:int(17548))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8780), ldc:int(-8781)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_644:int, ldc:int(-1509976435))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(16447), ldc:int(9729)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(265), ldc:int(19585)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_644 = and:int(var_3_D1:int, ldc:int(-206608260))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(2051), ldc:int(17621)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1681264193))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(871114978))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1411793052))
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(435607302))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1243091457))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1087071482))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1956022795))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-302632483))
                            var_11_E2 = and:int(ldc:int(-28955), ldc:int(28954))
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1129377861))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(802184630))
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1703250718))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(2000260970))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(512)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1214781597))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-123689294))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-437842049))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1491650716))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-144575848))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-306204434))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0804:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(615027711))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(563931762))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(512)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-272407267))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1123743906))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1376255817))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-306747553))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(849), ldc:int(8201))
                                goto(Label_1084)
                            }
                        }
                    }
                    
                    Label_0936:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1181050773))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(402661290))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1697309097))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-336633553))
                        var_11_E2 = and:int(ldc:int(19922), ldc:int(-19931))
                    }
                    
                    Label_1084:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1515697474))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-485645747))
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1681148008))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1377620788))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1200:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1468265911))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(304775302))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(512)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-43453181))
                            goto(Label_1084)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-636611897))
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1069653158))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1189509392))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1209549618))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1499)
                    }
                    
                    Label_1353:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-508409728))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-608103561))
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-852018273))
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1768461019))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-718068838))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_644 = and:int(var_3_644:int, ldc:int(-1109138659))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-806313972))
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1618630713))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-135845218))
                        var_17_64F = add:int(var_16_110:int, and:int(ldc:int(9), ldc:int(11399)))
                        looporswitchbreak()
                    }
                }
                
                var_3_644 = and:int(var_3_644:int, ldc:int(-1276641667))
                
                if (cmple:boolean(var_5_81 = var_17_64F:int, sub:int(var_6_88:int, xor:int(ldc:int(-20476), ldc:int(-20475))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
