public abstract class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<C> {
    public void \u34df\uceb8\u34df\u8640\u1187(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<C> p0, int p1, int p2, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p3, int p4, long p5) {
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
            invokespecial:Object(Object::<init>, this:\u34df\uceb8\u34df\u8640\u1187<C>)
            putfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>, invokestatic:ArrayList[expected:List<\uc7fe\u12cb\u1833\u67e9\u92ff>](Lists::newArrayList))
            putfield:\u5654\u9937\u72f1\ud4fe\u0c95<C>(\u34df\uceb8\u34df\u8640\u1187::\u47c2\u59ec\uc910\u71ae\u99f7\u4e72, this:\u34df\uceb8\u34df\u8640\u1187<C>, p0:\u5654\u9937\u72f1\ud4fe\u0c95<C>)
            putfield:int(\u34df\uceb8\u34df\u8640\u1187::\u5654\uc4d2\uae87\ub171\u718f\uc246, this:\u34df\uceb8\u34df\u8640\u1187<C>, p1:int)
            putfield:int(\u34df\uceb8\u34df\u8640\u1187::\ud171\u7af6\u965f\u392e\u67e9\u6c56, this:\u34df\uceb8\u34df\u8640\u1187<C>, p2:int)
            putfield:int(\u34df\uceb8\u34df\u8640\u1187::\ub1b9\u156b\u4daf\u071d\u6cfe\u47c2, this:\u34df\uceb8\u34df\u8640\u1187<C>, p4:int)
            invokevirtual:long(\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf::\u4f52\u93a2\ua562\u67e9\u6cfe\ub171, putfield:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf(\u34df\uceb8\u34df\u8640\u1187::\u2dcc\ua6bd\u0b8e\u16f6\u9af2\u7330, this:\u34df\uceb8\u34df\u8640\u1187<C>, initobject:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf(\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf::<init>)), p5:long, p1:int, p2:int)
            putfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>, p3:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u64f2\u7bad\u62da\u4179\u6435\uafe7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p2, int p3, int p4, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p5, C extends \u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 p6);
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 \ub1b9\u7c6b\u7d52\ua61f\u3504\u600f() {
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
            return:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> \u3e75\ufcaf\uc87f\u7049\u927d\u8aa5() {
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
            return:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))
        }
        
        goto(Label_0006)
    }
    
    public void \u3d64\u7af6\uc4d2\u6435\ufcaf\u3711(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8753\u4975\ubf56\u6b0d\u7e3f p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2, java.util.Random p3, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p4, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p5) {
        var_7_12D : int
        var_9_6F : List<\uc7fe\u12cb\u1833\u67e9\u92ff>
        var_10_145 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_11_153 : \u3a62\uc9f6\u3776\u4f52\ua068\u34df
        var_12_172 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_13_184 : Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>
        var_14_207 : \uc7fe\u12cb\u1833\u67e9\u92ff
        
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
            var_7_12D = and:int(and:int(ldc:int(-1196141916), ldc:int(-1963863299)), ldc:int(1958017983))
            monitorenter(var_9_6F = getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(2048)), ldc:int(0))) {
                        var_7_12D = and:int(var_7_12D:int, ldc:int(1887200757))
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_7_12D = and:int(var_7_12D:int, ldc:int(483518874))
                        goto(Label_0234)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(4096)), ldc:int(0))) {
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-875498828))
                        
                        if (invokeinterface:boolean(List<E>::isEmpty, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))) {
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0185:
                    
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(256)), ldc:int(0))) {
                            var_7_12D = and:int(var_7_12D:int, ldc:int(2061796997))
                            loopcontinue()
                        }
                        
                        var_7_12D = and:int(var_7_12D:int, ldc:int(79747239))
                    }
                    
                    Label_0234:
                    
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(524288)), ldc:int(0))) {
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-557271662))
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(32)), ldc:int(0))) {
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-263164814))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(4096)), ldc:int(0))) {
                            var_7_12D = and:int(var_7_12D:int, ldc:int(-1820721799))
                            goto(Label_0185)
                        }
                        
                        if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-1968254468))
                        var_10_145 = getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\uc7fe\u12cb\u1833\u67e9\u92ff::\u5bc4\ub19c\u5654\u71ae\u64f2\u3776, checkcast:\uc7fe\u12cb\u1833\u67e9\u92ff(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff.class, invokeinterface:\uc7fe\u12cb\u1833\u67e9\u92ff(List<\uc7fe\u12cb\u1833\u67e9\u92ff>::get, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>), and:int(ldc:int(1430), ldc:int(-9655)))))
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-571148618))
                        var_11_153 = invokevirtual:\u3a62\uc9f6\u3776\u4f52\ua068\u34df(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u927d\ub19c\ub171\u2dcc\u8df4\u9937, var_10_145:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-1963044417))
                        var_12_172 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_11_153:\u3a62\uc9f6\u3776\u4f52\ua068\u34df), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_10_145:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_11_153:\u3a62\uc9f6\u3776\u4f52\ua068\u34df))
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-441746955))
                        var_13_184 = invokeinterface:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>(List<\uc7fe\u12cb\u1833\u67e9\u92ff>::iterator, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(8192)), ldc:int(0))) {
                                var_7_12D = and:int(var_7_12D:int, ldc:int(1818619255))
                                goto(Label_0476)
                            }
                            
                            if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_7_12D = and:int(var_7_12D:int, ldc:int(1891673419))
                            }
                            else {
                                var_7_12D = and:int(var_7_12D:int, ldc:int(-1046159386))
                                
                                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_13_184:Iterator))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_0443:
                            
                            if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(256)), ldc:int(0))) {
                                var_7_12D = and:int(var_7_12D:int, ldc:int(-1499756380))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(33554432)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_7_12D = and:int(var_7_12D:int, ldc:int(-1929511689))
                            }
                            
                            Label_0476:
                            
                            if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(2048)), ldc:int(0))) {
                                var_7_12D = and:int(var_7_12D:int, ldc:int(-668848937))
                                goto(Label_0443)
                            }
                            
                            if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(8)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_7_12D = and:int(var_7_12D:int, ldc:int(-1078534226))
                            var_14_207 = checkcast:\uc7fe\u12cb\u1833\u67e9\u92ff(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff.class, invokeinterface:\uc7fe\u12cb\u1833\u67e9\u92ff(Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>::next, var_13_184:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(256)), ldc:int(0))) {
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(-917585984))
                                    goto(Label_0776)
                                }
                                
                                if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(-1307412509))
                                    goto(Label_0720)
                                }
                                
                                if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_0681)
                                }
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(32)), ldc:int(0))) {
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(1196168291))
                                }
                                else {
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(1686590118))
                                    
                                    if (logicalnot:boolean(invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ucef1\u3711\u0b8e\u6d69\u6b0d\u7e3f, invokevirtual:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\uc7fe\u12cb\u1833\u67e9\u92ff::\u8bb0\u3dd3\u0800\u416d\u3e75\uc2e8, var_14_207:\uc7fe\u12cb\u1833\u67e9\u92ff), p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                                        goto(Label_0776)
                                    }
                                }
                                
                                Label_0603:
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(8388608)), ldc:int(0))) {
                                    goto(Label_0776)
                                }
                                
                                if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(1580490757))
                                    goto(Label_0720)
                                }
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(16777216)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(2)), ldc:int(0))) {
                                        var_7_12D = and:int(var_7_12D:int, ldc:int(113616988))
                                        loopcontinue()
                                    }
                                    
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(1792210877))
                                    
                                    if (invokevirtual:boolean(\uc7fe\u12cb\u1833\u67e9\u92ff::\u69d9\u5db4\ubded\ubb2b\u0c95\u5140, var_14_207:\uc7fe\u12cb\u1833\u67e9\u92ff, p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p1:\u8753\u4975\ubf56\u6b0d\u7e3f, p2:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p3:Random, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, var_12_172:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                                        goto(Label_0776)
                                    }
                                }
                                
                                Label_0681:
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Label_0776)
                                }
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(2)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_0603)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(16777216)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(1469406205))
                                }
                                
                                Label_0720:
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(1073741824)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_0681)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(524288)), ldc:int(0))) {
                                        var_7_12D = and:int(var_7_12D:int, ldc:int(1195866471))
                                        goto(Label_0603)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(4096)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(-863382345))
                                    invokeinterface:void(Iterator<E>::remove, var_13_184:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>)
                                }
                                
                                Label_0776:
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(8388608)), ldc:int(0))) {
                                    goto(Label_0720)
                                }
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(4096)), ldc:int(0))) {
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(169443398))
                                    goto(Label_0681)
                                }
                                
                                if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(2048)), ldc:int(0))) {
                                    var_7_12D = and:int(var_7_12D:int, ldc:int(212722786))
                                    goto(Label_0603)
                                }
                                
                                if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(2)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_7_12D = and:int(var_7_12D:int, ldc:int(-1695589955))
                        }
                        
                        invokevirtual:void(\u34df\uceb8\u34df\u8640\u1187<C>::\u1187\ufcaf\u92ff\u98a4\u4f4a\u6ec6, this:\u34df\uceb8\u34df\u8640\u1187<C>)
                    }
                    
                    Label_0846:
                    
                    if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_7_12D = and:int(var_7_12D:int, ldc:int(181223633))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_7_12D = and:int(var_7_12D:int, ldc:int(-1835503411))
                            goto(Label_0234)
                        }
                        
                        if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(8)), ldc:int(0))) {
                            var_7_12D = and:int(var_7_12D:int, ldc:int(108767712))
                            goto(Label_0185)
                        }
                        
                        if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-2015691084))
                        monitorexit(var_9_6F:List<\uc7fe\u12cb\u1833\u67e9\u92ff>)
                    }
                    
                    Label_0918:
                    
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(256)), ldc:int(0))) {
                        var_7_12D = and:int(var_7_12D:int, ldc:int(-299681567))
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(8)), ldc:int(0))) {
                        var_7_12D = and:int(var_7_12D:int, ldc:int(1518233676))
                        goto(Label_0234)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_12D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_12D:int, ldc:int(8)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_7_12D = and:int(var_7_12D:int, ldc:int(1123408812))
            }
            finally {
                monitorexit(var_9_6F:List<\uc7fe\u12cb\u1833\u67e9\u92ff>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\ufcaf\u92ff\u98a4\u4f4a\u6ec6() {
        var_1_5F : int
        var_3_70 : Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>
        
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
            var_1_5F = and:int(ldc:int(-387766312), ldc:int(-1218601))
            putfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>, invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u98a4\u8258\u5d20\u64f2\ua068\uc4d2))
            var_3_70 = invokeinterface:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>(List<\uc7fe\u12cb\u1833\u67e9\u92ff>::iterator, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-622784806))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_70:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u120d\u7e3f\ub7dc\ua6bd\u873d\u7049, getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>), invokevirtual:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\uc7fe\u12cb\u1833\u67e9\u92ff::\u8bb0\u3dd3\u0800\u416d\u3e75\uc2e8, checkcast:\uc7fe\u12cb\u1833\u67e9\u92ff(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff.class, invokeinterface:\uc7fe\u12cb\u1833\u67e9\u92ff(Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>::next, var_3_70:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u6c56\u7e3f\ubb2b\u385b\u92ee\ud4fe(int p0, int p1) {
        var_3_64 : int
        var_5_6C : \uc31c\uc87f\uc246\u3776\ub7dc
        var_3_385 : int
        var_6_38D : \ud158\u8308\u76bc\u0a06\ud36e
        var_3_394 : int
        var_7_39A : List<\uc7fe\u12cb\u1833\u67e9\u92ff>
        var_8_3AC : Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>
        var_9_41F : \uc7fe\u12cb\u1833\u67e9\u92ff
        
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
            var_3_64 = and:int(and:int(ldc:int(-2057261940), ldc:int(1302609357)), ldc:int(2121990079))
            var_5_6C = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
            
            loop {
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0845)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0519)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(512)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-7857188))
                    goto(Label_0415)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0281)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(32)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-181044308))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u34df\uceb8\u34df\u8640\u1187<C>::\u4e72\ufe34\u0c95\u3e2a\u8d98\ud36e, this:\u34df\uceb8\u34df\u8640\u1187<C>))) {
                        goto(Label_1243)
                    }
                }
                
                Label_0185:
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0845)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-659051950))
                    goto(Label_0755)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-178986409))
                    goto(Label_0640)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1594455256))
                    goto(Label_0519)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0415)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(128)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1515724798))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(-822510899))
                }
                
                Label_0281:
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0845)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(32)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-2137452865))
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2048)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-186701969))
                    goto(Label_0640)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1201715785))
                    goto(Label_0519)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(16)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1812773549))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-675782539))
                        goto(Label_0185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(3264476))
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(1981856399))
                    invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("id"), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u5654\u9937\u72f1\ud4fe\u0c95<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u5654\u9937\u72f1\ud4fe\u0c95<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u8389\ub70c\u3e75\u718f\u9af2\uc87f), invokevirtual:\u5654\u9937\u72f1\ud4fe\u0c95<?>(\u34df\uceb8\u34df\u8640\u1187<C>::\ubf56\ud7e8\ubcb0\u3504\u69d9\ud7e8, this:\u34df\uceb8\u34df\u8640\u1187<C>))))
                }
                
                Label_0415:
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0845)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0755)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1223889522))
                    goto(Label_0640)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1124420547))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-1022286122))
                        goto(Label_0281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-1589273549))
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(-2018821444))
                    invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("ChunkX"), p0:int)
                }
                
                Label_0519:
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1731338542))
                    goto(Label_0845)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(512)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1624031421))
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-1374197988))
                        goto(Label_0415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(2130945840))
                        goto(Label_0281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(338370176))
                        goto(Label_0185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-879408450))
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(-2051047715))
                    invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("ChunkZ"), p1:int)
                }
                
                Label_0640:
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1149413322))
                    goto(Label_0845)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(4)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-403911681))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-137742759))
                        goto(Label_0415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(1637883439))
                        goto(Label_0281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-665380348))
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(1286388399))
                    invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("references"), getfield:int(\u34df\uceb8\u34df\u8640\u1187::\ub1b9\u156b\u4daf\u071d\u6cfe\u47c2, this:\u34df\uceb8\u34df\u8640\u1187<C>))
                }
                
                Label_0755:
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1055870525))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(541940927))
                        goto(Label_0415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(2109586143))
                    invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("BB"), invokevirtual:\ucb79\uf995\u3d64\u64f2\ucef1[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u5654\u5fe1\u4c2b\ud36e\uf995\u51fa, getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>)))
                }
                
                Label_0845:
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0519)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0415)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0281)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0185)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            loop {
                var_3_385 = and:int(var_3_64:int, ldc:int(-948453683))
                var_6_38D = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
                var_3_394 = and:int(var_3_385:int, ldc:int(1300113901))
                monitorenter(var_7_39A = getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))
                
                try {
                    var_3_394 = and:int(var_3_394:int, ldc:int(-467452244))
                    var_8_3AC = invokeinterface:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>(List<\uc7fe\u12cb\u1833\u67e9\u92ff>::iterator, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))
                    Label_0942:
                    
                    while (cmpne:boolean(and:int(var_3_394:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_394:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1113)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_394:int, ldc:int(2)), ldc:int(0))) {
                            var_3_394 = and:int(var_3_394:int, ldc:int(891898545))
                        }
                        else {
                            var_3_394 = and:int(var_3_394:int, ldc:int(1463659948))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_3AC:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>))) {
                                monitorexit(var_7_39A:List<\uc7fe\u12cb\u1833\u67e9\u92ff>)
                                goto(Label_1113)
                            }
                        }
                        
                        Label_0998:
                        
                        if (cmpne:boolean(and:int(var_3_394:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1188)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_394:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_394 = and:int(var_3_394:int, ldc:int(-1376653431))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_394:int, ldc:int(65536)), ldc:int(0))) {
                                var_3_394 = and:int(var_3_394:int, ldc:int(1055302180))
                                loopcontinue()
                            }
                            
                            var_3_394 = and:int(var_3_394:int, ldc:int(-194921251))
                            var_9_41F = checkcast:\uc7fe\u12cb\u1833\u67e9\u92ff(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff.class, invokeinterface:\uc7fe\u12cb\u1833\u67e9\u92ff(Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>::next, var_8_3AC:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>))
                            
                            do {
                                if (cmpne:boolean(and:int(var_3_394:int, ldc:int(2)), ldc:int(0))) {
                                    var_3_394 = and:int(var_3_394:int, ldc:int(134806925))
                                }
                                else {
                                    var_3_394 = and:int(var_3_394:int, ldc:int(-1124073796))
                                    invokevirtual:boolean(AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>::add, var_6_38D:AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc7fe\u12cb\u1833\u67e9\u92ff::\ub6ab\ub1b9\ud4fe\u760c\u4daf\u8258, var_9_41F:\uc7fe\u12cb\u1833\u67e9\u92ff))
                                }
                            } while (cmpne:boolean(and:int(var_3_394:int, ldc:int(33554432)), ldc:int(0)))
                            
                            var_3_394 = and:int(var_3_394:int, ldc:int(209186766))
                            loopcontinue()
                        }
                        
                        Label_1113:
                        
                        if (cmpeq:boolean(and:int(var_3_394:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1188)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_394:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_394 = and:int(var_3_394:int, ldc:int(-891911355))
                            goto(Label_0998)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_394:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_394 = and:int(var_3_394:int, ldc:int(1567304190))
                            goto(Label_1177)
                        }
                    }
                    
                    var_3_394 = and:int(var_3_394:int, ldc:int(-2072487151))
                    goto(Label_1188)
                }
                finally {
                    monitorexit(var_7_39A:List<\uc7fe\u12cb\u1833\u67e9\u92ff>)
                    var_3_394 = and:int(var_3_394:int, ldc:int(1198587822))
                }
                
                Label_1177:
                invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("Children"), var_6_38D:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
                Label_1188:
                
                if (cmpne:boolean(and:int(var_3_394:int, ldc:int(512)), ldc:int(0))) {
                    var_3_394 = and:int(var_3_394:int, ldc:int(465461212))
                    goto(Label_1113)
                }
                
                if (cmpne:boolean(and:int(var_3_394:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0998)
                }
                
                if (cmpeq:boolean(and:int(var_3_394:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_394 = and:int(var_3_394:int, ldc:int(1419425284))
                    goto(Label_0942)
                }
                
                looporswitchbreak()
            }
            
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc)
            Label_1243:
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("id"), ldc:String("INVALID"))
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_5_6C:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public void \u7af6\ube23\ube23\ud158\u624e\u839e(int p0, java.util.Random p1, int p2) {
        var_6_68 : int
        var_7_79 : int
        var_8_94 : int
        var_9_B6 : Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>
        
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
            var_6_68 = sub:int(p0:int, p2:int)
            var_7_79 = add:int(invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u64f2\ub1b9\uae5d\u3c25\uc4d2\u8389, getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>)), xor:int(ldc:int(-14320), ldc:int(-14319)))
            
            if (cmplt:boolean(var_7_79:int, var_6_68:int)) {
                var_7_79 = add:int(var_7_79:int, invokevirtual:int(Random::nextInt, p1:Random, sub:int(var_6_68:int, var_7_79:int)))
            }
            
            var_8_94 = sub:int(var_7_79:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4e72\uc238\u5245\ud217\u3d64\ub8be, getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>)))
            invokevirtual:void(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u5fe1\u3d4b\ub1b9\u64ab\uf94d\uc2bd, getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>), and:int(ldc:int(-6020), ldc:int(4995)), var_8_94:int, and:int(ldc:int(9001), ldc:int(-25386)))
            var_9_B6 = invokeinterface:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>(List<\uc7fe\u12cb\u1833\u67e9\u92ff>::iterator, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_9_B6:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>)) {
                invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\ube23\uc7fe\u67d0\u624e\u9af2\u67e9, checkcast:\uc7fe\u12cb\u1833\u67e9\u92ff(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff.class, invokeinterface:\uc7fe\u12cb\u1833\u67e9\u92ff(Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>::next, var_9_B6:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>)), and:int(ldc:int(-2994), ldc:int(2737)), var_8_94:int, and:int(ldc:int(10449), ldc:int(-10706)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5654\uc9f6\ub102\ud51e\u647c\u3bd6(java.util.Random p0, int p1, int p2) {
        var_4_63 : int
        var_6_78 : int
        var_7_8F : int
        var_4_A8 : int
        var_8_B4 : int
        var_9_D6 : Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>
        
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
            var_4_63 = and:int(ldc:int(820557497), ldc:int(1560146552))
            var_6_78 = sub:int(add:int(sub:int(p2:int, p1:int), and:int(ldc:int(12513), ldc:int(16401))), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u64f2\ub1b9\uae5d\u3c25\uc4d2\u8389, getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>)))
            
            if (cmple:boolean(var_6_78:int, and:int(ldc:int(16417), ldc:int(4737)))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-672140791))
                var_7_8F = p1:int
            }
            else {
                var_7_8F = add:int(p1:int, invokevirtual:int(Random::nextInt, p0:Random, var_6_78:int))
            }
            
            var_4_A8 = and:int(var_4_63:int, ldc:int(837629612))
            var_8_B4 = sub:int(var_7_8F:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>)))
            invokevirtual:void(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u5fe1\u3d4b\ub1b9\u64ab\uf94d\uc2bd, getfield:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u34df\uceb8\u34df\u8640\u1187::\u67d0\ud7e8\u34df\u946b\u61a4\u6d69, this:\u34df\uceb8\u34df\u8640\u1187<C>), and:int(ldc:int(31757), ldc:int(-31824)), var_8_B4:int, and:int(ldc:int(22589), ldc:int(-22590)))
            var_9_D6 = invokeinterface:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>(List<\uc7fe\u12cb\u1833\u67e9\u92ff>::iterator, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))
            
            loop {
                var_4_A8 = and:int(var_4_A8:int, ldc:int(821930622))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_9_D6:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\uc7fe\u12cb\u1833\u67e9\u92ff::\ube23\uc7fe\u67d0\u624e\u9af2\u67e9, checkcast:\uc7fe\u12cb\u1833\u67e9\u92ff(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff.class, invokeinterface:\uc7fe\u12cb\u1833\u67e9\u92ff(Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>::next, var_9_D6:Iterator<\uc7fe\u12cb\u1833\u67e9\u92ff>)), and:int(ldc:int(10481), ldc:int(-10482)), var_8_B4:int, and:int(ldc:int(-12666), ldc:int(8505)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4e72\ufe34\u0c95\u3e2a\u8d98\ud36e() {
        var_1_61 : int
        stack_8F_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1513900034), ldc:int(2121715579))
            
            if (invokeinterface:boolean(List<E>::isEmpty, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187::\u5fe1\u946b\u4f4a\uf9c5\u92ff\u67d0, this:\u34df\uceb8\u34df\u8640\u1187<C>))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2146789470))
                stack_8F_0 = and:int(ldc:int(-18482), ldc:int(18481))
            }
            else {
                stack_8F_0 = and:int(ldc:int(3073), ldc:int(16421))
            }
            
            return:boolean(stack_8F_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int \u72f1\ua562\u5d20\ufe34\u8389\u9255() {
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
            return:int(getfield:int(\u34df\uceb8\u34df\u8640\u1187::\u5654\uc4d2\uae87\ub171\u718f\uc246, this:\u34df\uceb8\u34df\u8640\u1187<C>))
        }
        
        goto(Label_0006)
    }
    
    public int \u12cb\ubf56\ucef1\u759a\u983f\u8df4() {
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
            return:int(getfield:int(\u34df\uceb8\u34df\u8640\u1187::\ud171\u7af6\u965f\u392e\u67e9\u6c56, this:\u34df\uceb8\u34df\u8640\u1187<C>))
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u6bb9\u0a06\u965f\u647c\u5f50\u6cfe() {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, shl:int(getfield:int(\u34df\uceb8\u34df\u8640\u1187::\u5654\uc4d2\uae87\ub171\u718f\uc246, this:\u34df\uceb8\u34df\u8640\u1187<C>), and:int(ldc:int(2053), ldc:int(4636))), and:int(ldc:int(-25165), ldc:int(25160)), shl:int(getfield:int(\u34df\uceb8\u34df\u8640\u1187::\ud171\u7af6\u965f\u392e\u67e9\u6c56, this:\u34df\uceb8\u34df\u8640\u1187<C>), and:int(ldc:int(453), ldc:int(1060)))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u839e\u7d52\u6b0d\u416d\u4f52\u6cfe() {
        var_1_61 : int
        stack_8E_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1112068562), ldc:int(-1433960581))
            
            if (cmpge:boolean(getfield:int(\u34df\uceb8\u34df\u8640\u1187::\ub1b9\u156b\u4daf\u071d\u6cfe\u47c2, this:\u34df\uceb8\u34df\u8640\u1187<C>), invokevirtual:int(\u34df\uceb8\u34df\u8640\u1187<C>::\u946b\u3a62\u3e75\ub19c\u8308\u6c56, this:\u34df\uceb8\u34df\u8640\u1187<C>))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1395775444))
                stack_8E_0 = and:int(ldc:int(2460), ldc:int(-19357))
            }
            else {
                stack_8E_0 = xor:int(ldc:int(26656), ldc:int(26657))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u4e72\ubff1\ua562\u7d52\u64ab\u3a62() {
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
            putfield:int(\u34df\uceb8\u34df\u8640\u1187::\ub1b9\u156b\u4daf\u071d\u6cfe\u47c2, this:\u34df\uceb8\u34df\u8640\u1187<C>, add:int(getfield:int(\u34df\uceb8\u34df\u8640\u1187::\ub1b9\u156b\u4daf\u071d\u6cfe\u47c2, this:\u34df\uceb8\u34df\u8640\u1187<C>), and:int(ldc:int(6549), ldc:int(1))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8258\u4daf\u16f6\uc2e8\u8df4\uc4d2() {
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
            return:int(getfield:int(\u34df\uceb8\u34df\u8640\u1187::\ub1b9\u156b\u4daf\u071d\u6cfe\u47c2, this:\u34df\uceb8\u34df\u8640\u1187<C>))
        }
        
        goto(Label_0006)
    }
    
    public int \u946b\u3a62\u3e75\ub19c\u8308\u6c56() {
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
            return:int(xor:int(ldc:int(34), ldc:int(35)))
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> \ubf56\ud7e8\ubcb0\u3504\u69d9\ud7e8() {
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
            return:\u5654\u9937\u72f1\ud4fe\u0c95<?>(getfield:\u5654\u9937\u72f1\ud4fe\u0c95<C>(\u34df\uceb8\u34df\u8640\u1187::\u47c2\u59ec\uc910\u71ae\u99f7\u4e72, this:\u34df\uceb8\u34df\u8640\u1187<C>))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            putstatic:\u34df\uceb8\u34df\u8640\u1187<?>(\u34df\uceb8\u34df\u8640\u1187::\u8d98\u3c25\uc87f\u34df\u0a06\u5fe1, initobject:\u392e\u6d99\u9937\ua562\u392e[expected:\u34df\uceb8\u34df\u8640\u1187<?>](\u392e\u6d99\u9937\ua562\u392e::<init>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>(\u5654\u9937\u72f1\ud4fe\u0c95::\uc2e8\ube23\ub102\u5140\u51b2\ucb79), and:int(ldc:int(1190), ldc:int(-1255)), and:int(ldc:int(1174), ldc:int(-1175)), invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u98a4\u8258\u5d20\u64f2\ua068\uc4d2), and:int(ldc:int(-9876), ldc:int(9875)), ldc:long(0L)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u6c52\u7ce1\u7ce1\u72f1\ub19c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_646 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_651 : int
        
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
        var_3_646 = and:int(ldc:int(-1794786722), ldc:int(492101242))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u34df\uceb8\u34df\u8640\u1187<C>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(1841636128))
        }
        else {
            var_3_646 = and:int(var_3_646:int, ldc:int(-134956102))
            var_5_8A = and:int(ldc:int(-6162), ldc:int(6161))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11106), ldc:int(-12131)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_646:int, ldc:int(-1758278070))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(8770), ldc:int(8771)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-32604), ldc:int(-32603)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_646 = and:int(var_3_E3:int, ldc:int(932343613))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(6153), ldc:int(6152)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(363579894))
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1934714292))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1489000984))
                    }
                    else {
                        var_3_646 = and:int(var_3_646:int, ldc:int(502312571))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0798)
                        }
                    }
                    
                    Label_0404:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(757950565))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(454447098))
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1561150103))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(624393071))
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-18555677))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1786691634))
                        var_11_F4 = and:int(ldc:int(225), ldc:int(-226))
                        goto(Label_1499)
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-59077688))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1461963252))
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1698373490))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1659766087))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0798)
                        }
                    }
                    
                    Label_0682:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1353934780))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2002598812))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-26972903))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1111458130))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0798:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(376100619))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-465345776))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-679744952))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(27648), ldc:int(27649))
                                goto(Label_1071)
                            }
                        }
                    }
                    
                    Label_0898:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2007121654))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1164397198))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(159742190))
                            goto(Label_0798)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-983569124))
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1563009894))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-579830802))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(1573780366))
                        var_11_F4 = and:int(ldc:int(21316), ldc:int(-23405))
                    }
                    
                    Label_1071:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(926079009))
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(945969824))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0798)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1955076316))
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-458637660))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(528781038))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1338)
                            }
                        }
                    }
                    
                    Label_1189:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-343338022))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(559467234))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1071)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-135521190))
                            goto(Label_0898)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-285908998))
                            goto(Label_0798)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1569890871))
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-777890037))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(1976668025))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1499)
                    }
                    
                    Label_1338:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1851140198))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-65786228))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-399909382))
                        goto(Label_0798)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(847920928))
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-663249197))
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1163131317))
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1901687679))
                        loopcontinue()
                    }
                    
                    var_3_646 = and:int(var_3_646:int, ldc:int(-1254080916))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_651 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1428446148))
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-186893400))
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-68918970))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(2004589406))
                        var_17_651 = add:int(var_16_122:int, xor:int(ldc:int(16640), ldc:int(16641)))
                        looporswitchbreak()
                    }
                }
                
                var_3_646 = and:int(var_3_646:int, ldc:int(1035370363))
                
                if (cmple:boolean(var_5_8A = var_17_651:int, sub:int(var_6_91:int, and:int(ldc:int(16409), ldc:int(1185))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(-210836774))
            goto(Label_0108)
        }
    }
}
