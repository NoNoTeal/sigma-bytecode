public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8308\u9937\u8cae\uae87\u9033 {
    public void \u8308\u9937\u8cae\uae87\u9033(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u759a\uff55\u8753\u69d9\u93a2 p0) {
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
            invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u8308\u9937\u8cae\uae87\u9033)
            putfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033, p0:\u759a\uff55\u8753\u69d9\u93a2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
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
    
    private boolean \ufe34\u8389\u6d99\u6b0d\u4e72\u494c() {
        var_1_5F : int
        var_3_82 : Iterator<\u759a\uff55\u8753\u69d9\u93a2>
        var_1_8E : int
        var_4_C9 : \u759a\uff55\u8753\u69d9\u93a2
        
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
        var_1_5F = and:int(ldc:int(2144314360), ldc:int(-9437728))
        var_3_82 = invokeinterface:Iterator<\u759a\uff55\u8753\u69d9\u93a2>(List<\u759a\uff55\u8753\u69d9\u93a2>::iterator, invokevirtual:List<\u759a\uff55\u8753\u69d9\u93a2>(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\u965f\ucef1\u34df\u4daf\u760c\u6d99, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e](\u759a\uff55\u8753\u69d9\u93a2::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), ldc:Class<\u759a\uff55\u8753\u69d9\u93a2>(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u759a\uff55\u8753\u69d9\u93a2.class), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033)), ldc:double(2.0))))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_8E = and:int(var_1_5F:int, ldc:int(-23361424))
            }
            else {
                var_1_8E = and:int(var_1_5F:int, ldc:int(-850419255))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_82:Iterator<\u759a\uff55\u8753\u69d9\u93a2>)) {
                    var_4_C9 = checkcast:\u759a\uff55\u8753\u69d9\u93a2(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u759a\uff55\u8753\u69d9\u93a2.class, invokeinterface:\u759a\uff55\u8753\u69d9\u93a2(Iterator<\u759a\uff55\u8753\u69d9\u93a2>::next, var_3_82:Iterator<\u759a\uff55\u8753\u69d9\u93a2>))
                    
                    if (logicaland:boolean(cmpne:boolean(var_4_C9:\u759a\uff55\u8753\u69d9\u93a2, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), logicalor:boolean(invokevirtual:boolean(\u759a\uff55\u8753\u69d9\u93a2::\u16f6\ubefe\u6c52\u7d52\ufcaf\u3d4b, var_4_C9:\u759a\uff55\u8753\u69d9\u93a2), invokevirtual:boolean(\u759a\uff55\u8753\u69d9\u93a2::\u0a06\ua3b4\u16f6\u6d69\ufe34\u120d, var_4_C9:\u759a\uff55\u8753\u69d9\u93a2)))) {
                        return:boolean(and:int[expected:boolean](ldc:int(8709), ldc:int(2387)))
                    }
                    
                    var_1_5F = and:int(var_1_8E:int, ldc:int(2145352164))
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_1_8E:int, ldc:int(8192)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-4073), ldc:int(3016)))
            }
            
            var_1_5F = and:int(var_1_8E:int, ldc:int(-93854415))
        }
    }
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_5F : int
        stack_D5_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1949930147), ldc:int(1970010447))
            
            if (invokevirtual:boolean(\u36d3\u2dcc\ub113\u5654\uceb8::\u3bd6\u88c5\ud158\ubf56\u8cae\u983f, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u36d3\u2dcc\ub113\u5654\uceb8](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u36d3\u2dcc\ub113\u5654\uceb8::\u7043\u4f52\u76bc\u624e\u7bad\ufe34, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u36d3\u2dcc\ub113\u5654\uceb8](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)))) {
                    if (cmpne:boolean(getfield:\ua3b4\u8aa5\ub113\ubf56\u873d(\u8308\u9937\u8cae\uae87\u9033::\u4c04\u6435\ub18d\u516c\u97b7\ubb2b, this:\u8308\u9937\u8cae\uae87\u9033), aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d())) {
                        if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u983f\u927d\u7006\ub19c\u4bc8\u4daf, getfield:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u8308\u9937\u8cae\uae87\u9033::\u4c04\u6435\ub18d\u516c\u97b7\ubb2b, this:\u8308\u9937\u8cae\uae87\u9033))) {
                            if (cmpne:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                                if (logicalnot:boolean(invokespecial:boolean(\u8308\u9937\u8cae\uae87\u9033::\ufe34\u8389\u6d99\u6b0d\u4e72\u494c, this:\u8308\u9937\u8cae\uae87\u9033))) {
                                    stack_D5_0 = and:int[expected:boolean](ldc:int(17), ldc:int(18245))
                                    return:boolean(stack_D5_0:boolean)
                                }
                            }
                        }
                    }
                }
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(-1294407227))
            stack_D5_0 = and:int[expected:boolean](ldc:int(-22244), ldc:int(22081))
            return:boolean(stack_D5_0:boolean[expected:int])
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
            
            if (cmpne:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                invokevirtual:void(\u36d3\u2dcc\ub113\u5654\uceb8::\u76bc\u4c04\u9255\ubded\uc29a\u8cae, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u36d3\u2dcc\ub113\u5654\uceb8](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), and:int[expected:boolean](ldc:int(1571), ldc:int(-1572)))
                invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u3711\u7049\u8cae\u72f1\uc7fe\u5140, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033))), ldc:double(1.100000023841858))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
        var_3_7B : float
        
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
            invokevirtual:void(\u759a\uff55\u8753\u69d9\u93a2::\u7ce1\ud4fe\u1833\u5245\ufe34\u4975, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), and:int[expected:boolean](ldc:int(11360), ldc:int(-27745)))
            var_3_7B = invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u8753\u8709\ubff1\ub32d\u4d85](\u759a\uff55\u8753\u69d9\u93a2::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), ldc:float(1.0f))
            
            if (cmpge:boolean(invokevirtual:int(\ua3b4\u8aa5\ub113\ubf56\u873d::\ucb79\u647c\u5f50\u8413\u8753\u3d4b, getfield:\ua3b4\u8aa5\ub113\ubf56\u873d(\u8308\u9937\u8cae\uae87\u9033::\u4c04\u6435\ub18d\u516c\u97b7\ubb2b, this:\u8308\u9937\u8cae\uae87\u9033)), ldc:int(100))) {
                if (cmpgt:boolean(f2d:double(var_3_7B:float), ldc:double(0.77))) {
                    if (cmplt:boolean(f2d:double(var_3_7B:float), ldc:double(0.8))) {
                        if (cmplt:boolean(f2d:double(invokevirtual:float(Random::nextFloat, invokevirtual:Random(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u76bc\u6c52\u9a18\u4179\u97b7\uafe7, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u759a\uff55\u8753\u69d9\u93a2::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033))))), ldc:double(0.7))) {
                            invokespecial:void(\u8308\u9937\u8cae\uae87\u9033::\u7043\u8df4\ub102\u494c\u62da\u760c, this:\u8308\u9937\u8cae\uae87\u9033)
                        }
                    }
                }
            }
            
            putfield:int(\u8308\u9937\u8cae\uae87\u9033::\u6c52\u0a06\ub83f\u34df\u6d69\u183a, this:\u8308\u9937\u8cae\uae87\u9033, and:int(ldc:int(-28476), ldc:int(28441)))
            invokevirtual:void(\u759a\uff55\u8753\u69d9\u93a2::\uc2bd\u1833\u446c\uceb8\ub19c\u93a2, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), and:int[expected:boolean](ldc:int(-12700), ldc:int(8603)))
            invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\ua6bd\u8c8a\u7043\u40a9\ud217\u47c2, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7043\u8df4\ub102\u494c\u62da\u760c() {
        var_1_61 : int
        var_3_69 : Random
        var_4_71 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_7_135 : Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        
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
            var_1_61 = and:int(ldc:int(-501372007), ldc:int(-396643332))
            var_3_69 = invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033))
            var_4_71 = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
            invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_4_71:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)))
            invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\ub19c\uc84e\u3d4b\uc29a\u5245\u9255, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), i2d:double(sub:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_4_71:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(Random::nextInt, var_3_69:Random, ldc:int(11))), and:int(ldc:int(8773), ldc:int(19621)))), i2d:double(sub:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_4_71:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(Random::nextInt, var_3_69:Random, xor:int(ldc:int(16676), ldc:int(16673)))), and:int(ldc:int(8198), ldc:int(2962)))), i2d:double(sub:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_4_71:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(Random::nextInt, var_3_69:Random, ldc:int(11))), and:int(ldc:int(71), ldc:int(29)))), and:int[expected:boolean](ldc:int(-10443), ldc:int(10440)))
            invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_4_71:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)))
            var_7_135 = invokeinterface:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::iterator, invokevirtual:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u4179\ud217\u7043\u8bb0\ucef1::\u6d69\uc246\u3bc9\ua61f\uae87\u5654, invokevirtual:\u4179\ud217\u7043\u8bb0\ucef1(\u7ce1\u5d20\u1187\u5f50\ua068::\uc31c\ub7dc\ua3b4\u0800\u836c\ub113, invokevirtual:\u7ce1\u5d20\u1187\u5f50\ua068(\u88c5\ud171\ub113\u6435\ud51e::\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u759a\uff55\u8753\u69d9\u93a2::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)))), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\u98a4\u34df\u6cfe\u4bc8::\u88c5\uc246\u47c2\u4c04\u4c04\u927d)), invokevirtual:\uf9c5\u7043\u0c95\u76bc\u8389(\u6c52\ucfaf\uc910\u527a\uc9f6::\u2dcc\u494c\uf995\u6bb9\ud217\ub32d, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\ua562\u3776\u7873\u927d\u9af2\ub70c, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u4c2b\u927d\ubf56\u1833\u6d99\ube23, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u4c2b\u927d\ubf56\u1833\u6d99\ube23, initobject:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::<init>, checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\ube23\uc238\u5140\u4cd9\u8aa5](\u759a\uff55\u8753\u69d9\u93a2::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)))), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u759a\u3a62\uc229\uc84e\u61a4\u718f), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033))), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u7d52\u718f\u3776\u6fb0\ub83f>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u8413\u64f2\u600f\u965f\u62da\ud171), getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), var_3_69:Random), getstatic:\u4bc8\uf9c5\u6b5f\u7006\ub171(\ubf56\u4d85\u8aa5\ub102\u56bd::\u9033\u5245\u7049\ub7dc\u4cd9\u527a))))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-587600455))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_135:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\ua6bd\ubefe\u5f50\u12cb\uceb8\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u72f1\u7ce1\ucef1\ub83f\u516c](\u759a\uff55\u8753\u69d9\u93a2::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), initobject:\u120d\u8bb0\u836c\u64f2\u3504(\u120d\u8bb0\u836c\u64f2\u3504::<init>, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u759a\uff55\u8753\u69d9\u93a2::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_4_71:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(getfield:float(\u759a\uff55\u8753\u69d9\u93a2::\ud523\ua562\u64ab\u92ee\u71f1\uc87f, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), ldc:float(0.017453292f))))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_4_71:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_4_71:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(getfield:float(\u759a\uff55\u8753\u69d9\u93a2::\ud523\ua562\u64ab\u92ee\u71f1\uc87f, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), ldc:float(0.017453292f))))), checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_7_135:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_1_75 : int
        
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
        var_1_75 = and:int(ldc:int(-908172067), ldc:int(-335632421))
        
        if (cmpne:boolean(getfield:\ua3b4\u8aa5\ub113\ubf56\u873d(\u8308\u9937\u8cae\uae87\u9033::\u4c04\u6435\ub18d\u516c\u97b7\ubb2b, this:\u8308\u9937\u8cae\uae87\u9033), aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d())) {
            if (cmpne:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                invokevirtual:void(\u36d3\u2dcc\ub113\u5654\uceb8::\u76bc\u4c04\u9255\ubded\uc29a\u8cae, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u36d3\u2dcc\ub113\u5654\uceb8](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), and:int[expected:boolean](ldc:int(-674), ldc:int(673)))
                invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u3711\u7049\u8cae\u72f1\uc7fe\u5140, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033)), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8308\u9937\u8cae\uae87\u9033::\u965f\ubb2b\u7af6\uc9f6\uc3e3\ub7dc, this:\u8308\u9937\u8cae\uae87\u9033))), ldc:double(1.100000023841858))
                
                if (cmpge:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), getfield:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8308\u9937\u8cae\uae87\u9033::\u4c04\u6435\ub18d\u516c\u97b7\ubb2b, this:\u8308\u9937\u8cae\uae87\u9033)), ldc:double(2.5))) {
                    goto(Label_0216)
                }
                
                putfield:int(\u8308\u9937\u8cae\uae87\u9033::\u6c52\u0a06\ub83f\u34df\u6d69\u183a, this:\u8308\u9937\u8cae\uae87\u9033, add:int(getfield:int(\u8308\u9937\u8cae\uae87\u9033::\u6c52\u0a06\ub83f\u34df\u6d69\u183a, this:\u8308\u9937\u8cae\uae87\u9033), xor:int(ldc:int(-24256), ldc:int(-24255))))
                
                if (cmple:boolean(getfield:int(\u8308\u9937\u8cae\uae87\u9033::\u6c52\u0a06\ub83f\u34df\u6d69\u183a, this:\u8308\u9937\u8cae\uae87\u9033), ldc:int(16))) {
                    var_1_75 = and:int(var_1_75:int, ldc:int(766272505))
                    invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\u8308\u873d\ub102\u7e3f\u718f\u8bb0, getfield:\u759a\uff55\u8753\u69d9\u93a2[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), getfield:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8308\u9937\u8cae\uae87\u9033::\u4c04\u6435\ub18d\u516c\u97b7\ubb2b, this:\u8308\u9937\u8cae\uae87\u9033), ldc:float(45.0f), ldc:float(45.0f))
                    invokevirtual:void(\u759a\uff55\u8753\u69d9\u93a2::\uc2bd\u1833\u446c\uceb8\ub19c\u93a2, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), xor:int[expected:boolean](ldc:int(-24319), ldc:int(-24320)))
                }
                else {
                    invokevirtual:void(\u759a\uff55\u8753\u69d9\u93a2::\u7ce1\ud4fe\u1833\u5245\ufe34\u4975, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), xor:int[expected:boolean](ldc:int(4740), ldc:int(4741)))
                    invokevirtual:void(\u759a\uff55\u8753\u69d9\u93a2::\uc2bd\u1833\u446c\uceb8\ub19c\u93a2, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), and:int[expected:boolean](ldc:int(26723), ldc:int(-26724)))
                }
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        var_1_75 = and:int(var_1_75:int, ldc:int(-1332929560))
        Label_0216:
        
        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(32768)), ldc:int(0))) {
            var_1_75 = and:int(var_1_75:int, ldc:int(-110286990))
            goto(Label_0105)
        }
        
        var_1_75 = and:int(var_1_75:int, ldc:int(1269595391))
        invokevirtual:void(\u759a\uff55\u8753\u69d9\u93a2::\u7ce1\ud4fe\u1833\u5245\ufe34\u4975, getfield:\u759a\uff55\u8753\u69d9\u93a2(\u8308\u9937\u8cae\uae87\u9033::\u6b5f\ud4fe\u7043\ubcb0\u9af2\u8cae, this:\u8308\u9937\u8cae\uae87\u9033), and:int[expected:boolean](ldc:int(-21228), ldc:int(16491)))
        goto(Label_0105)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 lambda$\ube23\u3776\u516c\u718f\u3711\ubcb0$1(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 lambda$\u760c\u6cfe\u3d4b\u156b\ud12e\u760c$0(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1) {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, p1:\u760c\u4975\u4179\uc246\u8640\u64f2)))
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
        var_3_651 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_65C : int
        
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
        var_3_651 = and:int(ldc:int(-139900371), ldc:int(-26779908))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8308\u9937\u8cae\uae87\u9033[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
            var_3_651 = and:int(var_3_651:int, ldc:int(-2022705032))
        }
        else {
            var_3_651 = and:int(var_3_651:int, ldc:int(-138426711))
            var_5_8A = and:int(ldc:int(-31139), ldc:int(22946))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16916), ldc:int(16915)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_651:int, ldc:int(2131754661))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, xor:int(ldc:int(-14304), ldc:int(-14303)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(901), ldc:int(17473)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_651 = and:int(var_3_D9:int, ldc:int(2126733925))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(10240), ldc:int(10241)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1039836745))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1326761836))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1461618777))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1713946599))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(841444653))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1985958713))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1286637006))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(908997502))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-743301850))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(2001194916))
                            var_11_EA = and:int(ldc:int(-11262), ldc:int(8860))
                            goto(Label_1488)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1033964843))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1961262370))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-47689136))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1867403579))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-163873812))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(574370395))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1024821116))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-280396912))
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-762604745))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1786755638))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(2127679458))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0830:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-811729521))
                        goto(Label_1093)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1684441858))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-306293660))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-154576347))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = xor:int(ldc:int(12305), ldc:int(12304))
                                goto(Label_1093)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-956775134))
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1209662151))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1495360123))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-21796299))
                        var_11_EA = and:int(ldc:int(16549), ldc:int(-16560))
                    }
                    
                    Label_1093:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(297193926))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1689005489))
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1379049724))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1593770340))
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-8008142))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1354)
                            }
                        }
                    }
                    
                    Label_1213:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-202703499))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1802823837))
                            goto(Label_1093)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(644970113))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1177404166))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-981644793))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(2131350330))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                        goto(Label_1488)
                    }
                    
                    Label_1354:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-2062081806))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-288796618))
                        goto(Label_1093)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-2074659620))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1442928752))
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(-16028054))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1488:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65C = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1499:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(222426123))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-625282868))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(2091371270))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1060239837))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-25731478))
                        var_17_65C = add:int(var_16_118:int, and:int(ldc:int(385), ldc:int(24583)))
                        looporswitchbreak()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(-1819980520))
                }
                
                var_3_651 = and:int(var_3_651:int, ldc:int(-149296592))
                
                if (cmple:boolean(var_5_8A = var_17_65C:int, sub:int(var_6_91:int, xor:int(ldc:int(8488), ldc:int(8489))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
