public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ub1b9\u1187\u72f1\ub18d\u8709 {
    public void \ub1b9\u1187\u72f1\ub18d\u8709() {
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
            invokespecial:Object(Object::<init>, this:\ub1b9\u1187\u72f1\ub18d\u8709)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d \ubcb0\u4bc8\u4e72\u71ae\u527a\ub6ab(int p0) {
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
        
        switch (p0:int) {
            case 0:
                return:\u7049\u52d3\u8640\u5654\u1833\ub18d(getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ud36e\u0b8e\u8d90\ub1b9\u67d0\u72f1))
            
            case 1:
                return:\u7049\u52d3\u8640\u5654\u1833\ub18d(getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))
            
            case 2:
                return:\u7049\u52d3\u8640\u5654\u1833\ub18d(getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))
            
            case 3:
                return:\u7049\u52d3\u8640\u5654\u1833\ub18d(getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))
            
            default:
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d), and:int(ldc:int(4507), ldc:int(-4572)))), p0:int))))
        }
    }
    
    public static \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 \u4daf\u8cae\uff55\u836c\u71f1\ufcaf(\u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\ubefe\uc29a\ub83f\u6fb0 p0) {
        var_3_64 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_3_64 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, p0:\u97b7\ubefe\uc29a\ub83f\u6fb0[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1])
            return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, var_3_64:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\u8350\u8c8a\u99f7\u718f\u16f6\u6d99, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_3_64:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u3504\u3bc9\uc87f\u92ee\u9255\u36d3, p0:\u97b7\ubefe\uc29a\ub83f\u6fb0), ldc:int(-1), ldc:int(-1), ldc:int(-1))), getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uceb8\uc238\u4d85\uc3e3\u4bc8\u51fa), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u9033\u446c\uc4d2\u3e75\uc4d2\u1833, p0:\u97b7\ubefe\uc29a\ub83f\u6fb0), var_3_64:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    public static \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 \u759a\uc29a\ub18d\u67d0\ucb79\u6bb9(\u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\ubefe\uc29a\ub83f\u6fb0 p0) {
        var_3_64 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_3_64 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, p0:\u97b7\ubefe\uc29a\ub83f\u6fb0[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1])
            return:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, var_3_64:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\u8350\u8c8a\u99f7\u718f\u16f6\u6d99, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_3_64:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u3504\u3bc9\uc87f\u92ee\u9255\u36d3, p0:\u97b7\ubefe\uc29a\ub83f\u6fb0), ldc:int(-1), ldc:int(-1), ldc:int(-1))), getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uceb8\uc238\u4d85\uc3e3\u4bc8\u51fa), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u9033\u446c\uc4d2\u3e75\uc4d2\u1833, p0:\u97b7\ubefe\uc29a\ub83f\u6fb0), var_3_64:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    public static void \u416d\uf995\u6c56\u7e3f\u36d3\u62da(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p3) {
        var_6_70 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_6_70 = invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\u8350\u8c8a\u99f7\u718f\u16f6\u6d99, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uceb8\uc238\u4d85\uc3e3\u4bc8\u51fa), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p3:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_6_70:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uae87\u62da\u4f4a\u7d52\u8bb0\u4bc8)))
            invokevirtual:void(\u93a2\u67d0\ubb2b\u16f6\uc29a::\u965f\u5f50\u0a06\u6435\u1187\u385b, invokevirtual:\u93a2\u67d0\ubb2b\u16f6\uc29a(\u183a\u8640\u6fb0\ube23\u7e3f::\u6b5f\u0b8e\u76bc\u983f\uc2e8\u12b2, checkcast:\u183a\u8640\u6fb0\ube23\u7e3f(\u5245\u8aa5\u61a4\u7049\u4cd9.\u183a\u8640\u6fb0\ube23\u7e3f.class, invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, p3:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_6_70:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))), loadelement:String(getstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d), xor:int(ldc:int(66), ldc:int(67))))
            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p3:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\u8350\u8c8a\u99f7\u718f\u16f6\u6d99, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_6_70:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int(ldc:int(-22928), ldc:int(6543)), and:int(ldc:int(-30973), ldc:int(14580)), ldc:int(-1)), getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uceb8\uc238\u4d85\uc3e3\u4bc8\u51fa), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, var_6_70:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8bb0\ub113\u52d3\u3504\u74b1\uc246)), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ud4fe\u385b\u760c\u4f4a\u7043\u3e2a(java.lang.String p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p4) {
        var_8_8C : \u97b7\ubefe\uc29a\ub83f\u6fb0
        
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
            invokestatic:void(\ub1b9\u1187\u72f1\ub18d\u8709::\u51b2\u7873\u4c2b\u3711\uc2e8\u0c95, invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ub1b9\u1187\u72f1\ub18d\u8709::\u416d\uc84e\u960f\u624e\uc84e\u97b7, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u7049\u52d3\u8640\u5654\u1833\ub18d), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p4:\ube23\uc238\u5140\u4cd9\u8aa5)
            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p4:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u59ec\u6cfe\ubded\uc3e3\u0a06\uc9f6)))
            var_8_8C = checkcast:\u97b7\ubefe\uc29a\ub83f\u6fb0(\u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\ubefe\uc29a\ub83f\u6fb0.class, invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:\u97b7\ubefe\uc29a\ub83f\u6fb0](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, p4:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u3bc9\u071d\u9a18\ubefe\ud12e\u98a4, var_8_8C:\u97b7\ubefe\uc29a\ub83f\u6fb0, and:int[expected:boolean](ldc:int(-31787), ldc:int(30762)))
            invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u3711\u0a06\u4492\u59ec\u59ec\uc84e, var_8_8C:\u97b7\ubefe\uc29a\ub83f\u6fb0, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p0:String))
            invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u0c95\ubb2b\uc87f\u9033\ua068\u1187, var_8_8C:\u97b7\ubefe\uc29a\ub83f\u6fb0, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\ud171\ubf56\u8d90\u71f1\uc4d2\ua6bd, var_8_8C:\u97b7\ubefe\uc29a\ub83f\u6fb0, getstatic:\u36d3\u9255\u7873\u8350\uc3e3\u56bd(\u36d3\u9255\u7873\u8350\uc3e3\u56bd::\u8d98\ud51e\u385b\ud217\u92ff\u6cfe))
            invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u7049\u7006\uc84e\uf9c5\u0a06\u98a4, var_8_8C:\u97b7\ubefe\uc29a\ub83f\u6fb0, xor:int[expected:boolean](ldc:int(2824), ldc:int(2825)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\ubefe\uc29a\ub83f\u6fb0 \u61a4\u5654\u8df4\ub19c\u56bd\u64ab(java.lang.String p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, int p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p4, boolean p5) {
        var_6_8B : int
        var_8_6C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_9_75 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_10_11C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_11_1CC : \u97b7\ubefe\uc29a\ub83f\u6fb0
        
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
            var_6_8B = and:int(ldc:int(-993505585), ldc:int(-805830963))
            var_8_6C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\uc3e3\ub1b9\uc246\u3bd6\u3d4b\u7ce1, invokestatic:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\ub1b9\u1187\u72f1\ub18d\u8709::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:String, p4:\ube23\uc238\u5140\u4cd9\u8aa5))
            var_9_75 = invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ub1b9\u1187\u72f1\ub18d\u8709::\u416d\uc84e\u960f\u624e\uc84e\u97b7, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_8_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d)
            
            if (cmpne:boolean(p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ud36e\u0b8e\u8d90\ub1b9\u67d0\u72f1))) {
                loop {
                    if (cmpne:boolean(and:int(var_6_8B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_6_8B = and:int(var_6_8B:int, ldc:int(-259015818))
                        goto(Label_0206)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_8B:int, ldc:int(128)), ldc:int(0))) {
                        var_6_8B = and:int(var_6_8B:int, ldc:int(-540469363))
                        
                        if (cmpeq:boolean(p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))) {
                            var_10_11C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_8_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(8229), ldc:int(8228))), and:int(ldc:int(5281), ldc:int(-6050)), and:int(ldc:int(-28960), ldc:int(8476)))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0166:
                    
                    if (cmpeq:boolean(and:int(var_6_8B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_6_8B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_6_8B = and:int(var_6_8B:int, ldc:int(1669304518))
                            loopcontinue()
                        }
                        
                        var_6_8B = and:int(var_6_8B:int, ldc:int(-1496260145))
                        
                        if (cmpeq:boolean(p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))) {
                            var_10_11C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_8_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(-32692), ldc:int(-32691))), and:int(ldc:int(-10394), ldc:int(10265)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_8_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(2304), ldc:int(2305))))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0206:
                    
                    if (cmpne:boolean(and:int(var_6_8B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0166)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_8B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_6_8B = and:int(var_6_8B:int, ldc:int(1544712738))
                    }
                    else {
                        if (cmpeq:boolean(p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))) {
                            var_10_11C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int(ldc:int(8641), ldc:int(-8642)), and:int(ldc:int(-18153), ldc:int(17640)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_8_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(-31732), ldc:int(-31731))))
                            looporswitchbreak()
                        }
                        
                        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d), and:int(ldc:int(4646), ldc:int(2051)))), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d[expected:Object]))))
                    }
                }
            }
            else {
                var_10_11C = p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
            }
            
            invokestatic:void(\ub1b9\u1187\u72f1\ub18d\u8709::\ud36e\u51b2\u3a62\u8258\u624e\u7043, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p4:\ube23\uc238\u5140\u4cd9\u8aa5)
            invokestatic:void(\ub1b9\u1187\u72f1\ub18d\u8709::\u51b2\u7873\u4c2b\u3711\uc2e8\u0c95, var_9_75:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p4:\ube23\uc238\u5140\u4cd9\u8aa5)
            var_11_1CC = invokestatic:\u97b7\ubefe\uc29a\ub83f\u6fb0(\ub1b9\u1187\u72f1\ub18d\u8709::\u9af2\ub19c\u8753\u1833\u4e72\u4d85, p0:String, var_10_11C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, p4:\ube23\uc238\u5140\u4cd9\u8aa5, p5:boolean)
            invokevirtual:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>>(\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u4975\u5f50\ud51e\ucef1\ub6ab\uf94d, invokevirtual:\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\uff55\ub8be\u385b\u92ee\u7330, p4:\ube23\uc238\u5140\u4cd9\u8aa5), var_9_75:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int[expected:boolean](ldc:int(5), ldc:int(745)), and:int[expected:boolean](ldc:int(17027), ldc:int(-17028)))
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u839e\u6b0d\ubefe\ucef1\u0800\u5f50, p4:\ube23\uc238\u5140\u4cd9\u8aa5, var_9_75:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            return:\u97b7\ubefe\uc29a\ub83f\u6fb0(var_11_1CC:\u97b7\ubefe\uc29a\ub83f\u6fb0)
        }
        
        goto(Label_0006)
    }
    
    private static void \ud36e\u51b2\u3a62\u8258\u624e\u7043(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1) {
        var_2_61 : int
        var_4_6A : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_5_6D : int
        var_2_B5 : int
        var_6_AE : int
        
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
            var_2_61 = and:int(ldc:int(-1608423290), ldc:int(-2021927714))
            var_4_6A = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            var_5_6D = ldc:int(-1)
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
                    var_2_B5 = and:int(var_2_61:int, ldc:int(1362370108))
                }
                else {
                    var_2_B5 = and:int(var_2_61:int, ldc:int(-2081500938))
                    
                    if (cmplt:boolean(var_5_6D:int, and:int(ldc:int(68), ldc:int(2214)))) {
                        var_6_AE = ldc:int(-1)
                        
                        loop {
                            var_2_B5 = and:int(var_2_B5:int, ldc:int(-1837143641))
                            
                            if (cmpge:boolean(var_6_AE:int, xor:int(ldc:int(515), ldc:int(519)))) {
                                looporswitchbreak()
                            }
                            
                            invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u6d99\ud51e\uc87f\u4d85\u760c\ube23, p1:\ube23\uc238\u5140\u4cd9\u8aa5, add:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, var_4_6A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), var_5_6D:int), add:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, var_4_6A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), var_6_AE:int), xor:int[expected:boolean](ldc:int(12548), ldc:int(12549)))
                            inc:int(var_6_AE, ldc:int(1))
                        }
                        
                        var_2_61 = and:int(var_2_B5:int, ldc:int(-1967363137))
                        inc:int(var_5_6D, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_B5:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_B5:int, ldc:int(1327527628))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u51b2\u7873\u4c2b\u3711\uc2e8\u0c95(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p0, int p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public static \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 \u416d\uc84e\u960f\u624e\uc84e\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2) {
        var_6_79 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_99 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        
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
            var_6_79 = invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\u8350\u8c8a\u99f7\u718f\u16f6\u6d99, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(-1), ldc:int(-1), ldc:int(-1)), getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uceb8\uc238\u4d85\uc3e3\u4bc8\u51fa), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            var_7_99 = invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u52d3\u9937\u8753\u7e3f\u7330\u8258, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_6_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_6_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_6_79:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            invokevirtual:void(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u7043\ub8be\ub171\u8640\uf9c5\u6ec6, var_7_99:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokestatic:int(Math::min, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_7_99:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ube23\uc7fe\u927d\u873d\ud36e\u8cae, var_7_99:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))), and:int(ldc:int(-7713), ldc:int(7712)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokestatic:int(Math::min, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_7_99:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4daf\u3bc9\u98a4\u6ec6\u16f6\u3d64, var_7_99:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)))))
            return:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(var_7_99:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u6c56\u385b\u93a2\u4d85\ub113\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, int p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public static \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u34df\uc84e\u3bd6\u4492\ud12e\u47c2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, int p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public static java.util.Collection<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u16f6\u3d64\u0c95\u8258\u5f50\u69d9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, int p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2) {
        var_3_EE : int
        var_5_65 : ArrayList
        var_6_78 : \u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7
        var_7_80 : int
        var_8_BE : int
        var_3_117 : int
        var_9_108 : int
        var_10_151 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_3_EE = and:int(ldc:int(97531406), ldc:int(-845352982))
            var_5_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_78 = invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), i2d:double(p1:int))
            var_7_80 = d2i:int(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, var_6_78:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(2)), ldc:int(0))) {
                    var_3_EE = and:int(var_3_EE:int, ldc:int(38164584))
                }
                else {
                    var_3_EE = and:int(var_3_EE:int, ldc:int(-1649394753))
                    
                    if (cmple:boolean(var_7_80:int, d2i:int(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, var_6_78:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)))) {
                        var_8_BE = d2i:int(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, var_6_78:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_117 = and:int(var_3_EE:int, ldc:int(282132438))
                            }
                            else {
                                var_3_117 = and:int(var_3_EE:int, ldc:int(-946079125))
                                
                                if (cmple:boolean(var_8_BE:int, d2i:int(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, var_6_78:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)))) {
                                    var_9_108 = d2i:int(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, var_6_78:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7))
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_3_117:int, ldc:int(8388608)), ldc:int(0))) {
                                            var_3_117 = and:int(var_3_117:int, ldc:int(-7198954))
                                            
                                            if (cmple:boolean(var_9_108:int, d2i:int(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, var_6_78:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)))) {
                                                var_10_151 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, var_7_80:int, var_8_BE:int, var_9_108:int)
                                                
                                                if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p2:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_10_151:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u59ec\u6cfe\ubded\uc3e3\u0a06\uc9f6))) {
                                                    invokeinterface:boolean(Collection<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, var_5_65:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Collection<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], var_10_151:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                                }
                                                
                                                var_3_117 = and:int(var_3_117:int, ldc:int(534197795))
                                                inc:int(var_9_108, ldc:int(1))
                                                loopcontinue()
                                            }
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_3_117:int, ldc:int(2)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_3_117 = and:int(var_3_117:int, ldc:int(-1153987994))
                                    }
                                    
                                    var_3_EE = and:int(var_3_117:int, ldc:int(1553345091))
                                    inc:int(var_8_BE, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(2097152)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_3_EE = and:int(var_3_117:int, ldc:int(2092030357))
                        }
                        
                        var_3_EE = and:int(var_3_117:int, ldc:int(1183933258))
                        inc:int(var_7_80, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:Collection<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(var_5_65:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)
        }
        
        goto(Label_0006)
    }
    
    private static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u40a9\u8753\u9937\u4daf\uc2bd\ufe34 \u12cb\ubf56\u647c\u7330\u446c\u836c(java.lang.String p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1) {
        var_4_66 : \u0a06\ufe34\u64ab\ub83f\ub18d\u74b1
        var_5_75 : \u40a9\u8753\u9937\u4daf\uc2bd\ufe34
        var_6_9E : String
        stack_B8_0 : String [generated]
        expr_AA : String[] [generated]
        var_7_BB : Path
        var_8_C2 : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
        var_4_66 = invokevirtual:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc238\u5140\u4cd9\u8aa5::\ube23\u5bc4\u5140\u16f6\u0800\u416d, p1:\ube23\uc238\u5140\u4cd9\u8aa5)
        var_5_75 = invokevirtual:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1::\u69d9\u3a62\u4975\u527a\u7e3f\u8258, var_4_66:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p0:String))
        
        if (cmpne:boolean(var_5_75:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34, aconstnull:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34())) {
            return:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(var_5_75:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34)
        }
        
        var_6_9E = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d), and:int(ldc:int(263), ldc:int(531)))))
        stack_B8_0 = getstatic:String(\ub1b9\u1187\u72f1\ub18d\u8709::\u92ff\ua6bd\u120d\uc31c\u6fb0\u156b)
        expr_AA = newarray:String[](java.lang.String.class, xor:int(ldc:int(1152), ldc:int(1153)))
        storeelement:String(expr_AA:String[], and:int(ldc:int(3488), ldc:int(-3493)), var_6_9E:String)
        var_7_BB = invokestatic:Path(Paths::get, stack_B8_0:String, expr_AA:String[])
        var_8_C2 = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\ub1b9\u1187\u72f1\ub18d\u8709::\ub6ab\ub18d\uf995\uc31c\uc9f6\u99f7, var_7_BB:Path)
        
        if (cmpne:boolean(var_8_C2:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
            return:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(invokevirtual:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1::\uc29a\uf94d\uf9c5\ucfaf\uae5d\u4bc8, var_4_66:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, var_8_C2:\uc31c\uc87f\uc246\u3776\ub7dc))
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d), xor:int(ldc:int(6149), ldc:int(6145)))), var_7_BB:Path[expected:Object]), loadelement:String(getstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d), xor:int(ldc:int(-24320), ldc:int(-24315)))))))
    }
    
    private static \u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\ubefe\uc29a\ub83f\u6fb0 \u9af2\ub19c\u8753\u1833\u4e72\u4d85(java.lang.String p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p3, boolean p4) {
        var_7_79 : \u97b7\ubefe\uc29a\ub83f\u6fb0
        
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
        invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p3:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u59ec\u6cfe\ubded\uc3e3\u0a06\uc9f6)))
        var_7_79 = checkcast:\u97b7\ubefe\uc29a\ub83f\u6fb0(\u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\ubefe\uc29a\ub83f\u6fb0.class, invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:\u97b7\ubefe\uc29a\ub83f\u6fb0](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, p3:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\ud171\ubf56\u8d90\u71f1\uc4d2\ua6bd, var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0, getstatic:\u36d3\u9255\u7873\u8350\uc3e3\u56bd(\u36d3\u9255\u7873\u8350\uc3e3\u56bd::\ubded\u494c\u7ce1\ub18d\u071d\u61a4))
        invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\ud51e\u760c\u64ab\u624e\u88c5\uae87, var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d)
        invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u3bc9\u071d\u9a18\ubefe\ud12e\u98a4, var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0, and:int[expected:boolean](ldc:int(23185), ldc:int(-23192)))
        invokevirtual:void(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u3711\u0a06\u4492\u59ec\u59ec\uc84e, var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p0:String))
        invokevirtual:boolean(\u97b7\ubefe\uc29a\ub83f\u6fb0::\uc87f\u385b\u760c\uff55\u8bb0\u71f1, var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0, p3:\ube23\uc238\u5140\u4cd9\u8aa5, p4:boolean)
        
        if (cmpne:boolean(invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u3504\u3bc9\uc87f\u92ee\u9255\u36d3, var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0), getstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u92ee\u56bd\u7ce1\ua6bd\u8709\u946b))) {
            return:\u97b7\ubefe\uc29a\ub83f\u6fb0(var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0)
        }
        
        invokevirtual:boolean(\u97b7\ubefe\uc29a\ub83f\u6fb0::\ud51e\u385b\u7bad\ub7dc\uf995\u927d, var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0, p3:\ube23\uc238\u5140\u4cd9\u8aa5, p4:boolean, invokestatic:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\ub1b9\u1187\u72f1\ub18d\u8709::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:String, p3:\ube23\uc238\u5140\u4cd9\u8aa5))
        
        if (cmpne:boolean(invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u97b7\ubefe\uc29a\ub83f\u6fb0::\u3504\u3bc9\uc87f\u92ee\u9255\u36d3, var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0), getstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u92ee\u56bd\u7ce1\ua6bd\u8709\u946b))) {
            return:\u97b7\ubefe\uc29a\ub83f\u6fb0(var_7_79:\u97b7\ubefe\uc29a\ub83f\u6fb0)
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d), and:int(ldc:int(5382), ldc:int(167)))), p0:String))))
    }
    
    private static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ub6ab\ub18d\uf995\uc31c\uc9f6\u99f7(java.nio.file.Path p0) {
        var_1_61 : int
        var_3_6C : BufferedReader
        var_4_77 : String
        stack_8A_0 : \uc31c\uc87f\uc246\u3776\ub7dc [generated]
        var_3_9C : CommandSyntaxException
        
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
        var_1_61 = and:int(ldc:int(-402396290), ldc:int(-126091269))
        
        try {
            var_1_61 = and:int(var_1_61:int, ldc:int(-10358785))
            var_3_6C = invokestatic:BufferedReader(Files::newBufferedReader, p0:Path)
            var_1_61 = and:int(var_1_61:int, ldc:int(-1441937))
            var_4_77 = invokestatic:String(IOUtils::toString, var_3_6C:BufferedReader[expected:Reader])
            var_1_61 = and:int(var_1_61:int, ldc:int(-57283586))
            stack_8A_0 = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u3e75\u6c52\u946b\u76bc\uc31c::\u8df4\u0b8e\u983f\u8c8a\uc9f6\u8308, var_4_77:String)
            var_1_61 = and:int(var_1_61:int, ldc:int(-349439126))
            return:\uc31c\uc87f\uc246\u3776\ub7dc(stack_8A_0:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        catch (java.io.IOException var_3_8F) {
            return:\uc31c\uc87f\uc246\u3776\ub7dc(aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_3_9C) {
            athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d), xor:int(ldc:int(29), ldc:int(26)))), p0:Path[expected:Object])), var_3_9C:Throwable))
        }
    }
    
    private static void \uc2e8\uf9c5\u6435\u4ab3\ub19c\ub83f(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2) {
        var_5_148 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_6_72 : \u6b0d\uc3e3\u12cb\u5bc4\u0b8e
        var_7_D6 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d[]
        
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
            var_5_148 = aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()
            var_6_72 = invokestatic:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\ud171\ud217\u6ec6\u8640\u8753\u7d52, invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>](\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, invokevirtual:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\ube23\uc238\u5140\u4cd9\u8aa5::\u4bc8\ubff1\u76bc\u718f\uc238\u6d69, p2:\ube23\uc238\u5140\u4cd9\u8aa5), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f)))
            
            if (logicalnot:boolean(instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e.class, var_6_72:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))) {
                if (cmpne:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), sub:int(p0:int, and:int(ldc:int(2113), ldc:int(30211))))) {
                    if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), sub:int(p0:int, and:int(ldc:int(8355), ldc:int(4621))))) {
                        var_5_148 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u3a62\u47c2\u946b\u6c56\u51b2::\u416d\u6fb0\u4cd9\u0b8e\u67d0\u9937, invokevirtual:\u3a62\u47c2\u946b\u6c56\u51b2(\uae5d\u8d98\u7d52\u4f52\u51b2::\u6ec6\ua068\u6d69\u7c6b\u7ce1\ufe34, invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\uc2e8\u9255\u647c\ud171\ubf56::\u16f6\uf9c5\u62da\u4975\u527a\u5db4, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, p2:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))))
                    }
                }
                else {
                    var_5_148 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u3a62\u47c2\u946b\u6c56\u51b2::\ubb2b\u527a\uc4d2\ud158\u59ec\u69d9, invokevirtual:\u3a62\u47c2\u946b\u6c56\u51b2(\uae5d\u8d98\u7d52\u4f52\u51b2::\u6ec6\ua068\u6d69\u7c6b\u7ce1\ufe34, invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\uc2e8\u9255\u647c\ud171\ubf56::\u16f6\uf9c5\u62da\u4975\u527a\u5db4, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, p2:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))))
                }
            }
            else {
                var_7_D6 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u3e2a\u392e\u6198\u965f\u7ce1\u64f2, var_6_72:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)
                
                if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p0:int)) {
                    if (cmple:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), arraylength:int(var_7_D6:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[]))) {
                        var_5_148 = loadelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(var_7_D6:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[], sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(-16312), ldc:int(-16311))))
                    }
                }
            }
            
            if (cmpeq:boolean(var_5_148:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
                var_5_148 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd))
            }
            
            invokevirtual:boolean(\ub6ab\ube23\uae87\uc84e\u1833::\u1833\u446c\u6b5f\u392e\u071d\u6b5f, initobject:\ub6ab\ube23\uae87\uc84e\u1833(\ub6ab\ube23\uae87\uc84e\u1833::<init>, var_5_148:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, invokestatic:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(Collections::emptySet), checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())), p2:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int(ldc:int(1346), ldc:int(16390)))
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u8aa5\uc910\ud217\u5db4\uafe7, p2:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_5_148:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u6d69\u8753\u6435\ub70c\u64ab\ub70c(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2) {
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
            return:boolean(invokevirtual:boolean(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u760c\u446c\u64ab\uc246\ucb79\u6c52, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokestatic:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\ub1b9\u1187\u72f1\ub18d\u8709::\u4daf\u8cae\uff55\u836c\u71f1\ufcaf, checkcast:\u97b7\ubefe\uc29a\ub83f\u6fb0(\u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\ubefe\uc29a\ub83f\u6fb0.class, invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:\u97b7\ubefe\uc29a\ub83f\u6fb0](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, p2:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))), ldc:double(1.0)), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u4c2b\u6198\u5245\u3bd6\u4bc8\uc29a, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u927d\u7af6\u6cfe\u6ec6\u6bb9\ud36e$3(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            return:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u120d\u62da\u69d9\u16f6\u6d99\u0800, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4d85\u71ae\u494c\u839e\uf9c5\u93a2$2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
            return:boolean(invokestatic:boolean(\ub1b9\u1187\u72f1\ub18d\u8709::\u6d69\u8753\u6435\ub70c\u64ab\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u516c\u3dd3\u3bd6\u93a2\u0c95\u8cae$1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1350598210), ldc:int(1922014679))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2013607882))
                stack_8A_0 = and:int(ldc:int(1577), ldc:int(-1578))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(4744), ldc:int(4745))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u8c8a\u62da\u7c6b\u385b\u3dd3\ud12e$0(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
            invokestatic:void(\ub1b9\u1187\u72f1\ub18d\u8709::\uc2e8\uf9c5\u6435\u4ab3\ub19c\ub83f, p0:int, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ube23\uc238\u5140\u4cd9\u8aa5)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2A0 : int
        expr_6E : int [generated]
        stack_9D_0 : byte[] [generated]
        stack_9F_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_DA_0 : byte[] [generated]
        stack_225_0 : byte[] [generated]
        stack_2B3_0 : byte[] [generated]
        stack_30A_0 : byte[] [generated]
        var_4_206 : int
        var_3_20B : byte[]
        var_5_20C : int
        var_0_23F : int
        expr_225 : byte [generated]
        stack_26E_2 : byte [generated]
        stack_242_0 : byte [generated]
        expr_2B9 : byte [generated]
        expr_9F : int [generated]
        var_2_BB : byte[]
        expr_BF : int [generated]
        var_3_2F8 : byte[]
        var_5_2F9 : int
        var_3_E6 : String
        expr_EE : String[] [generated]
        expr_F8 : String[] [generated]
        
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
        var_0_2A0 = and:int(ldc:int(1627126137), ldc:int(-455099029))
        expr_6E = arraylength:int(stack_9D_0 = stack_9F_0 = stack_BB_0 = stack_BD_0 = stack_DA_0 = stack_225_0 = stack_2B3_0 = stack_30A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("/uZ2/CXi9wD7WH9/gACogYahidv5GmmA/IfmegCK+qKGfBqG2Hyi5/WD+9weC/7//dh/f4AAiBiKiIX45X6ZHQN7++jtBgJ9exiBgAOc4n2DgAgAenr+2H9/gACogQcGAwAQAXv9WweCfgUDY54L+nt6XnkniYKdh935CoUAfX332H9/gACokQeKhdxuoYB6H4Jc+QqFAH1999h/f4AAqJGGg/7iagCli/d/emJ2hQCjk4oBh+FrdoF3fHkA+f8Jf4AAiHgBA/8Cf4UAk3cAgn+OCYR4f38ABagJigB24npWnov9/QP8IJsjnn/w5V9/52WDgeCei/YEAXgAAXiCYHyFsX+CfPxR")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_206 = expr_6E:int
        var_3_20B = newarray:byte[](byte.class, expr_6E:int)
        var_5_20C = expr_6E:int
        Label_0526:
        
        while (cmpne:boolean(and:int(var_0_2A0:int, ldc:int(65536)), ldc:int(0))) {
            var_0_23F = and:int(var_0_2A0:int, ldc:int(1778085777))
            var_5_20C = add:int(var_5_20C:int, ldc:int(-1))
            expr_225 = stack_26E_2 = loadelement(stack_225_0, var_5_20C)
            
            if (cmplt:boolean(add:int(add:int(var_5_20C:int, ldc:int(5)), neg:int(var_4_206:int)), ldc:int(0))) {
                stack_26E_2 = stack_242_0 = add:byte(expr_225:byte, loadelement:byte(var_3_20B:byte[], add:int(var_5_20C:int, ldc:int(5))))
                goto(Label_0594)
            }
            
            Label_0562:
            
            if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_23F = and:int(var_0_23F:int, ldc:int(1643641363))
                stack_26E_2 = stack_242_0 = add:byte(expr_225:byte, ldc:byte(5))
            }
            
            Label_0594:
            
            if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(512)), ldc:int(0))) {
                var_0_23F = and:int(var_0_23F:int, ldc:int(1605497629))
                goto(Label_0562)
            }
            
            var_0_2A0 = and:int(var_0_23F:int, ldc:int(-402687975))
            storeelement:byte(var_3_20B:byte[], var_5_20C:int, stack_26E_2:byte)
            
            if (cmpne:boolean(var_5_20C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_BB_0 = stack_BD_0 = stack_DA_0 = stack_225_0 = stack_2B3_0 = stack_30A_0 = var_3_20B:byte[]
            goto(Label_0115)
        }
        
        Label_0660:
        
        while (cmpeq:boolean(and:int(var_0_2A0:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_2A0 = and:int(var_0_2A0:int, ldc:int(-453772707))
            var_5_20C = add:int(var_5_20C:int, ldc:int(-1))
            expr_2B9 = add:byte(xor:byte(loadelement:byte(stack_2B3_0:byte[], var_5_20C:int), ldc:byte(64)), ldc:byte(115))
            storeelement:byte(var_3_20B:byte[], var_5_20C:int, or:int(and:int(shl:int(expr_2B9:byte, xor:int(ldc:int(-8127), ldc:int(-8123))), ldc:int(-16)), and:int(shr:int(expr_2B9:byte[expected:int], and:int(ldc:int(10284), ldc:int(324))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_20C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_BB_0 = stack_BD_0 = stack_DA_0 = stack_225_0 = stack_2B3_0 = stack_30A_0 = var_3_20B:byte[]
            goto(Label_0164)
        }
        
        var_0_2A0 = and:int(var_0_2A0:int, ldc:int(272908341))
        goto(Label_0526)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_2A0:int, ldc:int(512)), ldc:int(0))) {
            var_0_2A0 = and:int(var_0_2A0:int, ldc:int(583032150))
            goto(Label_0196)
        }
        
        if (cmpeq:boolean(and:int(var_0_2A0:int, ldc:int(8192)), ldc:int(0))) {
            var_0_2A0 = and:int(var_0_2A0:int, ldc:int(973560507))
        }
        else {
            var_0_2A0 = and:int(var_0_2A0:int, ldc:int(-53219719))
            expr_9F = arraylength:int(stack_9F_0:byte[])
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_4_206 = expr_9F:int
                var_3_20B = newarray:byte[](byte.class, expr_9F:int)
                var_5_20C = expr_9F:int
                goto(Label_0660)
            }
        }
        
        Label_0164:
        
        if (cmpne:boolean(and:int(var_0_2A0:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2A0:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2A0 = and:int(var_0_2A0:int, ldc:int(2060954951))
            var_2_BB = stack_BB_0:byte[]
            expr_BF = add:int(arraylength:int(stack_BD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BF:int, ldc:int(0))) {
                var_3_2F8 = newarray:byte[](byte.class, expr_BF:int)
                var_5_2F9 = expr_BF:int
                
                loop {
                    var_0_2A0 = and:int(var_0_2A0:int, ldc:int(1945369205))
                    var_5_2F9 = add:int(var_5_2F9:int, ldc:int(-1))
                    storeelement:byte(var_3_2F8:byte[], var_5_2F9:int, add:int(shl:int(loadelement:byte(stack_30A_0:byte[], var_5_2F9:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_BB:byte[], add:int(var_5_2F9:int, and:int(ldc:int(8323), ldc:int(24069)))), ldc:int(3)), xor:int(ldc:int(6466), ldc:int(6493)))))
                    
                    if (cmpne:boolean(var_5_2F9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9F_0 = stack_9D_0 = stack_BB_0 = stack_BD_0 = stack_DA_0 = stack_225_0 = stack_2B3_0 = stack_30A_0 = var_3_2F8:byte[]
            }
        }
        
        Label_0196:
        
        if (cmpne:boolean(and:int(var_0_2A0:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        if (cmpeq:boolean(and:int(var_0_2A0:int, ldc:int(128)), ldc:int(0))) {
            var_3_E6 = initobject:String(String::<init>, stack_DA_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_EE = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2178), ldc:int(2187)))
            expr_F8 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(523), ldc:int(4221)))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(2240), ldc:int(2245)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(25028), ldc:int(-27109)), and:int(ldc:int(197), ldc:int(4422))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(6530), ldc:int(6529)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(4189), ldc:int(4121)), and:int(ldc:int(9561), ldc:int(2121))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(81), ldc:int(85)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(4662), ldc:int(4735)), and:int(ldc:int(103), ldc:int(1263))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(4885), ldc:int(4882)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(2629), ldc:int(2594)), and:int(ldc:int(142), ldc:int(16557))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(13006), ldc:int(2054)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(2386), ldc:int(2526)), xor:int(ldc:int(16742), ldc:int(16835))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(18), ldc:int(14379)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(2277), ldc:int(25765)), xor:int(ldc:int(8356), ldc:int(8211))))
            storeelement:String(expr_EE:String[], and:int(ldc:int(1033), ldc:int(24840)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(4183), ldc:int(4320)), and:int(ldc:int(8411), ldc:int(23017))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(-4767), ldc:int(4750)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(25289), ldc:int(223)), xor:int(ldc:int(8342), ldc:int(8301))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(5337), ldc:int(8455)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(767), ldc:int(21755)), xor:int(ldc:int(-32266), ldc:int(-32527))))
            putstatic:String[](\ub1b9\u1187\u72f1\ub18d\u8709::\ud158\u2dcc\u74b1\ud523\u97b7\u120d, expr_F8:String[])
            putstatic:String(\ub1b9\u1187\u72f1\ub18d\u8709::\u92ff\ua6bd\u120d\uc31c\u6fb0\u156b, loadelement:String(expr_EE:String[], xor:int(ldc:int(16456), ldc:int(16448))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u3dd3\u156b\uc87f\u4bc8\ub83f\u7043(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C1 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6CC : int
        
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
        var_3_6C1 = and:int(ldc:int(1490570978), ldc:int(803994787))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub1b9\u1187\u72f1\ub18d\u8709[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16)), ldc:int(0))) {
            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-61311691))
        }
        else {
            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1714980693))
            var_5_8A = and:int(ldc:int(11531), ldc:int(-11532))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19011), ldc:int(19010)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6C1:int, ldc:int(-92086805))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(24619), ldc:int(4481)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(6793), ldc:int(1041)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6C1 = and:int(var_3_E3:int, ldc:int(-1981429582))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1280), ldc:int(1281)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1156172626))
                        goto(Label_1616)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-2096395745))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1928705700))
                        goto(Label_1010)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1789907247))
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0745)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-518707248))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-39007234))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0876)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1616)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(390916796))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1642057187))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1010)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1331230054))
                        goto(Label_0745)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-633251302))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1651912019))
                            loopcontinue()
                        }
                        
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1054198515))
                        var_11_F4 = and:int(ldc:int(15972), ldc:int(-32374))
                        goto(Label_1605)
                    }
                    
                    Label_0604:
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1616)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(255461696))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(2137662224))
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-186035353))
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1010452103))
                        goto(Label_1010)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(791496194))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1594017324))
                            loopcontinue()
                        }
                        
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-275972426))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0876)
                        }
                    }
                    
                    Label_0745:
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1616)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-997209420))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-800502546))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1470978200))
                        goto(Label_1010)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-772003847))
                            loopcontinue()
                        }
                        
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1822194667))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0876:
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1616)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1512632511))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-670424672))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1103318666))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0745)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-365919909))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(890541409))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1573317551))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(556), ldc:int(557))
                                goto(Label_1168)
                            }
                        }
                    }
                    
                    Label_1010:
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1616)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-806849574))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(188571792))
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0876)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-729960245))
                            goto(Label_0745)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(2146724326))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(746744559))
                        var_11_F4 = and:int(ldc:int(16486), ldc:int(-16999))
                    }
                    
                    Label_1168:
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(74490282))
                        goto(Label_1616)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-2028905043))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-96599500))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1921904345))
                            goto(Label_1010)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1208579379))
                            goto(Label_0876)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1877493424))
                            goto(Label_0745)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1266394122))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1822685139))
                            loopcontinue()
                        }
                        
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1487163059))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1479)
                            }
                        }
                    }
                    
                    Label_1328:
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1616)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(576764636))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1168)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-505321709))
                            goto(Label_1010)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0876)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-579087156))
                            goto(Label_0745)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1377766891))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(120916167))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1349473095))
                            loopcontinue()
                        }
                        
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(167607018))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1605)
                    }
                    
                    Label_1479:
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1616)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-469667158))
                        goto(Label_1010)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-682115782))
                        goto(Label_0745)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1924438020))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C1 = and:int(var_3_6C1:int, ldc:int(1267162807))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1605:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CC = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1616:
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-1640356926))
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(2064713408))
                        goto(Label_1010)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-459430300))
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0745)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-857646557))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C1 = and:int(var_3_6C1:int, ldc:int(736611774))
                        var_17_6CC = add:int(var_16_122:int, and:int(ldc:int(65), ldc:int(2337)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C1 = and:int(var_3_6C1:int, ldc:int(-325922902))
                
                if (cmple:boolean(var_5_8A = var_17_6CC:int, sub:int(var_6_91:int, xor:int(ldc:int(-32476), ldc:int(-32475))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6C1:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_6C1 = and:int(var_3_6C1:int, ldc:int(119878145))
            goto(Label_0108)
        }
    }
}
