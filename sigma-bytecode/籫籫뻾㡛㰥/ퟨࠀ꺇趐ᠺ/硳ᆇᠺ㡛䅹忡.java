public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7873\u1187\u183a\u385b\u4179\u5fe1 {
    public void \u7873\u1187\u183a\u385b\u4179\u5fe1(\u3504\ufe34\u600f\u6b0d\u69d9.\uf995\ub113\u51fa\u9937\u6bb9\uae87 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1) {
        var_5_90 : Iterator<\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e>
        var_6_BE : \ud217\u4cd9\ub83f\u51b2\u8709\u0b8e
        var_7_CA : \u71ae\u8709\u0a06\u4f4a\ucef1\u9af2
        
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
            putfield:\uf995\ub113\u51fa\u9937\u6bb9\uae87(\u7873\u1187\u183a\u385b\u4179\u5fe1::\ud217\ub19c\u8aa5\ub18d\u7043\ub83f, this:\u7873\u1187\u183a\u385b\u4179\u5fe1, p0:\uf995\ub113\u51fa\u9937\u6bb9\uae87)
            invokespecial:\ub7dc\u0800\u64ab\u8640\u6198\u927d(\ub7dc\u0800\u64ab\u8640\u6198\u927d::<init>, this:\u7873\u1187\u183a\u385b\u4179\u5fe1, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, getfield:int(\uf995\ub113\u51fa\u9937\u6bb9\uae87::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, p0:\uf995\ub113\u51fa\u9937\u6bb9\uae87), getfield:int(\uf995\ub113\u51fa\u9937\u6bb9\uae87::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, p0:\uf995\ub113\u51fa\u9937\u6bb9\uae87), ldc:int(32), add:int(sub:int(getfield:int(\uf995\ub113\u51fa\u9937\u6bb9\uae87::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, p0:\uf995\ub113\u51fa\u9937\u6bb9\uae87), ldc:int(65)), and:int(ldc:int(6), ldc:int(25180))), ldc:int(18))
            var_5_90 = invokeinterface:Iterator<\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e>(Set<\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e>::iterator, invokevirtual:SortedSet<\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e>[expected:Set<\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e>](\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9::\u3bd6\uc87f\u183a\u4d85\u7e3f\u7d52, invokestatic:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9(\uf995\ub113\u51fa\u9937\u6bb9\uae87::\ub7dc\u0c95\u647c\u12cb\ub19c\u7873, p0:\uf995\ub113\u51fa\u9937\u6bb9\uae87)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_90:Iterator<\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e>)) {
                var_6_BE = checkcast:\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e(\u36d3\u9033\u6b0d\u983f\u8d90.\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e.class, invokeinterface:\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e(Iterator<\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e>::next, var_5_90:Iterator<\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e>))
                var_7_CA = initobject:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2(\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2::<init>, this:\u7873\u1187\u183a\u385b\u4179\u5fe1, var_6_BE:\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e)
                invokevirtual:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>::\u446c\uff55\u9a18\ube23\u983f\u4cd9, this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>], var_7_CA:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2)
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e::getCode, invokevirtual:\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e(\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9::\u74b1\u8c8a\u62da\u4e72\uc2e8\ud12e, invokestatic:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9(\uf995\ub113\u51fa\u9937\u6bb9\uae87::\ub7dc\u0c95\u647c\u12cb\ub19c\u7873, p0:\uf995\ub113\u51fa\u9937\u6bb9\uae87))), invokevirtual:String(\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e::getCode, var_6_BE:\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e)))) {
                    loopcontinue()
                }
                
                invokevirtual:void(\u7873\u1187\u183a\u385b\u4179\u5fe1::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, this:\u7873\u1187\u183a\u385b\u4179\u5fe1, var_7_CA:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2)
            }
            
            if (cmpne:boolean(invokevirtual:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>]), aconstnull:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2())) {
                invokevirtual:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>::\uc229\ucfaf\uc246\uc9f6\u8d90\uc7fe, this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>], invokevirtual:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u6d69\u8308\u8aa5\uceb8\u9255\u4975() {
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
            return:int(add:int(invokespecial:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\u6d69\u8308\u8aa5\uceb8\u9255\u4975, this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>]), ldc:int(20)))
        }
        
        goto(Label_0006)
    }
    
    public int \u6d69\uafe7\u3bc9\u0a06\u0800\u51b2() {
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
            return:int(add:int(invokespecial:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\u6d69\uafe7\u3bc9\u0a06\u0800\u51b2, this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>]), ldc:int(50)))
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873(\u927d\u92ff\u71ae\uafe7\u6bb9.\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2 p0) {
        stack_A2_0 : \u74b1\u516c\u7330\ud523\u8df4\uc87f [generated]
        stack_9C_1 : String [generated]
        expr_8C : Object[] [generated]
        
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
            invokespecial:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2>], p0:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2)
            
            if (cmpne:boolean(p0:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2, aconstnull:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2())) {
                stack_A2_0 = getstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c)
                stack_9C_1 = loadelement:String(getstatic:String[](\u7873\u1187\u183a\u385b\u4179\u5fe1::\ub19c\ub171\u7ce1\u99f7\ud51e\ub18d), and:int(ldc:int(-25041), ldc:int(16848)))
                expr_8C = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(10384), ldc:int(10385)))
                storeelement:Object(expr_8C:Object[], and:int(ldc:int(-8680), ldc:int(167)), invokestatic:\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e[expected:Object](\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2::\u5db4\u927d\uc29a\uc84e\u7330\u61a4, p0:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2))
                invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u624e\u76bc\u92ee\u5db4\u5654\u88c5, stack_A2_0:\u74b1\u516c\u7330\ud523\u8df4\uc87f, invokevirtual:String(ITextComponent::getString, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_9C_1:String, expr_8C:Object[])))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\ucef1\u7af6\u9255\u8cae\ud171(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, getfield:\uf995\ub113\u51fa\u9937\u6bb9\uae87[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u7873\u1187\u183a\u385b\u4179\u5fe1::\ud217\ub19c\u8aa5\ub18d\u7043\ub83f, this:\u7873\u1187\u183a\u385b\u4179\u5fe1), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc4d2\uc29a\u416d\ucfaf\u071d\uc29a() {
        var_1_5F : int
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
            var_1_5F = and:int(ldc:int(1194398270), ldc:int(603041430))
            
            if (cmpne:boolean(invokevirtual:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u36d3\u97b7\u6ec6\u4c04\ud171\u5245::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, getfield:\uf995\ub113\u51fa\u9937\u6bb9\uae87[expected:\u36d3\u97b7\u6ec6\u4c04\ud171\u5245](\u7873\u1187\u183a\u385b\u4179\u5fe1::\ud217\ub19c\u8aa5\ub18d\u7043\ub83f, this:\u7873\u1187\u183a\u385b\u4179\u5fe1)), this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753])) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-139326722))
                stack_8A_0 = and:int(ldc:int(27137), ldc:int(-27278))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(-32670), ldc:int(-32669))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u93a2\ube23\u624e\u6fb0\u4daf\u92ee p0) {
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
            invokevirtual:void(\u7873\u1187\u183a\u385b\u4179\u5fe1::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, this:\u7873\u1187\u183a\u385b\u4179\u5fe1, checkcast:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2.class, p0:\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u416d\u76bc\u8308\ud217\u61a4\u12cb(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7873\u1187\u183a\u385b\u4179\u5fe1 p0) {
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
            return:int(getfield:int(\u7873\u1187\u183a\u385b\u4179\u5fe1::\uc3e3\u5bc4\u7006\u16f6\u7330\uc31c, p0:\u7873\u1187\u183a\u385b\u4179\u5fe1))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_187 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_199_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        stack_263_0 : byte[] [generated]
        stack_2B8_0 : byte[] [generated]
        var_4_174 : int
        var_3_179 : byte[]
        var_5_17A : int
        expr_199 : byte [generated]
        var_0_1EC : int
        expr_1F6 : byte [generated]
        stack_232_2 : byte [generated]
        stack_211_0 : byte [generated]
        expr_8E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_252 : byte[]
        var_5_253 : int
        expr_FE : int [generated]
        var_3_2A7 : byte[]
        var_5_2A8 : int
        var_3_13A : String
        stack_16D_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_187 = and:int(ldc:int(1307034460), ldc:int(1867505532))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_199_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HRgUGuZaEgjZBhoWDP3jzA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_174 = expr_6B:int
        var_3_179 = newarray:byte[](byte.class, expr_6B:int)
        var_5_17A = expr_6B:int
        Label_0380:
        
        while (cmpeq:boolean(and:int(var_0_187:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(1305466845))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            expr_199 = loadelement:byte(stack_199_0:byte[], var_5_17A:int)
            storeelement:byte(var_3_179:byte[], var_5_17A:int, xor:int(or:int(and:int(shl:int(expr_199:byte, xor:int(ldc:int(1027), ldc:int(1031))), ldc:int(-16)), and:int(shr:int(expr_199:byte[expected:int], xor:int(ldc:int(4616), ldc:int(4620))), ldc:int(15))), ldc:int(65)))
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_199_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = var_3_179:byte[]
            goto(Label_0112)
        }
        
        var_0_187 = and:int(var_0_187:int, ldc:int(1362160026))
        Label_0481:
        
        while (cmpeq:boolean(and:int(var_0_187:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_187:int, ldc:int(1539827194))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            expr_1F6 = stack_232_2 = loadelement(stack_1F6_0, var_5_17A)
            
            if (cmplt:boolean(add:int(add:int(var_5_17A:int, ldc:int(3)), neg:int(var_4_174:int)), ldc:int(0))) {
                stack_232_2 = stack_211_0 = add:byte(expr_1F6:byte, loadelement:byte(var_3_179:byte[], add:int(var_5_17A:int, ldc:int(3))))
                goto(Label_0545)
            }
            
            Label_0515:
            
            if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(-849349643))
                stack_232_2 = stack_211_0 = add:byte(expr_1F6:byte, ldc:byte(3))
            }
            
            Label_0545:
            
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0515)
            }
            
            var_0_187 = and:int(var_0_1EC:int, ldc:int(-110627982))
            storeelement:byte(var_3_179:byte[], var_5_17A:int, stack_232_2:byte)
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_199_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = var_3_179:byte[]
            goto(Label_0147)
        }
        
        goto(Label_0380)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(524288)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(1506800501))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_174 = expr_8E:int
                var_3_179 = newarray:byte[](byte.class, expr_8E:int)
                var_5_17A = expr_8E:int
                goto(Label_0481)
            }
        }
        
        Label_0147:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(65536)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(441116577))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(32768)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-363764321))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(262144)), ldc:int(0))) {
                var_0_187 = and:int(var_0_187:int, ldc:int(-1423653019))
                goto(Label_0112)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(1610082293))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_252 = newarray:byte[](byte.class, expr_CB:int)
                var_5_253 = expr_CB:int
                
                loop {
                    var_0_187 = and:int(var_0_187:int, ldc:int(-873472239))
                    var_5_253 = add:int(var_5_253:int, ldc:int(-1))
                    storeelement:byte(var_3_252:byte[], var_5_253:int, add:int(shl:int(loadelement:byte(stack_263_0:byte[], var_5_253:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_253:int, and:int(ldc:int(5393), ldc:int(10379)))), ldc:int(4)), xor:int(ldc:int(79), ldc:int(64)))))
                    
                    if (cmpne:boolean(var_5_253:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_199_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = var_3_252:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(262144)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(971369307))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_187 = and:int(var_0_187:int, ldc:int(-1231043258))
                goto(Label_0147)
            }
            
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(2037897532))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2A7 = newarray:byte[](byte.class, expr_FE:int)
                var_5_2A8 = expr_FE:int
                
                loop {
                    var_0_187 = and:int(var_0_187:int, ldc:int(-2622670))
                    var_5_2A8 = add:int(var_5_2A8:int, ldc:int(-1))
                    storeelement:byte(var_3_2A7:byte[], var_5_2A8:int, add:byte(loadelement:byte(stack_2B8_0:byte[], var_5_2A8:int), ldc:byte(75)))
                    
                    if (cmpne:boolean(var_5_2A8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_199_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = var_3_2A7:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-2049889409))
            goto(Label_0147)
        }
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-1479495134))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_16D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(37), ldc:int(13121)))
        expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(132), ldc:int(133)))
        storeelement:String(expr_14C:String[], and:int(ldc:int(30025), ldc:int(-32074)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(11188), ldc:int(-16309)), xor:int(ldc:int(1543), ldc:int(1544))))
        putstatic:String[](\u7873\u1187\u183a\u385b\u4179\u5fe1::\ub19c\ub171\u7ce1\u99f7\ud51e\ub18d, expr_14C:String[])
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63D : int
        var_5_7E : int
        var_6_85 : int
        var_7_94 : double
        var_9_C5 : double
        var_3_D7 : int
        var_11_E8 : int
        var_14_112 : double
        var_16_116 : int
        var_12_10E : double
        var_17_648 : int
        
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
        var_3_63D = and:int(ldc:int(861682208), ldc:int(804366933))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7873\u1187\u183a\u385b\u4179\u5fe1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0168)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-170463443))
            var_5_7E = and:int(ldc:int(-26989), ldc:int(26976))
            var_6_85 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_94 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9797), ldc:int(9796)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C5 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D7 = and:int(var_3_63D:int, ldc:int(2003090121))
                    var_9_C5 = sub:double(var_7_94:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E8 = var_5_7E:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E8:int, sub:int(var_6_85:int, and:int(ldc:int(1285), ldc:int(23177)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E8:int, and:int(ldc:int(7177), ldc:int(16673)))), var_7_94:double))) {
                        inc:int(var_11_E8, ldc:int(1))
                    }
                    
                    var_3_63D = and:int(var_3_D7:int, ldc:int(-1511473339))
                    var_14_112 = var_7_94:double
                    var_16_116 = var_11_E8:int
                }
                else {
                    var_11_E8 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7E:int), xor:int(ldc:int(768), ldc:int(769)))
                    var_12_10E = var_14_112 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E)
                    
                    if (cmplt:boolean(var_16_116 = var_11_E8:int, var_6_85:int)) {
                        var_9_C5 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E8:int)
                        var_16_116 = var_11_E8:int
                        var_14_112 = var_12_10E:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1291471001))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(170861158))
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1360837689))
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1418025231))
                        
                        if (cmplt:boolean(var_16_116:int, var_6_85:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0396:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(565891258))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1106184260))
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1869455451))
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1549163323))
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-949709861))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1628721697))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1186521560))
                        var_11_E8 = and:int(ldc:int(484), ldc:int(-16893))
                        goto(Label_1486)
                    }
                    
                    Label_0576:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1675876007))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1590231292))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1633622461))
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1977182820))
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-859519045))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-675113544))
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-2012192024))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1074701782))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_112 = var_9_C5:double
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0725:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1303129502))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1206606869))
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2032831673))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1128975749))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(434762374))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(829183725))
                        var_14_112 = mul:double(ldc:double(0.5), add:double(var_9_C5:double, var_14_112:double))
                    }
                    
                    Label_0863:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(150669920))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1990485854))
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-640832616))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(312233588))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-102690220))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E:int), var_7_94:double)) {
                                var_11_E8 = and:int(ldc:int(21089), ldc:int(3335))
                                goto(Label_1122)
                            }
                        }
                    }
                    
                    Label_0984:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(617690233))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(2129624998))
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1977728612))
                        var_11_E8 = and:int(ldc:int(20421), ldc:int(-20438))
                    }
                    
                    Label_1122:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-140860396))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(549550888))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0984)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1231037369))
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(2118494888))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(995006414))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-10501443))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                                goto(Label_1364)
                            }
                        }
                    }
                    
                    Label_1252:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2070479511))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1122)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0984)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-651559159))
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1384487340))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_112:double, var_5_7E:int, var_16_116:int)
                            goto(Label_1486)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1364:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1834302391))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-2129623757))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1916854931))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(-202966472))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_112:double, ldc:double(0.0))
                    Label_1486:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_648 = var_5_7E:int
                        
                        if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1497:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1392833007))
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-569260720))
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1047910458))
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-505165246))
                        var_17_648 = add:int(var_16_116:int, and:int(ldc:int(7857), ldc:int(323)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63D = and:int(var_3_63D:int, ldc:int(-205248978))
                
                if (cmple:boolean(var_5_7E = var_17_648:int, sub:int(var_6_85:int, and:int(ldc:int(16897), ldc:int(4167))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0168:
        
        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-1930098796))
            goto(Label_0106)
        }
    }
}
