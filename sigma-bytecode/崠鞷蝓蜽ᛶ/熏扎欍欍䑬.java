public class \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u624e\u6b0d\u6b0d\u446c {
    public void \u718f\u624e\u6b0d\u6b0d\u446c(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u62da\u36d3\u960f\u62da\ub83f p0) {
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
    
    public boolean \u7043\u7049\u67d0\u36d3\u183a\u983f() {
        var_1_5F : int
        var_3_11D : Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        
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
        var_1_5F = and:int(ldc:int(81846830), ldc:int(-1899187226))
        
        if (cmpgt:boolean(invokestatic:int(\u62da\u36d3\u960f\u62da\ub83f::\u4c2b\u647c\u965f\ua068\u64ab\ud51e, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)), ldc:int(0))) {
            return:boolean(and:int[expected:boolean](ldc:int(-25161), ldc:int(25160)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0247)
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0189)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1303377196))
                
                if (invokevirtual:boolean(\u62da\u36d3\u960f\u62da\ub83f::\u4d85\u3e75\u392e\uc87f\u99f7\uf9c5, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))) {
                    return:boolean(and:int[expected:boolean](ldc:int(35), ldc:int(-36)))
                }
            }
            
            Label_0142:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0247)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1024)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1231846381))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(32)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(231385060))
                
                if (invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u74b1\u7af6\ua61f\u6c52\u7873\ub7dc, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u62da\u36d3\u960f\u62da\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)))) {
                    return:boolean(and:int[expected:boolean](ldc:int(1258), ldc:int(-11772)))
                }
            }
            
            Label_0189:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(256)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1909110424))
            }
            else {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1693979223))
                    goto(Label_0142)
                }
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(-444203986))
                
                if (cmplt:boolean(invokevirtual:float(Random::nextFloat, invokestatic:Random(\u62da\u36d3\u960f\u62da\ub83f::\u9937\ud12e\u759a\ufe34\uff55\u3a62, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))), ldc:float(0.7f))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-24410), ldc:int(23880)))
                }
            }
            
            Label_0247:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1073579123))
                goto(Label_0189)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0142)
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
                loopcontinue()
            }
            
            var_3_11D = invokespecial:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u718f\u624e\u6b0d\u6b0d\u446c::\u47c2\u72f1\u527a\u527a\u59ec\u7043, this:\u718f\u624e\u6b0d\u6b0d\u446c)
            
            if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_3_11D:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))) {
                return:boolean(and:int[expected:boolean](ldc:int(-13240), ldc:int(13190)))
            }
            
            invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u62da\u36d3\u960f\u62da\ub83f::\u8d90\u4c2b\u6bb9\u51b2\u6d99\ube23, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c), checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::get, var_3_11D:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)))
            invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u3711\u7049\u8cae\u72f1\uc7fe\u5140, invokestatic:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u62da\u36d3\u960f\u62da\ub83f::\uc3e3\u47c2\u071d\u927d\u600f\u7bad, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u62da\u36d3\u960f\u62da\ub83f::\u99f7\ub83f\u1187\ub70c\ub32d\u72f1, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)))), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u62da\u36d3\u960f\u62da\ub83f::\u99f7\ub83f\u1187\ub70c\ub32d\u72f1, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)))), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u62da\u36d3\u960f\u62da\ub83f::\u99f7\ub83f\u1187\ub70c\ub32d\u72f1, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)))), ldc:double(0.5)), ldc:double(1.2000000476837158))
            return:boolean(and:int[expected:boolean](ldc:int(24833), ldc:int(33)))
        }
    }
    
    public boolean \u8709\ud158\u8308\u3e2a\u416d\u8350() {
        var_1_25A : int
        stack_275_0 : int [generated]
        
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
        var_1_25A = and:int(ldc:int(-1591906001), ldc:int(-227707929))
        
        if (getfield:boolean(\u718f\u624e\u6b0d\u6b0d\u446c::\ub7dc\u3a62\u8413\ub83f\u3a62\u6bb9, this:\u718f\u624e\u6b0d\u6b0d\u446c)) {
            loop {
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(841679449))
                    goto(Label_0547)
                }
                
                if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-1315961865))
                    goto(Label_0418)
                }
                
                if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0341)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0270)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(2056514792))
                }
                else {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-230689553))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u62da\u36d3\u960f\u62da\ub83f::\u93a2\ub18d\uf995\u71ae\u3dd3\u8258, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-4648), ldc:int(4647)))
                    }
                }
                
                Label_0177:
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(1)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(821805637))
                    goto(Label_0547)
                }
                
                if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(16)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-393538776))
                    goto(Label_0418)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(1371801067))
                    goto(Label_0341)
                }
                
                if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(313362468))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(32)), ldc:int(0))) {
                        var_1_25A = and:int(var_1_25A:int, ldc:int(1704615273))
                        loopcontinue()
                    }
                    
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-1121091857))
                    
                    if (invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u74b1\u7af6\ua61f\u6c52\u7873\ub7dc, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u62da\u36d3\u960f\u62da\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)))) {
                        return:boolean(and:int[expected:boolean](ldc:int(1183), ldc:int(-9376)))
                    }
                }
                
                Label_0270:
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0547)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-2139338771))
                    goto(Label_0418)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-1880541066))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(2)), ldc:int(0))) {
                        var_1_25A = and:int(var_1_25A:int, ldc:int(-1056771027))
                        loopcontinue()
                    }
                    
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-523283793))
                    
                    if (invokespecial:boolean(\u718f\u624e\u6b0d\u6b0d\u446c::\u67e9\u3711\u7049\u183a\u99f7\u3a62, this:\u718f\u624e\u6b0d\u6b0d\u446c)) {
                        if (cmpge:boolean(invokevirtual:float(Random::nextFloat, invokestatic:Random(\u62da\u36d3\u960f\u62da\ub83f::\u6d69\u69d9\u97e6\u69d9\u8cae\uc3e3, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))), ldc:float(0.2f))) {
                            goto(Label_0547)
                        }
                        
                        stack_275_0 = and:int(ldc:int(4485), ldc:int(17411))
                        looporswitchbreak()
                    }
                }
                
                Label_0341:
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0547)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_25A = and:int(var_1_25A:int, ldc:int(982668996))
                        goto(Label_0270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(2)), ldc:int(0))) {
                        var_1_25A = and:int(var_1_25A:int, ldc:int(1720549207))
                        goto(Label_0177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_25A = and:int(var_1_25A:int, ldc:int(-1522475080))
                        loopcontinue()
                    }
                    
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-188916369))
                    
                    if (cmpeq:boolean(rem:int(getfield:int(\u62da\u36d3\u960f\u62da\ub83f::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)), ldc:int(20)), ldc:int(0))) {
                        if (logicalnot:boolean(invokestatic:boolean(\u62da\u36d3\u960f\u62da\ub83f::\u9033\u76bc\u3711\ub18d\u7049\u760c, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u62da\u36d3\u960f\u62da\ub83f::\u99f7\ub83f\u1187\ub70c\ub32d\u72f1, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))))) {
                            invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u62da\u36d3\u960f\u62da\ub83f::\u8d90\u4c2b\u6bb9\u51b2\u6d99\ube23, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())
                            return:boolean(and:int[expected:boolean](ldc:int(29729), ldc:int(-31778)))
                        }
                    }
                }
                
                Label_0418:
                
                if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(2)), ldc:int(0))) {
                        var_1_25A = and:int(var_1_25A:int, ldc:int(1672004623))
                        goto(Label_0341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_25A = and:int(var_1_25A:int, ldc:int(169631263))
                        goto(Label_0270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0177)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(4)), ldc:int(0))) {
                        return:boolean(and:int[expected:boolean](ldc:int(2257), ldc:int(13059)))
                    }
                    
                    loopcontinue()
                }
                
                Label_0547:
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0418)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(32)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-326958446))
                    goto(Label_0341)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0270)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(1)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-1462576306))
                    goto(Label_0177)
                }
                
                if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(2)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-1135741313))
                    stack_275_0 = and:int(ldc:int(22144), ldc:int(-22145))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_275_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(14145), ldc:int(-14274)))
    }
    
    private boolean \u67e9\u3711\u7049\u183a\u99f7\u3a62() {
        var_1_60 : int
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
            var_1_60 = and:int(ldc:int(-1942029920), ldc:int(-1454540570))
            
            if (cmple:boolean(getfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u3d64\uc29a\u600f\u4975\u7330\u9033, this:\u718f\u624e\u6b0d\u6b0d\u446c), xor:int(ldc:int(25986), ldc:int(25618)))) {
                var_1_60 = and:int(var_1_60:int, ldc:int(-253445173))
                stack_90_0 = and:int(ldc:int(-10863), ldc:int(10862))
            }
            else {
                stack_90_0 = and:int(ldc:int(165), ldc:int(1))
            }
            
            return:boolean(stack_90_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u97b7\ud36e\u16f6\u5f50\u6d69\u7ce1() {
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
            return:boolean(getfield:boolean(\u718f\u624e\u6b0d\u6b0d\u446c::\ub7dc\u3a62\u8413\ub83f\u3a62\u6bb9, this:\u718f\u624e\u6b0d\u6b0d\u446c))
        }
        
        goto(Label_0006)
    }
    
    private void \ud4fe\u7d52\uf94d\uc7fe\uc4d2\u760c() {
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
            putfield:boolean(\u718f\u624e\u6b0d\u6b0d\u446c::\ub7dc\u3a62\u8413\ub83f\u3a62\u6bb9, this:\u718f\u624e\u6b0d\u6b0d\u446c, and:int[expected:boolean](ldc:int(9026), ldc:int(-9035)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\u4c2b\ud523\ube23\u416d\u3776() {
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
            putfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u3d64\uc29a\u600f\u4975\u7330\u9033, this:\u718f\u624e\u6b0d\u6b0d\u446c, and:int(ldc:int(-25535), ldc:int(16694)))
            putfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\uafe7\u8389\ud523\u12cb\u4f4a\u4975, this:\u718f\u624e\u6b0d\u6b0d\u446c, and:int(ldc:int(3869), ldc:int(-3872)))
            putfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u72f1\u3504\ub6ab\u98a4\ub32d\u8258, this:\u718f\u624e\u6b0d\u6b0d\u446c, and:int(ldc:int(-27267), ldc:int(27266)))
            putfield:boolean(\u718f\u624e\u6b0d\u6b0d\u446c::\ub7dc\u3a62\u8413\ub83f\u3a62\u6bb9, this:\u718f\u624e\u6b0d\u6b0d\u446c, and:int[expected:boolean](ldc:int(18947), ldc:int(173)))
            invokevirtual:void(\u62da\u36d3\u960f\u62da\ub83f::\u8753\ucef1\u960f\u071d\u624e\ud523, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
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
            
            if (invokespecial:boolean(\u718f\u624e\u6b0d\u6b0d\u446c::\u67e9\u3711\u7049\u183a\u99f7\u3a62, this:\u718f\u624e\u6b0d\u6b0d\u446c)) {
                invokestatic:void(\u62da\u36d3\u960f\u62da\ub83f::\u4c04\u97e6\ud158\u69d9\u7043\ub1b9, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c), xor:int[expected:boolean](ldc:int(3), ldc:int(2)))
            }
            
            putfield:boolean(\u718f\u624e\u6b0d\u6b0d\u446c::\ub7dc\u3a62\u8413\ub83f\u3a62\u6bb9, this:\u718f\u624e\u6b0d\u6b0d\u446c, and:int[expected:boolean](ldc:int(1874), ldc:int(-5971)))
            invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\ua6bd\u8c8a\u7043\u40a9\ud217\u47c2, invokestatic:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u62da\u36d3\u960f\u62da\ub83f::\u69d9\u8258\u34df\u8709\uff55\u7e3f, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)))
            invokestatic:int(\u62da\u36d3\u960f\u62da\ub83f::\uc84e\u3dd3\u647c\uceb8\u7873\u62da, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c), and:int(ldc:int(16637), ldc:int(4810)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_1_29C : int
        var_3_A9 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        stack_166_0 : int [generated]
        var_4_166 : int
        var_5_16F : int
        stack_2B8_0 : int [generated]
        var_1_2B7 : int
        
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
        var_1_29C = and:int(ldc:int(-1705632947), ldc:int(-675897601))
        putfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\uafe7\u8389\ud523\u12cb\u4f4a\u4975, this:\u718f\u624e\u6b0d\u6b0d\u446c, add:int(getfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\uafe7\u8389\ud523\u12cb\u4f4a\u4975, this:\u718f\u624e\u6b0d\u6b0d\u446c), and:int(ldc:int(45), ldc:int(14353))))
        
        if (cmpgt:boolean(getfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\uafe7\u8389\ud523\u12cb\u4f4a\u4975, this:\u718f\u624e\u6b0d\u6b0d\u446c), and:int(ldc:int(760), ldc:int(604)))) {
            invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u62da\u36d3\u960f\u62da\ub83f::\u8d90\u4c2b\u6bb9\u51b2\u6d99\ube23, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())
            goto(Label_0542)
        }
        
        Label_0128:
        
        if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(2048)), ldc:int(0))) {
            var_1_29C = and:int(var_1_29C:int, ldc:int(3605341))
        }
        else {
            var_1_29C = and:int(var_1_29C:int, ldc:int(1301461725))
            var_3_A9 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u965f\ud158\u71f1\u7bad\u8350\u071d, invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u494c\u47c2\u9255\u69d9\u8c8a\u624e, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u62da\u36d3\u960f\u62da\ub83f::\u99f7\ub83f\u1187\ub70c\ub32d\u72f1, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))), ldc:double(0.0), ldc:double(0.6000000238418579), ldc:double(0.0))
            
            if (cmple:boolean(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud171\u4bc8\ub6ab\u8d90\u69d9\ucfaf, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\u62da\u36d3\u960f\u62da\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))), ldc:double(1.0))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(2)), ldc:int(0))) {
                        var_1_29C = and:int(var_1_29C:int, ldc:int(-1581310643))
                        
                        if (cmpeq:boolean(getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u718f\u624e\u6b0d\u6b0d\u446c::\u8413\u8709\ubf56\u71ae\uc4d2\u5fe1, this:\u718f\u624e\u6b0d\u6b0d\u446c), aconstnull:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8())) {
                            putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u718f\u624e\u6b0d\u6b0d\u446c::\u8413\u8709\ubf56\u71ae\uc4d2\u5fe1, this:\u718f\u624e\u6b0d\u6b0d\u446c, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
                        }
                    }
                    
                    Label_0214:
                    
                    if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_29C = and:int(var_1_29C:int, ldc:int(-344278564))
                        
                        if (cmple:boolean(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud171\u4bc8\ub6ab\u8d90\u69d9\ucfaf, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\u62da\u36d3\u960f\u62da\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)), getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u718f\u624e\u6b0d\u6b0d\u446c::\u8413\u8709\ubf56\u71ae\uc4d2\u5fe1, this:\u718f\u624e\u6b0d\u6b0d\u446c)), ldc:double(0.1))) {
                            stack_166_0 = xor:int(ldc:int(-32752), ldc:int(-32751))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0256:
                    
                    if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_29C = and:int(var_1_29C:int, ldc:int(528597517))
                        goto(Label_0214)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(64)), ldc:int(0))) {
                        var_1_29C = and:int(var_1_29C:int, ldc:int(1698602716))
                        stack_166_0 = and:int(ldc:int(-12198), ldc:int(12197))
                        looporswitchbreak()
                    }
                }
                
                var_1_29C = and:int(var_1_29C:int, ldc:int(-2012063163))
                var_4_166 = stack_166_0:int
                var_5_16F = xor:int(ldc:int(6402), ldc:int(6403))
                
                if (cmpeq:boolean(var_4_166:int, ldc:int(0))) {
                    if (cmpgt:boolean(getfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\uafe7\u8389\ud523\u12cb\u4f4a\u4975, this:\u718f\u624e\u6b0d\u6b0d\u446c), and:int(ldc:int(1752), ldc:int(600)))) {
                        invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u62da\u36d3\u960f\u62da\ub83f::\u8d90\u4c2b\u6bb9\u51b2\u6d99\ube23, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())
                        goto(Label_0542)
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_29C = and:int(var_1_29C:int, ldc:int(-615208159))
                        goto(Label_0470)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(64)), ldc:int(0))) {
                        var_1_29C = and:int(var_1_29C:int, ldc:int(805190653))
                        
                        if (cmpne:boolean(var_4_166:int, ldc:int(0))) {
                            if (cmpne:boolean(invokevirtual:int(Random::nextInt, invokestatic:Random(\u62da\u36d3\u960f\u62da\ub83f::\u516c\u5654\uc4d2\ub113\ube23\u67e9, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)), ldc:int(25)), ldc:int(0))) {
                                goto(Label_0622)
                            }
                            
                            stack_2B8_0 = and:int(ldc:int(20515), ldc:int(8905))
                            goto(Label_0690)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(64)), ldc:int(0))) {
                        var_1_29C = and:int(var_1_29C:int, ldc:int(537066215))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_1_29C = and:int(var_1_29C:int, ldc:int(1657910364))
                            loopcontinue()
                        }
                        
                        var_1_29C = and:int(var_1_29C:int, ldc:int(-901841442))
                        
                        if (cmpne:boolean(var_5_16F:int, ldc:int(0))) {
                            invokespecial:void(\u718f\u624e\u6b0d\u6b0d\u446c::\u71f1\ub113\uceb8\u4f52\ucef1\u965f, this:\u718f\u624e\u6b0d\u6b0d\u446c)
                        }
                    }
                    
                    Label_0470:
                    
                    if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_29C = and:int(var_1_29C:int, ldc:int(416242446))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(2048)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0622:
                    
                    if (cmpeq:boolean(and:int(var_1_29C:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_29C = and:int(var_1_29C:int, ldc:int(-1115367723))
                        goto(Label_0470)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(128)), ldc:int(0))) {
                        var_1_29C = and:int(var_1_29C:int, ldc:int(1735325567))
                        loopcontinue()
                    }
                    
                    var_1_29C = and:int(var_1_29C:int, ldc:int(-1478492188))
                    stack_2B8_0 = and:int(ldc:int(-7455), ldc:int(3356))
                    Label_0690:
                    var_1_2B7 = and:int(var_1_29C:int, ldc:int(1897881063))
                    
                    if (cmpeq:boolean(stack_2B8_0:int, ldc:int(0))) {
                        var_1_2B7 = and:int(var_1_2B7:int, ldc:int(1421073527))
                        var_5_16F = and:int(ldc:int(-12043), ldc:int(12042))
                    }
                    else {
                        putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u718f\u624e\u6b0d\u6b0d\u446c::\u8413\u8709\ubf56\u71ae\uc4d2\u5fe1, this:\u718f\u624e\u6b0d\u6b0d\u446c, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, add:double(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), f2d:double(invokespecial:float(\u718f\u624e\u6b0d\u6b0d\u446c::\ub171\u9937\u7873\u7873\u8df4\u3c25, this:\u718f\u624e\u6b0d\u6b0d\u446c))), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), add:double(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), f2d:double(invokespecial:float(\u718f\u624e\u6b0d\u6b0d\u446c::\ub171\u9937\u7873\u7873\u8df4\u3c25, this:\u718f\u624e\u6b0d\u6b0d\u446c)))))
                        invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\ua6bd\u8c8a\u7043\u40a9\ud217\u47c2, invokestatic:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u62da\u36d3\u960f\u62da\ub83f::\u527a\u446c\u839e\u8c8a\u0a06\u12cb, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)))
                    }
                    
                    var_1_29C = and:int(var_1_2B7:int, ldc:int(-1768718978))
                    invokevirtual:void(\ub83f\u8753\ud217\u71f1\u6cfe::\u759a\u52d3\ud171\u3bc9\u72f1\u52d3, invokevirtual:\ub83f\u8753\ud217\u71f1\u6cfe(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7873\u51b2\ube23\ud158\u836c\ucfaf, getfield:\u62da\u36d3\u960f\u62da\ub83f[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
                    goto(Label_0418)
                }
                
                var_1_29C = and:int(var_1_29C:int, ldc:int(1312021749))
                putfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u3d64\uc29a\u600f\u4975\u7330\u9033, this:\u718f\u624e\u6b0d\u6b0d\u446c, add:int(getfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u3d64\uc29a\u600f\u4975\u7330\u9033, this:\u718f\u624e\u6b0d\u6b0d\u446c), xor:int(ldc:int(14337), ldc:int(14336))))
                
                if (cmplt:boolean(invokevirtual:float(Random::nextFloat, invokestatic:Random(\u62da\u36d3\u960f\u62da\ub83f::\u647c\u7e3f\u8cae\u516c\ub1b9\ub18d, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))), ldc:float(0.05f))) {
                    if (cmpgt:boolean(getfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u3d64\uc29a\u600f\u4975\u7330\u9033, this:\u718f\u624e\u6b0d\u6b0d\u446c), add:int(getfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u72f1\u3504\ub6ab\u98a4\ub32d\u8258, this:\u718f\u624e\u6b0d\u6b0d\u446c), ldc:int(60)))) {
                        putfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u72f1\u3504\ub6ab\u98a4\ub32d\u8258, this:\u718f\u624e\u6b0d\u6b0d\u446c, getfield:int(\u718f\u624e\u6b0d\u6b0d\u446c::\u3d64\uc29a\u600f\u4975\u7330\u9033, this:\u718f\u624e\u6b0d\u6b0d\u446c))
                        invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uc246\u4c2b\u51b2\u4f4a\u9a18\u99f7, getfield:\u62da\u36d3\u960f\u62da\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u836c\ucb79\u3711\u6d69\u71f1\u6198), ldc:float(1.0f), ldc:float(1.0f))
                    }
                }
            }
            else {
                putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u718f\u624e\u6b0d\u6b0d\u446c::\u8413\u8709\ubf56\u71ae\uc4d2\u5fe1, this:\u718f\u624e\u6b0d\u6b0d\u446c, var_3_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
                invokespecial:void(\u718f\u624e\u6b0d\u6b0d\u446c::\u71f1\ub113\uceb8\u4f52\ucef1\u965f, this:\u718f\u624e\u6b0d\u6b0d\u446c)
            }
        }
        
        Label_0542:
        
        if (cmpne:boolean(and:int(var_1_29C:int, ldc:int(128)), ldc:int(0))) {
            var_1_29C = and:int(var_1_29C:int, ldc:int(-788676753))
            goto(Label_0128)
        }
    }
    
    private void \u71f1\ub113\uceb8\u4f52\ucef1\u965f() {
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
            invokevirtual:void(\ua3b4\u4975\u0800\u16f6\u647c::\u4975\u1833\u36d3\ufe34\u873d\u6bb9, invokevirtual:\ua3b4\u4975\u0800\u16f6\u647c(\u4f4a\uafe7\u76bc\u392e\ub8be::\ud4fe\ub18d\uc7fe\ub19c\u7d52\u3e2a, getfield:\u62da\u36d3\u960f\u62da\ub83f[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u718f\u624e\u6b0d\u6b0d\u446c::\u8413\u8709\ubf56\u71ae\uc4d2\u5fe1, this:\u718f\u624e\u6b0d\u6b0d\u446c)), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u718f\u624e\u6b0d\u6b0d\u446c::\u8413\u8709\ubf56\u71ae\uc4d2\u5fe1, this:\u718f\u624e\u6b0d\u6b0d\u446c)), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u718f\u624e\u6b0d\u6b0d\u446c::\u8413\u8709\ubf56\u71ae\uc4d2\u5fe1, this:\u718f\u624e\u6b0d\u6b0d\u446c)), ldc:double(0.3499999940395355))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private float \ub171\u9937\u7873\u7873\u8df4\u3c25() {
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
            return:float(mul:float(sub:float(mul:float(invokevirtual:float(Random::nextFloat, invokestatic:Random(\u62da\u36d3\u960f\u62da\ub83f::\uc910\u1833\u5fe1\ud4fe\ubf56\u62da, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))), ldc:float(2.0f)), ldc:float(1.0f)), ldc:float(0.33333334f)))
        }
        
        goto(Label_0006)
    }
    
    private java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u47c2\u72f1\u527a\u527a\u59ec\u7043() {
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
            return:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokespecial:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u718f\u624e\u6b0d\u6b0d\u446c::\u3e75\u56bd\u7bad\u9255\ubded\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c, getfield:Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u718f\u624e\u6b0d\u6b0d\u446c::\ud217\uc31c\u4c04\ud4fe\u4f4a\ub18d, this:\u718f\u624e\u6b0d\u6b0d\u446c), ldc:double(5.0)))
        }
        
        goto(Label_0006)
    }
    
    private java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u3e75\u56bd\u7bad\u9255\ubded\u4c04(java.util.function.Predicate<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0, double p1) {
        var_4_112 : int
        var_6_6C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_75 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_8_7E : int
        var_9_C2 : int
        var_4_145 : int
        var_10_15F : int
        stack_1F5_0 : int [generated]
        var_4_29A : int
        var_11_1F5 : int
        stack_3D0_0 : int [generated]
        stack_3B4_0 : int [generated]
        stack_3E4_0 : int [generated]
        
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
        var_4_112 = and:int(ldc:int(-1433360833), ldc:int(-814299849))
        var_6_6C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\u62da\u36d3\u960f\u62da\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c))
        var_7_75 = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
        var_8_7E = and:int(ldc:int(-9248), ldc:int(9230))
        
        loop {
            if (cmpne:boolean(and:int(var_4_112:int, ldc:int(262144)), ldc:int(0))) {
                var_4_112 = and:int(var_4_112:int, ldc:int(1640356268))
            }
            else {
                var_4_112 = and:int(var_4_112:int, ldc:int(-1443512389))
                
                if (cmple:boolean(i2d:double(var_8_7E:int), p1:double)) {
                    var_9_C2 = and:int(ldc:int(-167), ldc:int(166))
                    
                    loop {
                        Label_0196:
                        
                        if (cmpne:boolean(and:int(var_4_112:int, ldc:int(2048)), ldc:int(0))) {
                            var_4_145 = and:int(var_4_112:int, ldc:int(1042087618))
                            goto(Label_0292)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_112:int, ldc:int(16)), ldc:int(0))) {
                            var_4_145 = and:int(var_4_112:int, ldc:int(871451199))
                        }
                        else {
                            var_4_145 = and:int(var_4_112:int, ldc:int(-1922051777))
                            
                            if (cmplt:boolean(i2d:double(var_9_C2:int), p1:double)) {
                                var_10_15F = and:int(ldc:int(-4353), ldc:int(4352))
                                
                                loop {
                                    if (cmpne:boolean(and:int(var_4_145:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_0438)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_4_145:int, ldc:int(134217728)), ldc:int(0))) {
                                        var_4_145 = and:int(var_4_145:int, ldc:int(-37110917))
                                        
                                        if (cmple:boolean(var_10_15F:int, var_9_C2:int)) {
                                            if (cmpge:boolean(var_10_15F:int, var_9_C2:int)) {
                                                goto(Label_0438)
                                            }
                                            
                                            if (cmple:boolean(var_10_15F:int, neg:int(var_9_C2:int))) {
                                                goto(Label_0438)
                                            }
                                            
                                            stack_1F5_0 = var_9_C2:int
                                            goto(Label_0493)
                                        }
                                    }
                                    
                                    Label_0386:
                                    
                                    if (cmpeq:boolean(and:int(var_4_145:int, ldc:int(16)), ldc:int(0))) {
                                        var_4_145 = and:int(var_4_145:int, ldc:int(-227931767))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_4_145:int, ldc:int(2)), ldc:int(0))) {
                                            var_4_112 = and:int(var_4_145:int, ldc:int(1810672695))
                                            inc:int(var_9_C2, ldc:int(1))
                                            loopcontinue(Label_0196)
                                        }
                                        
                                        loopcontinue()
                                    }
                                    
                                    Label_0438:
                                    
                                    if (cmpne:boolean(and:int(var_4_145:int, ldc:int(524288)), ldc:int(0))) {
                                        goto(Label_0386)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_4_145:int, ldc:int(2)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_4_145 = and:int(var_4_145:int, ldc:int(-1438014785))
                                    stack_1F5_0 = and:int(ldc:int(-12748), ldc:int(4545))
                                    Label_0493:
                                    var_4_29A = and:int(var_4_145:int, ldc:int(1228992887))
                                    var_11_1F5 = stack_1F5_0:int
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(16777216)), ldc:int(0))) {
                                            goto(Label_0796)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(2147483647)), ldc:int(0))) {
                                            goto(Label_0718)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(1)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(380903309))
                                            goto(Label_0606)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(32768)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(-320750913))
                                            
                                            if (cmple:boolean(var_11_1F5:int, var_9_C2:int)) {
                                                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u0a06\u12b2\uc2bd\ufe34\u760c\u47c2, var_7_75:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_6_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_10_15F:int, sub:int(var_8_7E:int, and:int(ldc:int(1179), ldc:int(10241))), var_11_1F5:int)
                                                
                                                if (logicalnot:boolean(invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u92ee\ua3b4\u3c25\u7330\u3711\uc2e8, var_6_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_7_75:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], p1:double))) {
                                                    goto(Label_0718)
                                                }
                                                
                                                if (logicalnot:boolean(invokeinterface:boolean(Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::test, p0:Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u62da\u36d3\u960f\u62da\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u62da\u36d3\u960f\u62da\ub83f(\u718f\u624e\u6b0d\u6b0d\u446c::\ubf56\u071d\u16f6\uae87\u0a06\u4c04, this:\u718f\u624e\u6b0d\u6b0d\u446c)), var_7_75:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])))) {
                                                    goto(Label_0718)
                                                }
                                                
                                                return:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokestatic:Optional<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a>(Optional<T>::of, var_7_75:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a))
                                            }
                                        }
                                        
                                        Label_0561:
                                        
                                        if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(16777216)), ldc:int(0))) {
                                            goto(Label_0796)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(2)), ldc:int(0))) {
                                            goto(Label_0718)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(2)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(32)), ldc:int(0))) {
                                                loopcontinue()
                                            }
                                            
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(-874535561))
                                            
                                            if (cmpgt:boolean(var_10_15F:int, ldc:int(0))) {
                                                stack_3D0_0 = stack_3B4_0 = neg(var_10_15F)
                                                goto(Label_0960)
                                            }
                                        }
                                        
                                        Label_0606:
                                        
                                        if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(32)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(586852459))
                                            goto(Label_0796)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(65536)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(-1374193572))
                                        }
                                        else {
                                            if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(16777216)), ldc:int(0))) {
                                                goto(Label_0561)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(1)), ldc:int(0))) {
                                                var_4_29A = and:int(var_4_29A:int, ldc:int(-278093133))
                                                stack_3D0_0 = stack_3B4_0 = sub(xor(ldc(-30080), ldc(-30079)), var_10_15F)
                                                goto(Label_0960)
                                            }
                                            
                                            loopcontinue()
                                        }
                                        
                                        Label_0718:
                                        
                                        if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(1)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(-767453101))
                                        }
                                        else {
                                            if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(16384)), ldc:int(0))) {
                                                var_4_29A = and:int(var_4_29A:int, ldc:int(-1444841449))
                                                goto(Label_0606)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(32)), ldc:int(0))) {
                                                var_4_29A = and:int(var_4_29A:int, ldc:int(-1451615714))
                                                goto(Label_0561)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(65536)), ldc:int(0))) {
                                                loopcontinue()
                                            }
                                            
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(-115371085))
                                            
                                            if (cmpgt:boolean(var_11_1F5:int, ldc:int(0))) {
                                                stack_3D0_0 = stack_3B4_0 = neg(var_11_1F5)
                                                goto(Label_0932)
                                            }
                                        }
                                        
                                        Label_0796:
                                        
                                        if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(2)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(1364953966))
                                            goto(Label_0718)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(134217728)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(-593115349))
                                            goto(Label_0606)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_29A:int, ldc:int(16)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(1459851664))
                                            goto(Label_0561)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(2048)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_4_29A = and:int(var_4_29A:int, ldc:int(-24864193))
                                        stack_3D0_0 = stack_3B4_0 = sub(xor(ldc(2080), ldc(2081)), var_11_1F5)
                                        Label_0932:
                                        
                                        if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(2)), ldc:int(0))) {
                                            var_4_29A = and:int(var_4_29A:int, ldc:int(-1364467717))
                                            var_11_1F5 = stack_3B4_0:int
                                            loopcontinue()
                                        }
                                        
                                        Label_0960:
                                        
                                        if (cmpne:boolean(and:int(var_4_29A:int, ldc:int(32)), ldc:int(0))) {
                                            var_4_145 = and:int(var_4_29A:int, ldc:int(-1732409605))
                                            var_10_15F = stack_3D0_0:int
                                            looporswitchbreak()
                                        }
                                        
                                        goto(Label_0932)
                                    }
                                }
                            }
                        }
                        
                        Label_0251:
                        
                        if (cmpne:boolean(and:int(var_4_145:int, ldc:int(32768)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_4_145:int, ldc:int(134217728)), ldc:int(0))) {
                                var_4_112 = and:int(var_4_145:int, ldc:int(-665628185))
                                loopcontinue()
                            }
                            
                            var_4_145 = and:int(var_4_145:int, ldc:int(1290050111))
                            
                            if (cmpgt:boolean(var_8_7E:int, ldc:int(0))) {
                                stack_3E4_0 = neg:int(var_8_7E:int)
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0292:
                        
                        if (cmpne:boolean(and:int(var_4_145:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0251)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_145:int, ldc:int(16777216)), ldc:int(0))) {
                            var_4_145 = and:int(var_4_145:int, ldc:int(1800515583))
                            stack_3E4_0 = sub:int(and:int(ldc:int(23073), ldc:int(395)), var_8_7E:int)
                            looporswitchbreak()
                        }
                        
                        var_4_112 = and:int(var_4_145:int, ldc:int(-1609846968))
                    }
                    
                    var_4_112 = and:int(var_4_145:int, ldc:int(422950263))
                    var_8_7E = stack_3E4_0:int
                    loopcontinue()
                }
            }
            
            if (cmpeq:boolean(and:int(var_4_112:int, ldc:int(16384)), ldc:int(0))) {
                return:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::empty))
            }
        }
    }
    
    private static boolean lambda$\ub83f\uc2e8\ua3b4\u5d20\u8753\u983f$0(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_1_ED : int
        stack_109_0 : int [generated]
        
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
            var_1_ED = and:int(ldc:int(296924513), ldc:int(255079789))
            
            if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\ubefe\u7e3f\uc246\u7043\u0a06\uc9f6))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ubff1\uc7fe\u64f2\u2dcc\ud158\uf9c5)))) {
                    goto(Label_0161)
                }
                
                if (cmpne:boolean(invokevirtual:\u8350\u52d3\ub8be\u9033\ub7dc\ub18d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8350\u52d3\ub8be\u9033\ub7dc\ub18d>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8350\u52d3\ub8be\u9033\ub7dc\ub18d>](\u51b2\u8413\u7c6b\uae5d\u4ab3\ua61f::\u51fa\u52d3\u839e\u5bc4\u7d52\u51fa)), getstatic:\u8350\u52d3\ub8be\u9033\ub7dc\ub18d(\u8350\u52d3\ub8be\u9033\ub7dc\ub18d::\u4179\u3bc9\u6c56\ucb79\u946b\ua3b4))) {
                    goto(Label_0207)
                }
                
                stack_109_0 = and:int[expected:boolean](ldc:int(4163), ldc:int(26625))
                return:boolean(stack_109_0:boolean)
            }
            
            Label_0108:
            
            if (cmpne:boolean(and:int(var_1_ED:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_ED = and:int(var_1_ED:int, ldc:int(-574018315))
                goto(Label_0207)
            }
            
            if (cmpeq:boolean(and:int(var_1_ED:int, ldc:int(512)), ldc:int(0))) {
                return:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\ubcb0\u946b\u16f6\uc910\u0a06\u156b)))
            }
            
            Label_0161:
            
            if (cmpne:boolean(and:int(var_1_ED:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_ED:int, ldc:int(4)), ldc:int(0))) {
                    return:boolean(xor:int[expected:boolean](ldc:int(4104), ldc:int(4105)))
                }
                
                goto(Label_0108)
            }
            
            Label_0207:
            
            if (cmpne:boolean(and:int(var_1_ED:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0161)
            }
            
            if (cmpne:boolean(and:int(var_1_ED:int, ldc:int(128)), ldc:int(0))) {
                var_1_ED = and:int(var_1_ED:int, ldc:int(-2077190538))
                goto(Label_0108)
            }
            
            var_1_ED = and:int(var_1_ED:int, ldc:int(-21054341))
            stack_109_0 = and:int[expected:boolean](ldc:int(-12636), ldc:int(8475))
            return:boolean(stack_109_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u7006\u983f\u183a\u97b7\ub6ab\uc229(\u5d20\u97b7\u8753\u873d\u16f6.\u718f\u624e\u6b0d\u6b0d\u446c p0) {
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
            return:boolean(invokespecial:boolean(\u718f\u624e\u6b0d\u6b0d\u446c::\u97b7\ud36e\u16f6\u5f50\u6d69\u7ce1, p0:\u718f\u624e\u6b0d\u6b0d\u446c))
        }
        
        goto(Label_0006)
    }
    
    public static void \u7330\u7043\u3776\uc9f6\u74b1\u8df4(\u5d20\u97b7\u8753\u873d\u16f6.\u718f\u624e\u6b0d\u6b0d\u446c p0) {
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
            invokespecial:void(\u718f\u624e\u6b0d\u6b0d\u446c::\ud4fe\u7d52\uf94d\uc7fe\uc4d2\u760c, p0:\u718f\u624e\u6b0d\u6b0d\u446c)
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
        var_3_607 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_612 : int
        
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
        var_3_607 = and:int(ldc:int(-1366449297), ldc:int(-1361449697))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\u624e\u6b0d\u6b0d\u446c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
            var_3_607 = and:int(var_3_607:int, ldc:int(-1067454160))
        }
        else {
            var_3_607 = and:int(var_3_607:int, ldc:int(-1186354005))
            var_5_89 = and:int(ldc:int(-31582), ldc:int(27416))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4832), ldc:int(-4833)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_607:int, ldc:int(1041759579))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(80), ldc:int(81)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(2160), ldc:int(2161)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_607 = and:int(var_3_E2:int, ldc:int(-1174293221))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(17431), ldc:int(2313)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1887006931))
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-358164422))
                    }
                    else {
                        var_3_607 = and:int(var_3_607:int, ldc:int(676050763))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0560)
                            }
                            
                            goto(Label_0803)
                        }
                    }
                    
                    Label_0398:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1720824724))
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1971087176))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1032439666))
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(416924493))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(1855714495))
                        var_11_F3 = and:int(ldc:int(21326), ldc:int(-32624))
                        goto(Label_1443)
                    }
                    
                    Label_0560:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1134130070))
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1490201176))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1300023795))
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(1057602943))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0803)
                        }
                    }
                    
                    Label_0673:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1071689916))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-668991390))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1300421728))
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1192449172))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1354388085))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0803:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-2112121950))
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-154011555))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(2118778411))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = xor:int(ldc:int(-16384), ldc:int(-16383))
                                goto(Label_1052)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1735684481))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0803)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(50201235))
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-17116493))
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1150573109))
                        var_11_F3 = and:int(ldc:int(25652), ldc:int(-26173))
                    }
                    
                    Label_1052:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1501988433))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(761812300))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1554201575))
                            goto(Label_0803)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0673)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(494538016))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(950135951))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1320)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(680642002))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1191281316))
                            goto(Label_1052)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(988433273))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(53297402))
                            goto(Label_0803)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1892672201))
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1379584879))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1829502219))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1443)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1320:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(942489623))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(2006911236))
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1771409206))
                        loopcontinue()
                    }
                    
                    var_3_607 = and:int(var_3_607:int, ldc:int(1048050495))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1443:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_612 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1454:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-953462832))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1045161195))
                        var_17_612 = add:int(var_16_121:int, and:int(ldc:int(8505), ldc:int(7)))
                        looporswitchbreak()
                    }
                    
                    var_3_607 = and:int(var_3_607:int, ldc:int(2134524347))
                }
                
                var_3_607 = and:int(var_3_607:int, ldc:int(2069888235))
                
                if (cmple:boolean(var_5_89 = var_17_612:int, sub:int(var_6_90:int, xor:int(ldc:int(523), ldc:int(522))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_607 = and:int(var_3_607:int, ldc:int(1613744705))
            goto(Label_0108)
        }
    }
}
