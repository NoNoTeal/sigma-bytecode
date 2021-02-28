public class \u494c\u4975\ua068\u0c95\uc84e.\uff55\uc229\uc910\u61a4\u74b1<T> {
    public void \uff55\uc229\uc910\u61a4\u74b1(\ub113\uc4d2\u183a\u527a\u6435.\u4c2b\ub8be\u839e\u71ae\uf9c5 p0, java.lang.Class<T> p1, float p2, double p3, double p4) {
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
    
    public void \uff55\uc229\uc910\u61a4\u74b1(\ub113\uc4d2\u183a\u527a\u6435.\u4c2b\ub8be\u839e\u71ae\uf9c5 p0, java.lang.Class<T> p1, java.util.function.Predicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p2, float p3, double p4, double p5, java.util.function.Predicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p6) {
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
            invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\uff55\uc229\uc910\u61a4\u74b1<T>)
            putfield:\u4c2b\ub8be\u839e\u71ae\uf9c5(\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>, p0:\u4c2b\ub8be\u839e\u71ae\uf9c5)
            putfield:Class<T>(\uff55\uc229\uc910\u61a4\u74b1::\ud7e8\u12cb\u960f\u385b\u3d64\ub18d, this:\uff55\uc229\uc910\u61a4\u74b1<T>, p1:Class<T>)
            putfield:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(\uff55\uc229\uc910\u61a4\u74b1::\u7873\u5245\u97e6\ud523\u6b5f\uc29a, this:\uff55\uc229\uc910\u61a4\u74b1<T>, p2:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>)
            putfield:float(\uff55\uc229\uc910\u61a4\u74b1::\ubf56\u3bc9\ucef1\u983f\u6198\u62da, this:\uff55\uc229\uc910\u61a4\u74b1<T>, p3:float)
            putfield:double(\uff55\uc229\uc910\u61a4\u74b1::\u0b8e\u5245\u7873\u51fa\uc246\u4c04, this:\uff55\uc229\uc910\u61a4\u74b1<T>, p4:double)
            putfield:double(\uff55\uc229\uc910\u61a4\u74b1::\u8308\u6c56\u120d\u3711\ub102\u16f6, this:\uff55\uc229\uc910\u61a4\u74b1<T>, p5:double)
            putfield:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(\uff55\uc229\uc910\u61a4\u74b1::\u7c6b\u4ab3\u8d90\ua6bd\u647c\ubff1, this:\uff55\uc229\uc910\u61a4\u74b1<T>, p6:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>)
            putfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\uff55\uc229\uc910\u61a4\u74b1::\u56bd\u72f1\uc84e\u392e\u8aa5\u5f50, this:\uff55\uc229\uc910\u61a4\u74b1<T>, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, p0:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]))
            invokevirtual:void(\uc87f\ub70c\uc87f\ubb2b\u0c95::\ub83f\u6b5f\u61a4\uc3e3\u6198\u7049, this:\uff55\uc229\uc910\u61a4\u74b1<T>[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95], invokestatic:EnumSet<\uc7fe\u9af2\u52d3\uc87f\u92ff>(EnumSet<E>::of, getstatic:\uc7fe\u9af2\u52d3\uc87f\u92ff(\uc7fe\u9af2\u52d3\uc87f\u92ff::\u67d0\uf9c5\u4c04\u4f4a\u67d0\u7043)))
            putfield:\uc246\u1187\u2dcc\u3a62\u392e(\uff55\uc229\uc910\u61a4\u74b1::\ud158\u759a\u7af6\uff55\u4975\u4f52, this:\uff55\uc229\uc910\u61a4\u74b1<T>, invokevirtual:\uc246\u1187\u2dcc\u3a62\u392e(\uc246\u1187\u2dcc\u3a62\u392e::\uc2bd\u7049\ube23\u9255\u836c\u72f1, invokevirtual:\uc246\u1187\u2dcc\u3a62\u392e(\uc246\u1187\u2dcc\u3a62\u392e::\u51fa\u836c\u156b\ud7e8\u183a\uc910, initobject:\uc246\u1187\u2dcc\u3a62\u392e(\uc246\u1187\u2dcc\u3a62\u392e::<init>), f2d:double(p3:float)), invokeinterface:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(Predicate<\ube23\u67d0\u64f2\u839e\u76bc>::and, p6:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>, p2:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uff55\uc229\uc910\u61a4\u74b1(\ub113\uc4d2\u183a\u527a\u6435.\u4c2b\ub8be\u839e\u71ae\uf9c5 p0, java.lang.Class<T> p1, float p2, double p3, double p4, java.util.function.Predicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p5) {
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
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_5F : int
        var_1_163 : int
        var_3_C4 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        stack_1AC_0 : int [generated]
        
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
        var_1_5F = and:int(ldc:int(-323765746), ldc:int(2028125989))
        putfield:T extends \ube23\u67d0\u64f2\u839e\u76bc(\uff55\uc229\uc910\u61a4\u74b1::\u4c04\uc4d2\u4f52\u64f2\u3711\u6b5f, this:\uff55\uc229\uc910\u61a4\u74b1<T>, invokevirtual:T extends \ube23\u67d0\u64f2\u839e\u76bc(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\uf9c5\u392e\ua3b4\u6435\u446c\ua3b4, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e](\u4c2b\ub8be\u839e\u71ae\uf9c5::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5(\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), getfield:Class<T>(\uff55\uc229\uc910\u61a4\u74b1::\ud7e8\u12cb\u960f\u385b\u3d64\ub18d, this:\uff55\uc229\uc910\u61a4\u74b1<T>), getfield:\uc246\u1187\u2dcc\u3a62\u392e(\uff55\uc229\uc910\u61a4\u74b1::\ud158\u759a\u7af6\uff55\u4975\u4f52, this:\uff55\uc229\uc910\u61a4\u74b1<T>), getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\ube23\u67d0\u64f2\u839e\u76bc](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), f2d:double(getfield:float(\uff55\uc229\uc910\u61a4\u74b1::\ubf56\u3bc9\ucef1\u983f\u6198\u62da, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), ldc:double(3.0), f2d:double(getfield:float(\uff55\uc229\uc910\u61a4\u74b1::\ubf56\u3bc9\ucef1\u983f\u6198\u62da, this:\uff55\uc229\uc910\u61a4\u74b1<T>)))))
        
        if (cmpeq:boolean(getfield:T extends \ube23\u67d0\u64f2\u839e\u76bc(\uff55\uc229\uc910\u61a4\u74b1::\u4c04\uc4d2\u4f52\u64f2\u3711\u6b5f, this:\uff55\uc229\uc910\u61a4\u74b1<T>), aconstnull:T extends \ube23\u67d0\u64f2\u839e\u76bc())) {
            return:boolean(and:int[expected:boolean](ldc:int(5802), ldc:int(-5867)))
        }
        
        var_1_163 = and:int(var_1_5F:int, ldc:int(1844771661))
        var_3_C4 = invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\uf9c5\u64ab\u927d\u0b8e\u34df::\u88c5\uc4d2\u927d\u120d\u3bc9\u97b7, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5(\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>), ldc:int(16), ldc:int(7), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:T extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u4c04\uc4d2\u4f52\u64f2\u3711\u6b5f, this:\uff55\uc229\uc910\u61a4\u74b1<T>)))
        
        if (cmpne:boolean(var_3_C4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, aconstnull:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8())) {
            loop {
                if (cmpeq:boolean(and:int(var_1_163:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0334)
                }
                
                if (cmpne:boolean(and:int(var_1_163:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_163 = and:int(var_1_163:int, ldc:int(626288273))
                }
                else {
                    var_1_163 = and:int(var_1_163:int, ldc:int(-353763499))
                    
                    if (cmplt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:T extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u4c04\uc4d2\u4f52\u64f2\u3711\u6b5f, this:\uff55\uc229\uc910\u61a4\u74b1<T>), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_3_C4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_3_C4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_3_C4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:T extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u4c04\uc4d2\u4f52\u64f2\u3711\u6b5f, this:\uff55\uc229\uc910\u61a4\u74b1<T>), getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>)))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-10675), ldc:int(10658)))
                    }
                }
                
                Label_0262:
                
                if (cmpne:boolean(and:int(var_1_163:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_163 = and:int(var_1_163:int, ldc:int(1044906207))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_163:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_163 = and:int(var_1_163:int, ldc:int(-1009435806))
                        loopcontinue()
                    }
                    
                    var_1_163 = and:int(var_1_163:int, ldc:int(2059304500))
                    putfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uff55\uc229\uc910\u61a4\u74b1::\u9033\u624e\u0c95\u392e\ub19c\ub83f, this:\uff55\uc229\uc910\u61a4\u74b1<T>, invokevirtual:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\uc2bd\u67d0\u6c56\u3a62\u67d0\u3bc9, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\uff55\uc229\uc910\u61a4\u74b1::\u56bd\u72f1\uc84e\u392e\u8aa5\u5f50, this:\uff55\uc229\uc910\u61a4\u74b1<T>), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_3_C4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_3_C4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_3_C4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), and:int(ldc:int(-18451), ldc:int(18450))))
                    
                    if (cmpne:boolean(getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uff55\uc229\uc910\u61a4\u74b1::\u9033\u624e\u0c95\u392e\ub19c\ub83f, this:\uff55\uc229\uc910\u61a4\u74b1<T>), aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())) {
                        stack_1AC_0 = xor:int(ldc:int(-30652), ldc:int(-30651))
                        looporswitchbreak()
                    }
                }
                
                Label_0334:
                
                if (cmpeq:boolean(and:int(var_1_163:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0262)
                }
                
                if (cmpeq:boolean(and:int(var_1_163:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_163 = and:int(var_1_163:int, ldc:int(-336691347))
                    stack_1AC_0 = and:int(ldc:int(-30630), ldc:int(20897))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_1AC_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-21669), ldc:int(21668)))
    }
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1338912609), ldc:int(1925022319))
            
            if (invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7ce1\uc246\u5bc4\u3d4b\u760c\uc2e8, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\uff55\uc229\uc910\u61a4\u74b1::\u56bd\u72f1\uc84e\u392e\u8aa5\u5f50, this:\uff55\uc229\uc910\u61a4\u74b1<T>))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1736861145))
                stack_8D_0 = and:int(ldc:int(-5673), ldc:int(5672))
            }
            else {
                stack_8D_0 = and:int(ldc:int(33), ldc:int(9))
            }
            
            return:boolean(stack_8D_0:int)
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
            invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7c6b\ud523\u965f\u9a18\u647c\u8bb0, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\uff55\uc229\uc910\u61a4\u74b1::\u56bd\u72f1\uc84e\u392e\u8aa5\u5f50, this:\uff55\uc229\uc910\u61a4\u74b1<T>), getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uff55\uc229\uc910\u61a4\u74b1::\u9033\u624e\u0c95\u392e\ub19c\ub83f, this:\uff55\uc229\uc910\u61a4\u74b1<T>), getfield:double(\uff55\uc229\uc910\u61a4\u74b1::\u0b8e\u5245\u7873\u51fa\uc246\u4c04, this:\uff55\uc229\uc910\u61a4\u74b1<T>))
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
            putfield:T extends \ube23\u67d0\u64f2\u839e\u76bc(\uff55\uc229\uc910\u61a4\u74b1::\u4c04\uc4d2\u4f52\u64f2\u3711\u6b5f, this:\uff55\uc229\uc910\u61a4\u74b1<T>, aconstnull:T extends \ube23\u67d0\u64f2\u839e\u76bc())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_1_61 : int
        
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
            var_1_61 = and:int(ldc:int(-1205946924), ldc:int(-346288651))
            
            if (cmpge:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>), getfield:T extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uff55\uc229\uc910\u61a4\u74b1::\u4c04\uc4d2\u4f52\u64f2\u3711\u6b5f, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), ldc:double(49.0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1451622915))
                invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7873\uf995\ub32d\u4ab3\u67d0\ud12e, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), getfield:double(\uff55\uc229\uc910\u61a4\u74b1::\u0b8e\u5245\u7873\u51fa\uc246\u4c04, this:\uff55\uc229\uc910\u61a4\u74b1<T>))
            }
            else {
                invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7873\uf995\ub32d\u4ab3\u67d0\ud12e, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\uff55\uc229\uc910\u61a4\u74b1::\u98a4\u9a18\uc910\u946b\u5bc4\u7c6b, this:\uff55\uc229\uc910\u61a4\u74b1<T>)), getfield:double(\uff55\uc229\uc910\u61a4\u74b1::\u8308\u6c56\u120d\u3711\ub102\u16f6, this:\uff55\uc229\uc910\u61a4\u74b1<T>))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4f4a\u3bd6\u516c\u59ec\ud7e8\u8350$1(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(20480), ldc:int(20481)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4492\u6198\u9033\ubded\u9937\u5245$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(25602), ldc:int(25603)))
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
        var_3_67A : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_685 : int
        
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
        var_3_67A = and:int(ldc:int(-1099227942), ldc:int(-666170381))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\uc229\uc910\u61a4\u74b1<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_67A = and:int(var_3_67A:int, ldc:int(-588518923))
            var_5_81 = and:int(ldc:int(-17645), ldc:int(17640))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5091), ldc:int(4834)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_67A:int, ldc:int(-3180377))
                    var_9_C7 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_88:int, xor:int(ldc:int(18432), ldc:int(18433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(2176), ldc:int(2177)))), var_7_97:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_67A = and:int(var_3_D9:int, ldc:int(-1127365460))
                    var_14_114 = var_7_97:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(4386), ldc:int(4387)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_88:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(906940020))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-946532514))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1620323425))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1197903485))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1373488018))
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-763669814))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0593)
                            }
                            
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-481580157))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1188881247))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1749486710))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(914291004))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1061987382))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-622207274))
                        var_11_EA = and:int(ldc:int(24857), ldc:int(-24858))
                        goto(Label_1544)
                    }
                    
                    Label_0593:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(539957627))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1619156659))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1332406656))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-238055718))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1800228621))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(928664476))
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1919666640))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1539545622))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(2063294384))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-764727874))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0848:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(567290787))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-984348522))
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(420281767))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(431304300))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-219600687))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EA = and:int(ldc:int(4113), ldc:int(7))
                                goto(Label_1140)
                            }
                        }
                    }
                    
                    Label_0973:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1972187631))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-868593781))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1732578044))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(219310797))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1505050119))
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1763857693))
                        var_11_EA = and:int(ldc:int(1576), ldc:int(-1577))
                    }
                    
                    Label_1140:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(947894227))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(35799867))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1970541908))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0973)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1093753764))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-61062229))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1450211120))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1611014408))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1418)
                            }
                        }
                    }
                    
                    Label_1282:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(936213291))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1140)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0973)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1288814078))
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(412344078))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1369341126))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1285612119))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_81:int, var_16_118:int)
                        goto(Label_1544)
                    }
                    
                    Label_1418:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1829311858))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1472618071))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1528105530))
                        loopcontinue()
                    }
                    
                    var_3_67A = and:int(var_3_67A:int, ldc:int(-1647369081))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_685 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(936472585))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-861333372))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(550274604))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-178305640))
                        var_17_685 = add:int(var_16_118:int, and:int(ldc:int(321), ldc:int(8225)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67A = and:int(var_3_67A:int, ldc:int(-1077282604))
                
                if (cmple:boolean(var_5_81 = var_17_685:int, sub:int(var_6_88:int, and:int(ldc:int(4441), ldc:int(33))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_67A = and:int(var_3_67A:int, ldc:int(-1553382128))
            goto(Label_0108)
        }
    }
}
