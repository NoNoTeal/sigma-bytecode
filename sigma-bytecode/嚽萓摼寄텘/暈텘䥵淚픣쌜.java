public abstract class \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c {
    public void \uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7873\u7006\u960f\ua6bd\u839e\u7873 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87 p2, java.util.function.Supplier<\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d> p3, boolean p4, boolean p5, long p6) {
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
            invokespecial:Object(Object::<init>, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)
            putfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8df4\u718f\u3c25\u36d3\u647c\u836c, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokestatic:ArrayList[expected:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>](Lists::newArrayList))
            putfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub6ab\u156b\u62da\u7873\u960f\uc3e3, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokestatic:ArrayList[expected:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>](Lists::newArrayList))
            putfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucb79\u4f52\ub7dc\uc229\uceb8\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokestatic:ArrayList[expected:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>](Lists::newArrayList))
            putfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3c25\u8258\u8aa5\ub70c\u5654\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokestatic:ArrayList[expected:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>](Lists::newArrayList))
            putfield:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6bb9\ub18d\u51fa\u51fa\u72f1\uc910, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:int(Random::nextInt, initobject:Random(Random::<init>)))
            putfield:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3d64\u12cb\u56bd\u0a06\u6cfe\u120d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, ldc:int(1013904223))
            putfield:Random(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, initobject:Random(Random::<init>))
            putfield:Supplier<\ubf56\u64f2\u392e\u98a4\u120d>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4bc8\u40a9\u6b0d\u6cfe\u7330\ub6ab, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p3:Supplier<\ubf56\u64f2\u392e\u98a4\u120d>)
            putfield:\u7873\u7006\u960f\ua6bd\u839e\u7873(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u7873\u7006\u960f\ua6bd\u839e\u7873)
            putfield:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6c52\u6435\u6fb0\ucef1\u3c25\uae5d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u3d4b\u9937\u7af6\u7af6\u6198\uae87)
            putfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u5140\u8cae\u6bb9\u759a\ubcb0\u5bc4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>)
            putfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p4:boolean)
            
            if (cmpeq:boolean(invokevirtual:double(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u4bc8\u40a9\u6bb9\u8bb0\u6435\u6b0d, p2:\u3d4b\u9937\u7af6\u7af6\u6198\uae87), ldc:double(1.0))) {
                putfield:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\u3e75\u52d3\ud171\u6d99\u3504, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, initobject:\u34df\u4492\u71ae\uc238\u7873\uafe7(\u34df\u4492\u71ae\uc238\u7873\uafe7::<init>))
            }
            else {
                putfield:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\u3e75\u52d3\ud171\u6d99\u3504, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, initobject:\u3dd3\u8350\u718f\u7ce1\u97e6\u12cb[expected:\u34df\u4492\u71ae\uc238\u7873\uafe7](\u3dd3\u8350\u718f\u7ce1\u97e6\u12cb::<init>, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u3d4b\u9937\u7af6\u7af6\u6198\uae87))
            }
            
            putfield:Thread(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u98a4\u718f\uae5d\ud523\uafe7\ub1b9, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokestatic:Thread(Thread::currentThread))
            putfield:\u8c8a\u51b2\u516c\ub70c\u624e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u1187\u5fe1\u7c6b\ub6ab\u7af6\u3c25, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, initobject:\u8c8a\u51b2\u516c\ub70c\u624e(\u8c8a\u51b2\u516c\ub70c\u624e::<init>, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uae5d\u7af6\u9033\ubcb0\u51fa], p6:long, invokevirtual:\u8df4\u0b8e\u3a62\ufcaf\u3504(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u9033\u759a\u9033\u3d4b\u5f50\uc9f6, p2:\u3d4b\u9937\u7af6\u7af6\u6198\uae87)))
            putfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u3711\u071d\u92ee\ub113\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p5:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ube23\u3d4b\u98a4\ud158\u97b7\u718f() {
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
            return:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e \u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90() {
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
            return:\u88c5\ud171\ub113\u6435\ud51e(aconstnull:\u88c5\ud171\ub113\u6435\ud51e())
        }
        
        goto(Label_0006)
    }
    
    public static boolean \uc3e3\u93a2\u4f52\uae5d\ud171\u836c(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_1_5F : int
        stack_94_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-2036615516), ldc:int(-1435853122))
            
            if (logicaland:boolean(logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8413\u8d98\u494c\u12cb\u3d64\u52d3, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                stack_94_0 = and:int(ldc:int(24577), ldc:int(1175))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-944072567))
                stack_94_0 = and:int(ldc:int(17584), ldc:int(-17585))
            }
            
            return:boolean(stack_94_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u4e72\uc229\uc238\uc3e3\ud217\u7330(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_1_5F : int
        stack_97_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1426799424), ldc:int(1995511344))
            
            if (logicaland:boolean(logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u74b1\uc4d2\u97b7\u6d69\u873d\u0a06, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))), invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8413\u8d98\u494c\u12cb\u3d64\u52d3, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                stack_97_0 = and:int(ldc:int(20491), ldc:int(10881))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1323021966))
                stack_97_0 = and:int(ldc:int(10572), ldc:int(-10605))
            }
            
            return:boolean(stack_97_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u8413\u8d98\u494c\u12cb\u3d64\u52d3(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_1_5F : int
        stack_B8_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1659268026), ldc:int(-1817633889))
            
            if (cmpge:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(-30000000))) {
                if (cmpge:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(-30000000))) {
                    if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(30000000))) {
                        if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(30000000))) {
                            stack_B8_0 = and:int[expected:boolean](ldc:int(1303), ldc:int(6177))
                            return:boolean(stack_B8_0:boolean)
                        }
                    }
                }
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(-620166506))
            stack_B8_0 = and:int[expected:boolean](ldc:int(32292), ldc:int(-32421))
            return:boolean(stack_B8_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u74b1\uc4d2\u97b7\u6d69\u873d\u0a06(int p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpge:boolean(p0:int, ldc:int(-20000000)), cmplt:boolean(p0:int, ldc:int(20000000))), and:int(ldc:int(242), ldc:int(-251)), and:int(ldc:int(8457), ldc:int(6785))))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u8350\u0800\u7d52\u6d69\uf995\u67d0(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7bad\ucef1\u5d20\u3bc9\ubefe\u5d20, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u7bad\ucef1\u5d20\u3bc9\ubefe\u5d20(int p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmplt:boolean(p0:int, and:int(ldc:int(8697), ldc:int(4866)))), and:int(ldc:int(-3664), ldc:int(1611)), xor:int(ldc:int(-32760), ldc:int(-32759))))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e \u7049\u67d0\u983f\u69d9\u6ec6\uc9f6(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\ud523\u92ff\ubb2b\u759a\ud36e(invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(2085), ldc:int(16462))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(244), ldc:int(23301)))))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e \ub113\u12b2\u3711\uc7fe\u1187\u5f50(int p0, int p1) {
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
            return:\ud523\u92ff\ubb2b\u759a\ud36e(checkcast:\ud523\u92ff\ubb2b\u759a\ud36e(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e.class, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\ud523\u92ff\ubb2b\u759a\ud36e](\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:int, p1:int, getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068))))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 \ub113\u12b2\u3711\uc7fe\u1187\u5f50(int p0, int p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p2, boolean p3) {
        var_7_71 : \u8aa5\ubded\ub18d\u4f4a\u4f52
        
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
        var_7_71 = invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u34df\ua068\u72f1\u527a\u0b8e::\uc29a\u4975\u600f\u99f7\uc7fe\u8709, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd]), p0:int, p1:int, p2:\ucb79\u7ce1\ubded\u3d64\ub171, p3:boolean)
        
        if (logicaland:boolean(cmpeq:boolean(var_7_71:\u8aa5\ubded\ub18d\u4f4a\u4f52, aconstnull:\u8aa5\ubded\ub18d\u4f4a\u4f52()), p3:boolean)) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Should always be able to create a chunk!")))
        }
        
        return:\u8aa5\ubded\ub18d\u4f4a\u4f52(var_7_71:\u8aa5\ubded\ub18d\u4f4a\u4f52)
    }
    
    public boolean \uc31c\u8709\u5db4\u97b7\u5d20\u9af2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, int p2) {
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
            return:boolean(invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:int, and:int(ldc:int(16902), ldc:int(2592))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc31c\u8709\u5db4\u97b7\u5d20\u9af2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, int p2, int p3) {
        var_5_63 : int
        var_5_9E : int
        var_7_A5 : \ud523\u92ff\ubb2b\u759a\ud36e
        var_8_AB : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        stack_109_0 : \ud523\u92ff\ubb2b\u759a\ud36e [generated]
        stack_109_3 : int [generated]
        var_5_107 : int
        var_9_10C : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_5_119 : int
        var_10_120 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_11_60E : int
        
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
        var_5_63 = and:int(ldc:int(-1655746200), ldc:int(-1955596815))
        
        if (invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
            return:boolean(and:int[expected:boolean](ldc:int(-24656), ldc:int(24653)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(4096)), ldc:int(0))) {
                var_5_63 = and:int(var_5_63:int, ldc:int(77315568))
            }
            else {
                var_5_63 = and:int(var_5_63:int, ldc:int(-70495378))
                
                if (logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                    if (invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u5bc4\u6b5f\ua6bd\u52d3\u36d3\u392e, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)) {
                        return:boolean(and:int[expected:boolean](ldc:int(-11071), ldc:int(2876)))
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_5_63:int, ldc:int(4096)), ldc:int(0))) {
                var_5_9E = and:int(var_5_63:int, ldc:int(-1646373266))
                var_7_A5 = invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                var_8_AB = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
                stack_109_0 = var_7_A5:\ud523\u92ff\ubb2b\u759a\ud36e
                
                if (cmpeq:boolean(and:int(p2:int, ldc:int(64)), ldc:int(0))) {
                    var_5_9E = and:int(var_5_9E:int, ldc:int(-1915954965))
                    stack_109_3 = and:int(ldc:int(9646), ldc:int(-26031))
                }
                else {
                    stack_109_3 = xor:int(ldc:int(297), ldc:int(296))
                }
                
                var_5_107 = and:int(var_5_9E:int, ldc:int(-1186070547))
                var_9_10C = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud523\u92ff\ubb2b\u759a\ud36e::\uc7fe\u4975\u3bd6\u5bc4\u8cae\u839e, stack_109_0:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, stack_109_3:boolean)
                
                if (cmpeq:boolean(var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
                    return:boolean(and:int[expected:boolean](ldc:int(1345), ldc:int(-1346)))
                }
                
                var_5_119 = and:int(var_5_107:int, ldc:int(-1200662548))
                var_10_120 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                
                if (cmpeq:boolean(and:int(p2:int, and:int(ldc:int(2499), ldc:int(4736))), ldc:int(0))) {
                    if (cmpne:boolean(var_10_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                        if (cmpne:boolean(invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ud523\uc87f\ub18d\ua6bd\u4cd9\uc229, var_10_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ud523\uc87f\ub18d\ua6bd\u4cd9\uc229, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                            goto(Label_0607)
                        }
                        
                        if (cmpne:boolean(invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u93a2\u16f6\u93a2\u4daf\u8389\u6ec6, var_10_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u93a2\u16f6\u93a2\u4daf\u8389\u6ec6, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                            goto(Label_0607)
                        }
                        
                        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u1187\ubcb0\u9a18\u9af2\uf94d\ubded, var_10_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])) {
                            goto(Label_0607)
                        }
                        
                        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u1187\ubcb0\u9a18\u9af2\uf94d\ubded, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])) {
                            goto(Label_0607)
                        }
                    }
                }
                
                Label_0302:
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-139829354))
                    goto(Label_1300)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(321703124))
                    goto(Label_1157)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(536870912)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-151271271))
                    goto(Label_1057)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0919)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0803)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(4194304)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(2016781226))
                    goto(Label_0607)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(262144)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-2106756222))
                }
                else {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-1620256410))
                    
                    if (cmpeq:boolean(var_10_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                        if (cmpeq:boolean(var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_10_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                            goto(Label_0803)
                        }
                        
                        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u600f\u9033\u4c2b\u7873\ub8be\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_10_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                        goto(Label_0803)
                    }
                }
                
                Label_0434:
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(32)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(402370852))
                    goto(Label_1300)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1157)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(16384)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-210559720))
                    goto(Label_1057)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0919)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0803)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(262144)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-241313800))
                }
                else {
                    if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(-1262733709))
                        goto(Label_0302)
                    }
                    
                    return:boolean(xor:int[expected:boolean](ldc:int(9216), ldc:int(9217)))
                }
                
                Label_0607:
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(1)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-241723400))
                    goto(Label_1300)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1157)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(64)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(1528818235))
                    goto(Label_1057)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0919)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0434)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(4194304)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(-1982934923))
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), ldc:String("queueCheckLight"))
                        invokevirtual:void(\ube23\u51b2\u92ee\u6435\u8308\u1833::\ub83f\uf9c5\u4492\u6c52\u4c04\u960f, invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u34df\ua068\u72f1\u527a\u0b8e::\ufe34\u3d4b\u946b\u74b1\ud4fe\ucb79, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
                    }
                    
                    goto(Label_0302)
                }
                
                Label_0803:
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_1300)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-1388949271))
                    goto(Label_1157)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1057)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0607)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(-810877814))
                        goto(Label_0434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(134217728)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(960576090))
                        goto(Label_0302)
                    }
                    
                    var_5_119 = and:int(var_5_119:int, ldc:int(-1681074691))
                    
                    if (cmpne:boolean(and:int(p2:int, and:int(ldc:int(4486), ldc:int(18514))), ldc:int(0))) {
                        if (logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                            goto(Label_1300)
                        }
                        
                        if (cmpeq:boolean(and:int(p2:int, and:int(ldc:int(24837), ldc:int(102))), ldc:int(0))) {
                            goto(Label_1300)
                        }
                    }
                }
                
                Label_0919:
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1300)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-945403035))
                    goto(Label_1157)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(536870912)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-1520219302))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(512)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(-1862658450))
                        goto(Label_0803)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(-1269432176))
                        goto(Label_0607)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0434)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(536870912)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(1007503908))
                        goto(Label_0302)
                    }
                    
                    var_5_119 = and:int(var_5_119:int, ldc:int(-1628471689))
                    
                    if (cmpne:boolean(and:int(p2:int, and:int(ldc:int(1161), ldc:int(277))), ldc:int(0))) {
                        invokevirtual:void(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\uc3e3\u8aa5\uc910\ud217\u5db4\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))
                        
                        if (logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                            if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\uceb8\u8c8a\ua562\u8cae\uc7fe\u7873, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])) {
                                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ufe34\u718f\u74b1\u3d4b\u9af2\u927d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_8_AB:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
                            }
                        }
                    }
                }
                
                Label_1057:
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1300)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(4096)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-1470387769))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(512)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(-901232984))
                        goto(Label_0607)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0434)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0302)
                    }
                    
                    var_5_119 = and:int(var_5_119:int, ldc:int(-1133643672))
                    
                    if (cmpeq:boolean(and:int(p2:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpgt:boolean(p3:int, ldc:int(0))) {
                            var_11_60E = and:int(p2:int, ldc:int(-34))
                            invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\uc87f\u071d\ua068\uc246\u3e75, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_11_60E:int, sub:int(p3:int, and:int(ldc:int(3457), ldc:int(4221))))
                            invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u0a06\u3c25\u67e9\u5f50\u7bad\u98a4, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_11_60E:int, sub:int(p3:int, xor:int(ldc:int(1410), ldc:int(1411))))
                            invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\uc87f\u071d\ua068\uc246\u3e75, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_11_60E:int, sub:int(p3:int, xor:int(ldc:int(65), ldc:int(64))))
                        }
                    }
                }
                
                Label_1157:
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(1)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(358619893))
                        goto(Label_1057)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(4096)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(1002368260))
                        goto(Label_0607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(1397930905))
                        goto(Label_0434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                        var_5_119 = and:int(var_5_119:int, ldc:int(-1671571979))
                        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8308\u69d9\uc2e8\ub32d\ud51e\u6ec6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_10_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                        goto(Label_0434)
                    }
                    
                    goto(Label_0302)
                }
                
                Label_1300:
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(16384)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(1067174126))
                    goto(Label_1157)
                }
                
                if (cmpeq:boolean(and:int(var_5_119:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_1057)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0919)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0803)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0607)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0434)
                }
                
                if (cmpne:boolean(and:int(var_5_119:int, ldc:int(16384)), ldc:int(0))) {
                    var_5_119 = and:int(var_5_119:int, ldc:int(-934480026))
                    
                    if (logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                        if (cmpeq:boolean(invokevirtual:\uf9c5\u5140\ud158\u4492\u3dd3(\ud523\u92ff\ubb2b\u759a\ud36e::\uf9c5\uc7fe\u960f\u6b0d\u5f50\ube23, var_7_A5:\ud523\u92ff\ubb2b\u759a\ud36e), aconstnull:\uf9c5\u5140\ud158\u4492\u3dd3())) {
                            goto(Label_0919)
                        }
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\uf9c5\u5140\ud158\u4492\u3dd3::\u72f1\ud12e\uc7fe\u4c2b\u516c\uc246, invokevirtual:\uf9c5\u5140\ud158\u4492\u3dd3(\ud523\u92ff\ubb2b\u759a\ud36e::\uf9c5\uc7fe\u960f\u6b0d\u5f50\ube23, var_7_A5:\ud523\u92ff\ubb2b\u759a\ud36e), getstatic:\uf9c5\u5140\ud158\u4492\u3dd3(\uf9c5\u5140\ud158\u4492\u3dd3::\u0b8e\u0c95\u4c2b\u6cfe\u8c8a\uf94d)))) {
                            goto(Label_0919)
                        }
                    }
                    
                    var_5_119 = and:int(var_5_119:int, ldc:int(-269552027))
                    invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u92ee\uceb8\u2dcc\u51b2\u5245\u34df, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_9_10C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:int)
                    goto(Label_0919)
                }
                
                goto(Label_0302)
            }
        }
    }
    
    public void \u8308\u69d9\uc2e8\ub32d\ud51e\u6ec6(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
    
    public boolean \u0b8e\u983f\uc238\ub6ab\u7049\ud4fe(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, boolean p1) {
        var_3_61 : int
        stack_98_2 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d [generated]
        stack_97_0 : int [generated]
        stack_97_1 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(2132989829), ldc:int(-1074440227))
            stack_98_2 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u4492\ud51e\u72f1\u34df\u51b2\uc238, invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            stack_97_0 = xor:int(ldc:int(-32544), ldc:int(-32541))
            
            if (logicalnot:boolean(p1:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1640005860))
                stack_97_1 = and:int(ldc:int(27148), ldc:int(-27149))
            }
            else {
                stack_97_1 = ldc:int(64)
            }
            
            return:boolean(invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, stack_98_2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, or:int(stack_97_0:int, stack_97_1:int)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u0b8e\ub70c\ud12e\u965f\uf94d\u8cae(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2, int p3) {
        var_5_63 : int
        var_7_6A : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_5_7A : int
        var_8_81 : \uf995\u8709\ua61f\ub32d\ubff1\u99f7
        stack_113_0 : \ub83f\uc9f6\u47c2\u67d0\u7ce1 [generated]
        
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
        var_5_63 = and:int(ldc:int(-32920405), ldc:int(2115759665))
        var_7_6A = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, var_7_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
            var_5_7A = and:int(var_5_63:int, ldc:int(2121017151))
            var_8_81 = invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (logicalnot:boolean(instanceof:boolean(\u12b2\u7049\u8df4\uc9f6\uae87.\u3c25\u8d98\ubff1\u516c\u873d\uc229.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_7_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))) {
                invokevirtual:void(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u4f4a\u76bc\ub6ab\u5654\uc4d2\ub7dc, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], xor:int(ldc:int(28392), ldc:int(26937)), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokestatic:int(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u3bc9\u183a\ucb79\ubded\u3504\u839e, var_7_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_5_7A:int, ldc:int(134217728)), ldc:int(0))) {
                    var_5_7A = and:int(var_5_7A:int, ldc:int(-22152015))
                    
                    if (p1:boolean) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_7_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))) {
                            var_5_7A = and:int(var_5_7A:int, ldc:int(2117938532))
                            stack_113_0 = aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1()
                        }
                        else {
                            stack_113_0 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        }
                        
                        invokestatic:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u5245\uc910\u5f50\u1833\u6b0d\ube23, var_7_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, stack_113_0:\ub83f\uc9f6\u47c2\u67d0\u7ce1, p2:\u7d52\u718f\u3776\u6fb0\ub83f, getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_7A:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u4492\ud51e\u72f1\u34df\u51b2\uc238, var_8_81:\uf995\u8709\ua61f\ub32d\ubff1\u99f7), and:int(ldc:int(16951), ldc:int(2115)), p3:int))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(12458), ldc:int(-14507)))
    }
    
    public boolean \uc31c\u8709\u5db4\u97b7\u5d20\u9af2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
            return:boolean(invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, and:int(ldc:int(515), ldc:int(20803))))
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u92ee\uceb8\u2dcc\u51b2\u5245\u34df(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, int p3);
    
    public void \u600f\u9033\u4c2b\u7873\ub8be\uc2bd(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
    
    public void \u51fa\u64ab\ufcaf\u47c2\u960f\u3bc9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p1) {
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
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u8df4\ub6ab\u8640\u5bc4\u62da\u416d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u7bad\u72f1\u7873\u5fe1\ua068, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u6ec6\u5654\u927d\u3711\u92ee\u97b7, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc246\u76bc\u4daf\uf9c5\uc246\u416d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua6bd\u7006\ud51e\ub19c\ub8be\u600f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p2) {
        var_4_118 : int
        var_4_84 : int
        var_4_98 : int
        
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
            var_4_118 = and:int(ldc:int(-1175395897), ldc:int(452121559))
            
            if (cmpne:boolean(p2:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u8df4\ub6ab\u8640\u5bc4\u62da\u416d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_4_118:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0455)
                }
                
                if (cmpeq:boolean(and:int(var_4_118:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_84 = and:int(var_4_118:int, ldc:int(-1055495568))
                    goto(Label_0360)
                }
                
                if (cmpne:boolean(and:int(var_4_118:int, ldc:int(8)), ldc:int(0))) {
                    var_4_98 = and:int(var_4_118:int, ldc:int(408520534))
                    goto(Label_0265)
                }
                
                if (cmpeq:boolean(and:int(var_4_118:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_118 = and:int(var_4_118:int, ldc:int(-991710772))
                }
                else {
                    var_4_118 = and:int(var_4_118:int, ldc:int(1560014807))
                    
                    if (cmpne:boolean(p2:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u7bad\u72f1\u7873\u5fe1\ua068, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                    }
                }
                
                Label_0192:
                
                if (cmpne:boolean(and:int(var_4_118:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0455)
                }
                
                if (cmpeq:boolean(and:int(var_4_118:int, ldc:int(128)), ldc:int(0))) {
                    var_4_84 = and:int(var_4_118:int, ldc:int(453115226))
                    goto(Label_0360)
                }
                
                if (cmpne:boolean(and:int(var_4_118:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_98 = and:int(var_4_118:int, ldc:int(-455354304))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_118:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_98 = and:int(var_4_118:int, ldc:int(-1126312961))
                    
                    if (cmpne:boolean(p2:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f))) {
                        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                    }
                }
                
                Label_0265:
                
                if (cmpeq:boolean(and:int(var_4_98:int, ldc:int(64)), ldc:int(0))) {
                    var_4_118 = and:int(var_4_98:int, ldc:int(-267101858))
                    goto(Label_0455)
                }
                
                if (cmpeq:boolean(and:int(var_4_98:int, ldc:int(256)), ldc:int(0))) {
                    var_4_84 = and:int(var_4_98:int, ldc:int(-1146211436))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_98:int, ldc:int(128)), ldc:int(0))) {
                        var_4_118 = and:int(var_4_98:int, ldc:int(1869293029))
                        goto(Label_0192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_98:int, ldc:int(256)), ldc:int(0))) {
                        var_4_118 = and:int(var_4_98:int, ldc:int(-1784175100))
                        loopcontinue()
                    }
                    
                    var_4_84 = and:int(var_4_98:int, ldc:int(-50397241))
                    
                    if (cmpne:boolean(p2:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))) {
                        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                    }
                }
                
                Label_0360:
                
                if (cmpne:boolean(and:int(var_4_84:int, ldc:int(32)), ldc:int(0))) {
                    var_4_118 = and:int(var_4_84:int, ldc:int(-204027376))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_84:int, ldc:int(131072)), ldc:int(0))) {
                        var_4_98 = and:int(var_4_84:int, ldc:int(-1170024688))
                        goto(Label_0265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_84:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_4_118 = and:int(var_4_84:int, ldc:int(-649213289))
                        goto(Label_0192)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_84:int, ldc:int(33554432)), ldc:int(0))) {
                        var_4_118 = and:int(var_4_84:int, ldc:int(-1630038562))
                        loopcontinue()
                    }
                    
                    var_4_118 = and:int(var_4_84:int, ldc:int(-52377625))
                    
                    if (cmpne:boolean(p2:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u6ec6\u5654\u927d\u3711\u92ee\u97b7, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                    }
                }
                
                Label_0455:
                
                if (cmpne:boolean(and:int(var_4_118:int, ldc:int(8)), ldc:int(0))) {
                    var_4_84 = and:int(var_4_118:int, ldc:int(-1328442808))
                    goto(Label_0360)
                }
                
                if (cmpne:boolean(and:int(var_4_118:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_4_98 = and:int(var_4_118:int, ldc:int(-1200704975))
                    goto(Label_0265)
                }
                
                if (cmpeq:boolean(and:int(var_4_118:int, ldc:int(2)), ldc:int(0))) {
                    var_4_118 = and:int(var_4_118:int, ldc:int(-574848477))
                    goto(Label_0192)
                }
                
                if (cmpne:boolean(and:int(var_4_118:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_118 = and:int(var_4_118:int, ldc:int(-834736423))
            }
            
            if (cmpne:boolean(p2:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4e72\u6ec6\u8753\u9937\u071d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc246\u76bc\u4daf\uf9c5\uc246\u416d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4e72\u6ec6\u8753\u9937\u071d\uc2bd(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
    
    public int \uf995\uc7fe\u4daf\u71f1\u62da\ub102(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0, int p1, int p2) {
        var_4_85 : int
        var_6_93 : int
        
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
            var_4_85 = and:int(ldc:int(581661009), ldc:int(-1753483447))
            
            if (cmpge:boolean(p1:int, ldc:int(-30000000))) {
                if (cmpge:boolean(p2:int, ldc:int(-30000000))) {
                    if (cmplt:boolean(p1:int, ldc:int(30000000))) {
                        if (cmplt:boolean(p2:int, ldc:int(30000000))) {
                            if (logicalnot:boolean(invokevirtual:boolean(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], shr:int(p1:int, xor:int(ldc:int(707), ldc:int(711))), shr:int(p2:int, xor:int(ldc:int(12931), ldc:int(12935)))))) {
                                goto(Label_0220)
                            }
                            
                            var_6_93 = add:int(invokevirtual:int(\ud523\u92ff\ubb2b\u759a\ud36e::\u8258\u7af6\ubb2b\u6198\u6fb0\u9a18, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, shr:int(p1:int, and:int(ldc:int(21), ldc:int(366))), shr:int(p2:int, xor:int(ldc:int(-24310), ldc:int(-24306)))), p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, and:int(p1:int, ldc:int(15)), and:int(p2:int, ldc:int(15))), and:int(ldc:int(19), ldc:int(28993)))
                            return:int(var_6_93:int)
                        }
                    }
                }
            }
            
            Label_0107:
            
            if (cmpeq:boolean(and:int(var_4_85:int, ldc:int(4)), ldc:int(0))) {
                var_4_85 = and:int(var_4_85:int, ldc:int(-1436159699))
                var_6_93 = add:int(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), xor:int(ldc:int(8200), ldc:int(8201)))
                return:int(var_6_93:int)
            }
            
            var_4_85 = and:int(var_4_85:int, ldc:int(-857937278))
            Label_0220:
            
            if (cmpne:boolean(and:int(var_4_85:int, ldc:int(1073741824)), ldc:int(0))) {
                var_4_85 = and:int(var_4_85:int, ldc:int(-1078204606))
                goto(Label_0107)
            }
            
            var_4_85 = and:int(var_4_85:int, ldc:int(-1036127317))
            var_6_93 = and:int(ldc:int(8732), ldc:int(-8733))
            return:int(var_6_93:int)
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\ube23\u51b2\u92ee\u6435\u8308\u1833 \u8c8a\ua6bd\u61a4\u72f1\ub32d\u64f2() {
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
            return:\ube23\u51b2\u92ee\u6435\u8308\u1833(invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u34df\ua068\u72f1\u527a\u0b8e::\ufe34\u3d4b\u946b\u74b1\ud4fe\ucb79, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \uc238\uc31c\ua61f\u92ee\u51b2\u527a(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
        
        if (logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud523\u92ff\ubb2b\u759a\ud36e::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(404), ldc:int(400))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(16464), ldc:int(16468)))), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ua6bd\u516c\u5db4\u8bb0\ucef1\u446c)))
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u9033\u3711\u494c\u88c5\u69d9\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
        
        if (logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\ud523\u92ff\ubb2b\u759a\ud36e::\u9033\u3711\u494c\u88c5\u69d9\u97b7, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u8cae\ucb79\ud7e8\ub8be\u156b\u960f::\u74b1\u51b2\u6ec6\ub113\u5140\u8bb0, getstatic:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u718f\u8753\ua61f\u67d0\ud51e\uc87f)))
    }
    
    public boolean \uf9c5\u983f\u6d69\u4bc8\u527a\ub19c() {
        var_1_61 : int
        stack_A2_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1403504341), ldc:int(-758821421))
            
            if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u4179\u4f4a\u7006\u97e6\ube23\u9033, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))), cmplt:boolean(getfield:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u98a4\u72f1\u7006\u3bd6\u59ec\u7e3f, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), xor:int(ldc:int(258), ldc:int(262))))) {
                stack_A2_0 = xor:int(ldc:int(-31230), ldc:int(-31229))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(1403909883))
                stack_A2_0 = and:int(ldc:int(-18440), ldc:int(18439))
            }
            
            return:boolean(stack_A2_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u72f1\u183a\u4975\u0b8e\ub32d\uc2bd() {
        var_1_61 : int
        stack_9B_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1317884805), ldc:int(-3173378))
            
            if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u4179\u4f4a\u7006\u97e6\ube23\u9033, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)), invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uf9c5\u983f\u6d69\u4bc8\u527a\ub19c, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)))) {
                stack_9B_0 = xor:int(ldc:int(1152), ldc:int(1153))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-269510756))
                stack_9B_0 = and:int(ldc:int(-31523), ldc:int(15136))
            }
            
            return:boolean(stack_9B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p2, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p3, float p4, float p5) {
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
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\ua3b4\u8aa5\ub113\ubf56\u873d, add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), p2:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, p3:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, p4:float, p5:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, double p1, double p2, double p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p4, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p5, float p6, float p7);
    
    public abstract void \u8308\u67e9\u965f\uc7fe\u9255\u51fa(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p2, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p3, float p4, float p5);
    
    public void \u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e(double p0, double p1, double p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p3, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p4, float p5, float p6, boolean p7) {
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
    
    public void \u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, double p1, double p2, double p3, double p4, double p5, double p6) {
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
    
    public void \u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7) {
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
    
    public void \ubded\u3504\uc2e8\uf995\u3a62\u67d0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, double p1, double p2, double p3, double p4, double p5, double p6) {
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
    
    public void \ubded\u3504\uc2e8\uf995\u3a62\u67d0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7) {
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
    
    public float \u51fa\u8c8a\u4daf\u760c\uc229\u600f(float p0) {
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
            return:float(mul:float(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u8753\u8709\ubff1\ub32d\u4d85], p0:float), ldc:float(6.2831855f)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u61a4\u6b5f\u8308\ud4fe\u3711\u3bd6(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p0) {
        stack_CD_0 : Logger [generated]
        stack_CD_1 : String [generated]
        expr_A7 : Supplier[] [generated]
        var_4_79 : boolean
        var_5_FD : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_6_105 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            
            if (getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u64f2\u7043\u51fa\u51b2\uafe7\uc2e8, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)) {
                stack_CD_0 = getstatic:Logger(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u5fe1\u5d20\uc246\u8258\u873d\uf995)
                stack_CD_1 = ldc:String("Adding block entity while ticking: {} @ {}")
                expr_A7 = newarray:Supplier[](org.apache.logging.log4j.util.Supplier.class, xor:int(ldc:int(-31480), ldc:int(-31478)))
                storeelement:Supplier(expr_A7:Supplier[], and:int(ldc:int(-12597), ldc:int(12564)), invokedynamic:Supplier(get:(L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\ub83f\uc9f6\u47c2\u67d0\u7ce1;)Lorg/apache/logging/log4j/util/Supplier;, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1))
                storeelement:Supplier(expr_A7:Supplier[], xor:int(ldc:int(-8191), ldc:int(-8192)), invokedynamic:Supplier(get:(L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\ub83f\uc9f6\u47c2\u67d0\u7ce1;)Lorg/apache/logging/log4j/util/Supplier;, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1))
                invokeinterface:void(Logger::error, stack_CD_0:Logger, stack_CD_1:String, expr_A7:Supplier[])
            }
            
            var_4_79 = invokeinterface:boolean(List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::add, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8df4\u718f\u3c25\u36d3\u647c\u836c, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
            
            if (var_4_79:boolean) {
                if (instanceof:boolean(\u36d3\u9033\u6b0d\u983f\u8d90.\u9255\u5bc4\u516c\u8389\u1833.class, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1)) {
                    invokeinterface:boolean(List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::add, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub6ab\u156b\u62da\u7873\u960f\uc3e3, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                }
            }
            
            if (getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)) {
                var_5_FD = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                var_6_105 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, var_5_FD:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u92ee\uceb8\u2dcc\u51b2\u5245\u34df, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, var_5_FD:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_6_105:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_6_105:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, xor:int(ldc:int(-28651), ldc:int(-28649)))
            }
            
            return:boolean(var_4_79:boolean)
        }
        
        goto(Label_0006)
    }
    
    public void \uc910\u1833\uae5d\ua068\u6d69\u0800(java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1> p0) {
        var_2_61 : int
        var_4_75 : Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>
        
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
            var_2_61 = and:int(ldc:int(714268215), ldc:int(-216361027))
            
            if (logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u64f2\u7043\u51fa\u51b2\uafe7\uc2e8, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2122552893))
                var_4_75 = invokeinterface:Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::iterator, p0:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>)
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_75:Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>)) {
                    invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u61a4\u6b5f\u8308\ud4fe\u3711\u3bd6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, checkcast:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1.class, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::next, var_4_75:Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>)))
                }
            }
            else {
                invokeinterface:boolean(List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::addAll, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucb79\u4f52\ub7dc\uc229\uceb8\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), p0:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u156b\u12cb\uc31c\ucfaf\u36d3\u392e() {
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
    
    public void \u4d85\u385b\ua3b4\u5654\ubf56\ub8be(java.util.function.Consumer<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
        var_3_8D : int
        var_6_A5 : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_5_95 : Throwable
        
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
            var_3_8D = and:int(ldc:int(-1490167306), ldc:int(-2069898253))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_3_8D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_8D = and:int(var_3_8D:int, ldc:int(-314837512))
                        invokeinterface:void(Consumer<\u7d52\u718f\u3776\u6fb0\ub83f>::accept, p0:Consumer<\u7d52\u718f\u3776\u6fb0\ub83f>, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8D:int, ldc:int(2147483647)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_8D = and:int(var_3_8D:int, ldc:int(820878243))
                }
                
                var_3_8D = and:int(var_3_8D:int, ldc:int(-270675497))
            }
            catch (java.lang.Throwable var_5_95) {
                var_6_A5 = invokestatic:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubcb0\u59ec\u6d99\u156b\u0800\u946b, var_5_95:Throwable, ldc:String("Ticking entity"))
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ubefe\u8d98\u7049\u64f2\u6cfe\u64ab, p1:\u7d52\u718f\u3776\u6fb0\ub83f, invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u8c8a\u6b0d\uae87\u7330\u446c\uc9f6, var_6_A5:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, ldc:String("Entity being ticked")))
                athrow(initobject:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::<init>, var_6_A5:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 \ubcb0\u416d\u8aa5\u5bc4\u7d52\ucfaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, double p1, double p2, double p3, float p4, \ud36e\u6bb9\u960f\u4c04\u64ab.\u5245\u8d90\ufcaf\u494c\u9937 p5) {
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
            return:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79(invokevirtual:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubcb0\u416d\u8aa5\u5bc4\u7d52\ucfaf, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u7d52\u718f\u3776\u6fb0\ub83f, checkcast:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u64f2\u718f\ub6ab\u9033\u8d90\u9033.class, aconstnull:\u64f2\u718f\ub6ab\u9033\u8d90\u9033()), checkcast:\uf9c5\u16f6\ub102\u3c25\u4c2b(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uf9c5\u16f6\ub102\u3c25\u4c2b.class, aconstnull:\uf9c5\u16f6\ub102\u3c25\u4c2b()), p1:double, p2:double, p3:double, p4:float, and:int[expected:boolean](ldc:int(-21282), ldc:int(21281)), p5:\u5245\u8d90\ufcaf\u494c\u9937))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 \ubcb0\u416d\u8aa5\u5bc4\u7d52\ucfaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, double p1, double p2, double p3, float p4, boolean p5, \ud36e\u6bb9\u960f\u4c04\u64ab.\u5245\u8d90\ufcaf\u494c\u9937 p6) {
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
            return:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79(invokevirtual:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubcb0\u416d\u8aa5\u5bc4\u7d52\ucfaf, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u7d52\u718f\u3776\u6fb0\ub83f, checkcast:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u64f2\u718f\ub6ab\u9033\u8d90\u9033.class, aconstnull:\u64f2\u718f\ub6ab\u9033\u8d90\u9033()), checkcast:\uf9c5\u16f6\ub102\u3c25\u4c2b(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uf9c5\u16f6\ub102\u3c25\u4c2b.class, aconstnull:\uf9c5\u16f6\ub102\u3c25\u4c2b()), p1:double, p2:double, p3:double, p4:float, p5:boolean, p6:\u5245\u8d90\ufcaf\u494c\u9937))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 \ubcb0\u416d\u8aa5\u5bc4\u7d52\ucfaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u64f2\u718f\ub6ab\u9033\u8d90\u9033 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\uf9c5\u16f6\ub102\u3c25\u4c2b p2, double p3, double p4, double p5, float p6, boolean p7, \ud36e\u6bb9\u960f\u4c04\u64ab.\u5245\u8d90\ufcaf\u494c\u9937 p8) {
        var_15_7C : \u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79
        
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
            var_15_7C = initobject:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::<init>, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u7d52\u718f\u3776\u6fb0\ub83f, p1:\u64f2\u718f\ub6ab\u9033\u8d90\u9033, p2:\uf9c5\u16f6\ub102\u3c25\u4c2b, p3:double, p4:double, p5:double, p6:float, p7:boolean, p8:\u5245\u8d90\ufcaf\u494c\u9937)
            invokevirtual:void(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::\u69d9\u74b1\u7043\u6b5f\u120d\ud217, var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79)
            invokevirtual:void(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::\ucb79\u8cae\u7c6b\u6d99\uc84e\u56bd, var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79, xor:int[expected:boolean](ldc:int(-32761), ldc:int(-32762)))
            return:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79(var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ubff1\u6ec6\u7bad\ub18d\ubefe\u7e3f() {
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
            return:String(invokevirtual:String(\u34df\ua068\u72f1\u527a\u0b8e::\ub8be\u8753\ud12e\uc3e3\u3504\ufcaf, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_E2 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
        
        if (invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())
        }
        
        if (logicaland:boolean(logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)), cmpne:boolean(invokestatic:Thread(Thread::currentThread), getfield:Thread(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u98a4\u718f\uae5d\ud523\uafe7\ub1b9, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)))) {
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())
        }
        
        var_4_E2 = aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1()
        
        if (getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u64f2\u7043\u51fa\u51b2\uafe7\uc2e8, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)) {
            var_4_E2 = invokespecial:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u965f\uc2bd\u3e75\ucb79\u760c\u8709, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        }
        
        if (cmpeq:boolean(var_4_E2:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
            var_4_E2 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ud523\u92ff\ubb2b\u759a\ud36e::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\ube23\u3504\u759a\ub83f\u8753(\ube23\u3504\u759a\ub83f\u8753::\u8308\u5db4\u92ee\u8413\u156b\u34df))
        }
        
        if (cmpeq:boolean(var_4_E2:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
            var_4_E2 = invokespecial:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u965f\uc2bd\u3e75\ucb79\u760c\u8709, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        }
        
        return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(var_4_E2:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
    }
    
    private \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \u965f\uc2bd\u3e75\ucb79\u760c\u8709(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        var_4_69 : int
        var_2_78 : int
        var_5_BB : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
        var_2_61 = and:int(ldc:int(-1084105493), ldc:int(790753529))
        var_4_69 = and:int(ldc:int(-1171), ldc:int(1170))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_78 = and:int(var_2_61:int, ldc:int(1592540931))
            }
            else {
                var_2_78 = and:int(var_2_61:int, ldc:int(993631401))
                
                if (cmplt:boolean(var_4_69:int, invokeinterface:int(List<E>::size, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucb79\u4f52\ub7dc\uc229\uceb8\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)))) {
                    var_5_BB = checkcast:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1.class, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::get, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucb79\u4f52\ub7dc\uc229\uceb8\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), var_4_69:int))
                    
                    if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u47c2\uc87f\u6b5f\ud523\u52d3\u7d52, var_5_BB:\ub83f\uc9f6\u47c2\u67d0\u7ce1)), invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::equals, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, var_5_BB:\ub83f\uc9f6\u47c2\u67d0\u7ce1), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object]))) {
                        return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(var_5_BB:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                    }
                    
                    var_2_61 = and:int(var_2_78:int, ldc:int(795792109))
                    inc:int(var_4_69, ldc:int(1))
                    loopcontinue()
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_78:int, ldc:int(256)), ldc:int(0))) {
                return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())
            }
            
            var_2_61 = and:int(var_2_78:int, ldc:int(-52876104))
        }
    }
    
    public void \u4c04\u8709\u67e9\ucfaf\u36d3\u7d52(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p1) {
        var_3_F1 : int
        var_5_E2 : Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>
        var_6_126 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
        var_3_F1 = and:int(ldc:int(-1140584928), ldc:int(-1885868842))
        
        if (logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
            if (cmpne:boolean(p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                if (logicalnot:boolean(invokevirtual:boolean(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u47c2\uc87f\u6b5f\ud523\u52d3\u7d52, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1))) {
                    if (logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u64f2\u7043\u51fa\u51b2\uafe7\uc2e8, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                        goto(Label_0165)
                    }
                    
                    invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ub70c\u8d98\ubf56\u6b5f\u72f1\u4c2b, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                    var_5_E2 = invokeinterface:Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::iterator, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucb79\u4f52\ub7dc\uc229\uceb8\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_3_F1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_F1 = and:int(var_3_F1:int, ldc:int(226344170))
                            
                            if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_E2:Iterator)) {
                                var_6_126 = checkcast:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1.class, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::next, var_5_E2:Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>))
                                
                                if (invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::equals, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, var_6_126:\ub83f\uc9f6\u47c2\u67d0\u7ce1), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])) {
                                    invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, var_6_126:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                                    invokeinterface:void(Iterator::remove, var_5_E2:Iterator)
                                }
                                
                                var_3_F1 = and:int(var_3_F1:int, ldc:int(-1647319273))
                                loopcontinue()
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_3_F1:int, ldc:int(67108864)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_3_F1 = and:int(var_3_F1:int, ldc:int(-1939511473))
                    invokeinterface:boolean(List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::add, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucb79\u4f52\ub7dc\uc229\uceb8\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                }
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_3_F1:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        var_3_F1 = and:int(var_3_F1:int, ldc:int(1203502155))
        Label_0165:
        
        if (cmpne:boolean(and:int(var_3_F1:int, ldc:int(64)), ldc:int(0))) {
            var_3_F1 = and:int(var_3_F1:int, ldc:int(1970661226))
            goto(Label_0105)
        }
        
        var_3_F1 = and:int(var_3_F1:int, ldc:int(2088058254))
        invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u8753\u647c\u6bb9\u7873\u759a\u69d9, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
        invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u61a4\u6b5f\u8308\ud4fe\u3711\u3bd6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
        goto(Label_0105)
    }
    
    public void \ucef1\u71ae\uc31c\uc29a\u4f52\u3e75(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_67 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
            var_4_67 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (logicaland:boolean(cmpne:boolean(var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1()), getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u64f2\u7043\u51fa\u51b2\uafe7\uc2e8, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                invokeinterface:boolean(List<E>::remove, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucb79\u4f52\ub7dc\uc229\uceb8\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:Object])
            }
            else {
                if (cmpne:boolean(var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                    invokeinterface:boolean(List<E>::remove, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucb79\u4f52\ub7dc\uc229\uceb8\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:Object])
                    invokeinterface:boolean(List<E>::remove, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8df4\u718f\u3c25\u36d3\u647c\u836c, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:Object])
                    invokeinterface:boolean(List<E>::remove, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub6ab\u156b\u62da\u7873\u960f\uc3e3, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:Object])
                }
                
                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\ud4fe\u6c56\ud217\uc4d2\u6b0d\u3776, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5bc4\u67d0\u97b7\u3711\u5654\u8709(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        stack_A2_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(289433251), ldc:int(-1457165141))
            
            if (logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1615918975))
                stack_A2_0 = invokevirtual:boolean[expected:int](\u34df\ua068\u72f1\u527a\u0b8e::\uc910\u3776\u718f\u8413\ucb79\u4492, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd]), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(-31705), ldc:int(-31709))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(12364), ldc:int(17156))))
            }
            else {
                stack_A2_0 = and:int(ldc:int(3274), ldc:int(-11467))
            }
            
            return:boolean(stack_A2_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \uae5d\u3a62\u385b\u5fe1\ub18d\u7ce1(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p2) {
        var_4_63 : int
        var_4_72 : int
        var_6_9A : \u8aa5\ubded\ub18d\u4f4a\u4f52
        stack_DD_0 : int [generated]
        
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
        var_4_63 = and:int(ldc:int(1180011675), ldc:int(-8925870))
        
        if (logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
            var_4_72 = and:int(var_4_63:int, ldc:int(-44043119))
            var_6_9A = invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(-32352), ldc:int(-32348))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(8194), ldc:int(8198))), getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068), and:int[expected:boolean](ldc:int(-6598), ldc:int(2437)))
            
            if (cmpne:boolean(var_6_9A:\u8aa5\ubded\ub18d\u4f4a\u4f52, aconstnull:\u8aa5\ubded\ub18d\u4f4a\u4f52())) {
                var_4_72 = and:int(var_4_72:int, ldc:int(1721574997))
                stack_DD_0 = invokevirtual:boolean[expected:int](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8bb0\u6d69\u4f52\u6d99\u965f\u5140, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_6_9A:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u7d52\u718f\u3776\u6fb0\ub83f, p2:\u760c\u4975\u4179\uc246\u8640\u64f2)
            }
            else {
                stack_DD_0 = and:int(ldc:int(11425), ldc:int(-11938))
            }
            
            return:boolean(stack_DD_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-32238), ldc:int(15525)))
    }
    
    public boolean \u071d\u3e2a\ua6bd\u8d98\uc238\u983f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
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
            return:boolean(invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u3a62\u385b\u5fe1\ub18d\u7ce1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u7d52\u718f\u3776\u6fb0\ub83f, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d)))
        }
        
        goto(Label_0006)
    }
    
    public void \ud12e\u1187\u071d\ub70c\u76bc\uc2e8() {
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
            putfield:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u98a4\u72f1\u7006\u3bd6\u59ec\u7e3f, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, d2i:int(mul:double(sub:double(ldc:double(1.0), mul:double(mul:double(add:double(ldc:double(0.5), mul:double(ldc:double(2.0), invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u8753\u8709\ubff1\ub32d\u4d85], ldc:float(1.0f)), ldc:float(6.2831855f)))), ldc:double(-0.25), ldc:double(0.25)))), sub:double(ldc:double(1.0), div:double(f2d:double(mul:float(invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, ldc:float(1.0f)), ldc:float(5.0f))), ldc:double(16.0)))), sub:double(ldc:double(1.0), div:double(f2d:double(mul:float(invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u76bc\ua3b4\ubf56\ub83f\u6ec6\u759a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, ldc:float(1.0f)), ldc:float(5.0f))), ldc:double(16.0))))), ldc:double(11.0))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3a62\u74b1\u7d52\u9937\u6198\u965f(boolean p0, boolean p1) {
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
            invokevirtual:void(\u34df\ua068\u72f1\u527a\u0b8e::\u0b8e\u12cb\uc29a\u6ec6\u71f1\u494c, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd]), p0:boolean, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc4d2\u1187\u3504\u67d0\ub113\ua6bd() {
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
            
            if (invokeinterface:boolean(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u12cb\u946b\ubb2b\u7bad\u6bb9\u8c8a, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                putfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u12b2\u946b\ufcaf\u61a4\u8cae\u9af2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, ldc:float(1.0f))
                
                if (invokeinterface:boolean(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uc229\u6bb9\u3a62\ub6ab\ud7e8\u97b7, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                    putfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u385b\u4ab3\u960f\ud158\u4f52\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, ldc:float(1.0f))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            invokevirtual:void(\u34df\ua068\u72f1\u527a\u0b8e::close, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 \u3e2a\u4f4a\u16f6\ub7dc\u8df4\u51fa(int p0, int p1) {
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
            return:\u718f\u6435\uc31c\u4ab3\u98a4(invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:int, p1:int, getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068), and:int[expected:boolean](ldc:int(-11130), ldc:int(11080))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u12cb\u873d\u6d99\u3e2a\uf995\u8389(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.function.Predicate<? super \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p2) {
        var_4_112 : int
        var_6_74 : ArrayList
        var_7_85 : int
        var_8_96 : int
        var_9_A7 : int
        var_10_B8 : int
        var_11_BE : \u34df\ua068\u72f1\u527a\u0b8e
        var_12_C2 : int
        var_13_101 : int
        var_14_151 : \ud523\u92ff\ubb2b\u759a\ud36e
        
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
            var_4_112 = and:int(ldc:int(1492047293), ldc:int(-1464870241))
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\ud51e\u8413\u51b2\u72f1\uc84e\u6198, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), ldc:String("getEntities"))
            var_6_74 = invokestatic:ArrayList(Lists::newArrayList)
            var_7_85 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_8_96 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_9_A7 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_10_B8 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_11_BE = invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])
            var_12_C2 = var_7_85:int
            
            loop {
                if (cmpeq:boolean(and:int(var_4_112:int, ldc:int(524288)), ldc:int(0))) {
                    var_4_112 = and:int(var_4_112:int, ldc:int(-974845060))
                }
                else {
                    var_4_112 = and:int(var_4_112:int, ldc:int(-855646757))
                    
                    if (cmple:boolean(var_12_C2:int, var_8_96:int)) {
                        var_13_101 = var_9_A7:int
                        
                        loop {
                            if (cmpne:boolean(and:int(var_4_112:int, ldc:int(131072)), ldc:int(0))) {
                                var_4_112 = and:int(var_4_112:int, ldc:int(-67135249))
                                
                                if (cmple:boolean(var_13_101:int, var_10_B8:int)) {
                                    var_14_151 = invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u34df\ua068\u72f1\u527a\u0b8e::\uc29a\u4975\u600f\u99f7\uc7fe\u8709, var_11_BE:\u34df\ua068\u72f1\u527a\u0b8e, var_12_C2:int, var_13_101:int, and:int[expected:boolean](ldc:int(-9160), ldc:int(8579)))
                                    
                                    if (cmpne:boolean(var_14_151:\ud523\u92ff\ubb2b\u759a\ud36e, aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e())) {
                                        invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\ub70c\u3a62\ucef1\u965f\u0c95\u36d3, var_14_151:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u7d52\u718f\u3776\u6fb0\ub83f, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7, var_6_74:ArrayList<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:List<\u7d52\u718f\u3776\u6fb0\ub83f>], p2:Predicate<? super \u7d52\u718f\u3776\u6fb0\ub83f>)
                                    }
                                    
                                    var_4_112 = and:int(var_4_112:int, ldc:int(-928340227))
                                    inc:int(var_13_101, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_4_112:int, ldc:int(524288)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_4_112 = and:int(var_4_112:int, ldc:int(832335793))
                        }
                        
                        var_4_112 = and:int(var_4_112:int, ldc:int(1052673675))
                        inc:int(var_12_C2, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_112:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:List<\u7d52\u718f\u3776\u6fb0\ub83f>(var_6_74:ArrayList<\u7d52\u718f\u3776\u6fb0\ub83f>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<T> \u965f\ucef1\u34df\u4daf\u760c\u6d99(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<T> p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.function.Predicate<? super T> p2) {
        var_4_12F : int
        var_6_80 : int
        var_7_91 : int
        var_8_A2 : int
        var_9_B3 : int
        var_10_B8 : ArrayList
        var_11_BC : int
        var_12_FB : int
        var_4_10C : int
        var_13_158 : \ud523\u92ff\ubb2b\u759a\ud36e
        
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
            var_4_12F = and:int(ldc:int(623885227), ldc:int(-235342101))
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\ud51e\u8413\u51b2\u72f1\uc84e\u6198, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), ldc:String("getEntities"))
            var_6_80 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_7_91 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_8_A2 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_9_B3 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_10_B8 = invokestatic:ArrayList(Lists::newArrayList)
            var_11_BC = var_6_80:int
            
            loop {
                if (cmpne:boolean(and:int(var_4_12F:int, ldc:int(512)), ldc:int(0))) {
                    var_4_12F = and:int(var_4_12F:int, ldc:int(-1423401218))
                    
                    if (cmplt:boolean(var_11_BC:int, var_7_91:int)) {
                        var_12_FB = var_8_A2:int
                        
                        loop {
                            if (cmpne:boolean(and:int(var_4_12F:int, ldc:int(33554432)), ldc:int(0))) {
                                var_4_10C = and:int(var_4_12F:int, ldc:int(-1758614157))
                            }
                            else {
                                var_4_10C = and:int(var_4_12F:int, ldc:int(-1484939270))
                                
                                if (cmplt:boolean(var_12_FB:int, var_9_B3:int)) {
                                    var_13_158 = invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u34df\ua068\u72f1\u527a\u0b8e::\uc29a\u4975\u600f\u99f7\uc7fe\u8709, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd]), var_11_BC:int, var_12_FB:int, and:int[expected:boolean](ldc:int(-11498), ldc:int(3169)))
                                    
                                    if (cmpne:boolean(var_13_158:\ud523\u92ff\ubb2b\u759a\ud36e, aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e())) {
                                        invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\uc87f\ubb2b\u4c2b\u34df\u1187, var_13_158:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u9255\u0c95\u4cd9\ube23\u760c<T>, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7, var_10_B8:ArrayList<? super \u7d52\u718f\u3776\u6fb0\ub83f>[expected:List<? super \u7d52\u718f\u3776\u6fb0\ub83f>], p2:Predicate<? super \u7d52\u718f\u3776\u6fb0\ub83f>)
                                    }
                                    
                                    var_4_12F = and:int(var_4_10C:int, ldc:int(-1913088071))
                                    inc:int(var_12_FB, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_4_10C:int, ldc:int(4096)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_4_12F = and:int(var_4_10C:int, ldc:int(-1444069003))
                        }
                        
                        var_4_12F = and:int(var_4_10C:int, ldc:int(-167904593))
                        inc:int(var_11_BC, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_12F:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_12F = and:int(var_4_12F:int, ldc:int(1297754242))
            }
            
            return:List<T>(var_10_B8:ArrayList<? super \u7d52\u718f\u3776\u6fb0\ub83f>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<T> \u965f\ucef1\u34df\u4daf\u760c\u6d99(java.lang.Class<? extends T> p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.function.Predicate<? super T> p2) {
        var_4_63 : int
        var_6_80 : int
        var_7_91 : int
        var_8_A2 : int
        var_9_B3 : int
        var_10_B8 : ArrayList
        var_11_BE : \u34df\ua068\u72f1\u527a\u0b8e
        var_12_C2 : int
        var_4_11D : int
        var_13_10C : int
        var_14_15C : \ud523\u92ff\ubb2b\u759a\ud36e
        
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
            var_4_63 = and:int(ldc:int(-1297979595), ldc:int(-1326722233))
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\ud51e\u8413\u51b2\u72f1\uc84e\u6198, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), ldc:String("getEntities"))
            var_6_80 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_7_91 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_8_A2 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_9_B3 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_10_B8 = invokestatic:ArrayList(Lists::newArrayList)
            var_11_BE = invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])
            var_12_C2 = var_6_80:int
            
            loop {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16384)), ldc:int(0))) {
                    var_4_11D = and:int(var_4_63:int, ldc:int(1080281467))
                }
                else {
                    var_4_11D = and:int(var_4_63:int, ldc:int(-1428228303))
                    
                    if (cmplt:boolean(var_12_C2:int, var_7_91:int)) {
                        var_13_10C = var_8_A2:int
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_4_11D:int, ldc:int(8)), ldc:int(0))) {
                                var_4_11D = and:int(var_4_11D:int, ldc:int(-1463094519))
                                
                                if (cmplt:boolean(var_13_10C:int, var_9_B3:int)) {
                                    var_14_15C = invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u34df\ua068\u72f1\u527a\u0b8e::\uc29a\u4975\u600f\u99f7\uc7fe\u8709, var_11_BE:\u34df\ua068\u72f1\u527a\u0b8e, var_12_C2:int, var_13_10C:int, and:int[expected:boolean](ldc:int(9794), ldc:int(-9811)))
                                    
                                    if (cmpne:boolean(var_14_15C:\ud523\u92ff\ubb2b\u759a\ud36e, aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e())) {
                                        invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u516c\u92ff\u927d\u8bb0\u4c2b\u0b8e, var_14_15C:\ud523\u92ff\ubb2b\u759a\ud36e, p0:Class<? extends T>, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7, var_10_B8:ArrayList<T>[expected:List<T>], p2:Predicate<? super T>)
                                    }
                                    
                                    var_4_11D = and:int(var_4_11D:int, ldc:int(-352402531))
                                    inc:int(var_13_10C, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_11D:int, ldc:int(8)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_4_11D = and:int(var_4_11D:int, ldc:int(-914772346))
                        }
                        
                        var_4_63 = and:int(var_4_11D:int, ldc:int(-1330481277))
                        inc:int(var_12_C2, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_11D:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_63 = and:int(var_4_11D:int, ldc:int(363670085))
            }
            
            return:List<T>(var_10_B8:ArrayList<T>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<T> \ub7dc\ua6bd\ud523\ud158\u5140\u5f50(java.lang.Class<? extends T> p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.function.Predicate<? super T> p2) {
        var_4_12A : int
        var_6_80 : int
        var_7_91 : int
        var_8_A2 : int
        var_9_B3 : int
        var_10_B8 : ArrayList
        var_11_BE : \u34df\ua068\u72f1\u527a\u0b8e
        var_12_C2 : int
        var_13_F6 : int
        var_4_107 : int
        var_14_14A : \ud523\u92ff\ubb2b\u759a\ud36e
        
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
            var_4_12A = and:int(ldc:int(1184924064), ldc:int(668950825))
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\ud51e\u8413\u51b2\u72f1\uc84e\u6198, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), ldc:String("getLoadedEntities"))
            var_6_80 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_7_91 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_8_A2 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_9_B3 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_10_B8 = invokestatic:ArrayList(Lists::newArrayList)
            var_11_BE = invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])
            var_12_C2 = var_6_80:int
            
            loop {
                if (cmpeq:boolean(and:int(var_4_12A:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_12A = and:int(var_4_12A:int, ldc:int(250332980))
                    
                    if (cmplt:boolean(var_12_C2:int, var_7_91:int)) {
                        var_13_F6 = var_8_A2:int
                        
                        loop {
                            if (cmpne:boolean(and:int(var_4_12A:int, ldc:int(2)), ldc:int(0))) {
                                var_4_107 = and:int(var_4_12A:int, ldc:int(101129871))
                            }
                            else {
                                var_4_107 = and:int(var_4_12A:int, ldc:int(1451706862))
                                
                                if (cmplt:boolean(var_13_F6:int, var_9_B3:int)) {
                                    var_14_14A = invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u34df\ua068\u72f1\u527a\u0b8e::\ubded\ud158\u16f6\u5fe1\u4f4a\ub171, var_11_BE:\u34df\ua068\u72f1\u527a\u0b8e, var_12_C2:int, var_13_F6:int)
                                    
                                    if (cmpne:boolean(var_14_14A:\ud523\u92ff\ubb2b\u759a\ud36e, aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e())) {
                                        invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u516c\u92ff\u927d\u8bb0\u4c2b\u0b8e, var_14_14A:\ud523\u92ff\ubb2b\u759a\ud36e, p0:Class<? extends T>, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7, var_10_B8:ArrayList<T>[expected:List<T>], p2:Predicate<? super T>)
                                    }
                                    
                                    var_4_12A = and:int(var_4_107:int, ldc:int(1063536954))
                                    inc:int(var_13_F6, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_4_107:int, ldc:int(32)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_4_12A = and:int(var_4_107:int, ldc:int(-1937171113))
                        }
                        
                        var_4_12A = and:int(var_4_107:int, ldc:int(517253923))
                        inc:int(var_12_C2, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_12A:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:List<T>(var_10_B8:ArrayList<T>)
        }
        
        goto(Label_0006)
    }
    
    public abstract \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \u5f50\uc910\u5140\u7330\u8709\uc2bd(int p0);
    
    public void \uf995\u5140\u7bad\uc29a\ub8be\u836c(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p1) {
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
            
            if (invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u64ab\u6b5f\u7873\ubefe\u392e\u51b2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u74b1\uf94d\u8640\u5bc4\ufcaf\u8350, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6() {
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
            return:int(ldc:int(63))
        }
        
        goto(Label_0006)
    }
    
    public int \u52d3\u7006\u8709\u5140\u7330\u9937(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_289 : int
        var_4_7B : int
        stack_2CD_0 : int [generated]
        
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
        var_2_289 = and:int(ldc:int(1559727844), ldc:int(-34628617))
        var_4_7B = invokestatic:int(Math::max, and:int(ldc:int(27120), ldc:int(-27121)), invokevirtual:int(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u52d3\u7006\u8709\u5140\u7330\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f)))
        
        if (cmplt:boolean(var_4_7B:int, ldc:int(15))) {
            loop {
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0577)
                }
                
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_289 = and:int(var_2_289:int, ldc:int(-1779808715))
                    goto(Label_0470)
                }
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0390)
                }
                
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0310)
                }
                
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(67108864)), ldc:int(0))) {
                    var_2_289 = and:int(var_2_289:int, ldc:int(1554437874))
                    var_4_7B = invokestatic:int(Math::max, var_4_7B:int, invokevirtual:int(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u52d3\u7006\u8709\u5140\u7330\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d)))
                    
                    if (cmpge:boolean(var_4_7B:int, ldc:int(15))) {
                        return:int(var_4_7B:int)
                    }
                }
                
                Label_0212:
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0577)
                }
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(128)), ldc:int(0))) {
                    var_2_289 = and:int(var_2_289:int, ldc:int(-1636625400))
                    goto(Label_0470)
                }
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_289 = and:int(var_2_289:int, ldc:int(847305698))
                    goto(Label_0390)
                }
                
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(8)), ldc:int(0))) {
                    var_2_289 = and:int(var_2_289:int, ldc:int(1204809618))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_289:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_289 = and:int(var_2_289:int, ldc:int(2092358308))
                    var_4_7B = invokestatic:int(Math::max, var_4_7B:int, invokevirtual:int(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u52d3\u7006\u8709\u5140\u7330\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u6ec6\u5654\u927d\u3711\u92ee\u97b7, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)))
                    
                    if (cmpge:boolean(var_4_7B:int, ldc:int(15))) {
                        return:int(var_4_7B:int)
                    }
                }
                
                Label_0310:
                
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0577)
                }
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0470)
                }
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_289 = and:int(var_2_289:int, ldc:int(-456325127))
                        goto(Label_0212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_289 = and:int(var_2_289:int, ldc:int(1592229564))
                    var_4_7B = invokestatic:int(Math::max, var_4_7B:int, invokevirtual:int(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u52d3\u7006\u8709\u5140\u7330\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc246\u76bc\u4daf\uf9c5\uc246\u416d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)))
                    
                    if (cmpge:boolean(var_4_7B:int, ldc:int(15))) {
                        return:int(var_4_7B:int)
                    }
                }
                
                Label_0390:
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0577)
                }
                
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_289:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0310)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_289 = and:int(var_2_289:int, ldc:int(-198316123))
                        goto(Label_0212)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_289:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_289 = and:int(var_2_289:int, ldc:int(2142918317))
                    var_4_7B = invokestatic:int(Math::max, var_4_7B:int, invokevirtual:int(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u52d3\u7006\u8709\u5140\u7330\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u8df4\ub6ab\u8640\u5bc4\u62da\u416d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)))
                    
                    if (cmpge:boolean(var_4_7B:int, ldc:int(15))) {
                        return:int(var_4_7B:int)
                    }
                }
                
                Label_0470:
                
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_289 = and:int(var_2_289:int, ldc:int(1944451771))
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_289 = and:int(var_2_289:int, ldc:int(893503932))
                        goto(Label_0310)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_289 = and:int(var_2_289:int, ldc:int(1687088830))
                        goto(Label_0212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(128)), ldc:int(0))) {
                        var_2_289 = and:int(var_2_289:int, ldc:int(-327546692))
                        loopcontinue()
                    }
                    
                    var_2_289 = and:int(var_2_289:int, ldc:int(2096580328))
                    var_4_7B = invokestatic:int(Math::max, var_4_7B:int, invokevirtual:int(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u52d3\u7006\u8709\u5140\u7330\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u7bad\u72f1\u7873\u5fe1\ua068, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)))
                    
                    if (cmpge:boolean(var_4_7B:int, ldc:int(15))) {
                        stack_2CD_0 = var_4_7B:int
                        looporswitchbreak()
                    }
                }
                
                Label_0577:
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0470)
                }
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(128)), ldc:int(0))) {
                    var_2_289 = and:int(var_2_289:int, ldc:int(700359506))
                    goto(Label_0390)
                }
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_289 = and:int(var_2_289:int, ldc:int(-203358103))
                    goto(Label_0310)
                }
                
                if (cmpeq:boolean(and:int(var_2_289:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0212)
                }
                
                if (cmpne:boolean(and:int(var_2_289:int, ldc:int(512)), ldc:int(0))) {
                    var_2_289 = and:int(var_2_289:int, ldc:int(2147108520))
                    stack_2CD_0 = var_4_7B:int
                    looporswitchbreak()
                }
                
                var_2_289 = and:int(var_2_289:int, ldc:int(998762756))
            }
            
            return:int(stack_2CD_0:int)
        }
        
        return:int(var_4_7B:int)
    }
    
    public boolean \u64f2\u8cae\u7873\u8389\u12b2\u56bd(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1) {
        var_3_61 : int
        stack_8C_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(2021738389), ldc:int(1989230277))
            
            if (cmple:boolean(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u760c\u4975\u4179\uc246\u8640\u64f2), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(2141966038))
                stack_8C_0 = and:int(ldc:int(-17832), ldc:int(1447))
            }
            else {
                stack_8C_0 = and:int(ldc:int(8453), ldc:int(1657))
            }
            
            return:boolean(stack_8C_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int \u6198\u6cfe\uff55\u8258\uceb8\uafe7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1) {
        var_3_61 : int
        var_5_67 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_6_71 : int
        stack_9C_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(1888206793), ldc:int(-345153427))
            var_5_67 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            var_6_71 = invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u385b\u946b\u61a4\u6ec6\ud7e8\u7e3f, var_5_67:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u760c\u4975\u4179\uc246\u8640\u64f2)
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u071d\u40a9\u71f1\u385b\u385b\u2dcc, var_5_67:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1931213417))
                stack_9C_0 = var_6_71:int
            }
            else {
                stack_9C_0 = invokestatic:int(Math::max, var_6_71:int, invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u52d3\u7006\u8709\u5140\u7330\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            }
            
            return:int(stack_9C_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u983f\u760c\ufe34\uc246\u965f\u1833(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_26B : int
        stack_2D2_0 : int [generated]
        
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
        var_2_26B = and:int(ldc:int(588735875), ldc:int(177451415))
        
        if (cmple:boolean(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f)), ldc:int(0))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(1723846796))
                    goto(Label_0556)
                }
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0469)
                }
                
                if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(8)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-2029736981))
                    goto(Label_0382)
                }
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(2)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-170094747))
                    goto(Label_0295)
                }
                
                if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(1758337993))
                }
                else {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-220584509))
                    
                    if (cmpgt:boolean(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d)), ldc:int(0))) {
                        return:boolean(and:int[expected:boolean](ldc:int(193), ldc:int(5)))
                    }
                }
                
                Label_0208:
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(989513265))
                    goto(Label_0556)
                }
                
                if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(1327235825))
                    goto(Label_0469)
                }
                
                if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0382)
                }
                
                if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(8)), ldc:int(0))) {
                        var_2_26B = and:int(var_2_26B:int, ldc:int(-993376166))
                        loopcontinue()
                    }
                    
                    var_2_26B = and:int(var_2_26B:int, ldc:int(986901203))
                    
                    if (cmpgt:boolean(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u6ec6\u5654\u927d\u3711\u92ee\u97b7, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), ldc:int(0))) {
                        return:boolean(xor:int[expected:boolean](ldc:int(2496), ldc:int(2497)))
                    }
                }
                
                Label_0295:
                
                if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-1376181212))
                    goto(Label_0556)
                }
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0469)
                }
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(2)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(1255967048))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(128)), ldc:int(0))) {
                        var_2_26B = and:int(var_2_26B:int, ldc:int(-184699658))
                        goto(Label_0208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-1562791797))
                    
                    if (cmpgt:boolean(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc246\u76bc\u4daf\uf9c5\uc246\u416d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(0))) {
                        return:boolean(xor:int[expected:boolean](ldc:int(544), ldc:int(545)))
                    }
                }
                
                Label_0382:
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(128)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-59978039))
                    goto(Label_0556)
                }
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_26B = and:int(var_2_26B:int, ldc:int(885383853))
                        goto(Label_0295)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_26B = and:int(var_2_26B:int, ldc:int(-770249113))
                        goto(Label_0208)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-67313497))
                    
                    if (cmpgt:boolean(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u8df4\ub6ab\u8640\u5bc4\u62da\u416d, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), ldc:int(0))) {
                        return:boolean(and:int[expected:boolean](ldc:int(393), ldc:int(2081)))
                    }
                }
                
                Label_0469:
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(2048)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_26B = and:int(var_2_26B:int, ldc:int(-1588100413))
                        goto(Label_0382)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(8)), ldc:int(0))) {
                        var_2_26B = and:int(var_2_26B:int, ldc:int(-111898293))
                        goto(Label_0295)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(32768)), ldc:int(0))) {
                        var_2_26B = and:int(var_2_26B:int, ldc:int(-1010243051))
                        goto(Label_0208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-1088522105))
                    
                    if (cmpgt:boolean(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u7bad\u72f1\u7873\u5fe1\ua068, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(0))) {
                        stack_2D2_0 = and:int(ldc:int(8239), ldc:int(16513))
                        looporswitchbreak()
                    }
                }
                
                Label_0556:
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-1040950025))
                    goto(Label_0469)
                }
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(128)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-477629935))
                    goto(Label_0382)
                }
                
                if (cmpeq:boolean(and:int(var_2_26B:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0295)
                }
                
                if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_2_26B:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_26B = and:int(var_2_26B:int, ldc:int(-1568970509))
                    stack_2D2_0 = and:int(ldc:int(5169), ldc:int(-5554))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_2D2_0:int)
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(1097), ldc:int(1096)))
    }
    
    public int \u3d64\u4f4a\u3c25\uf995\u64f2\uae5d(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        var_4_69 : int
        var_5_6E : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_6_73 : int
        var_7_7C : int
        var_8_9D : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_9_AB : int
        
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
        var_2_61 = and:int(ldc:int(-385554104), ldc:int(1838475977))
        var_4_69 = and:int(ldc:int(19014), ldc:int(-19015))
        var_5_6E = getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u624e\uae87\u3a62\ucb79\u7c6b\u6b5f)
        var_6_73 = arraylength:int(var_5_6E:\u760c\u4975\u4179\uc246\u8640\u64f2[])
        var_7_7C = and:int(ldc:int(-12008), ldc:int(11974))
        
        loop {
            var_2_61 = and:int(var_2_61:int, ldc:int(-608048807))
            
            if (cmpge:boolean(var_7_7C:int, var_6_73:int)) {
                return:int(var_4_69:int)
            }
            
            var_8_9D = loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_5_6E:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_7_7C:int)
            var_9_AB = invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6198\u6cfe\uff55\u8258\uceb8\uafe7, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_8_9D:\u760c\u4975\u4179\uc246\u8640\u64f2), var_8_9D:\u760c\u4975\u4179\uc246\u8640\u64f2)
            
            if (cmpge:boolean(var_9_AB:int, ldc:int(15))) {
                return:int(ldc:int(15))
            }
            
            if (cmpgt:boolean(var_9_AB:int, var_4_69:int)) {
                var_4_69 = var_9_AB:int
            }
            
            inc:int(var_7_7C, ldc:int(1))
        }
    }
    
    public void \u3e2a\u9af2\ub83f\u5d20\uc2e8\u92ee() {
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
    
    public long \u56bd\u8258\u8d98\u120d\uff55\uc229() {
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
            return:long(invokeinterface:long(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u93a2\u0b8e\u40a9\u8640\u93a2\u64ab, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)))
        }
        
        goto(Label_0006)
    }
    
    public long \u960f\u6d99\ub70c\u8753\u4ab3\u6c56() {
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
            return:long(invokeinterface:long(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\ud523\ud523\u64f2\uc229\u071d\ud12e, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u836c\u67d0\u6435\u4bc8\ud217\u12b2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            return:boolean(and:int[expected:boolean](ldc:int(1281), ldc:int(16995)))
        }
        
        goto(Label_0006)
    }
    
    public void \ua3b4\ub8be\uf995\u8bb0\u64f2\uc246(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, byte p1) {
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
    
    public void \u1187\u3e75\u183a\u7e3f\ub113\u836c(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p1, int p2, int p3) {
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
            invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ucb79\uc2bd\u6c52\ub32d\u9255\ubf56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4492\u92ee\u9255\uc29a\u3e75\u7043 \u3d4b\ud523\uff55\u647c\u4ab3\u7af6() {
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
            return:\u4492\u92ee\u9255\uc29a\u3e75\u7043(getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7e3f\ubff1\u718f\ub171\u72f1 \u8cae\u7330\u9937\ub83f\ube23\u6d69() {
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
            return:\u7e3f\ubff1\u718f\ub171\u72f1(invokeinterface:\u7e3f\ubff1\u718f\ub171\u72f1(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uf94d\u873d\u836c\u9a18\u718f\ud7e8, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)))
        }
        
        goto(Label_0006)
    }
    
    public float \u76bc\ua3b4\ubf56\ub83f\u6ec6\u759a(float p0) {
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
            return:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, p0:float, getfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub19c\u8389\u2dcc\u416d\ua3b4\u6bb9, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), getfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u385b\u4ab3\u960f\ud158\u4f52\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)), invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:float)))
        }
        
        goto(Label_0006)
    }
    
    public void \u3504\u3711\u4cd9\u74b1\u5d20\uf94d(float p0) {
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
            putfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub19c\u8389\u2dcc\u416d\ua3b4\u6bb9, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:float)
            putfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u385b\u4ab3\u960f\ud158\u4f52\u9937, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \ub32d\u8413\u600f\ucfaf\u61a4\ua3b4(float p0) {
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
            return:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, p0:float, getfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), getfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u12b2\u946b\ufcaf\u61a4\u8cae\u9af2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)))
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\ubf56\ubf56\u52d3\uc31c\u3776(float p0) {
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
            putfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:float)
            putfield:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u12b2\u946b\ufcaf\u61a4\u8cae\u9af2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u839e\u8c8a\uc238\ud36e\u4d85\u16f6() {
        var_1_BA : int
        stack_D6_0 : int [generated]
        
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
            var_1_BA = and:int(ldc:int(903321063), ldc:int(902274731))
            
            if (invokevirtual:boolean(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u6bb9\ubf56\u9af2\u927d\u927d\ub19c, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\ufcaf\u67d0\u16f6\u12b2\u67e9\ub19c, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)))) {
                    if (cmple:boolean(f2d:double(invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u76bc\ua3b4\ubf56\ub83f\u6ec6\u759a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, ldc:float(1.0f))), ldc:double(0.9))) {
                        goto(Label_0164)
                    }
                    
                    stack_D6_0 = and:int[expected:boolean](ldc:int(17477), ldc:int(6435))
                    return:boolean(stack_D6_0:boolean)
                }
            }
            
            Label_0108:
            
            if (cmpne:boolean(and:int(var_1_BA:int, ldc:int(2)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(18550), ldc:int(-18551)))
            }
            
            Label_0164:
            
            if (cmpeq:boolean(and:int(var_1_BA:int, ldc:int(268435456)), ldc:int(0))) {
                var_1_BA = and:int(var_1_BA:int, ldc:int(652122788))
                goto(Label_0108)
            }
            
            var_1_BA = and:int(var_1_BA:int, ldc:int(2137502931))
            stack_D6_0 = and:int[expected:boolean](ldc:int(16835), ldc:int(-20932))
            return:boolean(stack_D6_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean \u74b1\u7af6\ua61f\u6c52\u7873\ub7dc() {
        var_1_61 : int
        stack_90_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-60016876), ldc:int(-293806732))
            
            if (cmple:boolean(f2d:double(invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, ldc:float(1.0f))), ldc:double(0.2))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-319087204))
                stack_90_0 = and:int(ldc:int(17024), ldc:int(-17025))
            }
            else {
                stack_90_0 = xor:int(ldc:int(4160), ldc:int(4161))
            }
            
            return:boolean(stack_90_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3bc9\u6ec6\u8709\u6c52\u4ab3\u4179(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        var_2_76 : int
        var_2_F1 : int
        var_4_F7 : \uc2e8\u9255\u647c\ud171\ubf56
        stack_166_0 : int [generated]
        
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
        var_2_61 = and:int(ldc:int(-1913403304), ldc:int(1375451225))
        
        if (logicalnot:boolean(invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u74b1\u7af6\ua61f\u6c52\u7873\ub7dc, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
            return:boolean(and:int[expected:boolean](ldc:int(-6139), ldc:int(6130)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_76 = and:int(var_2_61:int, ldc:int(-739618998))
                goto(Label_0211)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                var_2_76 = and:int(var_2_61:int, ldc:int(988534172))
            }
            else {
                var_2_76 = and:int(var_2_61:int, ldc:int(551808695))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\u8df4\u71f1\u12b2\u9af2\u1833\ub1b9, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-25055), ldc:int(8650)))
                }
            }
            
            Label_0153:
            
            if (cmpeq:boolean(and:int(var_2_76:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_76 = and:int(var_2_76:int, ldc:int(-1631753577))
            }
            else {
                if (cmpne:boolean(and:int(var_2_76:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_76:int, ldc:int(-720071920))
                    loopcontinue()
                }
                
                var_2_76 = and:int(var_2_76:int, ldc:int(-50426565))
                
                if (cmpgt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7ce1\uc9f6\u61a4\u0a06\uff55::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u7ce1\uc9f6\u61a4\u0a06\uff55], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))) {
                    return:boolean(and:int[expected:boolean](ldc:int(17764), ldc:int(-18285)))
                }
            }
            
            Label_0211:
            
            if (cmpne:boolean(and:int(var_2_76:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0153)
            }
            
            if (cmpne:boolean(and:int(var_2_76:int, ldc:int(16)), ldc:int(0))) {
                var_2_F1 = and:int(var_2_76:int, ldc:int(-1242568611))
                var_4_F7 = invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                
                if (logicaland:boolean(cmpeq:boolean(invokevirtual:\ud51e\u927d\u69d9\u8df4\u6cfe(\uc2e8\u9255\u647c\ud171\ubf56::\u99f7\ub113\ua562\u5db4\u760c\u3d4b, var_4_F7:\uc2e8\u9255\u647c\ud171\ubf56), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), cmpge:boolean(invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u183a\u64ab\u983f\ud171\u97b7\u99f7, var_4_F7:\uc2e8\u9255\u647c\ud171\ubf56, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:float(0.15f)))) {
                    stack_166_0 = and:int(ldc:int(775), ldc:int(4161))
                }
                else {
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(568835931))
                    stack_166_0 = and:int(ldc:int(6840), ldc:int(-6843))
                }
                
                return:boolean(stack_166_0:int)
            }
            
            var_2_61 = and:int(var_2_76:int, ldc:int(1843814933))
        }
    }
    
    public boolean \u120d\uc2bd\uc31c\ud7e8\uff55\u7006(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:boolean(invokevirtual:boolean(\uc2e8\u9255\u647c\ud171\ubf56::\u385b\u5654\u6b0d\u3d4b\uafe7\uc2e8, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    public abstract \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7c6b\u839e\u5245\u12cb\u7873\ud171 \u9033\u67d0\ud217\u946b\u51fa\u624e(java.lang.String p0);
    
    public abstract void \u760c\u7e3f\u7bad\u16f6\u56bd\u1833(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7c6b\u839e\u5245\u12cb\u7873\ud171 p0);
    
    public abstract int \u4bc8\u9033\u4f4a\u3c25\u9af2\u7e3f();
    
    public void \u64ab\ub1b9\u12b2\ub6ab\u718f\u51b2(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2) {
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
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u446c\u67d0\ua562\u97b7\u6c56\u59ec \u3504\u8413\u5fe1\ub8be\u0b8e\u3e2a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e p0) {
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
    
    public abstract void \u392e\u8d98\u156b\ufe34\u51b2\u8640(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2);
    
    public void \u3e75\uc84e\u62da\u64f2\ubefe\u1833(double p0, double p1, double p2, double p3, double p4, double p5, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p6) {
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
    
    public abstract \u392e\ud7e8\u3bc9\u88c5\ud51e.\u7c6b\ud36e\u8d90\u0800\ua6bd \u8df4\ub113\u9937\u4cd9\u4c04\u6d69();
    
    public void \ufe34\u718f\u74b1\u3d4b\u9af2\u927d(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p1) {
        var_3_61 : int
        var_5_68 : Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>
        var_3_E9 : int
        var_6_B1 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_7_B9 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_8_D7 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_7_11B : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_8_123 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_3_61 = and:int(ldc:int(-1005524130), ldc:int(-195911010))
            var_5_68 = invokevirtual:Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>(\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d::iterator, getstatic:\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d(\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d::\u97e6\u3d4b\u3e75\u5654\u9a18\u4ab3))
            
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_E9 = and:int(var_3_61:int, ldc:int(1659915608))
                }
                else {
                    var_3_E9 = and:int(var_3_61:int, ldc:int(-434591978))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_68:Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>)) {
                        var_6_B1 = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokeinterface:\u760c\u4975\u4179\uc246\u8640\u64f2(Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>::next, var_5_68:Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>))
                        var_7_B9 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_6_B1:\u760c\u4975\u4179\uc246\u8640\u64f2)
                        
                        if (invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u64ab\u6b5f\u7873\ubefe\u392e\u51b2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_7_B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                            var_8_D7 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, var_7_B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            
                            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_8_D7:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ub171\ub113\u120d\u6b5f\u8709\ud51e)))) {
                                var_3_E9 = and:int(var_3_E9:int, ldc:int(-595855117))
                                
                                if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u071d\u40a9\u71f1\u385b\u385b\u2dcc, var_8_D7:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_7_B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                                    var_7_11B = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_7_B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_6_B1:\u760c\u4975\u4179\uc246\u8640\u64f2)
                                    var_8_123 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, var_7_11B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                    
                                    if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_8_123:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ub171\ub113\u120d\u6b5f\u8709\ud51e))) {
                                        invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u62da\u97b7\u759a\u4d85\u4f4a\uc87f, var_8_123:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, var_7_11B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(-5640), ldc:int(5639)))
                                    }
                                }
                            }
                            else {
                                invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u62da\u97b7\u759a\u4d85\u4f4a\uc87f, var_8_D7:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, var_7_B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(11413), ldc:int(-11454)))
                            }
                        }
                        
                        var_3_61 = and:int(var_3_E9:int, ldc:int(1848289656))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_E9:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_61 = and:int(var_3_E9:int, ldc:int(-1658466836))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u516c\u3d64\u718f\ub171\u6b5f.\u6d99\u6b0d\ubff1\uc246\u946b \u7af6\u8350\u4179\ufe34\ub18d\ucfaf(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_63 : long
        var_6_66 : float
        
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
            var_4_63 = ldc:long(0L)
            var_6_66 = ldc:float(0.0f)
            
            if (invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u64ab\u6b5f\u7873\ubefe\u392e\u51b2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                var_6_66 = invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\uc3e3\ubded\u5d20\u8d98\u64ab\u3d4b, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u8753\u8709\ubff1\ub32d\u4d85])
                var_4_63 = invokevirtual:long(\ud523\u92ff\ubb2b\u759a\ud36e::\uc229\ubb2b\u62da\uc29a\u8753\u9255, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            }
            
            return:\u6d99\u6b0d\ubff1\uc246\u946b(initobject:\u6d99\u6b0d\ubff1\uc246\u946b(\u6d99\u6b0d\ubff1\uc246\u946b::<init>, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd]), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u960f\u6d99\ub70c\u8753\u4ab3\u6c56, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), var_4_63:long, var_6_66:float))
        }
        
        goto(Label_0006)
    }
    
    public int \u8308\ufcaf\u392e\u5db4\u5d20\ud51e() {
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
            return:int(getfield:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u98a4\u72f1\u7006\u3bd6\u59ec\u7e3f, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public void \u5245\ub70c\u3bd6\u4daf\u3bd6\ub7dc(int p0) {
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
    
    public \ub113\ufcaf\u3c25\u071d\u97b7.\u34df\u4492\u71ae\uc238\u7873\uafe7 \u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330() {
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
            return:\u34df\u4492\u71ae\uc238\u7873\uafe7(getfield:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\u3e75\u52d3\ud171\u6d99\u3504, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public void \u7ce1\u9937\u12cb\u3d64\u5bc4\uc84e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0) {
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
            athrow(initobject:UnsupportedOperationException(UnsupportedOperationException::<init>, ldc:String("Can't send packets to server unless you're on the client.")))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87 \uc910\u74b1\u4cd9\u3711\uc29a\u071d() {
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
            return:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(getfield:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6c52\u6435\u6fb0\ucef1\u3c25\uae5d, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> \u7049\u64f2\uc9f6\u92ee\ud158\uc87f() {
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
            return:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u5140\u8cae\u6bb9\u759a\ubcb0\u5bc4, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Random \u76bc\u6c52\u9a18\u4179\u97b7\uafe7() {
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
            return:Random(getfield:Random(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uf94d\uc3e3\ubb2b\u6435\u4f4a\u7043(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, java.util.function.Predicate<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p1) {
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
            return:boolean(invokeinterface:boolean(Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::test, p1:Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    public abstract \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8350\u76bc\u67e9\uff55\u8bb0\u385b \u516c\uafe7\u8df4\u92ff\ub32d\u9937();
    
    public abstract \u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 \u6b5f\u8709\u36d3\ubb2b\ua3b4\ud36e();
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u71f1\u8350\u6cfe\u516c\u12b2\u67e9(int p0, int p1, int p2, int p3) {
        var_7_84 : int
        
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
            putfield:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6bb9\ub18d\u51fa\u51fa\u72f1\uc910, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, add:int(mul:int(getfield:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6bb9\ub18d\u51fa\u51fa\u72f1\uc910, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), and:int(ldc:int(5155), ldc:int(16667))), ldc:int(1013904223)))
            var_7_84 = shr:int(getfield:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u6bb9\ub18d\u51fa\u51fa\u72f1\uc910, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), xor:int(ldc:int(-16383), ldc:int(-16381)))
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, add:int(p0:int, and:int(var_7_84:int, ldc:int(15))), add:int(p1:int, and:int(shr:int(var_7_84:int, ldc:int(16)), p3:int)), add:int(p2:int, and:int(shr:int(var_7_84:int, ldc:int(8)), ldc:int(15)))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ucb79\ub83f\ubded\u97b7\u3d64\ub8be() {
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
            return:boolean(and:int[expected:boolean](ldc:int(9764), ldc:int(-9765)))
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d \u8d90\uae5d\u7049\u61a4\uceb8\u8df4() {
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
            return:\ubf56\u64f2\u392e\u98a4\u120d(checkcast:\ubf56\u64f2\u392e\u98a4\u120d(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d.class, invokeinterface:\ubf56\u64f2\u392e\u98a4\u120d(Supplier<\ubf56\u64f2\u392e\u98a4\u120d>::get, getfield:Supplier<\ubf56\u64f2\u392e\u98a4\u120d>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4bc8\u40a9\u6b0d\u6cfe\u7330\ub6ab, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.function.Supplier<\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d> \u1833\u4c2b\uc910\u3e75\u8413\ufcaf() {
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
            return:Supplier<\ubf56\u64f2\u392e\u98a4\u120d>(getfield:Supplier<\ubf56\u64f2\u392e\u98a4\u120d>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4bc8\u40a9\u6b0d\u6cfe\u7330\ub6ab, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public \u3d64\u7af6\uae87\uc238\u7d52.\u8c8a\u51b2\u516c\ub70c\u624e \uc238\u8350\u120d\uc7fe\u965f\u8c8a() {
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
            return:\u8c8a\u51b2\u516c\ub70c\u624e(getfield:\u8c8a\u51b2\u516c\ub70c\u624e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u1187\u5fe1\u7c6b\ub6ab\u7af6\u3c25, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public final boolean \u5bc4\u6b5f\ua6bd\u52d3\u36d3\u392e() {
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
            return:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u3711\u071d\u92ee\ub113\u3776, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 \ub113\u12b2\u3711\uc7fe\u1187\u5f50(int p0, int p1) {
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
            return:\u8aa5\ubded\ub18d\u4f4a\u4f52(invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e[expected:\u8aa5\ubded\ub18d\u4f4a\u4f52](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\u7c6b\u4ab3\uf94d\u4f4a\ud12e\u8753$4() {
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
            return:String(invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\uc238\u9af2\ub113\ud12e\u76bc\u0b8e$3() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokeinterface:int(List<E>::size, invokevirtual:List<? extends \ua3b4\u8aa5\ub113\ubf56\u873d>(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e]))), ldc:String(" total; ")), invokevirtual:List<? extends \ua3b4\u8aa5\ub113\ubf56\u873d>[expected:Object](\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e]))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\ub70c\ubff1\uc2bd\u0c95\ub102\ub6ab$2(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p0) {
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
            return:String(invokestatic:String(String::valueOf, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\uc229\u8413\ufcaf\u99f7\u494c<T>::\uc238\u0c95\u183a\uc29a\ub171\ud7e8, invokevirtual:\uc229\u8413\ufcaf\u99f7\u494c<?>(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u392e\u4179\u759a\u76bc\u8bb0\u36d3, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Object lambda$\uc84e\uc84e\uc910\u4179\u7d52\u3d64$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p0) {
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
            return:Object(invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc229\u8413\ufcaf\u99f7\u494c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc229\u8413\ufcaf\u99f7\u494c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7043\u6c52\u6d99\u4492\ud36e\u0a06), invokevirtual:\uc229\u8413\ufcaf\u99f7\u494c<?>(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u392e\u4179\u759a\u76bc\u8bb0\u36d3, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u5bc4\u416d\uc238\u5f50\ub70c\ubff1$0(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0) {
        var_1_61 : int
        stack_A2_0 : String [generated]
        expr_72 : Object[] [generated]
        stack_AB_0 : String [generated]
        
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
        var_1_61 = and:int(ldc:int(-79473384), ldc:int(-1318062467))
        
        try {
            var_1_61 = and:int(var_1_61:int, ldc:int(-1217552785))
            stack_A2_0 = ldc:String("ID #%s (%s // %s)")
            expr_72 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(16647), ldc:int(5251)))
            storeelement:Object(expr_72:Object[], and:int(ldc:int(3260), ldc:int(-3261)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a))
            storeelement:Object(expr_72:Object[], xor:int(ldc:int(384), ldc:int(385)), invokevirtual:String[expected:Object](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\uf9c5\ucfaf\u516c\u527a\ub7dc\ubff1, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a))
            storeelement:Object(expr_72:Object[], and:int(ldc:int(22562), ldc:int(8462)), invokevirtual:String[expected:Object](Class<T>::getCanonicalName, invokevirtual:Class<? extends \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::getClass, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)))
            stack_AB_0 = invokestatic:String(String::format, stack_A2_0:String, expr_72:Object[])
            var_1_61 = and:int(var_1_61:int, ldc:int(-1242980772))
            return:String(stack_AB_0:String)
        }
        catch (java.lang.Throwable var_3_B0) {
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("ID #")), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a))))
        }
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
            putstatic:Logger(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u5fe1\u5d20\uc246\u8258\u873d\uf995, invokestatic:Logger(LogManager::getLogger))
            putstatic:Codec<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\u3e75\u36d3\u3bc9\u92ff\u51b2, invokeinterface:Codec(Codec::xmap, getstatic:Codec<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\uafe7\u527a\u6d69\u4e72\u5db4\ub70c), invokestatic:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>::\u5654\u759a\u836c\uc4d2\u3d64\uc238, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u47c2\uc229\u759a\u2dcc\u2dcc\u34df)), invokedynamic:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(apply:()Ljava/util/function/Function;)))
            putstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u071d\u5140\u600f\u4975\ufcaf\u624e, invokestatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u8c8a\u0800\uceb8\u647c\ud4fe\u6c56, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u47c2\uc229\u759a\u2dcc\u2dcc\u34df), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("overworld"))))
            putstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubded\ub18d\u76bc\u8d98\u69d9\ucb79, invokestatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u8c8a\u0800\uceb8\u647c\ud4fe\u6c56, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u47c2\uc229\u759a\u2dcc\u2dcc\u34df), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("the_nether"))))
            putstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4d85\u120d\u5654\u9033\u446c\u4c2b, invokestatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u8c8a\u0800\uceb8\u647c\ud4fe\u6c56, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u47c2\uc229\u759a\u2dcc\u2dcc\u34df), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("the_end"))))
            putstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u624e\uae87\u3a62\ucb79\u7c6b\u6b5f, invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::values))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3a62\ucef1\u718f\ub70c\u71ae\u6bb9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_698 : int
        
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
        var_3_68D = and:int(ldc:int(1863960887), ldc:int(-407260625))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-77797757))
            var_5_81 = and:int(ldc:int(25666), ldc:int(-25796))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11802), ldc:int(11785)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68D:int, ldc:int(2006885343))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(2112), ldc:int(2113)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(263), ldc:int(262)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_DA:int, ldc:int(-476412860))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(6402), ldc:int(6403)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2078948253))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1036545542))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-481901558))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(873714078))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1943657826))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1074151306))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(609232321))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-56427572))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1765346331))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-4221546))
                            var_11_EB = and:int(ldc:int(-15616), ldc:int(10411))
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1724763674))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1661648684))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-987213389))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1133594215))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1798889003))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1801997917))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-780429976))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1197400199))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1838885842))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1675535549))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(909847219))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(76097950))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(765477894))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(892428720))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-333997349))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1079762406))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2069548004))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(9449), ldc:int(20741))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(287456569))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(449534576))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-276917742))
                        var_11_EB = and:int(ldc:int(22072), ldc:int(-30585))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1944155206))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-276975196))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(305625596))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1009740431))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(927790779))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1755524171))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2140907464))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-422853525))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(145037364))
                            goto(Label_1119)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(576936971))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(495859317))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1347421522))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-14707657))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1544)
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-196354181))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1785800119))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1905579729))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1185089201))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(-404888022))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-481630826))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-495274828))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(118949040))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-883763833))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2136990627))
                        var_17_698 = add:int(var_16_119:int, and:int(ldc:int(8717), ldc:int(17553)))
                        looporswitchbreak()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(1386705314))
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(-281108590))
                
                if (cmple:boolean(var_5_81 = var_17_698:int, sub:int(var_6_88:int, and:int(ldc:int(16417), ldc:int(1173))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(1484942154))
            goto(Label_0108)
        }
    }
}
