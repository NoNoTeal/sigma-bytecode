public class \u5d20\u7043\u88c5\u5db4\uf94d.\u8709\u7873\ud51e\ufe34\u9af2 {
    private void \u8709\u7873\ud51e\ufe34\u9af2(\u516c\u3d64\u718f\ub171\u6b5f.\ub83f\u72f1\u51b2\u494c\u0c95 p0) {
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
            putfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2, p0:\ub83f\u72f1\u51b2\u494c\u0c95)
            invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u8709\u7873\ud51e\ufe34\u9af2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
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
        
        if (cmple:boolean(getfield:int(\u8709\u7873\ud51e\ufe34\u9af2::\u7330\u4c04\uc9f6\u6bb9\u839e\uff55, this:\u8709\u7873\ud51e\ufe34\u9af2), getfield:int(\ub83f\u72f1\u51b2\u494c\u0c95::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)))) {
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(invokeinterface:boolean(List<E>::isEmpty, invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u965f\ucef1\u34df\u4daf\u760c\u6d99, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ub83f\u72f1\u51b2\u494c\u0c95::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:Class<\u120d\u8bb0\u836c\u64f2\u3504>(\u3d64\u7af6\uae87\uc238\u7d52.\u120d\u8bb0\u836c\u64f2\u3504.class), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:double(8.0), ldc:double(8.0), ldc:double(8.0)), getstatic:Predicate<\u120d\u8bb0\u836c\u64f2\u3504>(\ub83f\u72f1\u51b2\u494c\u0c95::\uf995\u6435\uceb8\u12b2\u7873\u4179))), invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7006\ubefe\u98a4\u9255\u8389\ud12e, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf)))), and:int(ldc:int(1840), ldc:int(-22321)), and:int(ldc:int(10305), ldc:int(5129))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-454), ldc:int(453)))
    }
    
    public void \ub7dc\u4c2b\ud523\ube23\u416d\u3776() {
        var_3_82 : List<\u7d52\u718f\u3776\u6fb0\ub83f>
        
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
            var_3_82 = invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u965f\ucef1\u34df\u4daf\u760c\u6d99, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ub83f\u72f1\u51b2\u494c\u0c95::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:Class<\u120d\u8bb0\u836c\u64f2\u3504>(\u3d64\u7af6\uae87\uc238\u7d52.\u120d\u8bb0\u836c\u64f2\u3504.class), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:double(8.0), ldc:double(8.0), ldc:double(8.0)), getstatic:Predicate<\u120d\u8bb0\u836c\u64f2\u3504>(\ub83f\u72f1\u51b2\u494c\u0c95::\uf995\u6435\uceb8\u12b2\u7873\u4179))
            
            if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_3_82:List<\u7d52\u718f\u3776\u6fb0\ub83f>))) {
                invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u960f\u839e\u4ab3\ud523\u7af6\ud12e, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(List<\u7d52\u718f\u3776\u6fb0\ub83f>::get, var_3_82:List<\u7d52\u718f\u3776\u6fb0\ub83f>, and:int(ldc:int(22865), ldc:int(-22878)))), ldc:double(1.2000000476837158))
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uc246\u4c2b\u51b2\u4f4a\u9a18\u99f7, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ucef1\uafe7\u62da\u8bb0\u9af2\u7873), ldc:float(1.0f), ldc:float(1.0f))
            }
            
            putfield:int(\u8709\u7873\ud51e\ufe34\u9af2::\u7330\u4c04\uc9f6\u6bb9\u839e\uff55, this:\u8709\u7873\ud51e\ufe34\u9af2, and:int(ldc:int(22241), ldc:int(-32484)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
        var_3_6A : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_3_6A = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7006\ubefe\u98a4\u9255\u8389\ud12e, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_3_6A:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                invokespecial:void(\u8709\u7873\ud51e\ufe34\u9af2::\ufe34\u4c2b\u4179\u3e75\u0c95\uceb8, this:\u8709\u7873\ud51e\ufe34\u9af2, var_3_6A:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\ufe34\u64f2\u392e\u7af6\u960f\u71f1, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf), getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                putfield:int(\u8709\u7873\ud51e\ufe34\u9af2::\u7330\u4c04\uc9f6\u6bb9\u839e\uff55, this:\u8709\u7873\ud51e\ufe34\u9af2, add:int(getfield:int(\ub83f\u72f1\u51b2\u494c\u0c95::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), invokevirtual:int(Random::nextInt, invokestatic:Random(\ub83f\u72f1\u51b2\u494c\u0c95::\u3a62\u6ec6\ucef1\u51fa\uc7fe\u12cb, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:int(100))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_1_5F : int
        var_3_82 : List<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_4_8D : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_1_5F = and:int(ldc:int(-1039990109), ldc:int(-139806329))
            var_3_82 = invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u965f\ucef1\u34df\u4daf\u760c\u6d99, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ub83f\u72f1\u51b2\u494c\u0c95::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:Class<\u120d\u8bb0\u836c\u64f2\u3504>(\u3d64\u7af6\uae87\uc238\u7d52.\u120d\u8bb0\u836c\u64f2\u3504.class), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:double(8.0), ldc:double(8.0), ldc:double(8.0)), getstatic:Predicate<\u120d\u8bb0\u836c\u64f2\u3504>(\ub83f\u72f1\u51b2\u494c\u0c95::\uf995\u6435\uceb8\u12b2\u7873\u4179))
            var_4_8D = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7006\ubefe\u98a4\u9255\u8389\ud12e, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf))
            
            if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_4_8D:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1105632643))
                
                if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_3_82:List<\u7d52\u718f\u3776\u6fb0\ub83f>))) {
                    invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u960f\u839e\u4ab3\ud523\u7af6\ud12e, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(List<\u7d52\u718f\u3776\u6fb0\ub83f>::get, var_3_82:List<\u7d52\u718f\u3776\u6fb0\ub83f>, and:int(ldc:int(2131), ldc:int(-2132)))), ldc:double(1.2000000476837158))
                }
            }
            else {
                invokespecial:void(\u8709\u7873\ud51e\ufe34\u9af2::\ufe34\u4c2b\u4179\u3e75\u0c95\uceb8, this:\u8709\u7873\ud51e\ufe34\u9af2, var_4_8D:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\ufe34\u64f2\u392e\u7af6\u960f\u71f1, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf), getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ufe34\u4c2b\u4179\u3e75\u0c95\uceb8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
        var_6_9D : \u120d\u8bb0\u836c\u64f2\u3504
        var_8_C3 : float
        var_9_D2 : float
        
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                var_6_9D = initobject:\u120d\u8bb0\u836c\u64f2\u3504(\u120d\u8bb0\u836c\u64f2\u3504::<init>, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ub83f\u72f1\u51b2\u494c\u0c95::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u6bb9\u3c25\u7043\ud217\u76bc\u6c52, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:double(0.30000001192092896)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                invokevirtual:void(\u120d\u8bb0\u836c\u64f2\u3504::\u88c5\uc31c\u3711\u36d3\u8c8a\u3776, var_6_9D:\u120d\u8bb0\u836c\u64f2\u3504, ldc:int(40))
                invokevirtual:void(\u120d\u8bb0\u836c\u64f2\u3504::\ub18d\u98a4\ub6ab\u71ae\u5bc4\uff55, var_6_9D:\u120d\u8bb0\u836c\u64f2\u3504, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, getfield:\ub83f\u72f1\u51b2\u494c\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)))
                var_8_C3 = mul:float(invokevirtual:float(Random::nextFloat, invokestatic:Random(\ub83f\u72f1\u51b2\u494c\u0c95::\u5d20\u8cae\ub113\u3bc9\u6b0d\u5140, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2))), ldc:float(6.2831855f))
                var_9_D2 = mul:float(ldc:float(0.02f), invokevirtual:float(Random::nextFloat, invokestatic:Random(\ub83f\u72f1\u51b2\u494c\u0c95::\uceb8\uceb8\u4f4a\uf9c5\u071d\u8308, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2))))
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ub102\u5bc4\u624e\ua3b4\u7d52\u5140, var_6_9D:\u120d\u8bb0\u836c\u64f2\u3504[expected:\u7d52\u718f\u3776\u6fb0\ub83f], f2d:double(add:float(mul:float(mul:float(ldc:float(0.3f), neg:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(getfield:float(\ub83f\u72f1\u51b2\u494c\u0c95::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:float(0.017453292f))))), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(getfield:float(\ub83f\u72f1\u51b2\u494c\u0c95::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:float(0.017453292f)))), mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_8_C3:float), var_9_D2:float))), f2d:double(mul:float(mul:float(ldc:float(0.3f), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(getfield:float(\ub83f\u72f1\u51b2\u494c\u0c95::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:float(0.017453292f)))), ldc:float(1.5f))), f2d:double(add:float(mul:float(mul:float(ldc:float(0.3f), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(getfield:float(\ub83f\u72f1\u51b2\u494c\u0c95::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:float(0.017453292f)))), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(getfield:float(\ub83f\u72f1\u51b2\u494c\u0c95::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), ldc:float(0.017453292f)))), mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_8_C3:float), var_9_D2:float))))
                invokevirtual:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\ua6bd\ubefe\u5f50\u12cb\uceb8\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u72f1\u7ce1\ucef1\ub83f\u516c](\ub83f\u72f1\u51b2\u494c\u0c95::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ub83f\u72f1\u51b2\u494c\u0c95(\u8709\u7873\ud51e\ufe34\u9af2::\u6bb9\u946b\u8c8a\u6c52\ufcaf\ubded, this:\u8709\u7873\ud51e\ufe34\u9af2)), var_6_9D:\u120d\u8bb0\u836c\u64f2\u3504[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8709\u7873\ud51e\ufe34\u9af2(\u516c\u3d64\u718f\ub171\u6b5f.\ub83f\u72f1\u51b2\u494c\u0c95 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u7330\ud12e\u527a\u494c\u97b7 p1) {
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
            invokespecial:\u8709\u7873\ud51e\ufe34\u9af2(\u8709\u7873\ud51e\ufe34\u9af2::<init>, this:\u8709\u7873\ud51e\ufe34\u9af2, p0:\ub83f\u72f1\u51b2\u494c\u0c95)
            return:void()
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69D : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_6A8 : int
        
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
        var_3_69D = and:int(ldc:int(1912302327), ldc:int(1996236493))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8709\u7873\ud51e\ufe34\u9af2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_69D = and:int(var_3_69D:int, ldc:int(-6163577))
            var_5_7F = and:int(ldc:int(1230), ldc:int(-1231))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4290), ldc:int(4289)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_69D:int, ldc:int(-139612274))
                    var_9_BD = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_86:int, xor:int(ldc:int(20504), ldc:int(20505)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(85), ldc:int(4513)))), var_7_95:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_69D = and:int(var_3_CF:int, ldc:int(1986625191))
                    var_14_10A = var_7_95:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), and:int(ldc:int(18699), ldc:int(1169)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_86:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-708929894))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1497574144))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1250945482))
                        goto(Label_0736)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(812146726))
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-206131315))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0593)
                            }
                            
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1564959703))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(361368756))
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1397786844))
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-797588528))
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1644706722))
                        goto(Label_0736)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-148790576))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-365093057))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-186355012))
                        var_11_E0 = and:int(ldc:int(13012), ldc:int(-13013))
                        goto(Label_1551)
                    }
                    
                    Label_0593:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1112572975))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(777328274))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(860697394))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1926308898))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-611447507))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(49328621))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-114966643))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0736:
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-121797906))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1305681932))
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-366328834))
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-1609820685))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(76458175))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-186145121))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0877:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1556664281))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1985197234))
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-813285126))
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-2032421043))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(1183704448))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(2105469583))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E0 = xor:int(ldc:int(9296), ldc:int(9297))
                                goto(Label_1171)
                            }
                        }
                    }
                    
                    Label_1011:
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-553366531))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1968304798))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(513077605))
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0736)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(1333932926))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(2084384405))
                        var_11_E0 = and:int(ldc:int(15816), ldc:int(-15849))
                    }
                    
                    Label_1171:
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(262846983))
                            goto(Label_1011)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-315347877))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(1396208640))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-119462234))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1423)
                            }
                        }
                    }
                    
                    Label_1287:
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1377279244))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(1944914631))
                            goto(Label_1171)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(1978666600))
                            goto(Label_1011)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-1528758414))
                            goto(Label_0877)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-152862729))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_7F:int, var_16_10E:int)
                            goto(Label_1551)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1423:
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-452214629))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1315700667))
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1246368271))
                        loopcontinue()
                    }
                    
                    var_3_69D = and:int(var_3_69D:int, ldc:int(1949641452))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1551:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A8 = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1562:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(151288627))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1436279437))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(495509901))
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1276811215))
                        goto(Label_0593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-914323794))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-88673642))
                        var_17_6A8 = add:int(var_16_10E:int, and:int(ldc:int(11283), ldc:int(4485)))
                        looporswitchbreak()
                    }
                    
                    var_3_69D = and:int(var_3_69D:int, ldc:int(665976864))
                }
                
                var_3_69D = and:int(var_3_69D:int, ldc:int(2032627372))
                
                if (cmple:boolean(var_5_7F = var_17_6A8:int, sub:int(var_6_86:int, xor:int(ldc:int(1056), ldc:int(1057))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
