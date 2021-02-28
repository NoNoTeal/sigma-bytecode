public class \u56bd\u8413\u647c\u5bc4\ud158.\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255 {
    public void \u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255() {
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
            invokespecial:Object(Object::<init>, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255)
            putfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\ucfaf\u1187\u4c2b\u8350\u5f50\uc910>(\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255::\u9af2\u836c\u7af6\u946b\ub70c\u76bc, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255, initobject:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\ucfaf\u1187\u4c2b\u8350\u5f50\uc910>(\ub1b9\uae87\uae5d\ua068\u647c\uc84e<T>::<init>, ldc:int(32)))
            putfield:Map<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>>(\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255::\ub8be\u624e\ud523\u718f\ubb2b\ud12e, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255, invokestatic:HashMap[expected:Map<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>>](Maps::newHashMap))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255 \u8709\u516c\u600f\u99f7\ud523\u9af2() {
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
    
    public int \u3e75\u4d85\uc9f6\u4f4a\u9937\ub18d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_4_61 : int
        var_6_77 : \ucfaf\u1187\u4c2b\u8350\u5f50\uc910
        var_4_84 : int
        var_7_8C : \uc84e\u927d\u8258\u8d90\ub1b9\u4bc8
        stack_CF_0 : int [generated]
        
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
        var_4_61 = and:int(ldc:int(-2043740534), ldc:int(-406914881))
        var_6_77 = checkcast:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ucfaf\u1187\u4c2b\u8350\u5f50\uc910.class, invokevirtual:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910(\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\ucfaf\u1187\u4c2b\u8350\u5f50\uc910>::\ufe34\u6ec6\uceb8\uff55\u9033\ube23, getfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\ucfaf\u1187\u4c2b\u8350\u5f50\uc910>(\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255::\u9af2\u836c\u7af6\u946b\ub70c\u76bc, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255), invokevirtual:int(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ud217\u5d20\u52d3\u92ee\u446c\ube23, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))))
        
        if (cmpeq:boolean(var_6_77:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, aconstnull:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910())) {
            var_4_84 = and:int(var_4_61:int, ldc:int(-1766000209))
            var_7_8C = invokevirtual:\uc84e\u927d\u8258\u8d90\ub1b9\u4bc8(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8389\ub1b9\u47c2\u5245\uc238\ubded, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (cmpeq:boolean(var_7_8C:\uc84e\u927d\u8258\u8d90\ub1b9\u4bc8, aconstnull:\uc84e\u927d\u8258\u8d90\ub1b9\u4bc8())) {
                var_4_84 = and:int(var_4_84:int, ldc:int(-1351614805))
                stack_CF_0 = ldc:int(-1)
            }
            else {
                stack_CF_0 = getfield:int(\uc84e\u927d\u8258\u8d90\ub1b9\u4bc8::\u8413\u6bb9\u873d\uc29a\u1187\u527a, var_7_8C:\uc84e\u927d\u8258\u8d90\ub1b9\u4bc8)
            }
            
            return:int(stack_CF_0:int)
        }
        
        return:int(invokeinterface:int(\ucfaf\u1187\u4c2b\u8350\u5f50\uc910::\u67d0\ub1b9\u12cb\u51fa\u7043\u6b0d, var_6_77:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, checkcast:\u8bb0\u759a\u3bc9\u527a\ube23\u5140(\u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140.class, aconstnull:\u8bb0\u759a\u3bc9\u527a\ube23\u5140()), checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()), and:int(ldc:int(3746), ldc:int(-3751))))
    }
    
    public int \uc238\u5bc4\u7c6b\u40a9\ucfaf\u88c5(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_5_63 : int
        var_7_79 : \ucfaf\u1187\u4c2b\u8350\u5f50\uc910
        stack_A4_0 : int [generated]
        
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
            var_5_63 = and:int(ldc:int(1102012262), ldc:int(1099947962))
            var_7_79 = checkcast:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ucfaf\u1187\u4c2b\u8350\u5f50\uc910.class, invokevirtual:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910(\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\ucfaf\u1187\u4c2b\u8350\u5f50\uc910>::\ufe34\u6ec6\uceb8\uff55\u9033\ube23, getfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\ucfaf\u1187\u4c2b\u8350\u5f50\uc910>(\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255::\u9af2\u836c\u7af6\u946b\ub70c\u76bc, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255), invokevirtual:int(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ud217\u5d20\u52d3\u92ee\u446c\ube23, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))))
            
            if (cmpne:boolean(var_7_79:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, aconstnull:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910())) {
                var_5_63 = and:int(var_5_63:int, ldc:int(1603295039))
                stack_A4_0 = invokeinterface:int(\ucfaf\u1187\u4c2b\u8350\u5f50\uc910::\u67d0\ub1b9\u12cb\u51fa\u7043\u6b0d, var_7_79:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:int)
            }
            else {
                stack_A4_0 = ldc:int(-1)
            }
            
            return:int(stack_A4_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u156b\u12b2\u6ec6\ub70c\ud12e\uc238(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ucfaf\u1187\u4c2b\u8350\u5f50\uc910 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[] p1) {
        var_3_61 : int
        var_6_68 : int
        var_7_71 : int
        
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
            var_3_61 = and:int(ldc:int(-1104066408), ldc:int(-4316098))
            var_6_68 = arraylength:int(p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[])
            var_7_71 = and:int(ldc:int(6340), ldc:int(-6341))
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1082855171))
                
                if (cmpge:boolean(var_7_71:int, var_6_68:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\ucfaf\u1187\u4c2b\u8350\u5f50\uc910>::\u8258\u72f1\u3d4b\u183a\u1833\u3bd6, getfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\ucfaf\u1187\u4c2b\u8350\u5f50\uc910>(\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255::\u9af2\u836c\u7af6\u946b\ub70c\u76bc, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255), p0:\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, invokevirtual:int(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ud217\u5d20\u52d3\u92ee\u446c\ube23, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), loadelement:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[], var_7_71:int)))
                inc:int(var_7_71, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u59ec\ud4fe\ube23\u600f\u1187\ub19c(java.util.Set<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>> p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[] p1) {
        var_3_61 : int
        var_6_68 : int
        var_7_71 : int
        
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
            var_3_61 = and:int(ldc:int(768692891), ldc:int(1035948751))
            var_6_68 = arraylength:int(p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[])
            var_7_71 = and:int(ldc:int(26896), ldc:int(-26897))
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(98907799))
                
                if (cmpge:boolean(var_7_71:int, var_6_68:int)) {
                    looporswitchbreak()
                }
                
                invokeinterface:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(Map<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>>::put, getfield:Map<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>>(\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255::\ub8be\u624e\ud523\u718f\ubb2b\ud12e, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255), loadelement:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[], var_7_71:int), p0:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>)
                inc:int(var_7_71, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u97b7\ube23\u47c2\ud171\u4f4a\ud51e(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?> p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[] p1) {
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
            invokespecial:void(\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255::\u59ec\ud4fe\ube23\u600f\u1187\ub19c, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255, invokestatic:ImmutableSet[expected:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>](ImmutableSet::of, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[expected:Object]), p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>> \u839e\u839e\ucb79\u8640\u600f\u4179(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0) {
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
            return:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(checkcast:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(java.util.Set<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>.class, invokeinterface:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(Map<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>>::getOrDefault, getfield:Map<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>>(\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255::\ub8be\u624e\ud523\u718f\ubb2b\ud12e, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255), p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:Object], invokestatic:ImmutableSet[expected:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>](ImmutableSet::of))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u4492\u759a\ub113\ud36e\u183a\u759a$10(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_4_63 : int
        stack_91_0 : int [generated]
        
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
            var_4_63 = and:int(ldc:int(-295774393), ldc:int(-9474169))
            
            if (logicaland:boolean(cmpne:boolean(p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, aconstnull:\u8bb0\u759a\u3bc9\u527a\ube23\u5140()), cmpne:boolean(p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))) {
                stack_91_0 = ldc:int(2129968)
            }
            else {
                var_4_63 = and:int(var_4_63:int, ldc:int(2118600454))
                stack_91_0 = ldc:int(7455580)
            }
            
            return:int(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ua3b4\ub70c\u51fa\u960f\u759a\u5245$9(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_6_72 : int
        
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
            var_6_72 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Integer>](\u760c\u7330\u71f1\u4bc8\u392e\u4d85::\u16f6\u3711\uae5d\uc910\u6d99\u5db4))))
            return:int(or:int(or:int(shl:int(mul:int(var_6_72:int, ldc:int(32)), ldc:int(16)), shl:int(sub:int(xor:int(ldc:int(12316), ldc:int(12515)), mul:int(var_6_72:int, ldc:int(8))), ldc:int(8))), mul:int(var_6_72:int, and:int(ldc:int(2228), ldc:int(4684)))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6cfe\u8c8a\ub18d\u3dd3\uc4d2\u16f6$8(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
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
            return:int(ldc:int(14731036))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uafe7\u946b\u6cfe\ub1b9\u718f\ubded$7(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_4_63 : int
        stack_91_0 : int [generated]
        
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
            var_4_63 = and:int(ldc:int(-1126344648), ldc:int(-1401075650))
            
            if (logicaland:boolean(cmpne:boolean(p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, aconstnull:\u8bb0\u759a\u3bc9\u527a\ube23\u5140()), cmpne:boolean(p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))) {
                stack_91_0 = invokestatic:int(\uafe7\uc246\ud7e8\u8350\u0c95::\u0b8e\u6d99\u8bb0\u3d64\u3a62\u6ec6, p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            else {
                var_4_63 = and:int(var_4_63:int, ldc:int(-736142785))
                stack_91_0 = ldc:int(-1)
            }
            
            return:int(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub171\uc87f\u12cb\u3bd6\u34df\ub83f$6(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
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
            return:int(invokestatic:int(\u8308\ube23\u4cd9\ucef1\uceb8\u98a4::\u5bc4\u385b\u1833\u72f1\u12b2\u40a9, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Integer>](\u8308\ube23\u4cd9\ucef1\uceb8\u98a4::\uf94d\u071d\u960f\u76bc\u3bc9\u2dcc))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ud7e8\u40a9\u873d\u40a9\u8d90\u9937$5(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_4_63 : int
        stack_91_0 : int [generated]
        
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
            var_4_63 = and:int(ldc:int(-1304402884), ldc:int(-293686530))
            
            if (logicaland:boolean(cmpne:boolean(p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, aconstnull:\u8bb0\u759a\u3bc9\u527a\ube23\u5140()), cmpne:boolean(p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))) {
                stack_91_0 = invokestatic:int(\uafe7\uc246\ud7e8\u8350\u0c95::\u7006\u9a18\ub8be\ud171\ua068\u3c25, p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            else {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1218730886))
                stack_91_0 = ldc:int(-1)
            }
            
            return:int(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u8389\ub32d\u3711\uf9c5\u183a\u6ec6$4(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_4_63 : int
        stack_93_0 : int [generated]
        
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
            var_4_63 = and:int(ldc:int(-1331948199), ldc:int(-1109430465))
            
            if (logicaland:boolean(cmpne:boolean(p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, aconstnull:\u8bb0\u759a\u3bc9\u527a\ube23\u5140()), cmpne:boolean(p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))) {
                stack_93_0 = invokestatic:int(\uafe7\uc246\ud7e8\u8350\u0c95::\u3e75\u7330\u98a4\u7330\u36d3\u392e, p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            else {
                var_4_63 = and:int(var_4_63:int, ldc:int(-648471211))
                stack_93_0 = invokestatic:int(\u718f\u4179\u7e3f\ub113\ud51e\u8413::\u56bd\ub7dc\uc4d2\u64f2\uc4d2\u385b)
            }
            
            return:int(stack_93_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u56bd\uc910\ubded\u88c5\u8640\ube23$3(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
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
            return:int(invokestatic:int(\u718f\u4179\u7e3f\ub113\ud51e\u8413::\u7043\uc84e\u7330\ub1b9\u36d3\u7e3f))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u759a\u7bad\u8c8a\u64f2\uc9f6\uc84e$2(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
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
            return:int(invokestatic:int(\u718f\u4179\u7e3f\ub113\ud51e\u8413::\u873d\u4cd9\u5654\u8d90\u4c2b\u516c))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub171\u3bc9\u392e\u69d9\u47c2\ufe34$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_4_63 : int
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
            var_4_63 = and:int(ldc:int(-1545682957), ldc:int(752204084))
            
            if (logicaland:boolean(cmpne:boolean(p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, aconstnull:\u8bb0\u759a\u3bc9\u527a\ube23\u5140()), cmpne:boolean(p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))) {
                stack_97_0 = invokestatic:int(\uafe7\uc246\ud7e8\u8350\u0c95::\u0b8e\u6d99\u8bb0\u3d64\u3a62\u6ec6, p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            else {
                var_4_63 = and:int(var_4_63:int, ldc:int(-151651654))
                stack_97_0 = invokestatic:int(\ubefe\u927d\u3a62\ufe34\u12b2\u0800::\u416d\uc229\u4f4a\u6d99\u3776\uc7fe, ldc:double(0.5), ldc:double(1.0))
            }
            
            return:int(stack_97_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3d4b\u7043\u64f2\u9af2\uafe7\u5d20$0(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_4_63 : int
        stack_AE_1 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 [generated]
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
            var_4_63 = and:int(ldc:int(-577926643), ldc:int(-2119025))
            
            if (logicaland:boolean(cmpne:boolean(p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, aconstnull:\u8bb0\u759a\u3bc9\u527a\ube23\u5140()), cmpne:boolean(p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))) {
                if (cmpne:boolean(invokevirtual:\u8350\u52d3\ub8be\u9033\ub7dc\ub18d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8350\u52d3\ub8be\u9033\ub7dc\ub18d>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8350\u52d3\ub8be\u9033\ub7dc\ub18d>](\u51b2\u8413\u7c6b\uae5d\u4ab3\ua61f::\u51fa\u52d3\u839e\u5bc4\u7d52\u51fa)), getstatic:\u8350\u52d3\ub8be\u9033\ub7dc\ub18d(\u8350\u52d3\ub8be\u9033\ub7dc\ub18d::\u4179\u3bc9\u6c56\ucb79\u946b\ua3b4))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-542526385))
                    stack_AE_1 = p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
                }
                else {
                    stack_AE_1 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                }
                
                stack_B9_0 = invokestatic:int(\uafe7\uc246\ud7e8\u8350\u0c95::\u0b8e\u6d99\u8bb0\u3d64\u3a62\u6ec6, p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, stack_AE_1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            else {
                stack_B9_0 = ldc:int(-1)
            }
            
            return:int(stack_B9_0:int)
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
    
    public void \u3dd3\u7006\uafe7\u647c\u5f50\u4f52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BC : int
        
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
        var_3_6B1 = and:int(ldc:int(-371534943), ldc:int(-607717406))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-75511911))
            var_5_81 = and:int(ldc:int(-10058), ldc:int(9032))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27371), ldc:int(10952)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B1:int, ldc:int(-112993305))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(2193), ldc:int(2192)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(136), ldc:int(137)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_DA:int, ldc:int(-109880860))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(288), ldc:int(289)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1978238241))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1013820994))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-142401263))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-916263477))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1230216780))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-976537695))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1356556068))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-339578997))
                        var_11_EB = and:int(ldc:int(-28469), ldc:int(25908))
                        goto(Label_1571)
                    }
                    
                    Label_0559:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(819631022))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-578270970))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1193498720))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-873381484))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-414881413))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-8985642))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(841428087))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(476792155))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1571981671))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1678662257))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-746987528))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1419068994))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-640688156))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-438507344))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(987573296))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-480925579))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(36249825))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1577669306))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-347419705))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(288), ldc:int(289))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1399984161))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1919778687))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1906237612))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1889132147))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-824412))
                        var_11_EB = and:int(ldc:int(5816), ldc:int(-5821))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1317791019))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(924619488))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1708064462))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-137411944))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1533180016))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1239717342))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-112303142))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-401199603))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-844096005))
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-991382587))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1216973358))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1094893689))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-817104495))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1571)
                    }
                    
                    Label_1425:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-197341975))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1635982655))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1141520907))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(411309314))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-718959217))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-615284811))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-750818923))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-467005916))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-811808595))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-557214902))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1128955017))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-10038373))
                        var_17_6BC = add:int(var_16_119:int, xor:int(ldc:int(4227), ldc:int(4226)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(202592497))
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-338963487))
                
                if (cmple:boolean(var_5_81 = var_17_6BC:int, sub:int(var_6_88:int, and:int(ldc:int(16435), ldc:int(13057))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1389381009))
            goto(Label_0108)
        }
    }
}
