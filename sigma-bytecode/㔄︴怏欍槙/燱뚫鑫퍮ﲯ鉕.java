public class \u3504\ufe34\u600f\u6b0d\u69d9.\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255 {
    public void \u71f1\ub6ab\u946b\ud36e\ufcaf\u9255(float p0, float p1, int p2, int p3) {
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
        invokespecial:\ua61f\u16f6\u8258\u494c\u52d3\u760c(\ua61f\u16f6\u8258\u494c\u52d3\u760c::<init>, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)
        
        if (cmplt:boolean(p2:int, p3:int)) {
            putfield:float(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u4c2b\u8640\u2dcc\u965f\u0800\u3776, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255, p0:float)
            putfield:float(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u5245\ud171\u4f52\u7ce1\u965f\u47c2, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255, p1:float)
            putfield:int(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u7043\u927d\u965f\u34df\u59ec\u67e9, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255, p2:int)
            putfield:int(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\ucfaf\u873d\u9255\u6bb9\uc31c\u88c5, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255, p3:int)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u392e\u946b\u67d0\u97b7\ud12e\u8d90), and:int(ldc:int(-25103), ldc:int(25098)))), p2:int), loadelement:String(getstatic:String[](\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u392e\u946b\u67d0\u97b7\ud12e\u8d90), xor:int(ldc:int(-31992), ldc:int(-31991)))), p3:int), loadelement:String(getstatic:String[](\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u392e\u946b\u67d0\u97b7\ud12e\u8d90), xor:int(ldc:int(-16256), ldc:int(-16254)))))))
    }
    
    public boolean \ua562\u59ec\uc84e\u7e3f\u071d\u7043(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Random p3) {
        var_5_61 : int
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
            var_5_61 = and:int(ldc:int(322875533), ldc:int(259974957))
            
            if (cmpgt:boolean(f2d:double(invokevirtual:float(Random::nextFloat, p3:Random)), invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u93a2\u7049\u183a\u6cfe\u4e72\u5fe1, f2d:double(getfield:float(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u4c2b\u8640\u2dcc\u965f\u0800\u3776, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)), f2d:double(getfield:float(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u5245\ud171\u4f52\u7ce1\u965f\u47c2, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)), invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub6ab\u3711\u92ee\u52d3\uff55\ub70c, i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u120d\u62da\u69d9\u16f6\u6d99\u0800, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(getfield:int(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u7043\u927d\u965f\u34df\u59ec\u67e9, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)), i2d:double(getfield:int(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\ucfaf\u873d\u9255\u6bb9\uc31c\u88c5, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)))))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(268383549))
                stack_B8_0 = and:int(ldc:int(-549), ldc:int(548))
            }
            else {
                stack_B8_0 = and:int(ldc:int(2585), ldc:int(20773))
            }
            
            return:boolean(stack_B8_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<?> \u8308\u5654\u0b8e\u7873\uc31c\uc9f6() {
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
            return:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<?>(getstatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4::\u7af6\uc910\uc7fe\u4492\u0b8e\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u4cd9\u4ab3\u4bc8\ud158\ubf56\u0a06$4(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.lang.Integer lambda$\u3e2a\u93a2\u6b0d\u74b1\ua562\uae5d$3(\u3504\ufe34\u600f\u6b0d\u69d9.\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\ucfaf\u873d\u9255\u6bb9\uc31c\u88c5, p0:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u7e3f\u071d\u120d\u99f7\ucfaf\u7bad$2(\u3504\ufe34\u600f\u6b0d\u69d9.\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u7043\u927d\u965f\u34df\u59ec\u67e9, p0:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u0c95\u1187\u5fe1\u6c56\u3d4b\u927d$1(\u3504\ufe34\u600f\u6b0d\u69d9.\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u5245\ud171\u4f52\u7ce1\u965f\u47c2, p0:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\ud51e\u7043\u4cd9\u99f7\ubb2b\ub6ab$0(\u3504\ufe34\u600f\u6b0d\u69d9.\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\u4c2b\u8640\u2dcc\u965f\u0800\u3776, p0:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255)))
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
    
    public void \u6d99\u8aa5\u4f52\u6c52\ua3b4\u8aa5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_687 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_692 : int
        
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
        var_3_687 = and:int(ldc:int(364869534), ldc:int(599479837))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1024)), ldc:int(0))) {
            var_3_687 = and:int(var_3_687:int, ldc:int(-1951522815))
        }
        else {
            var_3_687 = and:int(var_3_687:int, ldc:int(637529932))
            var_5_8A = and:int(ldc:int(-9422), ldc:int(8397))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3813), ldc:int(-7910)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_687:int, ldc:int(553377550))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(89), ldc:int(1537)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(3593), ldc:int(369)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_687 = and:int(var_3_E3:int, ldc:int(-2013532227))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(516), ldc:int(517)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-7798649))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-750955925))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1728548211))
                    }
                    else {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1811672780))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0566)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-367239479))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-763466600))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(323271858))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(935032831))
                        var_11_F4 = and:int(ldc:int(18991), ldc:int(-20016))
                        goto(Label_1551)
                    }
                    
                    Label_0566:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-463069862))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-209981712))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1860916528))
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1711499620))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(2130665086))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0688:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1479051487))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(179895887))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-268825782))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1984796033))
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1807488283))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(2080102300))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(875022452))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1955756848))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1682262880))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-927268161))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-218139010))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(22561), ldc:int(9373))
                                goto(Label_1121)
                            }
                        }
                    }
                    
                    Label_0952:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-95666052))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-413975359))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1803165574))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-1787689537))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(44985672))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(2075909772))
                        var_11_F4 = and:int(ldc:int(5257), ldc:int(-5258))
                    }
                    
                    Label_1121:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1260518257))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1049453388))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0952)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(362014870))
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-165702570))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(603703087))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1245:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1286900283))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(2112968184))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(62346155))
                            goto(Label_1121)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-1350737338))
                            goto(Label_0952)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-789862036))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(798881045))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-189052929))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1551)
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-111882432))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-688816037))
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(724760246))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1348673589))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(944667972))
                        goto(Label_0566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-2028040446))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_687 = and:int(var_3_687:int, ldc:int(-574890354))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1551:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_692 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1562:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-687459420))
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1456728803))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1818753852))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1337551201))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1056663214))
                        var_17_692 = add:int(var_16_122:int, and:int(ldc:int(22657), ldc:int(281)))
                        looporswitchbreak()
                    }
                }
                
                var_3_687 = and:int(var_3_687:int, ldc:int(838817742))
                
                if (cmple:boolean(var_5_8A = var_17_692:int, sub:int(var_6_91:int, and:int(ldc:int(2645), ldc:int(12291))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_687 = and:int(var_3_687:int, ldc:int(-2043726071))
            goto(Label_0108)
        }
    }
}
