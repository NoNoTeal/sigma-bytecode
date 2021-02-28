public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u446c\ud51e\u836c\u6b0d\u8413\u8c8a {
    public void \u446c\ud51e\u836c\u6b0d\u8413\u8c8a(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0) {
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
            invokespecial:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::<init>, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)
            putfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a, invokestatic:LinkedHashMap[expected:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>](Maps::newLinkedHashMap))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u7873\u873d\u5654\ub32d\uc229\u3a62, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\ub32d\ub18d\uc31c\uc7fe\u71ae(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
        var_2_14D : int
        var_4_80 : int
        var_5_84 : int
        var_6_94 : Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>
        var_7_B6 : \u3bd6\ub7dc\uc238\u88c5\u516c\uc238
        var_8_C5 : int
        var_9_EB : ITextComponent
        
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
            var_2_14D = and:int(ldc:int(506154932), ldc:int(515852277))
            
            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::isEmpty, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))) {
                var_4_80 = invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uae87\ua562\uceb8\uc9f6\u600f\u74b1, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u7873\u873d\u5654\ub32d\uc229\u3a62, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))
                var_5_84 = ldc:int(12)
                var_6_94 = invokeinterface:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(Collection<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::iterator, invokeinterface:Collection<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::values, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))
                
                loop {
                    var_2_14D = and:int(var_2_14D:int, ldc:int(1022095092))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_94:Iterator))) {
                        looporswitchbreak()
                    }
                    
                    var_7_B6 = checkcast:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\ub7dc\uc238\u88c5\u516c\uc238.class, invokeinterface:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::next, var_6_94:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>))
                    var_8_C5 = sub:int(div:int(var_4_80:int, and:int(ldc:int(10435), ldc:int(1030))), ldc:int(91))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
                    invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u7873\u873d\u5654\ub32d\uc229\u3a62, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u8389\ub32d\ud171\ub18d\ub83f\u7043))
                    invokespecial:void(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\uae87\u183a\u4492\u6ec6\u7330\ufe34, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_8_C5:int, var_5_84:int, var_7_B6:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238[expected:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf])
                    var_9_EB = invokevirtual:ITextComponent(\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u7bad\uc2e8\u97e6\u4c04\uf9c5\uc84e, var_7_B6:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238[expected:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf])
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6bb9\u67e9\u8df4\u8413\u624e\ucb79, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u7873\u873d\u5654\ub32d\uc229\u3a62, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_9_EB:ITextComponent, i2f:float(sub:int(div:int(var_4_80:int, and:int(ldc:int(2382), ldc:int(22147))), div:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u7873\u873d\u5654\ub32d\uc229\u3a62, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)), var_9_EB:ITextComponent[expected:ITextProperties]), and:int(ldc:int(1918), ldc:int(18434))))), i2f:float(sub:int(var_5_84:int, ldc:int(9))), ldc:int(16777215))
                    inc:int(var_5_84, ldc:int(19))
                    
                    if (cmpge:boolean(var_5_84:int, div:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\ud171\u3e75\u76bc\u99f7\u946b, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u7873\u873d\u5654\ub32d\uc229\u3a62, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a))), and:int(ldc:int(3), ldc:int(3747))))) {
                        looporswitchbreak()
                    }
                    
                    var_2_14D = and:int(var_2_14D:int, ldc:int(2146126908))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uae87\u183a\u4492\u6ec6\u7330\ufe34(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf p3) {
        var_7_B2 : int
        
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
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, and:int(ldc:int(-3853), ldc:int(3852)), mul:int(mul:int(invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u5db4\u6435\u8d90\u927d\u4c2b[expected:Enum<\u5db4\u6435\u8d90\u927d\u4c2b>](\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u69d9\u9255\u873d\u839e\u3d64\u56bd, p3:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf)), and:int(ldc:int(469), ldc:int(5))), xor:int(ldc:int(12546), ldc:int(12544))), and:int(ldc:int(5566), ldc:int(695)), and:int(ldc:int(10245), ldc:int(4365)))
            
            if (cmpne:boolean(invokevirtual:\ub1b9\ub32d\u3bd6\ud158\ua068\uc229(\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u61a4\ud171\u16f6\uc9f6\ube23\ud12e, p3:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf), getstatic:\ub1b9\ub32d\u3bd6\ud158\ua068\uc229(\ub1b9\ub32d\u3bd6\ud158\ua068\uc229::\u12cb\ud7e8\u983f\ud12e\u8bb0\uc7fe))) {
                invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, and:int(ldc:int(2930), ldc:int(-3955)), add:int(ldc:int(80), mul:int(mul:int(sub:int(invokevirtual:int(Enum<E>::ordinal, invokevirtual:\ub1b9\ub32d\u3bd6\ud158\ua068\uc229[expected:Enum<\ub1b9\ub32d\u3bd6\ud158\ua068\uc229>](\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u61a4\ud171\u16f6\uc9f6\ube23\ud12e, p3:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf)), xor:int(ldc:int(24576), ldc:int(24577))), and:int(ldc:int(28933), ldc:int(5))), xor:int(ldc:int(8401), ldc:int(8403)))), xor:int(ldc:int(17508), ldc:int(17618)), and:int(ldc:int(263), ldc:int(16485)))
            }
            
            var_7_B2 = f2i:int(mul:float(invokevirtual:float(\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u8389\u4179\u88c5\u97b7\ucb79\u92ff, p3:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf), ldc:float(183.0f)))
            
            if (cmpgt:boolean(var_7_B2:int, ldc:int(0))) {
                invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, and:int(ldc:int(30048), ldc:int(-32097)), add:int(mul:int(mul:int(invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u5db4\u6435\u8d90\u927d\u4c2b[expected:Enum<\u5db4\u6435\u8d90\u927d\u4c2b>](\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u69d9\u9255\u873d\u839e\u3d64\u56bd, p3:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf)), and:int(ldc:int(18239), ldc:int(12421))), and:int(ldc:int(6423), ldc:int(24674))), and:int(ldc:int(4117), ldc:int(8653))), var_7_B2:int, and:int(ldc:int(53), ldc:int(3341)))
                
                if (cmpne:boolean(invokevirtual:\ub1b9\ub32d\u3bd6\ud158\ua068\uc229(\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u61a4\ud171\u16f6\uc9f6\ube23\ud12e, p3:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf), getstatic:\ub1b9\ub32d\u3bd6\ud158\ua068\uc229(\ub1b9\ub32d\u3bd6\ud158\ua068\uc229::\u12cb\ud7e8\u983f\ud12e\u8bb0\uc7fe))) {
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, and:int(ldc:int(4947), ldc:int(-6996)), add:int(add:int(ldc:int(80), mul:int(mul:int(sub:int(invokevirtual:int(Enum<E>::ordinal, invokevirtual:\ub1b9\ub32d\u3bd6\ud158\ua068\uc229[expected:Enum<\ub1b9\ub32d\u3bd6\ud158\ua068\uc229>](\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u61a4\ud171\u16f6\uc9f6\ube23\ud12e, p3:\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf)), and:int(ldc:int(17921), ldc:int(329))), xor:int(ldc:int(2563), ldc:int(2566))), and:int(ldc:int(2123), ldc:int(822)))), xor:int(ldc:int(688), ldc:int(693))), var_7_B2:int, xor:int(ldc:int(17041), ldc:int(17044)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\u8640\u4d85\ubded\u7af6\ube23(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u16f6\uf94d\u156b\uc29a\ub7dc p0) {
        var_2_93 : int
        
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
            var_2_93 = and:int(ldc:int(-150673277), ldc:int(2103393799))
            
            if (cmpne:boolean(invokevirtual:\u960f\u67e9\u76bc\u6c56\u69d9(\u16f6\uf94d\u156b\uc29a\ub7dc::\ub6ab\u34df\ub113\u71f1\ub32d\u5bc4, p0:\u16f6\uf94d\u156b\uc29a\ub7dc), getstatic:\u960f\u67e9\u76bc\u6c56\u69d9(\u960f\u67e9\u76bc\u6c56\u69d9::\ud4fe\ufcaf\u69d9\ua61f\u873d\u7af6))) {
                do {
                    if (cmpeq:boolean(and:int(var_2_93:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_93 = and:int(var_2_93:int, ldc:int(-2013100768))
                    }
                    else {
                        var_2_93 = and:int(var_2_93:int, ldc:int(-147348657))
                        
                        if (cmpne:boolean(invokevirtual:\u960f\u67e9\u76bc\u6c56\u69d9(\u16f6\uf94d\u156b\uc29a\ub7dc::\ub6ab\u34df\ub113\u71f1\ub32d\u5bc4, p0:\u16f6\uf94d\u156b\uc29a\ub7dc), getstatic:\u960f\u67e9\u76bc\u6c56\u69d9(\u960f\u67e9\u76bc\u6c56\u69d9::\u6d99\u4f4a\uc4d2\u6b5f\u5654\u873d))) {
                            loopcontinue()
                        }
                        
                        invokeinterface:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::remove, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a), invokevirtual:UUID[expected:Object](\u16f6\uf94d\u156b\uc29a\ub7dc::\u7330\u51fa\u4daf\ubded\u3504\u7043, p0:\u16f6\uf94d\u156b\uc29a\ub7dc))
                        return:void()
                    }
                } while (cmpne:boolean(and:int(var_2_93:int, ldc:int(4)), ldc:int(0)))
                
                var_2_93 = and:int(var_2_93:int, ldc:int(-107020677))
                
                if (cmpne:boolean(invokeinterface:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::get, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a), invokevirtual:UUID[expected:Object](\u16f6\uf94d\u156b\uc29a\ub7dc::\u7330\u51fa\u4daf\ubded\u3504\u7043, p0:\u16f6\uf94d\u156b\uc29a\ub7dc)), aconstnull:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238())) {
                    invokevirtual:void(\u3bd6\ub7dc\uc238\u88c5\u516c\uc238::\u8350\u5245\u4daf\u5bc4\u0a06\u93a2, checkcast:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\ub7dc\uc238\u88c5\u516c\uc238.class, invokeinterface:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::get, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a), invokevirtual:UUID[expected:Object](\u16f6\uf94d\u156b\uc29a\ub7dc::\u7330\u51fa\u4daf\ubded\u3504\u7043, p0:\u16f6\uf94d\u156b\uc29a\ub7dc))), p0:\u16f6\uf94d\u156b\uc29a\ub7dc)
                }
            }
            else {
                invokeinterface:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::put, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a), invokevirtual:UUID(\u16f6\uf94d\u156b\uc29a\ub7dc::\u7330\u51fa\u4daf\ubded\u3504\u7043, p0:\u16f6\uf94d\u156b\uc29a\ub7dc), initobject:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(\u3bd6\ub7dc\uc238\u88c5\u516c\uc238::<init>, p0:\u16f6\uf94d\u156b\uc29a\ub7dc))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\u36d3\ub102\u34df\u5d20\u3d4b() {
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
            invokeinterface:void(Map<K, V>::clear, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uf9c5\ua3b4\u1833\ubefe\u3a62\u67e9() {
        var_1_B8 : int
        var_3_8B : Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>
        
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
            var_1_B8 = and:int(ldc:int(606305983), ldc:int(1844900603))
            
            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::isEmpty, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))) {
                var_3_8B = invokeinterface:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(Collection<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::iterator, invokeinterface:Collection<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::values, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))
                
                loop {
                    var_1_B8 = and:int(var_1_B8:int, ldc:int(896711423))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_8B:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>))) {
                        looporswitchbreak()
                    }
                    
                    if (invokevirtual:boolean(\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u4f4a\u8d90\u92ff\u156b\u6d69\u1833, checkcast:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\ub7dc\uc238\u88c5\u516c\uc238.class, invokeinterface:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::next, var_3_8B:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>)))) {
                        return:boolean(xor:int[expected:boolean](ldc:int(544), ldc:int(545)))
                    }
                    
                    var_1_B8 = and:int(var_1_B8:int, ldc:int(1860943611))
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(10466), ldc:int(-10979)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub70c\uc238\ubf56\uc9f6\u4cd9\ucef1() {
        var_1_B9 : int
        var_3_8B : Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>
        
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
            var_1_B9 = and:int(ldc:int(785710130), ldc:int(-993136975))
            
            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::isEmpty, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))) {
                var_3_8B = invokeinterface:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(Collection<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::iterator, invokeinterface:Collection<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::values, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))
                
                loop {
                    var_1_B9 = and:int(var_1_B9:int, ldc:int(-458772648))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_8B:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>))) {
                        looporswitchbreak()
                    }
                    
                    if (invokevirtual:boolean(\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\u7af6\u71f1\u34df\ud36e\uc31c\u7c6b, checkcast:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\ub7dc\uc238\u88c5\u516c\uc238.class, invokeinterface:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::next, var_3_8B:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>)))) {
                        return:boolean(xor:int[expected:boolean](ldc:int(184), ldc:int(185)))
                    }
                    
                    var_1_B9 = and:int(var_1_B9:int, ldc:int(2145906075))
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(22280), ldc:int(-22281)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua61f\ubf56\u69d9\u88c5\u67d0\ud171() {
        var_1_BD : int
        var_3_8E : Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>
        
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
            var_1_BD = and:int(ldc:int(-1909459397), ldc:int(-1620157900))
            
            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::isEmpty, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))) {
                var_3_8E = invokeinterface:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(Collection<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::iterator, invokeinterface:Collection<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::values, getfield:Map<UUID, \u3bd6\ub7dc\uc238\u88c5\u516c\uc238>(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u4975\u4f4a\u52d3\u7006\u16f6\u8640, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a)))
                
                loop {
                    var_1_BD = and:int(var_1_BD:int, ldc:int(1730633468))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_8E:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>))) {
                        looporswitchbreak()
                    }
                    
                    if (invokevirtual:boolean(\u7bad\ub19c\ud523\uf9c5\u624e\ucfaf::\ubb2b\u3e75\u7ce1\u8c8a\u51fa\ud36e, checkcast:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\ub7dc\uc238\u88c5\u516c\uc238.class, invokeinterface:\u3bd6\ub7dc\uc238\u88c5\u516c\uc238(Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>::next, var_3_8E:Iterator<\u3bd6\ub7dc\uc238\u88c5\u516c\uc238>)))) {
                        return:boolean(xor:int[expected:boolean](ldc:int(320), ldc:int(321)))
                    }
                    
                    var_1_BD = and:int(var_1_BD:int, ldc:int(-81267974))
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-16252), ldc:int(13107)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1B8 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_1CB_0 : byte[] [generated]
        stack_233_0 : byte[] [generated]
        stack_2B7_0 : byte[] [generated]
        stack_30D_0 : byte[] [generated]
        var_4_1A3 : int
        var_3_1A8 : byte[]
        var_5_1A9 : int
        expr_1CB : byte [generated]
        var_0_24D : int
        expr_233 : byte [generated]
        stack_285_2 : byte [generated]
        stack_259_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_DE : byte[]
        expr_E2 : int [generated]
        var_3_2A5 : byte[]
        var_5_2A6 : int
        expr_11B : int [generated]
        var_3_2FB : byte[]
        var_5_2FC : int
        var_3_154 : String
        expr_15C : String[] [generated]
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
        var_0_1B8 = and:int(ldc:int(1445818145), ldc:int(1323460626))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_1CB_0 = stack_233_0 = stack_2B7_0 = stack_30D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("780W5XEMxf/j7wrXXlfH8Qh4w7ejpQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1A3 = expr_6E:int
        var_3_1A8 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1A9 = expr_6E:int
        Label_0427:
        
        while (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(1870222159))
            var_5_1A9 = add:int(var_5_1A9:int, ldc:int(-1))
            expr_1CB = loadelement:byte(stack_1CB_0:byte[], var_5_1A9:int)
            storeelement:byte(var_3_1A8:byte[], var_5_1A9:int, add:int(or:int(and:int(shl:int(expr_1CB:byte, xor:int(ldc:int(2275), ldc:int(2279))), ldc:int(-16)), and:int(shr:int(expr_1CB:byte[expected:int], xor:int(ldc:int(1073), ldc:int(1077))), ldc:int(15))), ldc:int(2)))
            
            if (cmpne:boolean(var_5_1A9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_1CB_0 = stack_233_0 = stack_2B7_0 = stack_30D_0 = var_3_1A8:byte[]
            goto(Label_0115)
        }
        
        var_0_1B8 = and:int(var_0_1B8:int, ldc:int(402545274))
        Label_0531:
        
        while (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_24D = and:int(var_0_1B8:int, ldc:int(-823933052))
            var_5_1A9 = add:int(var_5_1A9:int, ldc:int(-1))
            expr_233 = stack_285_2 = loadelement(stack_233_0, var_5_1A9)
            
            if (cmplt:boolean(add:int(add:int(var_5_1A9:int, ldc:int(4)), neg:int(var_4_1A3:int)), ldc:int(0))) {
                stack_285_2 = stack_259_0 = add:byte(expr_233:byte, loadelement:byte(var_3_1A8:byte[], add:int(var_5_1A9:int, ldc:int(4))))
                goto(Label_0617)
            }
            
            Label_0576:
            
            if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(1766706917))
            }
            else {
                var_0_24D = and:int(var_0_24D:int, ldc:int(-823208653))
                stack_285_2 = stack_259_0 = add:byte(expr_233:byte, ldc:byte(4))
            }
            
            Label_0617:
            
            if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(-1990483281))
                goto(Label_0576)
            }
            
            var_0_1B8 = and:int(var_0_24D:int, ldc:int(-293808746))
            storeelement:byte(var_3_1A8:byte[], var_5_1A9:int, stack_285_2:byte)
            
            if (cmpne:boolean(var_5_1A9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_1CB_0 = stack_233_0 = stack_2B7_0 = stack_30D_0 = var_3_1A8:byte[]
            goto(Label_0172)
        }
        
        var_0_1B8 = and:int(var_0_1B8:int, ldc:int(-2135528937))
        goto(Label_0427)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(16)), ldc:int(0))) {
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(-323714742))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B8:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(-800315855))
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(1719419357))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_1A3 = expr_A7:int
                var_3_1A8 = newarray:byte[](byte.class, expr_A7:int)
                var_5_1A9 = expr_A7:int
                goto(Label_0531)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(16)), ldc:int(0))) {
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(1096810996))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1B8:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1B8 = and:int(var_0_1B8:int, ldc:int(685092196))
                goto(Label_0115)
            }
            
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(-135893493))
            var_2_DE = stack_DE_0:byte[]
            expr_E2 = add:int(arraylength:int(stack_E0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_3_2A5 = newarray:byte[](byte.class, expr_E2:int)
                var_5_2A6 = expr_E2:int
                
                loop {
                    var_0_1B8 = and:int(var_0_1B8:int, ldc:int(-277590789))
                    var_5_2A6 = add:int(var_5_2A6:int, ldc:int(-1))
                    storeelement:byte(var_3_2A5:byte[], var_5_2A6:int, add:int(shl:int(loadelement:byte(stack_2B7_0:byte[], var_5_2A6:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_DE:byte[], add:int(var_5_2A6:int, xor:int(ldc:int(18498), ldc:int(18499)))), ldc:int(5)), and:int(ldc:int(1063), ldc:int(27295)))))
                    
                    if (cmpne:boolean(var_5_2A6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_1CB_0 = stack_233_0 = stack_2B7_0 = stack_30D_0 = var_3_2A5:byte[]
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_0_1B8:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(706230684))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(16)), ldc:int(0))) {
                var_0_1B8 = and:int(var_0_1B8:int, ldc:int(373765111))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_1B8:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(1739441151))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_2FB = newarray:byte[](byte.class, expr_11B:int)
                var_5_2FC = expr_11B:int
                
                loop {
                    var_0_1B8 = and:int(var_0_1B8:int, ldc:int(-299211242))
                    var_5_2FC = add:int(var_5_2FC:int, ldc:int(-1))
                    storeelement:byte(var_3_2FB:byte[], var_5_2FC:int, xor:byte(loadelement:byte(stack_30D_0:byte[], var_5_2FC:int), ldc:byte(100)))
                    
                    if (cmpne:boolean(var_5_2FC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_1CB_0 = stack_233_0 = stack_2B7_0 = stack_30D_0 = var_3_2FB:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_1B8:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B8:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1B8 = and:int(var_0_1B8:int, ldc:int(1535693755))
            goto(Label_0115)
        }
        
        var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_15C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(6528), ldc:int(6529)))
        expr_166 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2065), ldc:int(9217)))
        storeelement:String(expr_15C:String[], and:int(ldc:int(-1200), ldc:int(175)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(14499), ldc:int(-31140)), and:int(ldc:int(12309), ldc:int(1629))))
        putstatic:String[](\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u3e75\ub1b9\u6cfe\u6bb9\uc2e8\ub113, expr_166:String[])
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\u8389\ub32d\ud171\ub18d\ub83f\u7043, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(expr_15C:String[], and:int(ldc:int(8567), ldc:int(-8568)))))
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6D4 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6DF : int
        
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
        var_3_6D4 = and:int(ldc:int(33701555), ldc:int(58447754))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(32768)), ldc:int(0))) {
            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(861522181))
        }
        else {
            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1917962041))
            var_5_8A = and:int(ldc:int(8828), ldc:int(-8830))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26160), ldc:int(-26289)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6D4:int, ldc:int(1091943887))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(321), ldc:int(25093)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(7172), ldc:int(7173)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6D4 = and:int(var_3_E3:int, ldc:int(837244307))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(20547), ldc:int(1969)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1542445735))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1448138443))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1613920789))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(876863228))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(2085958062))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1651169264))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-717893687))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-749437357))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-359246341))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(683094927))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1897566333))
                            loopcontinue()
                        }
                        
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1998430570))
                        var_11_F4 = and:int(ldc:int(-30127), ldc:int(30114))
                        goto(Label_1597)
                    }
                    
                    Label_0604:
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1484293124))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1183062580))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1083931153))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(88585107))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-224953949))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1081414171))
                            loopcontinue()
                        }
                        
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(658667994))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-37386831))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-880280423))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1031163303))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-408998779))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-258134926))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-2062946588))
                            loopcontinue()
                        }
                        
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-254135421))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(345), ldc:int(677))
                                goto(Label_1172)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1382316532))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(132414742))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1170286100))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(852940659))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-197503911))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-446162501))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-175766942))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-329303437))
                            loopcontinue()
                        }
                        
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-379152734))
                        var_11_F4 = and:int(ldc:int(2732), ldc:int(-2797))
                    }
                    
                    Label_1172:
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(525663348))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1040120735))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1531868824))
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1107449786))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1433)
                            }
                        }
                    }
                    
                    Label_1288:
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(254187443))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1172)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(805039581))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(416510534))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1589365412))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-718763681))
                            loopcontinue()
                        }
                        
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1009462030))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1597)
                    }
                    
                    Label_1433:
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(2126869037))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1687900622))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1548246357))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(807721344))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(544594196))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(969837286))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(210071245))
                        loopcontinue()
                    }
                    
                    var_3_6D4 = and:int(var_3_6D4:int, ldc:int(843937259))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1597:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6DF = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1608:
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1208793671))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-88497353))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(602457515))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(166033119))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(856925802))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(118465714))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1239388915))
                        var_17_6DF = add:int(var_16_122:int, and:int(ldc:int(3113), ldc:int(16529)))
                        looporswitchbreak()
                    }
                    
                    var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-1749578419))
                }
                
                var_3_6D4 = and:int(var_3_6D4:int, ldc:int(-927572753))
                
                if (cmple:boolean(var_5_8A = var_17_6DF:int, sub:int(var_6_91:int, and:int(ldc:int(2707), ldc:int(1033))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6D4:int, ldc:int(4096)), ldc:int(0))) {
            var_3_6D4 = and:int(var_3_6D4:int, ldc:int(1239580267))
            goto(Label_0108)
        }
    }
}
