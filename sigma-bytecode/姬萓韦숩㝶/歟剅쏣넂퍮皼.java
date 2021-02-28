public class \u59ec\u8413\u97e6\uc229\u3776.\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T> {
    public void \u946b\u8640\ub32d\u59ec\uc4d2\u965f() {
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
    
    public void \ufcaf\uc910\ub18d\u72f1\u718f\u120d() {
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
            invokevirtual:void(ReentrantLock::unlock, getfield:ReentrantLock(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u88c5\u62da\u0c95\u93a2\u61a4\u40a9, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6b5f\u5245\uc3e3\ub102\ud36e\u76bc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T> p0, \u5d20\u7043\u88c5\u5db4\uf94d.\ub1b9\uae87\uae5d\ua068\u647c\uc84e<T> p1, java.util.function.Function<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc, T> p2, java.util.function.Function<T, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> p3, T p4) {
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
    
    private static int \u1187\uc4d2\u3d64\u5db4\ub32d\u9af2(int p0, int p1, int p2) {
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
            return:int(or:int(or:int(shl:int(p1:int, ldc:int(8)), shl:int(p2:int, xor:int(ldc:int(17413), ldc:int(17409)))), p0:int))
        }
        
        goto(Label_0006)
    }
    
    private void \u16f6\u52d3\u99f7\u7af6\ud523\u4bc8(int p0) {
        var_2_D1 : int
        
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
            var_2_D1 = and:int(ldc:int(89130695), ldc:int(-716520722))
            
            if (cmpne:boolean(p0:int, getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))) {
                putfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, p0:int)
                
                if (cmpgt:boolean(getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), xor:int(ldc:int(3331), ldc:int(3335)))) {
                    goto(Label_0147)
                }
                
                putfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, and:int(ldc:int(262), ldc:int(12)))
                putfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, initobject:\u8753\u9255\ub70c\ud171\u4f52\ua61f<T>[expected:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>](\u8753\u9255\ub70c\ud171\u4f52\ua61f<T>::<init>, getfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u760c\ufe34\u36d3\u6d69\u4daf\uc238, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>[expected:\u759a\ube23\u8c8a\ub6ab\u3776\u6b5f<T>], getfield:Function<\uc31c\uc87f\uc246\u3776\ub7dc, T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u3e75\uc9f6\uc29a\u6b5f\u8709\ua3b4, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)))
                goto(Label_0309)
            }
            
            Label_0104:
            
            if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0183)
            }
            
            if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                return:void()
            }
            
            Label_0147:
            
            if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(256)), ldc:int(0))) {
                var_2_D1 = and:int(var_2_D1:int, ldc:int(1454365925))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0104)
                }
                
                var_2_D1 = and:int(var_2_D1:int, ldc:int(356877790))
                
                if (cmplt:boolean(getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), ldc:int(9))) {
                    putfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, initobject:\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>[expected:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>](\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>::<init>, getfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u760c\ufe34\u36d3\u6d69\u4daf\uc238, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>[expected:\u759a\ube23\u8c8a\ub6ab\u3776\u6b5f<T>], getfield:Function<\uc31c\uc87f\uc246\u3776\ub7dc, T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u3e75\uc9f6\uc29a\u6b5f\u8709\ua3b4, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:Function<T, \uc31c\uc87f\uc246\u3776\ub7dc>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u6fb0\ud4fe\u120d\u759a\u4c04\ub70c, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)))
                    goto(Label_0309)
                }
            }
            
            Label_0183:
            
            if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(131072)), ldc:int(0))) {
                var_2_D1 = and:int(var_2_D1:int, ldc:int(-441959839))
                goto(Label_0147)
            }
            
            if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0104)
            }
            
            var_2_D1 = and:int(var_2_D1:int, ldc:int(1978597102))
            putfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ud158\u67e9\uc910\ubefe\u8389\u3504, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))
            putfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ud158\ub32d\u6ec6\uf995\uc87f\u6435, invokevirtual:int(\ub1b9\uae87\uae5d\ua068\u647c\uc84e<T>::\u8bb0\u3d64\uc7fe\u67e9\u4179\u5f50, getfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u760c\ufe34\u36d3\u6d69\u4daf\uc238, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))))
            Label_0309:
            var_2_D1 = and:int(var_2_D1:int, ldc:int(-572525602))
            invokeinterface:int(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\uceb8\u47c2\u67e9\u71f1\u446c\u34df, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:T(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u9033\ua61f\u7006\u6c56\uc31c\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))
            putfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, initobject:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::<init>, getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), xor:int(ldc:int(9336), ldc:int(13432))))
            goto(Label_0104)
        }
        
        goto(Label_0006)
    }
    
    public int \u9255\u983f\u3a62\u52d3\u8c8a\ucb79(int p0, T p1) {
        var_3_61 : int
        var_5_6A : \ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25
        var_6_70 : \u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>
        var_7_7E : int
        var_8_D4 : T
        var_7_B9 : int
        
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
            var_3_61 = and:int(ldc:int(-305022762), ldc:int(-1344816290))
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u946b\u8640\ub32d\u59ec\uc4d2\u965f, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            var_5_6A = getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            var_6_70 = getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            invokespecial:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u16f6\u52d3\u99f7\u7af6\ud523\u4bc8, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, p0:int)
            var_7_7E = and:int(ldc:int(-15498), ldc:int(15497))
            
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1702247710))
                }
                else {
                    var_3_61 = and:int(var_3_61:int, ldc:int(2039610751))
                    
                    if (cmplt:boolean(var_7_7E:int, invokevirtual:int(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ube23\uae87\ubefe\u9033\u8753\u839e, var_5_6A:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25))) {
                        var_8_D4 = invokeinterface:T(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\u8709\u93a2\u6b0d\uc246\u718f\u8413, var_6_70:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>, invokevirtual:int(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ub113\u6b0d\u67e9\u446c\ucef1\uc229, var_5_6A:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25, var_7_7E:int))
                        
                        if (cmpne:boolean(var_8_D4:T, aconstnull:T())) {
                            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u6b5f\ufe34\u8413\ud523\uc87f\uf995, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, var_7_7E:int, var_8_D4:T)
                        }
                        
                        var_3_61 = and:int(var_3_61:int, ldc:int(-33837954))
                        inc:int(var_7_7E, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_7_B9 = invokeinterface:int(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\uceb8\u47c2\u67e9\u71f1\u446c\u34df, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p1:T)
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\ufcaf\uc910\ub18d\u72f1\u718f\u120d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            return:int(var_7_B9:int)
        }
        
        goto(Label_0006)
    }
    
    public T \ubefe\u873d\u64ab\u624e\u946b\ud7e8(int p0, int p1, int p2, T p3) {
        var_7_75 : Object
        
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
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u946b\u8640\ub32d\u59ec\uc4d2\u965f, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            var_7_75 = invokevirtual:Object(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<Object>::\u34df\u69d9\u6ec6\u7e3f\ua61f\u3dd3, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, invokestatic:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u1187\uc4d2\u3d64\u5db4\ub32d\u9af2, p0:int, p1:int, p2:int), p3:T[expected:Object])
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\ufcaf\uc910\ub18d\u72f1\u718f\u120d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            return:T(var_7_75:Object)
        }
        
        goto(Label_0006)
    }
    
    public T \u516c\u8258\u12cb\u3e2a\u5db4\ud51e(int p0, int p1, int p2, T p3) {
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
            return:T(invokevirtual:T(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u34df\u69d9\u6ec6\u7e3f\ua61f\u3dd3, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, invokestatic:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u1187\uc4d2\u3d64\u5db4\ub32d\u9af2, p0:int, p1:int, p2:int), p3:T))
        }
        
        goto(Label_0006)
    }
    
    public T \u34df\u69d9\u6ec6\u7e3f\ua61f\u3dd3(int p0, T p1) {
        var_3_61 : int
        var_7_85 : T
        stack_A5_0 : T [generated]
        
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
            var_3_61 = and:int(ldc:int(1301560184), ldc:int(-578905224))
            var_7_85 = invokeinterface:T(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\u8709\u93a2\u6b0d\uc246\u718f\u8413, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), invokevirtual:int(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\u8df4\u34df\ubff1\u8389\u97b7\u446c, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p0:int, invokeinterface:int(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\uceb8\u47c2\u67e9\u71f1\u446c\u34df, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p1:T)))
            
            if (cmpne:boolean(var_7_85:T, aconstnull:T())) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1137656868))
                stack_A5_0 = var_7_85:T
            }
            else {
                stack_A5_0 = getfield:T(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u9033\ua61f\u7006\u6c56\uc31c\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            }
            
            return:T(stack_A5_0:T)
        }
        
        goto(Label_0006)
    }
    
    public void \u6b5f\ufe34\u8413\ud523\uc87f\uf995(int p0, T p1) {
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
            invokevirtual:void(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ua562\ucfaf\u9033\u4cd9\u64f2\u52d3, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p0:int, invokeinterface:int(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\uceb8\u47c2\u67e9\u71f1\u446c\u34df, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p1:T))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T \u6ec6\u47c2\u0c95\ucfaf\uf94d\uae87(int p0, int p1, int p2) {
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
            return:T(invokevirtual:T(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u6ec6\u47c2\u0c95\ucfaf\uf94d\uae87, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, invokestatic:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u1187\uc4d2\u3d64\u5db4\ub32d\u9af2, p0:int, p1:int, p2:int)))
        }
        
        goto(Label_0006)
    }
    
    public T \u6ec6\u47c2\u0c95\ucfaf\uf94d\uae87(int p0) {
        var_2_61 : int
        var_4_73 : T
        stack_93_0 : T [generated]
        
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
            var_2_61 = and:int(ldc:int(-195663043), ldc:int(-1672004993))
            var_4_73 = invokeinterface:T(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\u8709\u93a2\u6b0d\uc246\u718f\u8413, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), invokevirtual:int(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ub113\u6b0d\u67e9\u446c\ucef1\uc229, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p0:int))
            
            if (cmpne:boolean(var_4_73:T, aconstnull:T())) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-28886081))
                stack_93_0 = var_4_73:T
            }
            else {
                stack_93_0 = getfield:T(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u9033\ua61f\u7006\u6c56\uc31c\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            }
            
            return:T(stack_93_0:T)
        }
        
        goto(Label_0006)
    }
    
    public void \ufcaf\u8389\u7e3f\u5db4\ud4fe\u7873(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_4_6A : byte
        
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
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u946b\u8640\ub32d\u59ec\uc4d2\u965f, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            var_4_6A = invokevirtual:byte(\u98a4\uafe7\uc3e3\ua6bd\u8640::readByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            
            if (cmpne:boolean(getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), var_4_6A:byte[expected:int])) {
                invokespecial:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u16f6\u52d3\u99f7\u7af6\ud523\u4bc8, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, var_4_6A:byte[expected:int])
            }
            
            invokeinterface:void(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\uceb8\u416d\u4e72\u7330\u5f50\u7e3f, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            invokevirtual:long[](\u98a4\uafe7\uc3e3\ua6bd\u8640::\uc31c\u6435\uc31c\u7873\ub83f\u5f50, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:long[](\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ud217\u3d64\u61a4\u7d52\u0c95\ua3b4, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)))
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\ufcaf\uc910\ub18d\u72f1\u718f\u120d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua61f\u156b\uceb8\u99f7\ub32d\u62da(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u946b\u8640\ub32d\u59ec\uc4d2\u965f, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))
            invokeinterface:void(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\u3c25\u3776\u6198\uc31c\u8df4\ucb79, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\ubf56\uc2bd\u8aa5\u4d85\ub19c\u71f1, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:long[](\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ud217\u3d64\u61a4\u7d52\u0c95\ua3b4, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)))
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\ufcaf\uc910\ub18d\u72f1\u718f\u120d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc9f6\ub113\u4ab3\ua3b4\u0b8e\u7d52(\u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e p0, long[] p1) {
        var_3_61 : int
        var_5_77 : int
        var_3_D9 : int
        var_6_9F : int
        var_7_EB : \ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25
        var_8_F4 : int
        var_7_123 : \u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>
        var_8_13E : \ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25
        var_9_147 : int
        
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
            var_3_61 = and:int(ldc:int(-1600489503), ldc:int(-522274905))
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u946b\u8640\ub32d\u59ec\uc4d2\u965f, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            var_5_77 = invokestatic:int(Math::max, and:int(ldc:int(1541), ldc:int(2444)), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ud158\ub32d\u6ec6\uf995\uc87f\u6435, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, p0:\ud158\u8308\u76bc\u0a06\ud36e)))
            
            if (cmpne:boolean(var_5_77:int, getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))) {
                invokespecial:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u16f6\u52d3\u99f7\u7af6\ud523\u4bc8, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, var_5_77:int)
            }
            
            var_3_D9 = and:int(var_3_61:int, ldc:int(-1076707401))
            invokeinterface:void(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\uceb8\u416d\u4e72\u7330\u5f50\u7e3f, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p0:\ud158\u8308\u76bc\u0a06\ud36e)
            var_6_9F = div:int(mul:int(arraylength:int(p1:long[]), ldc:int(64)), xor:int(ldc:int(1433), ldc:int(5529)))
            
            if (cmpne:boolean(getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ud158\u67e9\uc910\ubefe\u8389\u3504, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))) {
                loop {
                    if (cmpeq:boolean(and:int(var_3_D9:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_D9 = and:int(var_3_D9:int, ldc:int(-253904907))
                        
                        if (cmpeq:boolean(var_6_9F:int, getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))) {
                            invokestatic:void(System::arraycopy, p1:long[][expected:Object], and:int(ldc:int(-6030), ldc:int(1797)), invokevirtual:long[][expected:Object](\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ud217\u3d64\u61a4\u7d52\u0c95\ua3b4, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)), and:int(ldc:int(27408), ldc:int(-27637)), arraylength:int(p1:long[]))
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_3_D9:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_D9 = and:int(var_3_D9:int, ldc:int(1020721083))
                        var_7_EB = initobject:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::<init>, var_6_9F:int, and:int(ldc:int(7272), ldc:int(29315)), p1:long[])
                        var_8_F4 = and:int(ldc:int(-24143), ldc:int(17934))
                        
                        while (cmplt:boolean(var_8_F4:int, and:int(ldc:int(14354), ldc:int(21197)))) {
                            invokevirtual:void(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ua562\ucfaf\u9033\u4cd9\u64f2\u52d3, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), var_8_F4:int, invokevirtual:int(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ub113\u6b0d\u67e9\u446c\ucef1\uc229, var_7_EB:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25, var_8_F4:int))
                            inc:int(var_8_F4, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_3_D9 = and:int(var_3_D9:int, ldc:int(1228356498))
                }
            }
            else {
                var_7_123 = initobject:\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>(\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>::<init>, getfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u760c\ufe34\u36d3\u6d69\u4daf\uc238, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), var_5_77:int, getfield:\u759a\ube23\u8c8a\ub6ab\u3776\u6b5f<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u600f\ubb2b\u62da\u516c\u7873\ube23, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:Function<\uc31c\uc87f\uc246\u3776\ub7dc, T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u3e75\uc9f6\uc29a\u6b5f\u8709\ua3b4, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:Function<T, \uc31c\uc87f\uc246\u3776\ub7dc>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u6fb0\ud4fe\u120d\u759a\u4c04\ub70c, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))
                invokeinterface:void(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198::\uceb8\u416d\u4e72\u7330\u5f50\u7e3f, var_7_123:\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b[expected:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>], p0:\ud158\u8308\u76bc\u0a06\ud36e)
                var_8_13E = initobject:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::<init>, var_5_77:int, and:int(ldc:int(21677), ldc:int(15104)), p1:long[])
                var_9_147 = and:int(ldc:int(8540), ldc:int(-8541))
                
                loop {
                    if (cmpne:boolean(and:int(var_3_D9:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_D9 = and:int(var_3_D9:int, ldc:int(827848620))
                    }
                    else {
                        var_3_D9 = and:int(var_3_D9:int, ldc:int(599064557))
                        
                        if (cmplt:boolean(var_9_147:int, xor:int(ldc:int(-5626), ldc:int(-1530)))) {
                            invokevirtual:void(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ua562\ucfaf\u9033\u4cd9\u64f2\u52d3, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), var_9_147:int, invokeinterface:int(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\uceb8\u47c2\u67e9\u71f1\u446c\u34df, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ud158\u67e9\uc910\ubefe\u8389\u3504, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), invokeinterface:Object(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<Object>::\u8709\u93a2\u6b0d\uc246\u718f\u8413, var_7_123:\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<Object>[expected:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<Object>], invokevirtual:int(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ub113\u6b0d\u67e9\u446c\ucef1\uc229, var_8_13E:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25, var_9_147:int))))
                            inc:int(var_9_147, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_3_D9:int, ldc:int(256)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_3_D9 = and:int(var_3_D9:int, ldc:int(855637933))
            }
            
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\ufcaf\uc910\ub18d\u72f1\u718f\u120d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u51b2\u3504\u5bc4\u8d90\u9937\u8c8a(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, java.lang.String p1, java.lang.String p2) {
        var_4_63 : int
        var_6_84 : \u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>
        var_7_8A : T
        var_8_95 : int
        var_9_A0 : int[]
        var_10_A9 : int
        var_11_137 : T
        var_10_EA : \ud158\u8308\u76bc\u0a06\ud36e
        var_12_11F : \ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25
        var_13_128 : int
        
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
            var_4_63 = and:int(ldc:int(2105297745), ldc:int(-144039977))
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u946b\u8640\ub32d\u59ec\uc4d2\u965f, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            var_6_84 = initobject:\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>(\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>::<init>, getfield:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u760c\ufe34\u36d3\u6d69\u4daf\uc238, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:int(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u0800\uc4d2\u647c\uf94d\u1833\uf94d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:\u759a\ube23\u8c8a\ub6ab\u3776\u6b5f<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u600f\ubb2b\u62da\u516c\u7873\ube23, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:Function<\uc31c\uc87f\uc246\u3776\ub7dc, T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u3e75\uc9f6\uc29a\u6b5f\u8709\ua3b4, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), getfield:Function<T, \uc31c\uc87f\uc246\u3776\ub7dc>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u6fb0\ud4fe\u120d\u759a\u4c04\ub70c, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))
            var_7_8A = getfield:T(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u9033\ua61f\u7006\u6c56\uc31c\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            var_8_95 = invokevirtual:int(\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>::\uceb8\u47c2\u67e9\u71f1\u446c\u34df, var_6_84:\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>, getfield:T(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u9033\ua61f\u7006\u6c56\uc31c\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))
            var_9_A0 = newarray:int[](int.class, xor:int(ldc:int(-30678), ldc:int(-26582)))
            var_10_A9 = and:int(ldc:int(-12969), ldc:int(8872))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-2125682746))
                }
                else {
                    var_4_63 = and:int(var_4_63:int, ldc:int(334124889))
                    
                    if (cmplt:boolean(var_10_A9:int, and:int(ldc:int(4354), ldc:int(5313)))) {
                        var_11_137 = invokevirtual:T(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\u6ec6\u47c2\u0c95\ucfaf\uf94d\uae87, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>, var_10_A9:int)
                        
                        if (cmpne:boolean(var_11_137:T, var_7_8A:T)) {
                            var_7_8A = var_11_137:T
                            var_8_95 = invokevirtual:int(\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>::\uceb8\u47c2\u67e9\u71f1\u446c\u34df, var_6_84:\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>, var_11_137:T)
                        }
                        
                        var_4_63 = and:int(var_4_63:int, ldc:int(967725943))
                        storeelement:int(var_9_A0:int[], var_10_A9:int, var_8_95:int)
                        inc:int(var_10_A9, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_10_EA = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
            invokevirtual:void(\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>::\u8d90\ua61f\u3e75\u9033\ud171\u5f50, var_6_84:\u494c\u69d9\u4d85\u392e\uc3e3\ubb2b<T>, var_10_EA:\ud158\u8308\u76bc\u0a06\ud36e)
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, p1:String, var_10_EA:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            var_12_11F = initobject:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::<init>, invokestatic:int(Math::max, xor:int(ldc:int(17600), ldc:int(17604)), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ud158\ub32d\u6ec6\uf995\uc87f\u6435, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, var_10_EA:\ud158\u8308\u76bc\u0a06\ud36e))), xor:int(ldc:int(3384), ldc:int(7480)))
            var_13_128 = and:int(ldc:int(15892), ldc:int(-15957))
            
            while (cmplt:boolean(var_13_128:int, arraylength:int(var_9_A0:int[]))) {
                invokevirtual:void(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ua562\ucfaf\u9033\u4cd9\u64f2\u52d3, var_12_11F:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25, var_13_128:int, loadelement:int(var_9_A0:int[], var_13_128:int))
                inc:int(var_13_128, ldc:int(1))
            }
            
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u392e\u4179\u5f50\u9af2\ubb2b\u40a9, p0:\uc31c\uc87f\uc246\u3776\ub7dc, p2:String, invokevirtual:long[](\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ud217\u3d64\u61a4\u7d52\u0c95\ua3b4, var_12_11F:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25))
            invokevirtual:void(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>::\ufcaf\uc910\ub18d\u72f1\u718f\u120d, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u36d3\u64ab\u1833\u946b\u62da\u8308() {
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
            return:int(add:int(add:int(add:int(xor:int(ldc:boolean(0), ldc:boolean(1)), invokeinterface:int(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\u62da\u4f4a\u3a62\u99f7\uc229\ua562, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))), invokestatic:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u40a9\ua562\ud523\u1833\ud4fe\u4c2b, invokevirtual:int(\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ube23\uae87\ubefe\u9033\u8753\u839e, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>)))), mul:int(arraylength:int(invokevirtual:long[](\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25::\ud217\u3d64\u61a4\u7d52\u0c95\ua3b4, getfield:\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\ua068\u97b7\ub7dc\u71f1\u7873\u9af2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>))), ldc:int(8))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3776\u5f50\uf94d\ubded\uc238\u120d(java.util.function.Predicate<T> p0) {
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
            return:boolean(invokeinterface:boolean(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\u62da\uc7fe\u647c\ud12e\u71ae\u3d4b, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), p0:Predicate<T>))
        }
        
        goto(Label_0006)
    }
    
    public void \uc7fe\u385b\u3c25\u92ee\uc910\u3e2a(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6198\u3d4b\u960f\u3711\u9937\u7049<T> p0) {
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
    
    private void lambda$\u8413\uc84e\ub18d\u385b\u8709\ua562$3(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6198\u3d4b\u960f\u3711\u9937\u7049 p0, it.unimi.dsi.fastutil.ints.Int2IntMap$Entry p1) {
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
            invokeinterface:void(\u6198\u3d4b\u960f\u3711\u9937\u7049<T>::\u4d85\ub171\u7049\u983f\u36d3\uc910, p0:\u6198\u3d4b\u960f\u3711\u9937\u7049<T>, invokeinterface:T(\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>::\u8709\u93a2\u6b0d\uc246\u718f\u8413, getfield:\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198<T>(\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u7c6b\u5bc4\u64ab\u4492\ud171\u3776, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>), invokeinterface:int(Int2IntMap$Entry::getIntKey, p1:Int2IntMap$Entry)), invokeinterface:int(Int2IntMap$Entry::getIntValue, p1:Int2IntMap$Entry))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u5245\u392e\u67d0\u7043\u4d85\u36d3$2(it.unimi.dsi.fastutil.ints.Int2IntMap p0, int p1) {
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
            invokeinterface:int(Int2IntMap::put, p0:Int2IntMap, p1:int, add:int(invokeinterface:int(Int2IntMap::get, p0:Int2IntMap, p1:int), and:int(ldc:int(2129), ldc:int(16905))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u071d\ua61f\ud36e\u51b2\u647c\u960f$1(java.lang.Thread p0) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(Thread::getName, p0:Thread)), loadelement:String(getstatic:String[](\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u4e72\ub1b9\uae5d\u760c\ud12e\ub19c), and:int(ldc:int(13839), ldc:int(323)))), checkcast:String(java.lang.String.class, invokeinterface:String(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<StackTraceElement>::map, invokestatic:Stream<StackTraceElement>(Arrays::stream, invokevirtual:StackTraceElement[](Thread::getStackTrace, p0:Thread)), invokedynamic:Function<? super StackTraceElement, String>(apply:()Ljava/util/function/Function;)), invokestatic:Collector<CharSequence, ?, String>(Collectors::joining, loadelement:String[expected:CharSequence](getstatic:String[](\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u4e72\ub1b9\uae5d\u760c\ud12e\ub19c), xor:int(ldc:int(1542), ldc:int(1538)))))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3a62\u7330\ub171\u624e\u760c\u47c2$0(int p0, java.lang.Object p1) {
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
            return:int(and:int(ldc:int(27682), ldc:int(-28204)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_A8 : int
        expr_6E : int [generated]
        stack_92_0 : byte[] [generated]
        stack_94_0 : byte[] [generated]
        stack_BC_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_1BD_0 : byte[] [generated]
        stack_214_0 : byte[] [generated]
        stack_271_0 : byte[] [generated]
        var_4_19E : int
        var_3_1A3 : byte[]
        var_5_1A4 : int
        expr_1BD : byte [generated]
        var_0_267 : int
        expr_271 : byte [generated]
        stack_2A1_2 : byte [generated]
        var_2_92 : byte[]
        expr_96 : int [generated]
        var_3_202 : byte[]
        var_5_203 : int
        expr_BE : int [generated]
        var_3_F8 : String
        stack_197_0 : String[] [generated]
        expr_10A : String[] [generated]
        
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
        var_0_A8 = and:int(ldc:int(-901237155), ldc:int(-272334981))
        expr_6E = arraylength:int(stack_92_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_EC_0 = stack_1BD_0 = stack_214_0 = stack_271_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("mvMgkbGS3Sr7IJEevx+SVp6Rnv+qZrIynsKGkmqSRYbXpoIpCovqjr7eTlYapiOyRn7aZo5tTs+mZkGW/5aenmaOfknes5qSVp7CFdSe")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_19E = expr_6E:int
        var_3_1A3 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1A4 = expr_6E:int
        Label_0422:
        
        while (cmpne:boolean(and:int(var_0_A8:int, ldc:int(4096)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(-401475775))
            var_5_1A4 = add:int(var_5_1A4:int, ldc:int(-1))
            expr_1BD = loadelement:byte(stack_1BD_0:byte[], var_5_1A4:int)
            storeelement:byte(var_3_1A3:byte[], var_5_1A4:int, add:int(xor:int(or:int(and:int(shl:int(expr_1BD:byte, and:int(ldc:int(13316), ldc:int(19212))), ldc:int(-16)), and:int(shr:int(expr_1BD:byte[expected:int], and:int(ldc:int(21), ldc:int(3140))), ldc:int(15))), ldc:int(30)), ldc:int(73)))
            
            if (cmpne:boolean(var_5_1A4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_94_0 = stack_92_0 = stack_BC_0 = stack_BE_0 = stack_EC_0 = stack_1BD_0 = stack_214_0 = stack_271_0 = var_3_1A3:byte[]
            goto(Label_0115)
        }
        
        Label_0603:
        
        while (cmpne:boolean(and:int(var_0_A8:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_267 = and:int(var_0_A8:int, ldc:int(2104817395))
            var_5_1A4 = add:int(var_5_1A4:int, ldc:int(-1))
            expr_271 = loadelement:byte(stack_271_0:byte[], var_5_1A4:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1A4:int, ldc:int(2)), neg:int(var_4_19E:int)), ldc:int(0))) {
                var_0_267 = and:int(var_0_267:int, ldc:int(1797518966))
                stack_2A1_2 = add:byte(expr_271:byte, ldc:byte(2))
            }
            else {
                stack_2A1_2 = add:byte(expr_271:byte, loadelement:byte(var_3_1A3:byte[], add:int(var_5_1A4:int, ldc:int(2))))
            }
            
            var_0_A8 = and:int(var_0_267:int, ldc:int(-109299753))
            storeelement:byte(var_3_1A3:byte[], var_5_1A4:int, stack_2A1_2:byte)
            
            if (cmpne:boolean(var_5_1A4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_94_0 = stack_92_0 = stack_BC_0 = stack_BE_0 = stack_EC_0 = stack_1BD_0 = stack_214_0 = stack_271_0 = var_3_1A3:byte[]
            goto(Label_0195)
        }
        
        goto(Label_0422)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0195)
        }
        
        if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(131072)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(-462716606))
        }
        else {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(2089269102))
            var_2_92 = stack_92_0:byte[]
            expr_96 = add:int(arraylength:int(stack_94_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_3_202 = newarray:byte[](byte.class, expr_96:int)
                var_5_203 = expr_96:int
                
                loop {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-112904495))
                    var_5_203 = add:int(var_5_203:int, ldc:int(-1))
                    storeelement:byte(var_3_202:byte[], var_5_203:int, add:int(shl:int(loadelement:byte(stack_214_0:byte[], var_5_203:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_92:byte[], add:int(var_5_203:int, xor:int(ldc:int(19458), ldc:int(19459)))), ldc:int(6)), and:int(ldc:int(547), ldc:int(28739)))))
                    
                    if (cmpne:boolean(var_5_203:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_94_0 = stack_92_0 = stack_BC_0 = stack_BE_0 = stack_EC_0 = stack_1BD_0 = stack_214_0 = stack_271_0 = var_3_202:byte[]
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(-831960891))
        }
        else {
            if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_A8 = and:int(var_0_A8:int, ldc:int(-23642130))
            expr_BE = arraylength:int(stack_BE_0:byte[])
            
            if (cmpne:boolean(expr_BE:int, ldc:int(0))) {
                var_4_19E = expr_BE:int
                var_3_1A3 = newarray:byte[](byte.class, expr_BE:int)
                var_5_1A4 = expr_BE:int
                goto(Label_0603)
            }
        }
        
        Label_0195:
        
        if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(1364484254))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(1025625010))
            goto(Label_0115)
        }
        
        var_3_F8 = initobject:String(String::<init>, stack_EC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_197_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1093), ldc:int(10773)))
        expr_10A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(29), ldc:int(28903)))
        storeelement:String(expr_10A:String[], and:int(ldc:int(-24666), ldc:int(24665)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(-15021), ldc:int(14508)), and:int(ldc:int(259), ldc:int(10281))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(-23536), ldc:int(-23532)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-24256), ldc:int(-24255)), and:int(ldc:int(19078), ldc:int(4407))))
        storeelement:String(expr_10A:String[], and:int(ldc:int(115), ldc:int(8195)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(2145), ldc:int(2151)), xor:int(ldc:int(29), ldc:int(16))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(3085), ldc:int(3087)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(149), ldc:int(152)), and:int(ldc:int(2169), ldc:int(1051))))
        storeelement:String(expr_10A:String[], and:int(ldc:int(1843), ldc:int(8265)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(2110), ldc:int(2087)), xor:int(ldc:int(32), ldc:int(109))))
        putstatic:String[](\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc::\u4e72\ub1b9\uae5d\u760c\ud12e\ub19c, expr_10A:String[])
    }
    
    public void \u36d3\ud36e\u4179\u8d90\u8df4\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_679 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_684 : int
        
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
        var_3_679 = and:int(ldc:int(1829681822), ldc:int(892186490))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
            var_3_679 = and:int(var_3_679:int, ldc:int(-145294817))
            var_5_81 = and:int(ldc:int(21570), ldc:int(-21571))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5744), ldc:int(-22129)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_679:int, ldc:int(2009906810))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(4105), ldc:int(10757)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8225), ldc:int(18837)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_679 = and:int(var_3_DA:int, ldc:int(1738062670))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(2581), ldc:int(33)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-65781441))
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1143124806))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1358674670))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-70742000))
                    }
                    else {
                        var_3_679 = and:int(var_3_679:int, ldc:int(635694974))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1332224707))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-752137262))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1015210441))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1511132374))
                        var_11_EB = and:int(ldc:int(9779), ldc:int(-13876))
                        goto(Label_1525)
                    }
                    
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-651017263))
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1036532430))
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1605960231))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-77826482))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(848559212))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1040861046))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1253771297))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0706:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1653414816))
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1573845599))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1212285494))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1734975928))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(412738502))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-40131925))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(902880424))
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(691921172))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1988047541))
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(985261470))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(664776267))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(4737), ldc:int(4736))
                                goto(Label_1117)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1546393134))
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1341759392))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(103505093))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(2011032206))
                        var_11_EB = and:int(ldc:int(19082), ldc:int(-19083))
                    }
                    
                    Label_1117:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(48210633))
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-2041409418))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1222749347))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(249028055))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(796111791))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1397)
                            }
                        }
                    }
                    
                    Label_1237:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1169626480))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(739212900))
                            goto(Label_1117)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-578948508))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-812589379))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1045934244))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(541524750))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-567462431))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(1835843102))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1525)
                    }
                    
                    Label_1397:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(949228837))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1491453285))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-398169738))
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_679 = and:int(var_3_679:int, ldc:int(-1244812614))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1525:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_684 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1536:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1612201216))
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-612696889))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1067884436))
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1408883709))
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(933294687))
                        var_17_684 = add:int(var_16_119:int, xor:int(ldc:int(-32686), ldc:int(-32685)))
                        looporswitchbreak()
                    }
                    
                    var_3_679 = and:int(var_3_679:int, ldc:int(849597548))
                }
                
                var_3_679 = and:int(var_3_679:int, ldc:int(-305356146))
                
                if (cmple:boolean(var_5_81 = var_17_684:int, sub:int(var_6_88:int, and:int(ldc:int(18645), ldc:int(9))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
            var_3_679 = and:int(var_3_679:int, ldc:int(-1851836368))
            goto(Label_0108)
        }
    }
}
