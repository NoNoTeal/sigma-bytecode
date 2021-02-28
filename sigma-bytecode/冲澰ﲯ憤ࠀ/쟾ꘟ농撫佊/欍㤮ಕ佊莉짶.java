public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6 {
    public void \u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6() {
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
            invokespecial:Object(Object::<init>, this:\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u99f7\ub83f\u4daf\uc2e8\u494c\u3776() {
        var_2_67 : HashMap
        var_3_6F : ArrayList<String>
        var_4_7B : String
        var_5_88 : String
        var_6_95 : String
        var_7_D7 : String[]
        var_8_E5 : \u4f52\u7ce1\uc229\ucef1\ube23[]
        var_9_EE : int
        
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
            var_2_67 = initobject:HashMap(HashMap<K, V>::<init>)
            var_3_6F = initobject:ArrayList<String>(ArrayList<E>::<init>)
            var_4_7B = loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), and:int(ldc:int(3449), ldc:int(-16250)))
            var_5_88 = loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), and:int(ldc:int(6689), ldc:int(24777)))
            var_6_95 = loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), and:int(ldc:int(18058), ldc:int(6482)))
            invokeinterface:boolean(List<String>::add, var_3_6F:ArrayList<String>[expected:List<String>], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_7B:String), var_5_88:String), var_6_95:String)))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, getfield:String(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u51fa\u4e72\u9255\u7bad\ucef1\u5fe1, invokestatic:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u3a62\u2dcc\u1187\u6c56\u5db4\u6c52)), var_5_88:String[expected:Object]))) {
                invokeinterface:boolean(List<String>::add, var_3_6F:ArrayList<String>[expected:List<String>], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_7B:String), getfield:String(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u51fa\u4e72\u9255\u7bad\ucef1\u5fe1, invokestatic:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u3a62\u2dcc\u1187\u6c56\u5db4\u6c52))), var_6_95:String)))
            }
            
            var_7_D7 = checkcast:String[](java.lang.String[].class, invokeinterface:String[](List<E>::toArray, var_3_6F:ArrayList<String>[expected:List<String>], newarray:String[](java.lang.String.class, invokeinterface:int(List<E>::size, var_3_6F:ArrayList<String>[expected:List<String>]))))
            invokestatic:void(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u76bc\u6b5f\u5140\uc910\u4d85\u7006, invokestatic:\u74b1\u59ec\u2dcc\u8413\u8c8a[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc2bd\u67d0\u5f50\u76bc\u7bad\u61a4), var_7_D7:String[], var_2_67:HashMap[expected:Map])
            var_8_E5 = invokestatic:\u4f52\u7ce1\uc229\ucef1\ube23[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u0c95\u3776\u5245\u9af2\uf9c5\u47c2)
            var_9_EE = and:int(ldc:int(-31379), ldc:int(31378))
            
            while (cmplt:boolean(var_9_EE:int, arraylength:int(var_8_E5:\u4f52\u7ce1\uc229\ucef1\ube23[]))) {
                invokestatic:void(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u76bc\u6b5f\u5140\uc910\u4d85\u7006, loadelement:\u4f52\u7ce1\uc229\ucef1\ube23(var_8_E5:\u4f52\u7ce1\uc229\ucef1\ube23[], var_9_EE:int), var_7_D7:String[], var_2_67:HashMap[expected:Map])
                inc:int(var_9_EE, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u76bc\u6b5f\u5140\uc910\u4d85\u7006(\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 p0, java.lang.String[] p1, java.util.Map p2) {
        var_3_10C : int
        var_5_6C : int
        var_7_CD : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_8_E8 : InputStream
        var_5_106 : IOException
        
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
            var_3_10C = and:int(ldc:int(-1880401897), ldc:int(-200733427))
            
            try {
                var_3_10C = and:int(var_3_10C:int, ldc:int(-1909903585))
                var_5_6C = and:int(ldc:int(9409), ldc:int(-9410))
                
                loop {
                    if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_10C = and:int(var_3_10C:int, ldc:int(290995953))
                    }
                    else {
                        var_3_10C = and:int(var_3_10C:int, ldc:int(-410256467))
                        
                        if (cmpge:boolean(var_5_6C:int, arraylength:int(p1:String[]))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0144:
                    
                    if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_10C = and:int(var_3_10C:int, ldc:int(1670452758))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_10C = and:int(var_3_10C:int, ldc:int(-453440505))
                    }
                    
                    Label_0171:
                    
                    if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_10C = and:int(var_3_10C:int, ldc:int(-1782752307))
                    var_7_CD = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(p1:String[], var_5_6C:int))
                    
                    if (invokeinterface:boolean(\u4f52\u7ce1\uc229\ucef1\ube23::\u718f\u52d3\u12b2\u93a2\u4179\u97b7, p0:\u4f52\u7ce1\uc229\ucef1\ube23, getstatic:\u983f\u6c56\u6bb9\u927d\u965f(\u983f\u6c56\u6bb9\u927d\u965f::\u071d\ud12e\u8d98\u8308\u5d20\u7e3f), var_7_CD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)) {
                        var_8_E8 = invokeinterface:InputStream(\u4f52\u7ce1\uc229\ucef1\ube23::\uc4d2\ubb2b\ufe34\u960f\u6435\u600f, p0:\u4f52\u7ce1\uc229\ucef1\ube23, getstatic:\u983f\u6c56\u6bb9\u927d\u965f(\u983f\u6c56\u6bb9\u927d\u965f::\u071d\ud12e\u8d98\u8308\u5d20\u7e3f), var_7_CD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                        
                        if (cmpne:boolean(var_8_E8:InputStream, aconstnull:InputStream())) {
                            invokestatic:void(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u6c52\uc9f6\uae5d\u97e6\u76bc\uceb8, var_8_E8:InputStream, p2:Map)
                        }
                    }
                    
                    inc:int(var_5_6C, ldc:int(1))
                }
            }
            catch (java.io.IOException var_5_106) {
                var_3_10C = and:int(var_3_10C:int, ldc:int(-583193105))
                invokevirtual:void(Throwable::printStackTrace, var_5_106:IOException[expected:Throwable])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u6c52\uc9f6\uae5d\u97e6\u76bc\uceb8(java.io.InputStream p0, java.util.Map p1) {
        var_2_5F : int
        var_4_6C : Iterator<String>
        var_5_AB : String
        var_6_E9 : String[]
        
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
            var_2_5F = and:int(ldc:int(-1508874092), ldc:int(1593604998))
            var_4_6C = invokeinterface:Iterator<String>(List<String>::iterator, invokestatic:List(IOUtils::readLines, p0:InputStream, getstatic:Charset(Charsets::UTF_8)))
            invokevirtual:void(InputStream::close, p0:InputStream)
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1618871627))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1855920130))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6C:Iterator<String>)) {
                        var_5_AB = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_4_6C:Iterator<String>))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_5_AB:String))) {
                            if (cmpne:boolean(invokevirtual:char(String::charAt, var_5_AB:String, and:int(ldc:int(-29720), ldc:int(29699))), ldc:char(35))) {
                                var_6_E9 = checkcast:String[](java.lang.String[].class, invokestatic:Object[][expected:String[]](Iterables::toArray, invokevirtual:Iterable(Splitter::split, getstatic:Splitter(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u3dd3\u8df4\u88c5\u74b1\ufe34\uf94d), var_5_AB:String[expected:CharSequence]), ldc:Class<String>(java.lang.String.class)))
                                
                                if (cmpne:boolean(var_6_E9:String[], aconstnull:String[]())) {
                                    if (cmpeq:boolean(arraylength:int(var_6_E9:String[]), and:int(ldc:int(20554), ldc:int(2594)))) {
                                        invokeinterface:String(Map<String, String>::put, p1:Map<String, String>, loadelement:String(var_6_E9:String[], and:int(ldc:int(-1389), ldc:int(1388))), invokevirtual:String(Matcher::replaceAll, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u71f1\u3c25\u97e6\u4c04\uc9f6\u1833), loadelement:String(var_6_E9:String[], and:int(ldc:int(28181), ldc:int(41)))), loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), xor:int(ldc:int(-32250), ldc:int(-32251)))))
                                    }
                                }
                            }
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(502164220))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u76bc\u6b5f\u5140\uc910\u4d85\u7006(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, java.lang.String p1, java.util.Map<java.lang.String, java.lang.String> p2) {
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
            
            try {
                invokestatic:void(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u6c52\uc9f6\uae5d\u97e6\u76bc\uceb8, invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, p0:\u6c52\u52d3\u516c\uae87\uae5d, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), and:int(ldc:int(7480), ldc:int(-7481)))), p1:String), loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), xor:int(ldc:int(2152), ldc:int(2154)))))))), p2:Map<String, String>)
            }
            catch (java.io.IOException stack_D7_0) {
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \ud523\u4ab3\u93a2\u67d0\u7d52\u93a2(java.lang.String p0) {
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
            return:String(invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, p0:String, newarray:Object[](java.lang.Object.class, and:int(ldc:int(-25365), ldc:int(25364)))))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.TranslationTextComponent \u6ec6\u8cae\u4cd9\u6c52\u5f50\ub6ab(java.lang.String p0) {
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
            return:TranslationTextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, p0:String))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \ud523\u4ab3\u93a2\u67d0\u7d52\u93a2(java.lang.String p0, java.lang.String p1) {
        var_2_61 : int
        var_4_70 : String
        stack_9D_0 : String [generated]
        
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
            var_2_61 = and:int(ldc:int(-290753869), ldc:int(-335808805))
            var_4_70 = invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, p0:String, newarray:Object[](java.lang.Object.class, and:int(ldc:int(-26457), ldc:int(26456))))
            
            if (logicaland:boolean(cmpne:boolean(var_4_70:String, aconstnull:String()), logicalnot:boolean(invokevirtual:boolean(String::equals, var_4_70:String, p0:String[expected:Object])))) {
                stack_9D_0 = var_4_70:String
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-286197761))
                stack_9D_0 = p1:String
            }
            
            return:String(stack_9D_0:String)
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u8753\u2dcc\u873d\ub171\ub83f\uafe7() {
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
            return:String(invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), and:int(ldc:int(1317), ldc:int(8332))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-23161), ldc:int(19064)))))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u99f7\ub19c\ucfaf\u6b0d\u4f52\ud171() {
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
            return:String(invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), xor:int(ldc:int(24585), ldc:int(24588))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(11284), ldc:int(-11285)))))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u624e\u183a\u7330\u5db4\u4975\ud217() {
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
            return:String(invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), and:int(ldc:int(5135), ldc:int(2342))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(4552), ldc:int(-5581)))))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \ud51e\u624e\u7006\u5140\u64ab\u7330() {
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
            return:String(invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), and:int(ldc:int(16439), ldc:int(3719))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(31756), ldc:int(-32270)))))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u983f\u93a2\u6bb9\u93a2\u0c95\u7d52() {
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
            return:String(invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc), and:int(ldc:int(4104), ldc:int(472))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(6244), ldc:int(-22629)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_24B : int
        expr_6E : int [generated]
        stack_8B_0 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_AA_0 : byte[] [generated]
        stack_AC_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_25E_0 : byte[] [generated]
        stack_2C0_0 : byte[] [generated]
        stack_33B_0 : byte[] [generated]
        var_4_237 : int
        var_3_23C : byte[]
        var_5_23D : int
        expr_261 : byte [generated]
        var_0_2B6 : int
        expr_2C0 : byte [generated]
        stack_309_2 : byte [generated]
        stack_2E6_0 : byte [generated]
        expr_8D : int [generated]
        var_2_AA : byte[]
        expr_AE : int [generated]
        var_3_329 : byte[]
        var_5_32A : int
        var_3_E7 : String
        expr_EF : String[] [generated]
        expr_F9 : String[] [generated]
        var_3_20F : String[]
        
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
        var_0_24B = and:int(ldc:int(-1024947841), ldc:int(-630460562))
        expr_6E = arraylength:int(stack_8B_0 = stack_8D_0 = stack_AA_0 = stack_AC_0 = stack_DB_0 = stack_25E_0 = stack_2C0_0 = stack_33B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("dtgnC1ba0lXUGaK6gt53IXe4zqrcQcDIXCXS3CX0xM41JdL4L/Ir/qchP6LU/sT4I8Dc1DEp3t5b2NhcK0PY9kbeISvAUSvWqvInyDXCU94zWNTu1PYv0iErwFEr1qryJ8g1wlPeM0j+yNje1CErwFHaN6LU9PDYISvAUdonY7G34A==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_237 = expr_6E:int
        var_3_23C = newarray:byte[](byte.class, expr_6E:int)
        var_5_23D = expr_6E:int
        Label_0575:
        
        while (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_24B = and:int(var_0_24B:int, ldc:int(-353342145))
            var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
            expr_261 = xor:byte(loadelement:byte(stack_25E_0:byte[], var_5_23D:int), ldc:byte(42))
            storeelement:byte(var_3_23C:byte[], var_5_23D:int, add:int(or:int(and:int(shl:int(expr_261:byte, xor:int(ldc:int(16914), ldc:int(16918))), ldc:int(-16)), and:int(shr:int(expr_261:byte[expected:int], xor:int(ldc:int(10279), ldc:int(10275))), ldc:int(15))), ldc:int(17)))
            
            if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8D_0 = stack_8B_0 = stack_AA_0 = stack_AC_0 = stack_DB_0 = stack_25E_0 = stack_2C0_0 = stack_33B_0 = var_3_23C:byte[]
            goto(Label_0115)
        }
        
        var_0_24B = and:int(var_0_24B:int, ldc:int(914576794))
        Label_0681:
        
        while (cmpne:boolean(and:int(var_0_24B:int, ldc:int(256)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_24B:int, ldc:int(-763627105))
            var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
            expr_2C0 = stack_309_2 = loadelement(stack_2C0_0, var_5_23D)
            
            if (cmplt:boolean(add:int(add:int(var_5_23D:int, ldc:int(3)), neg:int(var_4_237:int)), ldc:int(0))) {
                stack_309_2 = stack_2E6_0 = add:byte(expr_2C0:byte, loadelement:byte(var_3_23C:byte[], add:int(var_5_23D:int, ldc:int(3))))
                goto(Label_0758)
            }
            
            Label_0717:
            
            if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(2048)), ldc:int(0))) {
                var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-246247283))
            }
            else {
                var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-161212082))
                stack_309_2 = stack_2E6_0 = add:byte(expr_2C0:byte, ldc:byte(3))
            }
            
            Label_0758:
            
            if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0717)
            }
            
            var_0_24B = and:int(var_0_2B6:int, ldc:int(-766117426))
            storeelement:byte(var_3_23C:byte[], var_5_23D:int, stack_309_2:byte)
            
            if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8D_0 = stack_8B_0 = stack_AA_0 = stack_AC_0 = stack_DB_0 = stack_25E_0 = stack_2C0_0 = stack_33B_0 = var_3_23C:byte[]
            goto(Label_0146)
        }
        
        goto(Label_0575)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0179)
        }
        
        if (cmpne:boolean(and:int(var_0_24B:int, ldc:int(256)), ldc:int(0))) {
            var_0_24B = and:int(var_0_24B:int, ldc:int(-296252593))
            expr_8D = arraylength:int(stack_8D_0:byte[])
            
            if (cmpne:boolean(expr_8D:int, ldc:int(0))) {
                var_4_237 = expr_8D:int
                var_3_23C = newarray:byte[](byte.class, expr_8D:int)
                var_5_23D = expr_8D:int
                goto(Label_0681)
            }
        }
        
        Label_0146:
        
        if (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_24B = and:int(var_0_24B:int, ldc:int(-161723009))
            var_2_AA = stack_AA_0:byte[]
            expr_AE = add:int(arraylength:int(stack_AC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AE:int, ldc:int(0))) {
                var_3_329 = newarray:byte[](byte.class, expr_AE:int)
                var_5_32A = expr_AE:int
                
                loop {
                    var_0_24B = and:int(var_0_24B:int, ldc:int(-883376673))
                    var_5_32A = add:int(var_5_32A:int, ldc:int(-1))
                    storeelement:byte(var_3_329:byte[], var_5_32A:int, add:int(shl:int(loadelement:byte(stack_33B_0:byte[], var_5_32A:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_AA:byte[], add:int(var_5_32A:int, xor:int(ldc:int(8716), ldc:int(8717)))), ldc:int(5)), xor:int(ldc:int(2700), ldc:int(2699)))))
                    
                    if (cmpne:boolean(var_5_32A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8D_0 = stack_8B_0 = stack_AA_0 = stack_AC_0 = stack_DB_0 = stack_25E_0 = stack_2C0_0 = stack_33B_0 = var_3_329:byte[]
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_24B = and:int(var_0_24B:int, ldc:int(1314405829))
            goto(Label_0146)
        }
        
        if (cmpne:boolean(and:int(var_0_24B:int, ldc:int(128)), ldc:int(0))) {
            var_0_24B = and:int(var_0_24B:int, ldc:int(70933188))
            goto(Label_0115)
        }
        
        var_3_E7 = initobject:String(String::<init>, stack_DB_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_EF = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(21150), ldc:int(106)))
        expr_F9 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32638), ldc:int(-32632)))
        storeelement:String(expr_F9:String[], and:int(ldc:int(363), ldc:int(16403)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(-10749), ldc:int(10716)), and:int(ldc:int(8484), ldc:int(2180))))
        storeelement:String(expr_EF:String[], and:int(ldc:int(12617), ldc:int(2077)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(17410), ldc:int(17414)), and:int(ldc:int(18716), ldc:int(1240))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(20481), ldc:int(20483)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(3288), ldc:int(8248)), xor:int(ldc:int(313), ldc:int(292))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(17184), ldc:int(17185)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(-27612), ldc:int(-27591)), xor:int(ldc:int(529), ldc:int(563))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(325), ldc:int(333)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(12850), ldc:int(106)), and:int(ldc:int(51), ldc:int(28915))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(-23823), ldc:int(22798)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(10611), ldc:int(20531)), xor:int(ldc:int(572), ldc:int(637))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(2123), ldc:int(2124)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(577), ldc:int(24655)), and:int(ldc:int(119), ldc:int(215))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(8662), ldc:int(5158)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(21375), ldc:int(87)), and:int(ldc:int(8812), ldc:int(109))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(28932), ldc:int(28929)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(1686), ldc:int(1786)), and:int(ldc:int(4215), ldc:int(3199))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(260), ldc:int(10780)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(16543), ldc:int(16616)), xor:int(ldc:int(-16327), ldc:int(-16200))))
        putstatic:String[](\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u5654\u7330\u839e\ucb79\u6fb0\u2dcc, expr_F9:String[])
        var_3_20F = expr_EF:String[]
        putstatic:Splitter(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u3dd3\u8df4\u88c5\u74b1\ufe34\uf94d, invokevirtual:Splitter(Splitter::limit, invokestatic:Splitter(Splitter::on, ldc:char(61)), xor:int(ldc:int(2093), ldc:int(2095))))
        putstatic:Pattern(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u71f1\u3c25\u97e6\u4c04\uc9f6\u1833, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_20F:String[], xor:int(ldc:int(24609), ldc:int(24616)))))
    }
    
    public void \u7330\u67e9\u7bad\u527a\ub6ab\u7af6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_694 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_69F : int
        
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
        var_3_694 = and:int(ldc:int(123543538), ldc:int(92229241))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(770510840))
            var_5_80 = and:int(ldc:int(14536), ldc:int(-14537))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(30592), ldc:int(-30597)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_694:int, ldc:int(-679485831))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(20483), ldc:int(11849)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(5696), ldc:int(5697)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_694 = and:int(var_3_D0:int, ldc:int(760217339))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(5129), ldc:int(2259)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1953580903))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1268572721))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(838913389))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1555212561))
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(474861192))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1370129645))
                    }
                    else {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1062027102))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(265613738))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2091829714))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-621917509))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(795836413))
                            var_11_E1 = and:int(ldc:int(-16785), ldc:int(16784))
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-322838306))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2030560015))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1108841521))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1926101341))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1748140193))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(963578451))
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1051319403))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(239200519))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(435517407))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(1432219639))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1093774078))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1035813930))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1408901407))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1775281293))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1726764881))
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(98314276))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1553240721))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(1610555229))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(2370), ldc:int(2371))
                                goto(Label_1142)
                            }
                        }
                    }
                    
                    Label_0976:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(693680876))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-441499480))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-544997998))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1000289669))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(2012032215))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1386410371))
                        var_11_E1 = and:int(ldc:int(1227), ldc:int(-22220))
                    }
                    
                    Label_1142:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2119980308))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1779183571))
                            goto(Label_0976)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(605627823))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1051375505))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(526835608))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1746063493))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1411)
                            }
                        }
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(879726673))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(2047625140))
                            goto(Label_1142)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(109387023))
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1435830392))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1241669898))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1411:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(339646635))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(838373377))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-64774279))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(890147879))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1046338695))
                        loopcontinue()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(-11583883))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69F = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1069894613))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-111535706))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(167991880))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1383003178))
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(231673426))
                        var_17_69F = add:int(var_16_10F:int, and:int(ldc:int(16395), ldc:int(7169)))
                        looporswitchbreak()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(425224034))
                }
                
                var_3_694 = and:int(var_3_694:int, ldc:int(-1219670190))
                
                if (cmple:boolean(var_5_80 = var_17_69F:int, sub:int(var_6_87:int, and:int(ldc:int(3589), ldc:int(4161))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
