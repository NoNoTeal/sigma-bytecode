public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8753\u071d\ub6ab\ud7e8\u3711 {
    public void \u8753\u071d\ub6ab\ud7e8\u3711() {
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
            invokespecial:\u0c95\u8cae\u67e9\u67e9\ub18d(\u0c95\u8cae\u67e9\u67e9\ub18d::<init>, this:\u8753\u071d\ub6ab\ud7e8\u3711, ldc:int(20))
            putfield:Long2LongMap(\u8753\u071d\ub6ab\ud7e8\u3711::\u4179\u4bc8\u3d64\u647c\u759a\u7006, this:\u8753\u071d\ub6ab\ud7e8\u3711, initobject:Long2LongOpenHashMap[expected:Long2LongMap](Long2LongOpenHashMap::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>> \u3504\u8258\u1833\uc246\u98a4\u6cfe() {
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
            return:Set<\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>(invokestatic:ImmutableSet[expected:Set<\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>](ImmutableSet::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ubff1\ub171\u0c95\uc229\ub83f\u4975)))
        }
        
        goto(Label_0006)
    }
    
    public void \u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p1) {
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
    
    public void \u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokevirtual:void(\u8753\u071d\ub6ab\ud7e8\u3711::\u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e, this:\u8753\u071d\ub6ab\ud7e8\u3711, p0:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u72f1\uc3e3\uc2e8\u92ff\u92ff\ud171$1(it.unimi.dsi.fastutil.longs.Long2LongMap$Entry p0) {
        var_2_5F : int
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
            var_2_5F = and:int(ldc:int(152117364), ldc:int(-848070147))
            
            if (cmpge:boolean(invokeinterface:long(Long2LongMap$Entry::getLongValue, p0:Long2LongMap$Entry), getfield:long(\u8753\u071d\ub6ab\ud7e8\u3711::\uae5d\u59ec\ud158\u4f52\u8753\ub102, this:\u8753\u071d\ub6ab\ud7e8\u3711))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-654515937))
                stack_8D_0 = and:int(ldc:int(-29065), ldc:int(29064))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(2626), ldc:int(2627))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u3711\u8389\u9af2\ua068\ub18d\u72f1$0(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_64 : long
        
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
        var_4_64 = invokevirtual:long(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\ubff1\u59ec\u183a\ub32d\u4e72\u0800, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (invokeinterface:boolean(Long2LongMap::containsKey, getfield:Long2LongMap(\u8753\u071d\ub6ab\ud7e8\u3711::\u4179\u4bc8\u3d64\u647c\u759a\u7006, this:\u8753\u071d\ub6ab\ud7e8\u3711), var_4_64:long)) {
            return:boolean(and:int[expected:boolean](ldc:int(8769), ldc:int(-8770)))
        }
        
        if (cmplt:boolean(putfield:int(\u8753\u071d\ub6ab\ud7e8\u3711::\u3776\ub7dc\u120d\u4975\u97e6\u5245, this:\u8753\u071d\ub6ab\ud7e8\u3711, add:int(getfield:int(\u8753\u071d\ub6ab\ud7e8\u3711::\u3776\ub7dc\u120d\u4975\u97e6\u5245, this:\u8753\u071d\ub6ab\ud7e8\u3711), xor:int(ldc:int(2560), ldc:int(2561)))), xor:int(ldc:int(22656), ldc:int(22661)))) {
            invokeinterface:long(Long2LongMap::put, getfield:Long2LongMap(\u8753\u071d\ub6ab\ud7e8\u3711::\u4179\u4bc8\u3d64\u647c\u759a\u7006, this:\u8753\u071d\ub6ab\ud7e8\u3711), var_4_64:long, add:long(getfield:long(\u8753\u071d\ub6ab\ud7e8\u3711::\uae5d\u59ec\ud158\u4f52\u8753\ub102, this:\u8753\u071d\ub6ab\ud7e8\u3711), ldc:long(40L)))
            return:boolean(and:int[expected:boolean](ldc:int(9), ldc:int(17827)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-24608), ldc:int(24607)))
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
    
    public void \ud171\uc910\ubff1\uc31c\u9937\u2dcc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(-1065669009), ldc:int(1285242605))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8753\u071d\ub6ab\ud7e8\u3711[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-1858752361))
        }
        else {
            var_3_696 = and:int(var_3_696:int, ldc:int(-176803857))
            var_5_8A = and:int(ldc:int(1340), ldc:int(-13631))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12559), ldc:int(8462)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_696:int, ldc:int(-1558876483))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(27001), ldc:int(513)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(10753), ldc:int(4179)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_DA:int, ldc:int(-1388712154))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(2384), ldc:int(2385)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(494705037))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1929188948))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1680380389))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(915813602))
                    }
                    else {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1129938487))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(652265679))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2133030815))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-817592526))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1404940031))
                        var_11_EB = and:int(ldc:int(23104), ldc:int(-23105))
                        goto(Label_1562)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-452068243))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1138472559))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-770865859))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1380435516))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-447859667))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-836096829))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-872628355))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-683477433))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1845538796))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(564355556))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1387114017))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(482199040))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(370884205))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1855054207))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(72465617))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1913958324))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2013266140))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(9216), ldc:int(9217))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-824976165))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(618566510))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2016754627))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1559801914))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1731347635))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(838123373))
                        var_11_EB = and:int(ldc:int(17792), ldc:int(-17793))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-74419403))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1881989980))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(384415776))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(753431730))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-521763091))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-391484817))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-114053268))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1916712582))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1829061416))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(854881208))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-2072850372))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(697385194))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-574630122))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-676020244))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1562)
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1334302832))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(807905264))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1710905012))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-342872082))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1659597639))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2015181765))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1756016977))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-273222089))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1818247444))
                        var_17_6A1 = add:int(var_16_119:int, xor:int(ldc:int(12546), ldc:int(12547)))
                        looporswitchbreak()
                    }
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(1676787693))
                
                if (cmple:boolean(var_5_8A = var_17_6A1:int, sub:int(var_6_91:int, and:int(ldc:int(1429), ldc:int(99))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
