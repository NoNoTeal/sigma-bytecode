public final class \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 {
    private void \uc2e8\u9255\u647c\ud171\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5654\u8258\u718f\u647c\uc9f6 p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf995\u7049\u8258\u5654\u718f p1, float p2, float p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u8cae\uc87f\u8640\u836c\uc238 p4, \u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 p5, \ub113\ufcaf\u3c25\u071d\u97b7.\u6198\uff55\u56bd\u8308\u4cd9 p6) {
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
    
    public int \uc2bd\u93a2\uc238\u392e\u76bc\u71f1() {
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
            return:int(invokevirtual:int(\u8cae\uc87f\u8640\u836c\uc238::\u16f6\u64f2\u51b2\u67d0\u6198\u9033, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\ufcaf\u3c25\u071d\u97b7.\u6198\uff55\u56bd\u8308\u4cd9 \u36d3\u873d\uf9c5\u3bd6\u156b\u6d69() {
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
            return:\u6198\uff55\u56bd\u8308\u4cd9(getfield:\u6198\uff55\u56bd\u8308\u4cd9(\uc2e8\u9255\u647c\ud171\ubf56::\u34df\uc9f6\u6d99\u983f\u8d98\u647c, this:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud51e\u927d\u69d9\u8df4\u6cfe \u99f7\ub113\ua562\u5db4\u760c\u3d4b() {
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
            return:\ud51e\u927d\u69d9\u8df4\u6cfe(invokestatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\u5654\u8258\u718f\u647c\uc9f6::\uc4d2\u8d90\u385b\u74b1\u3776\u927d, getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u385b\u5654\u6b0d\u3d4b\uafe7\uc2e8() {
        var_1_5F : int
        stack_89_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-136404565), ldc:int(260745923))
            
            if (cmple:boolean(invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\ud4fe\u2dcc\u494c\u8389\ubcb0\u8389, this:\uc2e8\u9255\u647c\ud171\ubf56), ldc:float(0.85f))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1748382070))
                stack_89_0 = and:int(ldc:int(13854), ldc:int(-30367))
            }
            else {
                stack_89_0 = xor:int(ldc:int(8236), ldc:int(8237))
            }
            
            return:boolean(stack_89_0:int)
        }
        
        goto(Label_0006)
    }
    
    private float \u6d99\u6435\u9a18\u8640\u5fe1\u59ec(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_6F : float
        
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
        var_4_6F = invokevirtual:float(\u3d4b\uc2e8\ucb79\uc31c\uae5d::\u8c8a\u6cfe\u6d99\u64f2\u6c56\u0a06, invokestatic:\u3d4b\uc2e8\ucb79\uc31c\uae5d(\u5654\u8258\u718f\u647c\uc9f6::\ubcb0\u7e3f\u47c2\u98a4\u385b\uc238, getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, this:\uc2e8\u9255\u647c\ud171\ubf56)), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u4bc8\u97e6\uc31c\ub83f\ubded\uc246, this:\uc2e8\u9255\u647c\ud171\ubf56))
        
        if (cmple:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(64))) {
            return:float(var_4_6F:float)
        }
        
        return:float(sub:float(var_4_6F:float, div:float(mul:float(sub:float(add:float(d2f:float(mul:double(invokevirtual:double(\u718f\u120d\u4f4a\u156b\ucfaf::\u7bad\u5fe1\ub113\u7d52\ufe34\u5245, getstatic:\u718f\u120d\u4f4a\u156b\ucfaf(\uc2e8\u9255\u647c\ud171\ubf56::\ub171\u7006\u3bd6\u59ec\ub7dc\u3dd3), f2d:double(div:float(i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:float(8.0f))), f2d:double(div:float(i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:float(8.0f))), and:int[expected:boolean](ldc:int(1892), ldc:int(-6117))), ldc:double(4.0))), i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))), ldc:float(64.0f)), ldc:float(0.05f)), ldc:float(30.0f))))
    }
    
    public final float \u183a\u64ab\u983f\ud171\u97b7\u99f7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_64 : long
        var_6_70 : Long2FloatLinkedOpenHashMap
        var_7_79 : float
        var_8_8D : float
        
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
        var_6_70 = checkcast:Long2FloatLinkedOpenHashMap(it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap.class, invokevirtual:Long2FloatLinkedOpenHashMap(ThreadLocal<Long2FloatLinkedOpenHashMap>::get, getfield:ThreadLocal<Long2FloatLinkedOpenHashMap>(\uc2e8\u9255\u647c\ud171\ubf56::\u760c\ud171\u6b0d\u120d\u839e\u3504, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        var_7_79 = invokevirtual:float(Long2FloatLinkedOpenHashMap::get, var_6_70:Long2FloatLinkedOpenHashMap, var_4_64:long)
        
        if (invokestatic:boolean(Float::isNaN, var_7_79:float)) {
            var_8_8D = invokespecial:float(\uc2e8\u9255\u647c\ud171\ubf56::\u6d99\u6435\u9a18\u8640\u5fe1\u59ec, this:\uc2e8\u9255\u647c\ud171\ubf56, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (cmpeq:boolean(invokevirtual:int(Long2FloatLinkedOpenHashMap::size, var_6_70:Long2FloatLinkedOpenHashMap), xor:int(ldc:int(4971), ldc:int(5995)))) {
                invokevirtual:float(Long2FloatLinkedOpenHashMap::removeFirstFloat, var_6_70:Long2FloatLinkedOpenHashMap)
            }
            
            invokevirtual:float(Long2FloatLinkedOpenHashMap::put, var_6_70:Long2FloatLinkedOpenHashMap, var_4_64:long, var_8_8D:float)
            return:float(var_8_8D:float)
        }
        
        return:float(var_7_79:float)
    }
    
    public boolean \u8308\uceb8\u5245\u873d\u3bd6\uc229(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u97e6\uf995\ucef1\ubff1\u7049\u4f4a p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            return:boolean(invokevirtual:boolean(\uc2e8\u9255\u647c\ud171\ubf56::\u8308\uceb8\u5245\u873d\u3bd6\uc229, this:\uc2e8\u9255\u647c\ud171\ubf56, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, xor:int[expected:boolean](ldc:int(8234), ldc:int(8235))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8308\uceb8\u5245\u873d\u3bd6\uc229(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u97e6\uf995\ucef1\ubff1\u7049\u4f4a p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, boolean p2) {
        var_4_15D : int
        var_6_F2 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        stack_1C7_0 : int [generated]
        
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
        var_4_15D = and:int(ldc:int(-609206029), ldc:int(855305639))
        
        if (cmpge:boolean(invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u183a\u64ab\u983f\ud171\u97b7\u99f7, this:\uc2e8\u9255\u647c\ud171\ubf56, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:float(0.15f))) {
            return:boolean(and:int[expected:boolean](ldc:int(-28710), ldc:int(28708)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_4_15D:int, ldc:int(8)), ldc:int(0))) {
                var_4_15D = and:int(var_4_15D:int, ldc:int(435239359))
                
                if (cmpge:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(0))) {
                    if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(9536), ldc:int(905)))) {
                        if (cmplt:boolean(invokeinterface:int(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\ub19c\ub171\u7ce1\u99f7\ud51e\ub18d, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], getstatic:\u3a62\u7330\uafe7\u5db4\u12cb(\u3a62\u7330\uafe7\u5db4\u12cb::\u3a62\u5f50\ufcaf\u47c2\u6198\uc7fe), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:int(10))) {
                            var_6_F2 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            
                            if (cmpeq:boolean(invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, invokeinterface:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u718f\u6435\uc31c\u4ab3\u98a4::\u9033\u3711\u494c\u88c5\u69d9\u97b7, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f](\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8))) {
                                if (instanceof:boolean(\u5245\u8aa5\u61a4\u7049\u4cd9.\u0800\u71f1\uf995\u71ae\u392e\u960f.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_6_F2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                                    if (logicalnot:boolean(p2:boolean)) {
                                        return:boolean(and:int[expected:boolean](ldc:int(515), ldc:int(9241)))
                                    }
                                    
                                    loop {
                                        if (cmpeq:boolean(and:int(var_4_15D:int, ldc:int(2097152)), ldc:int(0))) {
                                            var_4_15D = and:int(var_4_15D:int, ldc:int(-18016441))
                                        }
                                        else {
                                            var_4_15D = and:int(var_4_15D:int, ldc:int(477428134))
                                            
                                            if (invokeinterface:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u8d98\u4daf\u3776\ua562\ubefe\ub19c, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u8df4\ub6ab\u8640\u5bc4\u62da\u416d, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                                if (invokeinterface:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u8d98\u4daf\u3776\ua562\ubefe\ub19c, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u7bad\u72f1\u7873\u5fe1\ua068, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                                    if (invokeinterface:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u8d98\u4daf\u3776\ua562\ubefe\ub19c, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u6ec6\u5654\u927d\u3711\u92ee\u97b7, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                                        if (invokeinterface:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u8d98\u4daf\u3776\ua562\ubefe\ub19c, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc246\u76bc\u4daf\uf9c5\uc246\u416d, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                                            stack_1C7_0 = xor:int(ldc:int(-20476), ldc:int(-20475))
                                                            looporswitchbreak()
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_15D:int, ldc:int(512)), ldc:int(0))) {
                                            var_4_15D = and:int(var_4_15D:int, ldc:int(-717585170))
                                            stack_1C7_0 = and:int(ldc:int(-28715), ldc:int(12330))
                                            looporswitchbreak()
                                        }
                                    }
                                    
                                    var_4_15D = and:int(var_4_15D:int, ldc:int(301577703))
                                    
                                    if (cmpeq:boolean(stack_1C7_0:int, ldc:int(0))) {
                                        return:boolean(xor:int[expected:boolean](ldc:int(20768), ldc:int(20769)))
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_4_15D:int, ldc:int(524288)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(27544), ldc:int(-27545)))
            }
            
            var_4_15D = and:int(var_4_15D:int, ldc:int(1936911989))
        }
    }
    
    public boolean \ucef1\ufe34\u6c52\u624e\u3a62\u7330(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u97e6\uf995\ucef1\ubff1\u7049\u4f4a p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
        
        if (cmplt:boolean(invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u183a\u64ab\u983f\ud171\u97b7\u99f7, this:\uc2e8\u9255\u647c\ud171\ubf56, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:float(0.15f))) {
            if (cmpge:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(0))) {
                if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(4864), ldc:int(26998)))) {
                    if (cmplt:boolean(invokeinterface:int(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\ub19c\ub171\u7ce1\u99f7\ud51e\ub18d, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], getstatic:\u3a62\u7330\uafe7\u5db4\u12cb(\u3a62\u7330\uafe7\u5db4\u12cb::\u3a62\u5f50\ufcaf\u47c2\u6198\uc7fe), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:int(10))) {
                        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                            if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u600f\ub32d\u5bc4\ua61f\u64f2\u4c04, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u494c\u3dd3\u12cb\u56bd\uc238\u2dcc)), p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                                return:boolean(and:int[expected:boolean](ldc:int(1), ldc:int(1189)))
                            }
                        }
                    }
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(24609), ldc:int(-24610)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(21232), ldc:int(-21233)))
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 \u16f6\uf9c5\u62da\u4975\u527a\u5db4() {
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
            return:\uae5d\u8d98\u7d52\u4f52\u51b2(getfield:\uae5d\u8d98\u7d52\u4f52\u51b2(\uc2e8\u9255\u647c\ud171\ubf56::\uc31c\uc29a\u88c5\u7af6\u6d99\u36d3, this:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\ud158\ub83f\u4d85\u3bd6\ua562(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8753\u4975\ubf56\u6b0d\u7e3f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, \u516c\u3d64\u718f\ub171\u6b5f.\u52d3\u624e\u8bb0\u385b\u6198 p2, long p3, \u3504\ufe34\u600f\u6b0d\u69d9.\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf p4, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p5) {
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
    
    public int \u6d69\u5654\u494c\ub1b9\ua562\ubb2b() {
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
            return:int(invokevirtual:int(\u8cae\uc87f\u8640\u836c\uc238::\u36d3\u873d\u4bc8\u7049\u64ab\uc87f, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public int \ud4fe\u7c6b\u7006\u494c\u4bc8\u527a(double p0, double p1) {
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
            return:int(invokevirtual:int(\u4d85\ubf56\u67e9\u92ff\u516c::\u983f\u1833\u4cd9\u4179\ub102\u0a06, invokevirtual:\u4d85\ubf56\u67e9\u92ff\u516c(\u8cae\uc87f\u8640\u836c\uc238::\u2dcc\ua6bd\u4f4a\ube23\u74b1\u67e9, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)), p0:double, p1:double, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(Optional<Integer>::orElseGet, invokevirtual:Optional<Integer>(\u8cae\uc87f\u8640\u836c\uc238::\ud4fe\uc2bd\u3d4b\u88c5\u4179\u8c8a, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)), invokedynamic:Supplier<Integer>(get:(L\u51fa\u12cb\u7330\u74b1\u6c52/\uc2e8\u9255\u647c\ud171\ubf56;)Ljava/util/function/Supplier;, this:\uc2e8\u9255\u647c\ud171\ubf56))))))
        }
        
        goto(Label_0006)
    }
    
    private int \u183a\u5db4\ud523\u62da\ub19c\u8cae() {
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
            return:int(invokestatic:int(\ubefe\u927d\u3a62\ufe34\u12b2\u0800::\u416d\uc229\u4f4a\u6d99\u3776\uc7fe, f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:float(\u5654\u8258\u718f\u647c\uc9f6::\u8aa5\uc31c\u4ab3\ub32d\u4d85\uc2bd, getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, this:\uc2e8\u9255\u647c\ud171\ubf56)), ldc:float(0.0f), ldc:float(1.0f))), f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:float(\u5654\u8258\u718f\u647c\uc9f6::\u61a4\u7006\uc229\u5245\u6b5f\u8709, getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, this:\uc2e8\u9255\u647c\ud171\ubf56)), ldc:float(0.0f), ldc:float(1.0f)))))
        }
        
        goto(Label_0006)
    }
    
    public int \u9a18\u6cfe\u93a2\u36d3\uc246\u92ff() {
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
            return:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(Optional<Integer>::orElseGet, invokevirtual:Optional<Integer>(\u8cae\uc87f\u8640\u836c\uc238::\u8350\u7e3f\u965f\uc910\u7ce1\ubefe, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)), invokedynamic:Supplier<Integer>(get:(L\u51fa\u12cb\u7330\u74b1\u6c52/\uc2e8\u9255\u647c\ud171\ubf56;)Ljava/util/function/Supplier;, this:\uc2e8\u9255\u647c\ud171\ubf56)))))
        }
        
        goto(Label_0006)
    }
    
    private int \u3d64\u3d64\uc7fe\u6b5f\u4c2b\u52d3() {
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
            return:int(invokestatic:int(\u718f\u4179\u7e3f\ub113\ud51e\u8413::\u47c2\uc87f\u5654\ufe34\uc3e3\u5140, f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:float(\u5654\u8258\u718f\u647c\uc9f6::\u8aa5\uc31c\u4ab3\ub32d\u4d85\uc2bd, getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, this:\uc2e8\u9255\u647c\ud171\ubf56)), ldc:float(0.0f), ldc:float(1.0f))), f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:float(\u5654\u8258\u718f\u647c\uc9f6::\u61a4\u7006\uc229\u5245\u6b5f\u8709, getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, this:\uc2e8\u9255\u647c\ud171\ubf56)), ldc:float(0.0f), ldc:float(1.0f)))))
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\u7873\u8bb0\u5654\u3c25\u983f(java.util.Random p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p1, int p2, int p3, int p4, double p5, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p6, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p7, int p8, long p9) {
        var_15_74 : \u64ab\ua6bd\u8413\u93a2\u88c5<?>
        
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
            var_15_74 = checkcast:\u64ab\ua6bd\u8413\u93a2\u88c5<?>(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<?>.class, invokeinterface:\u64ab\ua6bd\u8413\u93a2\u88c5<?>(Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>::get, invokevirtual:Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\ud523\ub113\u8640\u40a9\u4d85\u6cfe, getfield:\uae5d\u8d98\u7d52\u4f52\u51b2(\uc2e8\u9255\u647c\ud171\ubf56::\uc31c\uc29a\u88c5\u7af6\u6d99\u36d3, this:\uc2e8\u9255\u647c\ud171\ubf56))))
            invokevirtual:void(\u64ab\ua6bd\u8413\u93a2\u88c5<SC>::\u40a9\uc29a\u8753\u88c5\u97b7\u93a2, var_15_74:\u64ab\ua6bd\u8413\u93a2\u88c5<?>, p9:long)
            invokevirtual:void(\u64ab\ua6bd\u8413\u93a2\u88c5<SC>::\ubff1\u3d64\u3776\u3c25\u52d3\u0a06, var_15_74:\u64ab\ua6bd\u8413\u93a2\u88c5<?>, p0:Random, p1:\u8aa5\ubded\ub18d\u4f4a\u4f52, this:\uc2e8\u9255\u647c\ud171\ubf56, p2:int, p3:int, p4:int, p5:double, p6:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p7:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p8:int, p9:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final float \u7bad\uae87\ub7dc\u983f\ud7e8\uc29a() {
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
            return:float(getfield:float(\uc2e8\u9255\u647c\ud171\ubf56::\u3bd6\u4975\ub102\u4bc8\uc3e3\ube23, this:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public final float \ud4fe\u2dcc\u494c\u8389\ubcb0\u8389() {
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
            return:float(invokestatic:float(\u5654\u8258\u718f\u647c\uc9f6::\u61a4\u7006\uc229\u5245\u6b5f\u8709, getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public final float \u61a4\u6b5f\u965f\u385b\ubded\u8389() {
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
            return:float(getfield:float(\uc2e8\u9255\u647c\ud171\ubf56::\u52d3\u4bc8\ub32d\u76bc\u67d0\u4c04, this:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public final float \u4bc8\u97e6\uc31c\ub83f\ubded\uc246() {
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
            return:float(invokestatic:float(\u5654\u8258\u718f\u647c\uc9f6::\u8aa5\uc31c\u4ab3\ub32d\u4d85\uc2bd, getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u8cae\uc87f\u8640\u836c\uc238 \u4c04\u59ec\ud171\u56bd\u156b\ubb2b() {
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
            return:\u8cae\uc87f\u8640\u836c\uc238(getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public final int \u416d\u7873\u0c95\ucef1\u3c25\ubb2b() {
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
            return:int(invokevirtual:int(\u8cae\uc87f\u8640\u836c\uc238::\uf94d\uc229\u99f7\u8389\u64f2\ub1b9, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public final int \u7ce1\uc84e\u4e72\u446c\u6b0d\u4daf() {
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
            return:int(invokevirtual:int(\u8cae\uc87f\u8640\u836c\uc238::\u6bb9\u965f\u52d3\u760c\u494c\u52d3, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u5d20\u7043\u88c5\u5db4\uf94d.\u7049\u5fe1\u4179\u9937\ubded> \ua6bd\u156b\uc9f6\ub32d\u40a9\u4bc8() {
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
            return:Optional<\u7049\u5fe1\u4179\u9937\ubded>(invokevirtual:Optional<\u7049\u5fe1\u4179\u9937\ubded>(\u8cae\uc87f\u8640\u836c\uc238::\u92ff\u5654\u1187\ucb79\u8d98\uae5d, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937> \u3e2a\u12cb\ud171\u7d52\ud171\u51fa() {
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
            return:Optional<\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937>(invokevirtual:Optional<\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937>(\u8cae\uc87f\u8640\u836c\uc238::\uc229\u3bd6\u4bc8\u61a4\ud7e8\u120d, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u64ab\u7006\u385b\ua3b4\u4e72> \u8d90\u4975\u0c95\uff55\u416d\u6198() {
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
            return:Optional<\u64ab\u7006\u385b\ua3b4\u4e72>(invokevirtual:Optional<\u64ab\u7006\u385b\ua3b4\u4e72>(\u8cae\uc87f\u8640\u836c\uc238::\u600f\u7af6\uae5d\u5db4\u6c52\uc84e, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u494c\u4975\ua068\u0c95\uc84e.\uae87\u36d3\uae87\u1187\u3dd3> \ub7dc\uc910\u6c56\u4ab3\uae5d\ud36e() {
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
            return:Optional<\uae87\u36d3\uae87\u1187\u3dd3>(invokevirtual:Optional<\uae87\u36d3\uae87\u1187\u3dd3>(\u8cae\uc87f\u8640\u836c\uc238::\u8d98\u47c2\u12cb\ubcb0\ucef1\u8258, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ubb2b\u64f2\u7330\u839e\ua068\uf94d> \u4c04\u183a\ua562\u56bd\u3d64\u7049() {
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
            return:Optional<\ubb2b\u64f2\u7330\u839e\ua068\uf94d>(invokevirtual:Optional<\ubb2b\u64f2\u7330\u839e\ua068\uf94d>(\u8cae\uc87f\u8640\u836c\uc238::\u98a4\u6198\u99f7\u71ae\uc2e8\ub113, getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, this:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    public final \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf995\u7049\u8258\u5654\u718f \u7af6\u156b\ub7dc\ua3b4\u7ce1\u7049() {
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
            return:\uf995\u7049\u8258\u5654\u718f(getfield:\uf995\u7049\u8258\u5654\u718f(\uc2e8\u9255\u647c\ud171\ubf56::\u97e6\uf9c5\ub7dc\u8709\u1833\ua3b4, this:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
        var_1_61 : int
        var_3_69 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        stack_89_0 : String [generated]
        
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
            var_1_61 = and:int(ldc:int(-70427130), ldc:int(-825426262))
            var_3_69 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>(\u759a\ud523\u61a4\u8640\u97b7\uc84e::\u5245\u4c04\ua3b4\u8bb0\uc87f\u6d99), this:\uc2e8\u9255\u647c\ud171\ubf56)
            
            if (cmpne:boolean(var_3_69:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-539197484))
                stack_89_0 = invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, var_3_69:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            }
            else {
                stack_89_0 = invokespecial:String(Object::toString, this:\uc2e8\u9255\u647c\ud171\ubf56[expected:Object])
            }
            
            return:String(stack_89_0:String)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u98a4\u4d85\u52d3\ub83f\u52d3\ufe34$20(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a p0) {
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
            return:String(invokevirtual:String(Object::toString, getfield:F extends \u93a2\u1187\u5654\u8413\u3a62\ua61f<FC>[expected:Object](\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a::\uc246\u51fa\u7330\u8258\u8640\u8aa5, p0:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\ucfaf\u416d\u6cfe\ub1b9\ufe34\u516c$19(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 p0) {
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
            return:String(invokevirtual:String(Object::toString, p0:\u5654\u9937\u72f1\ud4fe\u0c95[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ubf56\uc29a\u5245\u9937\ub32d\u74b1$18(\u516c\u3d64\u718f\ub171\u6b5f.\u52d3\u624e\u8bb0\u385b\u6198 p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8753\u4975\ubf56\u6b0d\u7e3f p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2, \u3504\ufe34\u600f\u6b0d\u69d9.\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf p3, int p4, int p5, int p6, int p7, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187 p8) {
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
            invokevirtual:void(\u34df\uceb8\u34df\u8640\u1187::\u3d64\u7af6\uc4d2\u6435\ufcaf\u3711, p8:\u34df\uceb8\u34df\u8640\u1187, p0:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd], p1:\u8753\u4975\ubf56\u6b0d\u7e3f, p2:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p3:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf[expected:Random], initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, p4:int, p5:int, add:int(p4:int, ldc:int(15)), add:int(p5:int, ldc:int(15))), initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, p6:int, p7:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap lambda$\u34df\u8bb0\uc238\ud7e8\u98a4\u0a06$17() {
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
    
    private it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap lambda$\u718f\ua068\u8cae\ub7dc\u4c2b\ub1b9$16() {
        var_3_74 : \u9a18\u16f6\u4179\u88c5\u3776
        
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
            var_3_74 = initobject:\u9a18\u16f6\u4179\u88c5\u3776(\u9a18\u16f6\u4179\u88c5\u3776::<init>, this:\uc2e8\u9255\u647c\ud171\ubf56, xor:int(ldc:int(8844), ldc:int(9868)), ldc:float(0.25f))
            invokevirtual:void(Long2FloatLinkedOpenHashMap::defaultReturnValue, var_3_74:\u9a18\u16f6\u4179\u88c5\u3776[expected:Long2FloatLinkedOpenHashMap], ldc:float(Float.NaN))
            return:Long2FloatLinkedOpenHashMap(var_3_74:\u9a18\u16f6\u4179\u88c5\u3776[expected:Long2FloatLinkedOpenHashMap])
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u494c\u4daf\u3bd6\u624e\uceb8\u3dd3$15(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa[expected:Enum<\u527a\u5f50\u92ff\ud36e\u3e75\u51fa>](\u5654\u9937\u72f1\ud4fe\u0c95::\u7c6b\u88c5\u69d9\u8753\u71ae\ucfaf, p0:\u5654\u9937\u72f1\ud4fe\u0c95))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u9033\u7bad\u4e72\ufcaf\u8aa5\ua562$14(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 lambda$\u3d64\ucfaf\u6ec6\u6bb9\ub6ab\u946b$13(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5654\u8258\u718f\u647c\uc9f6 p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf995\u7049\u8258\u5654\u718f p1, java.lang.Float p2, java.lang.Float p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u8cae\uc87f\u8640\u836c\uc238 p4) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(initobject:\uc2e8\u9255\u647c\ud171\ubf56(\uc2e8\u9255\u647c\ud171\ubf56::<init>, p0:\u5654\u8258\u718f\u647c\uc9f6, p1:\uf995\u7049\u8258\u5654\u718f, invokevirtual:float(Float::floatValue, p2:Float), invokevirtual:float(Float::floatValue, p3:Float), p4:\u8cae\uc87f\u8640\u836c\uc238, getstatic:\uae5d\u8d98\u7d52\u4f52\u51b2(\uae5d\u8d98\u7d52\u4f52\u51b2::\ua61f\u960f\u0b8e\u69d9\u34df\u98a4), getstatic:\u6198\uff55\u56bd\u8308\u4cd9(\u6198\uff55\u56bd\u8308\u4cd9::\u8d90\u7043\ubff1\u12b2\u0c95\u4975)))
        }
        
        goto(Label_0006)
    }
    
    private static \u927d\u92ff\u71ae\uafe7\u6bb9.\u8cae\uc87f\u8640\u836c\uc238 lambda$\u3bd6\u51b2\u7d52\u8df4\ub171\u7af6$12(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\u8cae\uc87f\u8640\u836c\uc238(getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, p0:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\uae5d\u47c2\u5654\ub171\u1833\ubf56$11(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\uc2e8\u9255\u647c\ud171\ubf56::\u52d3\u4bc8\ub32d\u76bc\u67d0\u4c04, p0:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u62da\u47c2\ucfaf\u61a4\u71ae\u5245$10(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\uc2e8\u9255\u647c\ud171\ubf56::\u3bd6\u4975\ub102\u4bc8\uc3e3\ube23, p0:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf995\u7049\u8258\u5654\u718f lambda$\u64f2\u93a2\ucb79\u36d3\ub6ab\ud36e$9(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\uf995\u7049\u8258\u5654\u718f(getfield:\uf995\u7049\u8258\u5654\u718f(\uc2e8\u9255\u647c\ud171\ubf56::\u97e6\uf9c5\ub7dc\u8709\u1833\ua3b4, p0:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5654\u8258\u718f\u647c\uc9f6 lambda$\u6bb9\u7006\u52d3\u4c2b\u7af6\u5bc4$8(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\u5654\u8258\u718f\u647c\uc9f6(getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, p0:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\uf9c5\u5654\u760c\uc3e3\u5245\u7049$7(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static \ub113\ufcaf\u3c25\u071d\u97b7.\u6198\uff55\u56bd\u8308\u4cd9 lambda$\u600f\u62da\u7873\ud36e\u56bd\u4cd9$6(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\u6198\uff55\u56bd\u8308\u4cd9(getfield:\u6198\uff55\u56bd\u8308\u4cd9(\uc2e8\u9255\u647c\ud171\ubf56::\u34df\uc9f6\u6d99\u983f\u8d98\u647c, p0:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 lambda$\u4d85\u8308\u4bc8\ud523\u5db4\u4492$5(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\uae5d\u8d98\u7d52\u4f52\u51b2(getfield:\uae5d\u8d98\u7d52\u4f52\u51b2(\uc2e8\u9255\u647c\ud171\ubf56::\uc31c\uc29a\u88c5\u7af6\u6d99\u36d3, p0:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    private static \u927d\u92ff\u71ae\uafe7\u6bb9.\u8cae\uc87f\u8640\u836c\uc238 lambda$\uceb8\u0b8e\u0a06\ubff1\ud4fe\ub19c$4(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\u8cae\uc87f\u8640\u836c\uc238(getfield:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u9033\u72f1\u4bc8\u67e9\uc84e\uc3e3, p0:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u527a\u93a2\u4975\u965f\u64f2\u76bc$3(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\uc2e8\u9255\u647c\ud171\ubf56::\u52d3\u4bc8\ub32d\u76bc\u67d0\u4c04, p0:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u3776\u600f\u120d\ubff1\uc2e8\u67d0$2(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\uc2e8\u9255\u647c\ud171\ubf56::\u3bd6\u4975\ub102\u4bc8\uc3e3\ube23, p0:\uc2e8\u9255\u647c\ud171\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf995\u7049\u8258\u5654\u718f lambda$\u88c5\ucef1\ub18d\u6d99\u759a\u6435$1(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\uf995\u7049\u8258\u5654\u718f(getfield:\uf995\u7049\u8258\u5654\u718f(\uc2e8\u9255\u647c\ud171\ubf56::\u97e6\uf9c5\ub7dc\u8709\u1833\ua3b4, p0:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5654\u8258\u718f\u647c\uc9f6 lambda$\ub7dc\u93a2\u624e\u4d85\uc7fe\u9a18$0(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\u5654\u8258\u718f\u647c\uc9f6(getfield:\u5654\u8258\u718f\u647c\uc9f6(\uc2e8\u9255\u647c\ud171\ubf56::\u1187\u600f\ud51e\u4975\u6c56\u0c95, p0:\uc2e8\u9255\u647c\ud171\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public void \uc2e8\u9255\u647c\ud171\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5654\u8258\u718f\u647c\uc9f6 p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf995\u7049\u8258\u5654\u718f p1, float p2, float p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u8cae\uc87f\u8640\u836c\uc238 p4, \u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 p5, \ub113\ufcaf\u3c25\u071d\u97b7.\u6198\uff55\u56bd\u8308\u4cd9 p6, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u9a18\u16f6\u4179\u88c5\u3776 p7) {
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
            invokespecial:\uc2e8\u9255\u647c\ud171\ubf56(\uc2e8\u9255\u647c\ud171\ubf56::<init>, this:\uc2e8\u9255\u647c\ud171\ubf56, p0:\u5654\u8258\u718f\u647c\uc9f6, p1:\uf995\u7049\u8258\u5654\u718f, p2:float, p3:float, p4:\u8cae\uc87f\u8640\u836c\uc238, p5:\uae5d\u8d98\u7d52\u4f52\u51b2, p6:\u6198\uff55\u56bd\u8308\u4cd9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u59ec\u8413\u97e6\uc229\u3776.\u718f\u120d\u4f4a\u156b\ucfaf \u12cb\u3d4b\u64ab\u760c\u0b8e\u4975() {
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
            return:\u718f\u120d\u4f4a\u156b\ucfaf(getstatic:\u718f\u120d\u4f4a\u156b\ucfaf(\uc2e8\u9255\u647c\ud171\ubf56::\u7d52\ud523\u12cb\ubefe\u5245\ua068))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u392e\u40a9\u88c5\u64f2\u6ec6\u61a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(-1141360999), ldc:int(-139723715))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc2e8\u9255\u647c\ud171\ubf56[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(1474721286))
        }
        else {
            var_3_660 = and:int(var_3_660:int, ldc:int(-6128517))
            var_5_8A = and:int(ldc:int(14546), ldc:int(-14547))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11668), ldc:int(11667)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_660:int, ldc:int(-71729735))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(8224), ldc:int(8225)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(257), ldc:int(4097)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_DA:int, ldc:int(-202247141))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(9346), ldc:int(9347)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-513562575))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2128196010))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1966401149))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-372354320))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1924638711))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1275642725))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-835271425))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1430302107))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1776694627))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1931987393))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-127152057))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-205916449))
                            var_11_EB = and:int(ldc:int(-24396), ldc:int(24329))
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1635538760))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1612923859))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1783915653))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-101728357))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1514893692))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1541814175))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1404391042))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-549839249))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-240058629))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(549353682))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2083396785))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-670178839))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1176238136))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-235129701))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(9760), ldc:int(9761))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(766876718))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(2035096965))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2020564564))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1309163811))
                        var_11_EB = and:int(ldc:int(13904), ldc:int(-13907))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1372790267))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(406991962))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1722832013))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-106546055))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1235:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1171516307))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1771966222))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-54879836))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-73187685))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(273040104))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1614196917))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(792104386))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1818640218))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-224541301))
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-1179994785))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(458520821))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-415859237))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-739358383))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1722666843))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-239337729))
                        var_17_66B = add:int(var_16_119:int, and:int(ldc:int(4227), ldc:int(9249)))
                        looporswitchbreak()
                    }
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(-1181957))
                
                if (cmple:boolean(var_5_8A = var_17_66B:int, sub:int(var_6_91:int, xor:int(ldc:int(-12032), ldc:int(-12031))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
