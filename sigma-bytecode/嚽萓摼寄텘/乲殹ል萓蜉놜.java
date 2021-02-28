public class \u56bd\u8413\u647c\u5bc4\ud158.\u4e72\u6bb9\u120d\u8413\u8709\ub19c {
    public void \u4e72\u6bb9\u120d\u8413\u8709\ub19c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u527a\u873d\u071d\u4f52\uc229\ud217 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1) {
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
            invokespecial:Object(Object::<init>, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c)
            putfield:int(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u3e75\uc229\u8d98\u4179\u8c8a\uc84e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c, ldc:int(-1))
            putfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ubded\ufe34\u93a2\u97b7\u71ae\ub6ab, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c, p0:\u527a\u873d\u071d\u4f52\uc229\ud217)
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u97e6\uc7fe\u3504\u5bc4\ua3b4\ud51e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<java.lang.String> \u99f7\u6d99\u839e\u16f6\u6cfe\u97e6() {
        var_1_5F : int
        var_3_63 : ArrayList
        var_4_70 : Iterator<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>
        
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
            var_1_5F = and:int(ldc:int(827612394), ldc:int(-753124102))
            var_3_63 = invokestatic:ArrayList(Lists::newArrayList)
            var_4_70 = invokeinterface:Iterator<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(Collection<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>::iterator, invokevirtual:Collection<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(\u527a\u873d\u071d\u4f52\uc229\ud217::\u97b7\u64ab\ucfaf\u8df4\ud4fe\u4c2b, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ubded\ufe34\u93a2\u97b7\u71ae\ub6ab, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c)))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1739365375))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_70:Iterator<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<String>::add, var_3_63:ArrayList<String>[expected:List<String>], invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\uae87\uc31c\ud523\u5245\u8413\uc3e3, checkcast:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u839e\ud36e\ufe34\uc31c\u392e\u64ab.class, invokeinterface:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(Iterator<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>::next, var_4_70:Iterator<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>)))))
            }
            
            return:Collection<String>(var_3_63:ArrayList<String>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<java.lang.String> \uc2bd\u97e6\u6ec6\u4c2b\u8308\u946b() {
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
            return:Collection<String>(ternaryop:Object[expected:Collection<String>](logicaland:boolean(cmpne:boolean(getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u97e6\uc7fe\u3504\u5bc4\ua3b4\ud51e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c)), aconstnull:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79()), cmpeq:boolean(invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u97e6\uc7fe\u3504\u5bc4\ua3b4\ud51e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c))), getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u56bd\u873d\uc2e8\u7ce1\u6b5f\ub113))), invokestatic:Set<String>[expected:Object](Collections::singleton, invokevirtual:String(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\u760c\uff55\uff55\ub102\u3e2a, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u836c\u8709\uae87\u93a2\u4d85\u5db4::\uc238\uc246\ucb79\u7bad\ud217\u7c6b, checkcast:\u836c\u8709\uae87\u93a2\u4d85\u5db4(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u836c\u8709\uae87\u93a2\u4d85\u5db4.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\u836c\u8709\uae87\u93a2\u4d85\u5db4](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u97e6\uc7fe\u3504\u5bc4\ua3b4\ud51e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c)))))), invokestatic:List<Object>[expected:Object](Collections::emptyList)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<java.lang.String> \u3d4b\u5245\u74b1\u7e3f\u6c56\u8df4() {
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
            return:Collection<String>(invokevirtual:Collection<String>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u88c5\u6d99\u62da\u600f\ua61f\u6c56, invokevirtual:\u7c6b\ud36e\u8d90\u0800\ua6bd(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8df4\ub113\u9937\u4cd9\u4c04\u6d69, invokevirtual:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u527a\u873d\u071d\u4f52\uc229\ud217::\uff55\u67e9\u0a06\u0800\u4c2b\u93a2, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ubded\ufe34\u93a2\u97b7\u71ae\ub6ab, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c)))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u4cd9\uc4d2\u8640\u3bc9\u0b8e\u40a9() {
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
            return:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(invokevirtual:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u7bad\ub70c\ub171\u47c2\u6435\u61a4, invokevirtual:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u64f2\u3bc9\u67e9\u36d3\u5d20, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u97e6\uc7fe\u3504\u5bc4\ua3b4\ud51e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u0b8e\u9033\ud12e\u446c\u67d0\u3711() {
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
            return:Stream<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(invokevirtual:Stream<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u8350\u76bc\u67e9\uff55\u8bb0\u385b::\u4f52\uafe7\ud171\u9033\u4492\ubb2b, invokevirtual:\u8350\u76bc\u67e9\uff55\u8bb0\u385b(\u527a\u873d\u071d\u4f52\uc229\ud217::\u4179\u983f\ub6ab\u960f\u836c\ub6ab, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ubded\ufe34\u93a2\u97b7\u71ae\ub6ab, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u873d\u7043\u385b\uceb8\u3a62\u6b0d(int p0) {
        var_2_91 : int
        var_4_67 : \uf995\u72f1\u8389\ucb79\ub6ab\u8d98
        stack_B9_0 : int [generated]
        
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
            var_2_91 = and:int(ldc:int(-209380973), ldc:int(-1481785697))
            var_4_67 = getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u97e6\uc7fe\u3504\u5bc4\ua3b4\ud51e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c))
            
            if (cmpeq:boolean(var_4_67:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98, aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                loop {
                    if (cmpne:boolean(and:int(var_2_91:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_91 = and:int(var_2_91:int, ldc:int(-1552580705))
                        
                        if (cmpeq:boolean(p0:int, ldc:int(0))) {
                            stack_B9_0 = and:int(ldc:int(4097), ldc:int(9997))
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_91:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_91 = and:int(var_2_91:int, ldc:int(-350357261))
                        stack_B9_0 = and:int(ldc:int(-334), ldc:int(333))
                        looporswitchbreak()
                    }
                    
                    var_2_91 = and:int(var_2_91:int, ldc:int(-1876759457))
                }
            }
            else {
                stack_B9_0 = invokevirtual:boolean[expected:int](\u7d52\u718f\u3776\u6fb0\ub83f::\u3dd3\u760c\u760c\u960f\u93a2\u183a, var_4_67:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:int)
            }
            
            return:boolean(stack_B9_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u6c56\u56bd\ud523\u8d98\u600f\uc910(com.mojang.brigadier.context.CommandContext<\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
        expr_83 : int [generated]
        
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
            
            if (cmpne:boolean(getfield:CompletableFuture<Suggestions>(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u8389\u8c8a\u4cd9\u3dd3\u7e3f\uf94d, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c), aconstnull:CompletableFuture<Suggestions>())) {
                invokevirtual:boolean(CompletableFuture<T>::cancel, getfield:CompletableFuture<Suggestions>(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u8389\u8c8a\u4cd9\u3dd3\u7e3f\uf94d, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c), and:int[expected:boolean](ldc:int(16001), ldc:int(-16002)))
            }
            
            putfield:CompletableFuture<Suggestions>(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u8389\u8c8a\u4cd9\u3dd3\u7e3f\uf94d, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c, initobject:CompletableFuture<Suggestions>(CompletableFuture<T>::<init>))
            expr_83 = add:int(getfield:int(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u3e75\uc229\u8d98\u4179\u8c8a\uc84e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c), xor:int(ldc:int(2049), ldc:int(2048)))
            putfield:int(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u3e75\uc229\u8d98\u4179\u8c8a\uc84e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c, expr_83:int)
            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ubded\ufe34\u93a2\u97b7\u71ae\ub6ab, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c), initobject:\u9255\uae5d\u5140\ub18d\u7ce1(\u9255\uae5d\u5140\ub18d\u7ce1::<init>, expr_83:int, invokevirtual:String(CommandContext::getInput, p0:CommandContext<\u7e3f\uf94d\u446c\uc7fe\u7e3f>)))
            return:CompletableFuture<Suggestions>(getfield:CompletableFuture<Suggestions>(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u8389\u8c8a\u4cd9\u3dd3\u7e3f\uf94d, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \u6435\u7049\u839e\uc910\u527a\ubf56(double p0) {
        stack_86_0 : Locale [generated]
        stack_86_1 : String [generated]
        expr_76 : Object[] [generated]
        
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
            stack_86_0 = getstatic:Locale(Locale::ROOT)
            stack_86_1 = loadelement:String(getstatic:String[](\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ub171\u8bb0\ua3b4\uc84e\u4c04\u56bd), and:int(ldc:int(-30546), ldc:int(29713)))
            expr_76 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(8714), ldc:int(8715)))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(27666), ldc:int(-27667)), invokestatic:Double[expected:Object](Double::valueOf, p0:double))
            return:String(invokestatic:String(String::format, stack_86_0:Locale, stack_86_1:String, expr_76:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc(int p0) {
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
            return:String(invokestatic:String(Integer::toString, p0:int))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9> \u59ec\uc246\u4ab3\u88c5\u7873\uae5d() {
        var_3_69 : \u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79
        var_4_95 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_3_69 = getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u97e6\uc7fe\u3504\u5bc4\ua3b4\ud51e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c))
        
        if (logicaland:boolean(cmpne:boolean(var_3_69:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79, aconstnull:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79()), cmpeq:boolean(invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, var_3_69:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79), getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u5d20\u494c\ucb79\u3504\u7ce1\u983f)))) {
            var_4_95 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ud4fe\u120d\u9a18\u385b\u4492\u5f50::\u0b8e\ub83f\uf995\u5245\u59ec\u9937, checkcast:\ud4fe\u120d\u9a18\u385b\u4492\u5f50(\ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50.class, var_3_69:\ud4fe\u120d\u9a18\u385b\u4492\u5f50))
            return:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>(invokestatic:Set<\u4492\ub8be\u8cae\uae5d\u40a9>(Collections::singleton, initobject:\u4492\ub8be\u8cae\uae5d\u40a9(\u4492\ub8be\u8cae\uae5d\u40a9::<init>, invokestatic:String(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_4_95:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokestatic:String(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_4_95:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokestatic:String(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u3d4b\ub113\u64f2\u3e2a\u6b0d\ub7dc, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_4_95:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))))
        }
        
        return:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>(invokespecial:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u59ec\uc246\u4ab3\u88c5\u7873\uae5d, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c[expected:\u7e3f\uf94d\u446c\uc7fe\u7e3f]))
    }
    
    public java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9> \ud7e8\u12cb\u3e2a\u6b0d\u392e\ub19c() {
        var_3_69 : \u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79
        var_4_92 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        
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
        var_3_69 = getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u97e6\uc7fe\u3504\u5bc4\ua3b4\ud51e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c))
        
        if (logicaland:boolean(cmpne:boolean(var_3_69:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79, aconstnull:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79()), cmpeq:boolean(invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, var_3_69:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79), getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u5d20\u494c\ucb79\u3504\u7ce1\u983f)))) {
            var_4_92 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\u0a06\u8d98\u5d20\u51fa\u36d3\ud12e, var_3_69:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79)
            return:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>(invokestatic:Set<\u4492\ub8be\u8cae\uae5d\u40a9>(Collections::singleton, initobject:\u4492\ub8be\u8cae\uae5d\u40a9(\u4492\ub8be\u8cae\uae5d\u40a9::<init>, invokestatic:String(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u6435\u7049\u839e\uc910\u527a\ubf56, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_4_92:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), invokestatic:String(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u6435\u7049\u839e\uc910\u527a\ubf56, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_4_92:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), invokestatic:String(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u6435\u7049\u839e\uc910\u527a\ubf56, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_4_92:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)))))
        }
        
        return:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>(invokespecial:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\ud7e8\u12cb\u3e2a\u6b0d\u392e\ub19c, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c[expected:\u7e3f\uf94d\u446c\uc7fe\u7e3f]))
    }
    
    public java.util.Set<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>> \u97e6\u69d9\ua562\uc87f\ub6ab\u76bc() {
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
            return:Set<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(invokevirtual:Set<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\u527a\u873d\u071d\u4f52\uc229\ud217::\u51fa\u3dd3\uc246\u4daf\u8c8a\u965f, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ubded\ufe34\u93a2\u97b7\u71ae\ub6ab, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c)))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f \u392e\uc7fe\u7330\u36d3\u4ab3\u56bd() {
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
            return:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(invokevirtual:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\u527a\u873d\u071d\u4f52\uc229\ud217::\u7049\u7af6\u8d98\ud523\u2dcc\u873d, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ubded\ufe34\u93a2\u97b7\u71ae\ub6ab, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c)))
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\u6c56\ua61f\u4d85\u071d\u61a4(int p0, com.mojang.brigadier.suggestion.Suggestions p1) {
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
            
            if (cmpeq:boolean(p0:int, getfield:int(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u3e75\uc229\u8d98\u4179\u8c8a\uc84e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c))) {
                invokevirtual:boolean(CompletableFuture<Suggestions>::complete, getfield:CompletableFuture<Suggestions>(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u8389\u8c8a\u4cd9\u3dd3\u7e3f\uf94d, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c), p1:Suggestions)
                putfield:CompletableFuture<Suggestions>(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u8389\u8c8a\u4cd9\u3dd3\u7e3f\uf94d, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c, aconstnull:CompletableFuture<Suggestions>())
                putfield:int(\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\u3e75\uc229\u8d98\u4179\u8c8a\uc84e, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c, ldc:int(-1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_135_0 : byte[] [generated]
        stack_199_0 : byte[] [generated]
        stack_1F8_0 : byte[] [generated]
        stack_273_0 : byte[] [generated]
        stack_2C9_0 : byte[] [generated]
        var_4_17B : int
        var_3_180 : byte[]
        var_5_181 : int
        expr_199 : byte [generated]
        var_0_1EE : int
        expr_1F8 : byte [generated]
        stack_241_2 : byte [generated]
        stack_21E_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_261 : byte[]
        var_5_262 : int
        expr_112 : int [generated]
        var_3_2B7 : byte[]
        var_5_2B8 : int
        var_3_141 : String
        stack_174_0 : String[] [generated]
        expr_153 : String[] [generated]
        
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
        var_0_61 = and:int(ldc:int(-128585518), ldc:int(-1183064074))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_135_0 = stack_199_0 = stack_1F8_0 = stack_273_0 = stack_2C9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("bUV+YX0=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_17B = expr_6E:int
        var_3_180 = newarray:byte[](byte.class, expr_6E:int)
        var_5_181 = expr_6E:int
        Label_0387:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(978818766))
            var_5_181 = add:int(var_5_181:int, ldc:int(-1))
            expr_199 = loadelement:byte(stack_199_0:byte[], var_5_181:int)
            storeelement:byte(var_3_180:byte[], var_5_181:int, xor:int(or:int(and:int(shl:int(expr_199:byte, and:int(ldc:int(2062), ldc:int(20900))), ldc:int(-16)), and:int(shr:int(expr_199:byte[expected:int], xor:int(ldc:int(-31661), ldc:int(-31657))), ldc:int(15))), ldc:int(105)))
            
            if (cmpne:boolean(var_5_181:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_135_0 = stack_199_0 = stack_1F8_0 = stack_273_0 = stack_2C9_0 = var_3_180:byte[]
            goto(Label_0115)
        }
        
        Label_0481:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1EE = and:int(var_0_61:int, ldc:int(2146950847))
            var_5_181 = add:int(var_5_181:int, ldc:int(-1))
            expr_1F8 = stack_241_2 = loadelement(stack_1F8_0, var_5_181)
            
            if (cmplt:boolean(add:int(add:int(var_5_181:int, ldc:int(2)), neg:int(var_4_17B:int)), ldc:int(0))) {
                stack_241_2 = stack_21E_0 = add:byte(expr_1F8:byte, loadelement:byte(var_3_180:byte[], add:int(var_5_181:int, ldc:int(2))))
                goto(Label_0558)
            }
            
            Label_0517:
            
            if (cmpne:boolean(and:int(var_0_1EE:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1EE = and:int(var_0_1EE:int, ldc:int(-1666980902))
            }
            else {
                var_0_1EE = and:int(var_0_1EE:int, ldc:int(-1238918954))
                stack_241_2 = stack_21E_0 = add:byte(expr_1F8:byte, ldc:byte(2))
            }
            
            Label_0558:
            
            if (cmpne:boolean(and:int(var_0_1EE:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0517)
            }
            
            var_0_61 = and:int(var_0_1EE:int, ldc:int(-1082027594))
            storeelement:byte(var_3_180:byte[], var_5_181:int, stack_241_2:byte)
            
            if (cmpne:boolean(var_5_181:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_135_0 = stack_199_0 = stack_1F8_0 = stack_273_0 = stack_2C9_0 = var_3_180:byte[]
            goto(Label_0172)
        }
        
        goto(Label_0387)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(256)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(812080413))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-2094403))
        }
        else {
            var_0_61 = and:int(var_0_61:int, ldc:int(895983291))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_17B = expr_A7:int
                var_3_180 = newarray:byte[](byte.class, expr_A7:int)
                var_5_181 = expr_A7:int
                goto(Label_0481)
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(131072)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(748754060))
        }
        else {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(1889924350))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_261 = newarray:byte[](byte.class, expr_D9:int)
                var_5_262 = expr_D9:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(2002255754))
                    var_5_262 = add:int(var_5_262:int, ldc:int(-1))
                    storeelement:byte(var_3_261:byte[], var_5_262:int, add:int(shl:int(loadelement:byte(stack_273_0:byte[], var_5_262:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_262:int, xor:int(ldc:int(5664), ldc:int(5665)))), ldc:int(4)), and:int(ldc:int(1295), ldc:int(12879)))))
                    
                    if (cmpne:boolean(var_5_262:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_135_0 = stack_199_0 = stack_1F8_0 = stack_273_0 = stack_2C9_0 = var_3_261:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(4096)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-1206320546))
        }
        else {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-162058903))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-1168900134))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_2B7 = newarray:byte[](byte.class, expr_112:int)
                var_5_2B8 = expr_112:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-177357662))
                    var_5_2B8 = add:int(var_5_2B8:int, ldc:int(-1))
                    storeelement:byte(var_3_2B7:byte[], var_5_2B8:int, add:byte(loadelement:byte(stack_2C9_0:byte[], var_5_2B8:int), ldc:byte(74)))
                    
                    if (cmpne:boolean(var_5_2B8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_135_0 = stack_199_0 = stack_1F8_0 = stack_273_0 = stack_2C9_0 = var_3_2B7:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
            var_3_141 = initobject:String(String::<init>, stack_135_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_174_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-24566), ldc:int(-24565)))
            expr_153 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18432), ldc:int(18433)))
            storeelement:String(expr_153:String[], and:int(ldc:int(3678), ldc:int(-3680)), invokevirtual:String[expected:String](String::substring, var_3_141:String, and:int(ldc:int(-2098), ldc:int(2097)), xor:int(ldc:int(16388), ldc:int(16384))))
            putstatic:String[](\u4e72\u6bb9\u120d\u8413\u8709\ub19c::\ub171\u8bb0\ua3b4\uc84e\u4c04\u56bd, expr_153:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u8cae\u16f6\uae87\u3bd6\u7043\u5fe1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_679 : int
        
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
        var_3_66E = and:int(ldc:int(-818632775), ldc:int(-853545554))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4e72\u6bb9\u120d\u8413\u8709\ub19c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(1336919531))
            var_5_81 = and:int(ldc:int(12684), ldc:int(-12685))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11910), ldc:int(-11919)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_66E:int, ldc:int(1875709819))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(16705), ldc:int(563)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2059), ldc:int(5169)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_66E = and:int(var_3_DA:int, ldc:int(-43022361))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(16660), ldc:int(16661)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1646193217))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(717754178))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1890259504))
                        goto(Label_0824)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1806710319))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1577987490))
                    }
                    else {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1472542011))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0824)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(189874611))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1923621486))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1124880818))
                        goto(Label_0824)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1464931519))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(2134701358))
                            var_11_EB = and:int(ldc:int(-25890), ldc:int(9505))
                            goto(Label_1531)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0585:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(452648405))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-976520080))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1066820756))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0824)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-405289038))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0824)
                        }
                    }
                    
                    Label_0701:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1381761393))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1082388399))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1992741827))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1575845438))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0824:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(421765874))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1495960766))
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1754517562))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-11641409))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(9488), ldc:int(9489))
                                goto(Label_1125)
                            }
                        }
                    }
                    
                    Label_0940:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(2004497827))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-711324722))
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(530221749))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-445339851))
                            goto(Label_0824)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-412412626))
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(517999177))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1961486720))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-537424595))
                        var_11_EB = and:int(ldc:int(24732), ldc:int(-29855))
                    }
                    
                    Label_1125:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-910675082))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0940)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(578728778))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-464327777))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-495500200))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1864515004))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-44673093))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1385)
                            }
                        }
                    }
                    
                    Label_1258:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1889070150))
                            goto(Label_1125)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1825076440))
                            goto(Label_0940)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-467368121))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-147009941))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1531)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1385:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(993268705))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-418615788))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-914329067))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1171865516))
                        goto(Label_0824)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1475684520))
                        loopcontinue()
                    }
                    
                    var_3_66E = and:int(var_3_66E:int, ldc:int(-450927503))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1531:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_679 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1542:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-2014884273))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1175241793))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0824)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1169016173))
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1704259257))
                        var_17_679 = add:int(var_16_119:int, and:int(ldc:int(9), ldc:int(4289)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66E = and:int(var_3_66E:int, ldc:int(-3871260))
                
                if (cmple:boolean(var_5_81 = var_17_679:int, sub:int(var_6_88:int, xor:int(ldc:int(-30703), ldc:int(-30704))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(262144)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(289444771))
            goto(Label_0108)
        }
    }
}
