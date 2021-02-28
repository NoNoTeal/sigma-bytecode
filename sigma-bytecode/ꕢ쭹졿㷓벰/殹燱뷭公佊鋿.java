public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff {
    private void \u6bb9\u71f1\ubded\u516c\u4f4a\u92ff(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u6198\u624e\u3504\u965f\u4c2b\ub8be p0, int p1) {
        var_5_76 : int
        var_6_7F : ArrayList<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>
        var_7_88 : int
        
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
            putfield:\u6198\u624e\u3504\u965f\u4c2b\ub8be(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ufe34\ucb79\ub6ab\uc229\u600f\uc2bd, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff, p0:\u6198\u624e\u3504\u965f\u4c2b\ub8be)
            invokespecial:Object(Object::<init>, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff)
            putfield:int(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ud51e\ubf56\u0c95\u965f\u3d4b\u4c04, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff, p1:int)
            var_5_76 = loadelement:int(invokevirtual:int[](\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8::\u3bd6\ub6ab\u1833\u98a4\u516c\ua6bd, invokestatic:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\ucef1\u527a\u7c6b\u8350\u5fe1\u0c95, p0:\u6198\u624e\u3504\u965f\u4c2b\ub8be)), p1:int)
            var_6_7F = initobject:ArrayList<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>(ArrayList<E>::<init>)
            var_7_88 = and:int(ldc:int(-24468), ldc:int(22403))
            
            while (cmplt:boolean(var_7_88:int, ldc:int(9))) {
                if (cmpeq:boolean(and:int(shr:int(var_5_76:int, sub:int(ldc:int(8), var_7_88:int)), xor:int(ldc:int(24581), ldc:int(24580))), and:int(ldc:int(8193), ldc:int(3713)))) {
                    invokeinterface:boolean(List<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>::add, var_6_7F:ArrayList<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>[expected:List<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>], loadelement:\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b(invokestatic:\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[](\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b::values), var_7_88:int))
                }
                
                inc:int(var_7_88, ldc:int(1))
            }
            
            putfield:\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[](\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\u92ff\ud12e\uc7fe\ud12e\ub6ab\u0b8e, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff, checkcast:\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[](\u12b2\u4e72\u8df4\u67e9\u67e9.\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[].class, invokeinterface:\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[](List<E>::toArray, var_6_7F:ArrayList<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>[expected:List<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>], newarray:\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[](\u12b2\u4e72\u8df4\u67e9\u67e9.\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b.class, invokeinterface:int(List<E>::size, var_6_7F:ArrayList<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>[expected:List<\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b>])))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8258\u5245\u965f\ua562\u7c6b\uc229() {
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
            return:int(loadelement:int(invokevirtual:int[](\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8::\ufcaf\u6fb0\u494c\u8d90\ub6ab\u56bd, invokestatic:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\ucef1\u527a\u7c6b\u8350\u5fe1\u0c95, getfield:\u6198\u624e\u3504\u965f\u4c2b\ub8be(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ufe34\ucb79\ub6ab\uc229\u600f\uc2bd, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff))), getfield:int(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ud51e\ubf56\u0c95\u965f\u3d4b\u4c04, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff)))
        }
        
        goto(Label_0006)
    }
    
    public int \u62da\u5fe1\u6cfe\ud36e\ub6ab\u36d3() {
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
            return:int(loadelement:int(invokevirtual:int[](\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8::\u64ab\u392e\uc229\u71f1\u6435\u7d52, invokestatic:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\ucef1\u527a\u7c6b\u8350\u5fe1\u0c95, getfield:\u6198\u624e\u3504\u965f\u4c2b\ub8be(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ufe34\ucb79\ub6ab\uc229\u600f\uc2bd, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff))), getfield:int(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ud51e\ubf56\u0c95\u965f\u3d4b\u4c04, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff)))
        }
        
        goto(Label_0006)
    }
    
    public int \u7e3f\u12cb\uc2e8\u3d64\ud217\ub70c() {
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
            return:int(loadelement:int(invokevirtual:int[](\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8::\u3e2a\uf94d\uc910\ua61f\uc87f\ufe34, invokestatic:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\ucef1\u527a\u7c6b\u8350\u5fe1\u0c95, getfield:\u6198\u624e\u3504\u965f\u4c2b\ub8be(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ufe34\ucb79\ub6ab\uc229\u600f\uc2bd, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff))), getfield:int(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ud51e\ubf56\u0c95\u965f\u3d4b\u4c04, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff)))
        }
        
        goto(Label_0006)
    }
    
    public int \ua068\u3d64\u0800\u6b5f\u516c\u59ec() {
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
            return:int(loadelement:int(invokevirtual:int[](\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8::\ud12e\u4f52\uc31c\u56bd\ud217\u960f, invokestatic:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\ucef1\u527a\u7c6b\u8350\u5fe1\u0c95, getfield:\u6198\u624e\u3504\u965f\u4c2b\ub8be(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ufe34\ucb79\ub6ab\uc229\u600f\uc2bd, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff))), getfield:int(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ud51e\ubf56\u0c95\u965f\u3d4b\u4c04, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub19c\u40a9\ua068\u183a\u6cfe\ua562() {
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
            return:boolean(loadelement:boolean(invokevirtual:boolean[](\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8::\ud36e\ua3b4\u7e3f\uae5d\uae5d\u12cb, invokestatic:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\ucef1\u527a\u7c6b\u8350\u5fe1\u0c95, getfield:\u6198\u624e\u3504\u965f\u4c2b\ub8be(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ufe34\ucb79\ub6ab\uc229\u600f\uc2bd, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff))), getfield:int(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\ud51e\ubf56\u0c95\u965f\u3d4b\u4c04, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff)))
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[] \ub8be\ud51e\u3c25\u5bc4\u6d99\u6c52() {
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
            return:\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[](getfield:\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b[](\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::\u92ff\ud12e\uc7fe\ud12e\ub6ab\u0b8e, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff))
        }
        
        goto(Label_0006)
    }
    
    public void \u6bb9\u71f1\ubded\u516c\u4f4a\u92ff(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u6198\u624e\u3504\u965f\u4c2b\ub8be p0, int p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u6435\u5bc4\uf9c5\u3dd3\u4f4a\u2dcc p2) {
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
            invokespecial:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::<init>, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff, p0:\u6198\u624e\u3504\u965f\u4c2b\ub8be, p1:int)
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
    
    public void \ubf56\u69d9\u8c8a\u12b2\ube23\ub102(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_605 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_610 : int
        
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
        var_3_605 = and:int(ldc:int(-1413693320), ldc:int(-893460267))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(-2142509775))
        }
        else {
            var_3_605 = and:int(var_3_605:int, ldc:int(-1616913840))
            var_5_85 = and:int(ldc:int(-23174), ldc:int(23173))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19169), ldc:int(-27368)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_605:int, ldc:int(-287449219))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32616), ldc:int(-32615)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(2080), ldc:int(2081)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_605 = and:int(var_3_D2:int, ldc:int(-1629558539))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(22529), ldc:int(1097)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1769878480))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1975769183))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1062287188))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1144551037))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-553787695))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(2043908984))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-171485568))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1929051348))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-824386952))
                        var_11_E3 = and:int(ldc:int(-6271), ldc:int(6268))
                        goto(Label_1408)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-945880049))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-711349639))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-151770662))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-612998622))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1079649808))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(728466788))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(246840075))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-339872292))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1679063405))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1055420432))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-283538832))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-4194691))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-783392337))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1821851705))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-591235467))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1965173035))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(14337), ldc:int(14336))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1518353497))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1107550712))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(960782177))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-328436575))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-750095710))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1407127435))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1631785729))
                        var_11_E3 = and:int(ldc:int(10664), ldc:int(-10665))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(475827562))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1913584176))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1543430089))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1028513170))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-276021000))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1902187560))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1298)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1155785848))
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-349440904))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-261908463))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-905625824))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1935309121))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-872549423))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1408)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(2119354673))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1357760226))
                        loopcontinue()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(-356647594))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1408:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_610 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1419:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-527138269))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1466201123))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(257368372))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1651763799))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1984641966))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1430465285))
                        var_17_610 = add:int(var_16_111:int, and:int(ldc:int(561), ldc:int(2121)))
                        looporswitchbreak()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(-1722476700))
                }
                
                var_3_605 = and:int(var_3_605:int, ldc:int(-21049358))
                
                if (cmple:boolean(var_5_85 = var_17_610:int, sub:int(var_6_8C:int, and:int(ldc:int(2209), ldc:int(1281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
