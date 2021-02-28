public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u47c2\u9af2\u67d0\uae5d\u92ee\u392e {
    public void \u47c2\u9af2\u67d0\uae5d\u92ee\u392e(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e, getstatic:ITextComponent(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u7bad\u3e75\u0b8e\u16f6\u6ec6\ua3b4))
            putfield:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\ud158\u965f\u7043\u4d85\u52d3\u6ec6, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e, getstatic:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a::\u51b2\u52d3\u446c\u4ab3\ubff1\u8d90))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u4e72\ubded\u3e2a\u4daf\ube23\ud7e8, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
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
    
    public java.lang.String \u8df4\u960f\uc9f6\uf94d\u5fe1\u3e75() {
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
            return:String(invokeinterface:String(ITextComponent::getString, getstatic:ITextComponent(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u600f\ub18d\u6198\u9a18\ub8be\u7d52)))
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u836c\ub102\ua61f\ua6bd\u9937\u88c5, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], and:int(ldc:int(-9188), ldc:int(931)))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e), getstatic:ITextComponent(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\ubf56\uc7fe\u3e2a\u5140\ud7e8\u8413), ldc:int(25), ldc:int(30), ldc:int(16777215))
            invokeinterface:int(\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a::\u4d85\u8308\u99f7\u3d4b\u7c6b\u1187, getfield:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\ud158\u965f\u7043\u4d85\u52d3\u6ec6, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:int(25), ldc:int(70), ldc:int(18), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4ab3\u527a\ud217\u3e2a\u7af6\u527a$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u4e72\ubded\u3e2a\u4daf\ube23\ud7e8, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4e72\ua3b4\u16f6\uc7fe\u7e3f\u0a06$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            
            if (invokevirtual:boolean(\u47c2\u67e9\ub1b9\u494c\u8cae\u6b5f::\u9af2\u8413\u6435\ud158\ubded\u1833, getfield:\u47c2\u67e9\ub1b9\u494c\u8cae\u6b5f(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\uf94d\u965f\u4cd9\u7049\u12cb\ub32d, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e))) {
                putfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uae87\ubded\u873d\u12b2\uc9f6\u7e3f, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e)), and:int[expected:boolean](ldc:int(259), ldc:int(13041)))
                invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e)))
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e), initobject:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::<init>, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u4e72\ubded\u3e2a\u4daf\ube23\ud7e8, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8F_0 : byte[] [generated]
        stack_91_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_23F_0 : byte[] [generated]
        stack_2C6_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1D7 : byte[]
        var_4_1D8 : int
        expr_91 : int [generated]
        var_5_228 : int
        var_3_22D : byte[]
        var_4_22E : int
        var_0_259 : int
        expr_23F : byte [generated]
        stack_291_2 : byte [generated]
        stack_265_0 : byte [generated]
        expr_B5 : int [generated]
        var_3_2B4 : byte[]
        var_4_2B5 : int
        expr_2C6 : byte [generated]
        var_3_E2 : String
        expr_EA : String[] [generated]
        expr_F4 : String[] [generated]
        var_3_16E : String[]
        
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
            var_0_5F = and:int(ldc:int(-751633475), ldc:int(-172757090))
            expr_65 = var_2_69 = stack_8F_0 = stack_91_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_23F_0 = stack_2C6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AOoFvgU9wwEuGv9BLoBXAsFCQbE9V0NuFIIFvgU9wwEuGv9BLoBXAsFCQbKTQuzUQ0LCBb4FPcMBLhr/QS6AVwLBQkGz0gOAA22XgZA="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1D7 = newarray:byte[](byte.class, expr_6D:int)
                var_4_1D8 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-612631883))
                    var_4_1D8 = add:int(var_4_1D8:int, ldc:int(-1))
                    storeelement:byte(var_3_1D7:byte[], var_4_1D8:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1D8:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1D8:int, and:int(ldc:int(12309), ldc:int(233)))), ldc:int(2)), xor:int(ldc:int(160), ldc:int(159)))))
                    
                    if (cmpne:boolean(var_4_1D8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_23F_0 = stack_2C6_0 = var_3_1D7:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(16519940))
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-143396970))
                    expr_91 = arraylength:int(stack_91_0:byte[])
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_5_228 = expr_91:int
                        var_3_22D = newarray:byte[](byte.class, expr_91:int)
                        var_4_22E = expr_91:int
                        
                        loop {
                            var_0_259 = and:int(var_0_5F:int, ldc:int(-675283044))
                            var_4_22E = add:int(var_4_22E:int, ldc:int(-1))
                            expr_23F = stack_291_2 = loadelement(stack_23F_0, var_4_22E)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_22E:int, ldc:int(1)), neg:int(var_5_228:int)), ldc:int(0))) {
                                stack_291_2 = stack_265_0 = add:byte(expr_23F:byte, loadelement:byte(var_3_22D:byte[], add:int(var_4_22E:int, ldc:int(1))))
                                goto(Label_0629)
                            }
                            
                            Label_0588:
                            
                            if (cmpne:boolean(and:int(var_0_259:int, ldc:int(65536)), ldc:int(0))) {
                                var_0_259 = and:int(var_0_259:int, ldc:int(726279361))
                            }
                            else {
                                var_0_259 = and:int(var_0_259:int, ldc:int(-705433602))
                                stack_291_2 = stack_265_0 = add:byte(expr_23F:byte, ldc:byte(1))
                            }
                            
                            Label_0629:
                            
                            if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(32768)), ldc:int(0))) {
                                var_0_259 = and:int(var_0_259:int, ldc:int(-792412258))
                                goto(Label_0588)
                            }
                            
                            var_0_5F = and:int(var_0_259:int, ldc:int(-676070444))
                            storeelement:byte(var_3_22D:byte[], var_4_22E:int, stack_291_2:byte)
                            
                            if (cmpne:boolean(var_4_22E:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_23F_0 = stack_2C6_0 = var_3_22D:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-236207649))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-578818153))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_2B4 = newarray:byte[](byte.class, expr_B5:int)
                        var_4_2B5 = expr_B5:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-750781732))
                            var_4_2B5 = add:int(var_4_2B5:int, ldc:int(-1))
                            expr_2C6 = loadelement:byte(stack_2C6_0:byte[], var_4_2B5:int)
                            storeelement:byte(var_3_2B4:byte[], var_4_2B5:int, add:int(xor:int(or:int(and:int(shl:int(expr_2C6:byte, and:int(ldc:int(18948), ldc:int(8238))), ldc:int(-16)), and:int(shr:int(expr_2C6:byte[expected:int], xor:int(ldc:int(4226), ldc:int(4230))), ldc:int(15))), ldc:int(87)), ldc:int(100)))
                            
                            if (cmpne:boolean(var_4_2B5:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_23F_0 = stack_2C6_0 = var_3_2B4:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1791148992))
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_EA = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16916), ldc:int(3396)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6790), ldc:int(9301)))
            storeelement:String(expr_EA:String[], and:int(ldc:int(3), ldc:int(4119)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-32176), ldc:int(12709)), xor:int(ldc:int(1232), ldc:int(1233))))
            storeelement:String(expr_EA:String[], xor:int(ldc:int(102), ldc:int(100)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(86), ldc:int(87)), and:int(ldc:int(4127), ldc:int(281))))
            storeelement:String(expr_EA:String[], and:int(ldc:int(8266), ldc:int(-8267)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(2328), ldc:int(2305)), xor:int(ldc:int(-28658), ldc:int(-28612))))
            storeelement:String(expr_EA:String[], xor:int(ldc:int(8193), ldc:int(8192)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(2447), ldc:int(2493)), and:int(ldc:int(591), ldc:int(16508))))
            putstatic:String[](\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u98a4\ud36e\u59ec\ud217\ud523\ucfaf, expr_F4:String[])
            var_3_16E = expr_EA:String[]
            putstatic:ITextComponent(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\ubf56\uc7fe\u3e2a\u5140\ud7e8\u8413, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_16E:String[], and:int(ldc:int(-3274), ldc:int(3145)))), getstatic:TextFormatting(TextFormatting::BOLD)))
            putstatic:ITextComponent(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\uae5d\u927d\u527a\u600f\u97b7\u7330, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_16E:String[], xor:int(ldc:int(16457), ldc:int(16456)))))
            putstatic:ITextComponent(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u7e3f\ud7e8\ucfaf\u9af2\u6b5f\uf94d, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_16E:String[], and:int(ldc:int(586), ldc:int(29062)))))
            putstatic:ITextComponent(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\u600f\ub18d\u6198\u9a18\ub8be\u7d52, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, getstatic:ITextComponent(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\ubf56\uc7fe\u3e2a\u5140\ud7e8\u8413)), loadelement:String(var_3_16E:String[], and:int(ldc:int(43), ldc:int(2755)))), getstatic:ITextComponent(\u47c2\u9af2\u67d0\uae5d\u92ee\u392e::\uae5d\u927d\u527a\u600f\u97b7\u7330)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_679 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
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
        var_3_679 = and:int(ldc:int(-416272488), ldc:int(-115409462))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u47c2\u9af2\u67d0\uae5d\u92ee\u392e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
            var_3_679 = and:int(var_3_679:int, ldc:int(-1420526104))
            var_5_81 = and:int(ldc:int(20791), ldc:int(-29496))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15423), ldc:int(15370)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_679:int, ldc:int(-2024046621))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(17408), ldc:int(17409)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(4135), ldc:int(257)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_679 = and:int(var_3_D1:int, ldc:int(596978133))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(24641), ldc:int(1555)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1470901795))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1141808524))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(4230717))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1173216693))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1882816516))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-2138957397))
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1441765167))
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(798535580))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0423:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1827928864))
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-267121657))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-581282862))
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-270905328))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(2132799361))
                        var_11_E2 = and:int(ldc:int(-2300), ldc:int(2296))
                        goto(Label_1525)
                    }
                    
                    Label_0588:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-988510845))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(254200290))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1457694796))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(142080700))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-2047964666))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(1337195506))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0722:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1427656443))
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1002684108))
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1465404628))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1562196504))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1664597364))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-377853550))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-2013626770))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(128)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(848132670))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-91690048))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1342754909))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(4099), ldc:int(321))
                                goto(Label_1143)
                            }
                        }
                    }
                    
                    Label_0976:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1579831071))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1728627703))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1139843893))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-2105200108))
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1154223318))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1412088929))
                        var_11_E2 = and:int(ldc:int(824), ldc:int(-825))
                    }
                    
                    Label_1143:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(256)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1681565878))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(596700607))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(375995621))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1101268513))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-650987128))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1265:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1429136706))
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1768771068))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1915943135))
                            goto(Label_1143)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-610453526))
                            goto(Label_0976)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(188333782))
                            goto(Label_0722)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1818193313))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-548328503))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1525)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(823899359))
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_679 = and:int(var_3_679:int, ldc:int(-1519260702))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1525:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_684 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1536:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-347860474))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1458194637))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-944449855))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(389584307))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1120464352))
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(256)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1141347910))
                        var_17_684 = add:int(var_16_110:int, xor:int(ldc:int(8964), ldc:int(8965)))
                        looporswitchbreak()
                    }
                }
                
                var_3_679 = and:int(var_3_679:int, ldc:int(1975351683))
                
                if (cmple:boolean(var_5_81 = var_17_684:int, sub:int(var_6_88:int, and:int(ldc:int(24583), ldc:int(2241))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
