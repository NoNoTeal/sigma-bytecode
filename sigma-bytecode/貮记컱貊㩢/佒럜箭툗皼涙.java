public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 {
    public void \u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
            invokespecial:Object(Object::<init>, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99)
            putfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97e6\u4d85\u4975\u5140\uae87\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, invokestatic:HashMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>](Maps::newHashMap))
            putfield:Set<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\ub7dc\u5245\u72f1\ufe34\u983f\u983f, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, invokestatic:HashSet[expected:Set<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>](Sets::newHashSet))
            putfield:Map<String, Integer>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u446c\uc910\ubb2b\u34df\ubf56\uc2bd, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, invokestatic:HashMap[expected:Map<String, Integer>](Maps::newHashMap))
            putfield:\u6c52\u52d3\u516c\uae87\uae5d(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u7af6\u8bb0\uc229\ube23\u156b\ua6bd, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u6c52\u52d3\u516c\uae87\uae5d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
    
    private void \u4c04\u759a\u071d\uf995\u4975\ube23(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_4_78 : \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a
        
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
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u34df\u5db4\ud36e\u62da\ufcaf\ubefe)) {
                p0 = invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ucef1\u4492\u4c2b\u72f1\u8640\ubefe::\u7af6\uafe7\u8389\u99f7\u59ec\ufe34, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            }
            
            var_4_78 = checkcast:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a.class, invokeinterface:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>::get, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97e6\u4d85\u4975\u5140\uae87\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))
            
            if (cmpeq:boolean(var_4_78:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, aconstnull:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a())) {
                var_4_78 = initobject:\u76bc\uc910\u3dd3\uae5d\uc910\ub113[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a](\u76bc\uc910\u3dd3\uae5d\uc910\ub113::<init>, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u51fa\u4f52\ub171\u8d90\u0b8e\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_78:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            }
            
            if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c))) {
                invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u5f50\u0800\u6b5f\u4cd9\u0c95\u6cfe, var_4_78:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            }
            else {
                invokestatic:void(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u6ec6\ucb79\uc229\u8cae\ud523\u8640, var_4_78:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            }
            
            putfield:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u8bb0\u7043\u3c25\uc229\ub19c\u8389, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, var_4_78:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u392e\u3e2a\ub8be\u8df4\u34df\u36d3, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u51fa\u4f52\ub171\u8d90\u0b8e\uc910(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a p1) {
        var_3_5F : int
        var_5_75 : \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a
        
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
            var_3_5F = and:int(ldc:int(-1002631267), ldc:int(1048387517))
            p1 = invokespecial:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\ua61f\u7043\u92ee\u7c6b\u983f\u7c6b, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            var_5_75 = checkcast:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a.class, invokeinterface:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97e6\u4d85\u4975\u5140\uae87\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a))
            
            if (cmpne:boolean(var_5_75:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, p1:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)) {
                if (cmpne:boolean(var_5_75:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, aconstnull:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a())) {
                    if (cmpne:boolean(var_5_75:\u5140\u4ab3\u183a\ud523\u071d\u983f, invokestatic:\u5140\u4ab3\u183a\ud523\u071d\u983f(\u8350\ub32d\ud171\u4975\u4cd9\u6cfe::\u392e\u7049\uc31c\u3e75\u3bd6\u927d))) {
                        invokeinterface:boolean(Set<E>::remove, getfield:Set<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\ub7dc\u5245\u72f1\ufe34\u983f\u983f, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), var_5_75:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:Object])
                        invokespecial:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u52d3\u6d99\ud158\ubded\u120d\u5245, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_5_75:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
                    }
                }
                
                var_3_5F = and:int(var_3_5F:int, ldc:int(-167034979))
                
                if (instanceof:boolean(\ub113\ufcaf\u3c25\u071d\u97b7.\uc29a\u494c\uc2e8\uc31c\ufe34\u718f.class, p1:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)) {
                    invokeinterface:boolean(Set<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>::add, getfield:Set<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\ub7dc\u5245\u72f1\ufe34\u983f\u983f, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), checkcast:\uc29a\u494c\uc2e8\uc31c\ufe34\u718f(\ub113\ufcaf\u3c25\u071d\u97b7.\uc29a\u494c\uc2e8\uc31c\ufe34\u718f.class, p1:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a[expected:\uc29a\u494c\uc2e8\uc31c\ufe34\u718f]))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u52d3\u6d99\ud158\ubded\u120d\u5245(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a p1) {
        var_3_102 : int
        var_5_14E : Exception
        
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
            var_3_102 = and:int(ldc:int(-963597078), ldc:int(1339870296))
            
            loop {
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(-1537591507))
                    goto(Label_0363)
                }
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(-1872038367))
                    goto(Label_0286)
                }
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(-1677299449))
                    goto(Label_0225)
                }
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(1189079019))
                    
                    if (cmpeq:boolean(p1:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, invokestatic:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a](\u8350\ub32d\ud171\u4975\u4cd9\u6cfe::\u392e\u7049\uc31c\u3e75\u3bd6\u927d))) {
                        goto(Label_0363)
                    }
                }
                
                Label_0160:
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(-316073855))
                    goto(Label_0363)
                }
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(16)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(686778870))
                    goto(Label_0286)
                }
                
                if (cmpeq:boolean(and:int(var_3_102:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(-1182402573))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_102:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_102 = and:int(var_3_102:int, ldc:int(-205452397))
                        loopcontinue()
                    }
                    
                    var_3_102 = and:int(var_3_102:int, ldc:int(416452218))
                }
                
                try {
                    Label_0225:
                    
                    while (cmpeq:boolean(and:int(var_3_102:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_102:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_102 = and:int(var_3_102:int, ldc:int(1068576305))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_3_102:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Block_18)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_102:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Block_19)
                            }
                            
                            var_3_102 = and:int(var_3_102:int, ldc:int(731241944))
                            invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::close, p1:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
                        }
                        
                        Label_0286:
                        
                        if (cmpne:boolean(and:int(var_3_102:int, ldc:int(268435456)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(and:int(var_3_102:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0308)
                        }
                        
                        var_3_102 = and:int(var_3_102:int, ldc:int(1075563152))
                    }
                    
                    goto(Label_0363)
                    Block_18:
                    var_3_102 = and:int(var_3_102:int, ldc:int(1999043948))
                    goto(Label_0160)
                    Block_19:
                    var_3_102 = and:int(var_3_102:int, ldc:int(-1405743121))
                    loopcontinue()
                    Label_0308:
                    
                    if (cmpne:boolean(and:int(var_3_102:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_102:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_102 = and:int(var_3_102:int, ldc:int(701937242))
                }
                catch (java.lang.Exception var_5_14E) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(1771758710))
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97b7\u392e\uc87f\u516c\u12cb\u6c56), loadelement:String(getstatic:String[](\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u4daf\u9af2\u51fa\u8d98\ud217\u718f), and:int(ldc:int(2000), ldc:int(-6133))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], var_5_14E:Exception[expected:Object])
                }
                
                Label_0363:
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(-1660622435))
                    goto(Label_0286)
                }
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0225)
                }
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_102 = and:int(var_3_102:int, ldc:int(1107831716))
                    goto(Label_0160)
                }
                
                if (cmpne:boolean(and:int(var_3_102:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\uc31c\u8c8a\u0800\u3d64\ua3b4\u0800, p1:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a \ua61f\u7043\u92ee\u7c6b\u983f\u7c6b(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a p1) {
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
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a \u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(checkcast:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a.class, invokeinterface:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>::get, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97e6\u4d85\u4975\u5140\uae87\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u4cd9\u965f\u839e\u5654\u62da\u8753(java.lang.String p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u5140\u4ab3\u183a\ud523\u071d\u983f p1) {
        var_3_61 : int
        var_5_6F : Integer
        var_5_8C : Integer
        stack_E2_0 : String [generated]
        expr_CA : Object[] [generated]
        var_6_E8 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
            var_3_61 = and:int(ldc:int(-526351512), ldc:int(-577566871))
            var_5_6F = checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Map<String, Integer>::get, getfield:Map<String, Integer>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u446c\uc910\ubb2b\u34df\ubf56\uc2bd, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), p0:String[expected:Object]))
            
            if (cmpne:boolean(var_5_6F:Integer, aconstnull:Integer())) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-777168200))
                var_5_8C = invokestatic:Integer(Integer::valueOf, add:int(invokevirtual:int(Integer::intValue, var_5_6F:Integer), xor:int(ldc:int(16522), ldc:int(16523))))
            }
            else {
                var_5_8C = invokestatic:Integer(Integer::valueOf, xor:int(ldc:int(-32382), ldc:int(-32381)))
            }
            
            invokeinterface:Integer(Map<String, Integer>::put, getfield:Map<String, Integer>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u446c\uc910\ubb2b\u34df\ubf56\uc2bd, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), p0:String, var_5_8C:Integer)
            stack_E2_0 = loadelement:String(getstatic:String[](\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u4daf\u9af2\u51fa\u8d98\ud217\u718f), and:int(ldc:int(230), ldc:int(1286)))
            expr_CA = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(289), ldc:int(291)))
            storeelement:Object(expr_CA:Object[], and:int(ldc:int(30228), ldc:int(-30517)), p0:String[expected:Object])
            storeelement:Object(expr_CA:Object[], and:int(ldc:int(21173), ldc:int(2113)), var_5_8C:Integer[expected:Object])
            var_6_E8 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokestatic:String(String::format, stack_E2_0:String, expr_CA:Object[]))
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u51fa\u4f52\ub171\u8d90\u0b8e\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, var_6_E8:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(var_6_E8:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \u72f1\u760c\u5654\u6b0d\u3e75\ub32d(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, java.util.concurrent.Executor p1) {
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
    
    private static void \u51fa\u7bad\u6c56\uae87\u3e2a\uafe7(java.lang.Runnable p0) {
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
    
    public void \u5db4\u0c95\u960f\u5bc4\u8413\u71ae() {
        var_1_61 : int
        var_3_6B : Iterator<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>
        
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
            var_1_61 = and:int(ldc:int(-1943634595), ldc:int(-1169196091))
            var_3_6B = invokeinterface:Iterator<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>(Set<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>::iterator, getfield:Set<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\ub7dc\u5245\u72f1\ufe34\u983f\u983f, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-842135913))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_6B:Iterator<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:void(\uc29a\u494c\uc2e8\uc31c\ufe34\u718f::\u5db4\u0c95\u960f\u5bc4\u8413\u71ae, checkcast:\uc29a\u494c\uc2e8\uc31c\ufe34\u718f(\ub113\ufcaf\u3c25\u071d\u97b7.\uc29a\u494c\uc2e8\uc31c\ufe34\u718f.class, invokeinterface:\uc29a\u494c\uc2e8\uc31c\ufe34\u718f(Iterator<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>::next, var_3_6B:Iterator<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\u8d90\u93a2\u839e\u4179\u67e9(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_4_67 : \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a
        
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
            var_4_67 = invokevirtual:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            
            if (cmpne:boolean(var_4_67:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, aconstnull:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a())) {
                invokeinterface:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>::remove, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97e6\u4d85\u4975\u5140\uae87\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\ubff1\ub6ab\ub18d\u56bd\u12b2\u527a, invokevirtual:int(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u3dd3\u071d\u6fb0\u8413\u64f2\u3bc9, var_4_67:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a))
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
            invokeinterface:void(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>::forEach, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97e6\u4d85\u4975\u5140\uae87\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99), invokedynamic:BiConsumer<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(accept:(L\u8cae\u8bb0\ucef1\u8c8a\u3a62/\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99;)Ljava/util/function/BiConsumer;, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97e6\u4d85\u4975\u5140\uae87\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))
            invokeinterface:void(Set<E>::clear, getfield:Set<\uc29a\u494c\uc2e8\uc31c\ufe34\u718f>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\ub7dc\u5245\u72f1\ufe34\u983f\u983f, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))
            invokeinterface:void(Map<K, V>::clear, getfield:Map<String, Integer>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u446c\uc910\ubb2b\u34df\ubf56\uc2bd, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \ub6ab\u6c56\u8350\u0a06\u8350\u40a9(\u36d3\u9033\u6b0d\u983f\u8d90.\ud7e8\u71ae\ud523\u7af6\u76bc p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p3, java.util.concurrent.Executor p4, java.util.concurrent.Executor p5) {
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
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a \u6b0d\u0a06\u16f6\u7ce1\u2dcc\u4ab3() {
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
            return:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(getfield:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u8bb0\u7043\u3c25\uc229\ub19c\u8389, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \ub1b9\u9255\u34df\u7006\u120d\u4c04() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u392e\u3e2a\ub8be\u8df4\u34df\u36d3, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ubcb0\u5d20\u071d\ucef1\u12b2\u385b$5(java.lang.Runnable p0) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u446c\ubcb0\u8d98\u6c56\uc7fe\ub19c, invokedynamic:\u6b5f\u8389\ub32d\ub83f\u71f1(\u12b2\ub32d\u92ff\ud217\u3d4b\u3776:(Ljava/lang/Runnable;)L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\u6b5f\u8389\ub32d\ub83f\u71f1;, p0:Runnable))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u52d3\uc4d2\ud217\u718f\u3504\u7043$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, java.util.concurrent.Executor p1, java.lang.Void p2) {
        var_4_F9 : int
        var_7_89 : Iterator<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>
        var_8_D1 : Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>
        var_9_DD : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_10_E9 : \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a
        
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
            var_4_F9 = and:int(ldc:int(-818145727), ldc:int(-2021665160))
            invokestatic:\u5140\u4ab3\u183a\ud523\u071d\u983f(\u8350\ub32d\ud171\u4975\u4cd9\u6cfe::\u392e\u7049\uc31c\u3e75\u3bd6\u927d)
            invokestatic:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u983f\u0800\u12b2\ub83f\ub113\u5f50, getfield:\u6c52\u52d3\u516c\uae87\uae5d(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u7af6\u8bb0\uc229\ube23\u156b\ua6bd, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))
            var_7_89 = invokeinterface:Iterator<Object>(Set<Object>::iterator, initobject:HashSet<Object>[expected:Set<Object>](HashSet<Object>::<init>, invokeinterface:Set<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>>[expected:Collection<?>](Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>::entrySet, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97e6\u4d85\u4975\u5140\uae87\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99))))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_F9:int, ldc:int(262144)), ldc:int(0))) {
                    var_4_F9 = and:int(var_4_F9:int, ldc:int(-1051694040))
                }
                else {
                    var_4_F9 = and:int(var_4_F9:int, ldc:int(-1078648847))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_89:Iterator)) {
                        var_8_D1 = checkcast:Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>(java.util.Map.Entry<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>.class, invokeinterface:Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>(Iterator<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>::next, var_7_89:Iterator<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>))
                        var_9_DD = checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>::getKey, var_8_D1:Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>))
                        var_10_E9 = checkcast:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a.class, invokeinterface:V[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a](Entry<K, V>::getValue, var_8_D1:Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>))
                        
                        if (logicaland:boolean(cmpeq:boolean(var_10_E9:\u5140\u4ab3\u183a\ud523\u071d\u983f, invokestatic:\u5140\u4ab3\u183a\ud523\u071d\u983f(\u8350\ub32d\ud171\u4975\u4cd9\u6cfe::\u392e\u7049\uc31c\u3e75\u3bd6\u927d)), logicalnot:boolean(invokevirtual:boolean(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::equals, var_9_DD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u8350\ub32d\ud171\u4975\u4cd9\u6cfe::\uc7fe\u9937\u3504\ub32d\u71f1\u8753))))) {
                            invokeinterface:void(Iterator::remove, var_7_89:Iterator)
                        }
                        else {
                            var_4_F9 = and:int(var_4_F9:int, ldc:int(-1342275991))
                            invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u8308\u34df\ud7e8\u51fa\ubcb0\u74b1, var_10_E9:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a], this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u6c52\u52d3\u516c\uae87\uae5d, var_9_DD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:Executor)
                        }
                        
                        var_4_F9 = and:int(var_4_F9:int, ldc:int(-1112236049))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_F9:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u5140\ud7e8\u3dd3\ud51e\u760c\u494c$3(java.lang.Runnable p0) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u446c\ubcb0\u8d98\u6c56\uc7fe\ub19c, invokedynamic:\u6b5f\u8389\ub32d\ub83f\u71f1(\u12b2\ub32d\u92ff\ud217\u3d4b\u3776:(Ljava/lang/Runnable;)L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\u6b5f\u8389\ub32d\ub83f\u71f1;, p0:Runnable))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u67d0\uc910\u69d9\ub70c\u760c\uc2e8$2(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f p1) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u51fa\u4f52\ub171\u8d90\u0b8e\uc910, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u98a4\uf995\uc2e8\u760c\u760c\u5fe1$1(\u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a p0) {
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
            return:String(invokevirtual:String(Class<T>::getName, invokevirtual:Class<? extends \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a>(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::getClass, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u2dcc\ub8be\u12b2\ub18d\u416d\u6bb9$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            invokespecial:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u4c04\u759a\u071d\uf995\u4975\ube23, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2B6 : int
        expr_6E : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_D8_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_108_0 : byte[] [generated]
        stack_133_0 : byte[] [generated]
        stack_2C9_0 : byte[] [generated]
        stack_307_0 : byte[] [generated]
        stack_36E_0 : byte[] [generated]
        stack_3EB_0 : byte[] [generated]
        var_4_2A2 : int
        var_3_2A7 : byte[]
        var_5_2A8 : int
        var_0_364 : int
        expr_36E : byte [generated]
        stack_3B6_2 : byte [generated]
        stack_394_0 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_2F5 : byte[]
        var_5_2F6 : int
        expr_D8 : int [generated]
        expr_108 : int [generated]
        var_3_3D9 : byte[]
        var_5_3DA : int
        expr_3EB : byte [generated]
        var_3_13F : String
        expr_147 : String[] [generated]
        expr_151 : String[] [generated]
        var_3_282 : String[]
        
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
        var_0_2B6 = and:int(ldc:int(1972353272), ldc:int(-15802119))
        expr_6E = arraylength:int(stack_9B_0 = stack_9D_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_133_0 = stack_2C9_0 = stack_307_0 = stack_36E_0 = stack_3EB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("odPVzdOwTFiqz4CjhbUEqKKg9vj20i0p0yEr6iGyoiqnIne1Jt+0Vqm1BKhY+lhQAF3OeEvqIbKi2KkmdqhftFmvtQSoTCD0oqZB+SR0U+ihiKJyQsygo4W1BKhcDkSmb6/kTG7aRkigVwaook5uQ4hZr+RMbtpGSKBXBqiiqiRAXKhZJCWAXkxRLKihgE5EaE5cTa/kTG4iqkhUUTwqznxWo9UL6FjCRnhIUdWE3lqkqlEupYakfHZcbtDbtGzVIyZVl8xcpG503HpsQm3I")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2A2 = expr_6E:int
        var_3_2A7 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2A8 = expr_6E:int
        Label_0682:
        
        while (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-600854020))
            var_5_2A8 = add:int(var_5_2A8:int, ldc:int(-1))
            storeelement:byte(var_3_2A7:byte[], var_5_2A8:int, add:byte(xor:byte(loadelement:byte(stack_2C9_0:byte[], var_5_2A8:int), ldc:byte(92)), ldc:byte(12)))
            
            if (cmpne:boolean(var_5_2A8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_133_0 = stack_2C9_0 = stack_307_0 = stack_36E_0 = stack_3EB_0 = var_3_2A7:byte[]
            goto(Label_0115)
        }
        
        var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-1416343030))
        Label_0846:
        
        while (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(1)), ldc:int(0))) {
            var_0_364 = and:int(var_0_2B6:int, ldc:int(-185621550))
            var_5_2A8 = add:int(var_5_2A8:int, ldc:int(-1))
            expr_36E = stack_3B6_2 = loadelement(stack_36E_0, var_5_2A8)
            
            if (cmplt:boolean(add:int(add:int(var_5_2A8:int, ldc:int(5)), neg:int(var_4_2A2:int)), ldc:int(0))) {
                stack_3B6_2 = stack_394_0 = add:byte(expr_36E:byte, loadelement:byte(var_3_2A7:byte[], add:int(var_5_2A8:int, ldc:int(5))))
                goto(Label_0932)
            }
            
            Label_0891:
            
            if (cmpeq:boolean(and:int(var_0_364:int, ldc:int(8192)), ldc:int(0))) {
                var_0_364 = and:int(var_0_364:int, ldc:int(-1497124251))
            }
            else {
                var_0_364 = and:int(var_0_364:int, ldc:int(1563422448))
                stack_3B6_2 = stack_394_0 = add:byte(expr_36E:byte, ldc:byte(5))
            }
            
            Label_0932:
            
            if (cmpeq:boolean(and:int(var_0_364:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0891)
            }
            
            var_0_2B6 = and:int(var_0_364:int, ldc:int(-163582505))
            storeelement:byte(var_3_2A7:byte[], var_5_2A8:int, stack_3B6_2:byte)
            
            if (cmpne:boolean(var_5_2A8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_133_0 = stack_2C9_0 = stack_307_0 = stack_36E_0 = stack_3EB_0 = var_3_2A7:byte[]
            goto(Label_0221)
        }
        
        var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-159462240))
        goto(Label_0682)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0269)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-1628197924))
            goto(Label_0221)
        }
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(2104425168))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_2F5 = newarray:byte[](byte.class, expr_9F:int)
                var_5_2F6 = expr_9F:int
                
                loop {
                    var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1607379455))
                    var_5_2F6 = add:int(var_5_2F6:int, ldc:int(-1))
                    storeelement:byte(var_3_2F5:byte[], var_5_2F6:int, add:int(shl:int(loadelement:byte(stack_307_0:byte[], var_5_2F6:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_2F6:int, and:int(ldc:int(1665), ldc:int(6211)))), ldc:int(5)), and:int(ldc:int(1559), ldc:int(18543)))))
                    
                    if (cmpne:boolean(var_5_2F6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_133_0 = stack_2C9_0 = stack_307_0 = stack_36E_0 = stack_3EB_0 = var_3_2F5:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(4)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(2050111673))
            goto(Label_0269)
        }
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(256)), ldc:int(0))) {
                var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1448262026))
                goto(Label_0115)
            }
            
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1594801144))
            expr_D8 = arraylength:int(stack_D8_0:byte[])
            
            if (cmpne:boolean(expr_D8:int, ldc:int(0))) {
                var_4_2A2 = expr_D8:int
                var_3_2A7 = newarray:byte[](byte.class, expr_D8:int)
                var_5_2A8 = expr_D8:int
                goto(Label_0846)
            }
        }
        
        Label_0221:
        
        if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(524288)), ldc:int(0))) {
                var_0_2B6 = and:int(var_0_2B6:int, ldc:int(924716664))
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-559940619))
            expr_108 = arraylength:int(stack_108_0:byte[])
            
            if (cmpne:boolean(expr_108:int, ldc:int(0))) {
                var_3_3D9 = newarray:byte[](byte.class, expr_108:int)
                var_5_3DA = expr_108:int
                
                loop {
                    var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1963900369))
                    var_5_3DA = add:int(var_5_3DA:int, ldc:int(-1))
                    expr_3EB = loadelement:byte(stack_3EB_0:byte[], var_5_3DA:int)
                    storeelement:byte(var_3_3D9:byte[], var_5_3DA:int, or:int(and:int(shl:int(expr_3EB:byte, xor:int(ldc:int(16528), ldc:int(16532))), ldc:int(-16)), and:int(shr:int(expr_3EB:byte[expected:int], xor:int(ldc:int(2466), ldc:int(2470))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_3DA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_133_0 = stack_2C9_0 = stack_307_0 = stack_36E_0 = stack_3EB_0 = var_3_3D9:byte[]
            }
        }
        
        Label_0269:
        
        if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0221)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(8192)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-780943278))
            goto(Label_0164)
        }
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_13F = initobject:String(String::<init>, stack_133_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_147 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32763), ldc:int(-32754)))
            expr_151 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-23935), ldc:int(-23926)))
            storeelement:String(expr_147:String[], xor:int(ldc:int(2578), ldc:int(2584)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(12939), ldc:int(-12940)), and:int(ldc:int(803), ldc:int(-804))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(8213), ldc:int(8210)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(22152), ldc:int(-24203)), xor:int(ldc:int(14390), ldc:int(14380))))
            storeelement:String(expr_151:String[], and:int(ldc:int(-4863), ldc:int(766)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(16666), ldc:int(1755)), and:int(ldc:int(4149), ldc:int(8500))))
            storeelement:String(expr_151:String[], and:int(ldc:int(9345), ldc:int(6437)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(6972), ldc:int(52)), xor:int(ldc:int(4279), ldc:int(4345))))
            storeelement:String(expr_151:String[], and:int(ldc:int(3202), ldc:int(16490)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(1102), ldc:int(238)), and:int(ldc:int(16503), ldc:int(11361))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(24714), ldc:int(24718)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(4345), ldc:int(101)), xor:int(ldc:int(346), ldc:int(296))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(283), ldc:int(280)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(-32156), ldc:int(-32234)), xor:int(ldc:int(1236), ldc:int(1088))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(16407), ldc:int(16415)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(8205), ldc:int(8345)), and:int(ldc:int(18924), ldc:int(4788))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(1095), ldc:int(1090)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(4260), ldc:int(8364)), and:int(ldc:int(8376), ldc:int(2297))))
            storeelement:String(expr_151:String[], and:int(ldc:int(8390), ldc:int(6406)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(-8067), ldc:int(-7995)), xor:int(ldc:int(-32125), ldc:int(-32186))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(-32635), ldc:int(-32628)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(396), ldc:int(329)), xor:int(ldc:int(4237), ldc:int(4163))))
            putstatic:String[](\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u4daf\u9af2\u51fa\u8d98\ud217\u718f, expr_151:String[])
            var_3_282 = expr_147:String[]
            putstatic:Logger(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u97b7\u392e\uc87f\u516c\u12cb\u6c56, invokestatic:Logger(LogManager::getLogger))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\ud171\ub6ab\uff55\u51fa\ubded\u3a62, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_282:String[], xor:int(ldc:int(1541), ldc:int(1551)))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u51fa\ud523\u927d\u3711\ud217\u61a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65D : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_CF : double
        var_3_E1 : int
        var_11_F2 : int
        var_14_11C : double
        var_16_120 : int
        var_12_118 : double
        var_17_668 : int
        
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
        var_3_65D = and:int(ldc:int(24279331), ldc:int(-1744950217))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_65D = and:int(var_3_65D:int, ldc:int(666735136))
        }
        else {
            var_3_65D = and:int(var_3_65D:int, ldc:int(1507275937))
            var_5_89 = and:int(ldc:int(-4688), ldc:int(4687))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25258), ldc:int(25128)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E1 = and:int(var_3_65D:int, ldc:int(-369398937))
                    var_9_CF = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F2 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F2:int, sub:int(var_6_90:int, and:int(ldc:int(2151), ldc:int(24705)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F2:int, xor:int(ldc:int(-30200), ldc:int(-30199)))), var_7_9F:double))) {
                        inc:int(var_11_F2, ldc:int(1))
                    }
                    
                    var_3_65D = and:int(var_3_E1:int, ldc:int(-1149801675))
                    var_14_11C = var_7_9F:double
                    var_16_120 = var_11_F2:int
                }
                else {
                    var_11_F2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(16713), ldc:int(6661)))
                    var_12_118 = var_14_11C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_120 = var_11_F2:int, var_6_90:int)) {
                        var_9_CF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F2:int)
                        var_16_120 = var_11_F2:int
                        var_14_11C = var_12_118:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1008871899))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1874240020))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(739266433))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(995309887))
                        
                        if (cmplt:boolean(var_16_120:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0404:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1791352123))
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(96816695))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(147954568))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-210505609))
                        var_11_F2 = and:int(ldc:int(17528), ldc:int(-21625))
                        goto(Label_1511)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-705327097))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1547553019))
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-566212359))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(972772027))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11C = var_9_CF:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(555820638))
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-2094544209))
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1481245880))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(885459254))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(1515243643))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1880072528))
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1236604082))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-405401939))
                        var_14_11C = mul:double(ldc:double(0.5), add:double(var_9_CF:double, var_14_11C:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-979981048))
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1920798951))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(436928279))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1173270219))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1267928577))
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1980270219))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F2 = and:int(ldc:int(1185), ldc:int(14345))
                                goto(Label_1105)
                            }
                        }
                    }
                    
                    Label_0956:
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1297527645))
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-628334556))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(1915249030))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1308995729))
                        var_11_F2 = and:int(ldc:int(21556), ldc:int(-23669))
                    }
                    
                    Label_1105:
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-761051738))
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1708188269))
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(152463775))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1785298155))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(467320567))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                                goto(Label_1379)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1664808571))
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(476747368))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-812268533))
                            goto(Label_1105)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(224258922))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1430093972))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(217441398))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(762749109))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11C:double, var_5_89:int, var_16_120:int)
                        goto(Label_1511)
                    }
                    
                    Label_1379:
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-362511849))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1829529588))
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1869049483))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1313828573))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65D = and:int(var_3_65D:int, ldc:int(-1317825743))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11C:double, ldc:double(0.0))
                    Label_1511:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_668 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1522:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-194484340))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1563848283))
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-768507801))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1630019538))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1070816681))
                        var_17_668 = add:int(var_16_120:int, xor:int(ldc:int(20738), ldc:int(20739)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65D = and:int(var_3_65D:int, ldc:int(1341786933))
                
                if (cmple:boolean(var_5_89 = var_17_668:int, sub:int(var_6_90:int, xor:int(ldc:int(16412), ldc:int(16413))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
            var_3_65D = and:int(var_3_65D:int, ldc:int(1194280412))
            goto(Label_0108)
        }
    }
}
