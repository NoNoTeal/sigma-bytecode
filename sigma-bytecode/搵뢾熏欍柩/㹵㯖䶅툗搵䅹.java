public class \u6435\ub8be\u718f\u6b0d\u67e9.\u3e75\u3bd6\u4d85\ud217\u6435\u4179 {
    public void \u3e75\u3bd6\u4d85\ud217\u6435\u4179(\u494c\u4975\ua068\u0c95\uc84e.\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd p0) {
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
            invokespecial:\u3e75\u3bd6\u4d85\ud217\u6435\u4179(\u3e75\u3bd6\u4d85\ud217\u6435\u4179::<init>, this:\u3e75\u3bd6\u4d85\ud217\u6435\u4179, p0:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, invokevirtual:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc238\u6435\u7e3f\ud171\u97e6\u5654, p0:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3e75\u3bd6\u4d85\ud217\u6435\u4179(\u494c\u4975\ua068\u0c95\uc84e.\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f p1) {
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
    
    private static net.minecraft.util.text.ITextComponent lambda$\ua068\u3bd6\ub113\u6c56\u59ec\u0c95$3(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p1, \ub113\ufcaf\u3c25\u071d\u97b7.\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc p2) {
        var_3_5F : int
        var_3_68 : int
        var_5_6E : double
        stack_CF_0 : ITextComponent [generated]
        
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
        var_3_5F = and:int(ldc:int(703555459), ldc:int(734227419))
        
        if (cmpne:boolean(p0:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f, aconstnull:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f())) {
            var_3_68 = and:int(var_3_5F:int, ldc:int(2028437423))
            var_5_6E = invokevirtual:double(\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, p2:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, p1:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3)
            
            if (cmpne:boolean(var_5_6E:double, ldc:double(-1.0))) {
                var_3_68 = and:int(var_3_68:int, ldc:int(1827399045))
                stack_CF_0 = invokevirtual:ITextComponent(\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u8258\ud171\ud171\u93a2\u8bb0\ub171, p2:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6], initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, invokevirtual:String(\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae::toString, invokevirtual:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\u5fe1\u6d99\u12b2\u4179\u8753\u3bc9, p0:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f, d2i:int(var_5_6E:double)))))
            }
            else {
                stack_CF_0 = invokevirtual:ITextComponent(\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u8258\ud171\ud171\u93a2\u8bb0\ub171, p2:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6], initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3e75\u3bd6\u4d85\ud217\u6435\u4179::\uc238\u0b8e\ub7dc\u8308\u8413\u4ab3), and:int(ldc:int(2755), ldc:int(12586)))))
            }
            
            return:ITextComponent(stack_CF_0:ITextComponent)
        }
        
        return:ITextComponent(initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3e75\u3bd6\u4d85\ud217\u6435\u4179::\uc238\u0b8e\ub7dc\u8308\u8413\u4ab3), xor:int(ldc:int(-24480), ldc:int(-24479)))))
    }
    
    private static void lambda$\uf9c5\ubded\u3776\u2dcc\ud523\uafe7$2(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f p0, \u494c\u4975\ua068\u0c95\uc84e.\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p2, java.lang.Double p3) {
        var_4_61 : int
        
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
            var_4_61 = and:int(ldc:int(-620066142), ldc:int(-1722877838))
            
            if (cmpne:boolean(p0:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f, aconstnull:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f())) {
                if (cmpne:boolean(invokevirtual:double(Double::doubleValue, p3:Double), ldc:double(-1.0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(1026526074))
                    invokevirtual:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc2bd\u3e2a\u4c2b\u527a\ud12e\u9af2, p1:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, invokestatic:Optional<\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae>(Optional<T>::of, invokevirtual:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\u5fe1\u6d99\u12b2\u4179\u8753\u3bc9, p0:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f, invokevirtual:int(Double::intValue, p3:Double))))
                }
                else {
                    invokevirtual:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc2bd\u3e2a\u4c2b\u527a\ud12e\u9af2, p1:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, invokestatic:Optional<\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae>(Optional<T>::empty))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Double lambda$\u97b7\ud171\u760c\uc238\ua3b4\u3dd3$1(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f p0, \u494c\u4975\ua068\u0c95\uc84e.\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p2) {
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
    
    private static java.lang.Double lambda$\u2dcc\uc9f6\u873d\ub8be\u7873\u8cae$0(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae p1) {
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
            return:Double(invokestatic:Double(Double::valueOf, i2d:double(invokevirtual:int(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\u5245\u3a62\u6b0d\uc31c\u16f6\uf9c5, p0:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f, p1:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_20C : int
        expr_6B : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_143_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_17C_0 : byte[] [generated]
        stack_227_0 : byte[] [generated]
        stack_286_0 : byte[] [generated]
        stack_309_0 : byte[] [generated]
        stack_35A_0 : byte[] [generated]
        stack_3B0_0 : byte[] [generated]
        var_4_1F8 : int
        var_3_1FD : byte[]
        var_5_1FE : int
        var_0_27C : int
        expr_286 : byte [generated]
        stack_2C5_2 : byte [generated]
        stack_2A3_0 : byte [generated]
        expr_309 : byte [generated]
        expr_9D : int [generated]
        expr_CF : int [generated]
        var_2_107 : byte[]
        expr_10B : int [generated]
        var_3_348 : byte[]
        var_5_349 : int
        expr_145 : int [generated]
        var_3_39E : byte[]
        var_5_39F : int
        var_3_188 : String
        stack_1F1_0 : String[] [generated]
        expr_19A : String[] [generated]
        
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
        var_0_20C = and:int(ldc:int(-1259783307), ldc:int(-153519375))
        expr_6B = arraylength:int(stack_9B_0 = stack_9D_0 = stack_CD_0 = stack_CF_0 = stack_107_0 = stack_109_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_227_0 = stack_286_0 = stack_309_0 = stack_35A_0 = stack_3B0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("TNjUVNWJlmFYGFRZVVYVUcjY5Vha11GTWtaX2NRU1YmWYVgYVFlVVhVRyNipVNYY0xiYlVTVlhnY1FTViZZhWBhUWVVWFVHI2GiWk5iWVVeUFVdV4aM=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F8 = expr_6B:int
        var_3_1FD = newarray:byte[](byte.class, expr_6B:int)
        var_5_1FE = expr_6B:int
        Label_0512:
        
        while (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0598)
            }
            
            var_0_20C = and:int(var_0_20C:int, ldc:int(-750137537))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, add:byte(loadelement:byte(stack_227_0:byte[], var_5_1FE:int), ldc:byte(106)))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CD_0 = stack_CF_0 = stack_107_0 = stack_109_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_227_0 = stack_286_0 = stack_309_0 = stack_35A_0 = stack_3B0_0 = var_3_1FD:byte[]
            goto(Label_0112)
        }
        
        var_0_20C = and:int(var_0_20C:int, ldc:int(1083640774))
        goto(Label_0747)
        Label_0598:
        
        while (cmpne:boolean(and:int(var_0_20C:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20C:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_20C = and:int(var_0_20C:int, ldc:int(1179896799))
                goto(Label_0512)
            }
            
            var_0_27C = and:int(var_0_20C:int, ldc:int(-1192518985))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_286 = stack_2C5_2 = loadelement(stack_286_0, var_5_1FE)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FE:int, ldc:int(2)), neg:int(var_4_1F8:int)), ldc:int(0))) {
                stack_2C5_2 = stack_2A3_0 = add:byte(expr_286:byte, loadelement:byte(var_3_1FD:byte[], add:int(var_5_1FE:int, ldc:int(2))))
                goto(Label_0691)
            }
            
            Label_0659:
            
            if (cmpne:boolean(and:int(var_0_27C:int, ldc:int(524288)), ldc:int(0))) {
                var_0_27C = and:int(var_0_27C:int, ldc:int(-26530249))
                stack_2C5_2 = stack_2A3_0 = add:byte(expr_286:byte, ldc:byte(2))
            }
            
            Label_0691:
            
            if (cmpne:boolean(and:int(var_0_27C:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0659)
            }
            
            var_0_20C = and:int(var_0_27C:int, ldc:int(-1646288897))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, stack_2C5_2:byte)
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CD_0 = stack_CF_0 = stack_107_0 = stack_109_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_227_0 = stack_286_0 = stack_309_0 = stack_35A_0 = stack_3B0_0 = var_3_1FD:byte[]
            goto(Label_0162)
        }
        
        var_0_20C = and:int(var_0_20C:int, ldc:int(-1691971937))
        Label_0747:
        
        while (cmpne:boolean(and:int(var_0_20C:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0512)
            }
            
            var_0_20C = and:int(var_0_20C:int, ldc:int(300924663))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_309 = loadelement:byte(stack_309_0:byte[], var_5_1FE:int)
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, or:int(and:int(shl:int(expr_309:byte, xor:int(ldc:int(2093), ldc:int(2089))), ldc:int(-16)), and:int(shr:int(expr_309:byte[expected:int], xor:int(ldc:int(5697), ldc:int(5701))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CD_0 = stack_CF_0 = stack_107_0 = stack_109_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_227_0 = stack_286_0 = stack_309_0 = stack_35A_0 = stack_3B0_0 = var_3_1FD:byte[]
            goto(Label_0212)
        }
        
        goto(Label_0598)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(512)), ldc:int(0))) {
            var_0_20C = and:int(var_0_20C:int, ldc:int(1299859279))
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0212)
        }
        
        if (cmpne:boolean(and:int(var_0_20C:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_20C = and:int(var_0_20C:int, ldc:int(410594941))
            expr_9D = arraylength:int(stack_9D_0:byte[])
            
            if (cmpne:boolean(expr_9D:int, ldc:int(0))) {
                var_4_1F8 = expr_9D:int
                var_3_1FD = newarray:byte[](byte.class, expr_9D:int)
                var_5_1FE = expr_9D:int
                goto(Label_0598)
            }
        }
        
        Label_0162:
        
        if (cmpne:boolean(and:int(var_0_20C:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpne:boolean(and:int(var_0_20C:int, ldc:int(16384)), ldc:int(0))) {
            var_0_20C = and:int(var_0_20C:int, ldc:int(1079413508))
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_20C = and:int(var_0_20C:int, ldc:int(315195135))
            expr_CF = arraylength:int(stack_CF_0:byte[])
            
            if (cmpne:boolean(expr_CF:int, ldc:int(0))) {
                var_4_1F8 = expr_CF:int
                var_3_1FD = newarray:byte[](byte.class, expr_CF:int)
                var_5_1FE = expr_CF:int
                goto(Label_0747)
            }
        }
        
        Label_0212:
        
        if (cmpne:boolean(and:int(var_0_20C:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(1)), ldc:int(0))) {
                var_0_20C = and:int(var_0_20C:int, ldc:int(150951036))
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(1)), ldc:int(0))) {
                var_0_20C = and:int(var_0_20C:int, ldc:int(-1540819249))
                goto(Label_0112)
            }
            
            var_0_20C = and:int(var_0_20C:int, ldc:int(-1217819023))
            var_2_107 = stack_107_0:byte[]
            expr_10B = add:int(arraylength:int(stack_109_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_3_348 = newarray:byte[](byte.class, expr_10B:int)
                var_5_349 = expr_10B:int
                
                loop {
                    var_0_20C = and:int(var_0_20C:int, ldc:int(-1637909517))
                    var_5_349 = add:int(var_5_349:int, ldc:int(-1))
                    storeelement:byte(var_3_348:byte[], var_5_349:int, add:int(shl:int(loadelement:byte(stack_35A_0:byte[], var_5_349:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_107:byte[], add:int(var_5_349:int, and:int(ldc:int(17571), ldc:int(6221)))), ldc:int(2)), and:int(ldc:int(63), ldc:int(2751)))))
                    
                    if (cmpne:boolean(var_5_349:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_CD_0 = stack_CF_0 = stack_107_0 = stack_109_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_227_0 = stack_286_0 = stack_309_0 = stack_35A_0 = stack_3B0_0 = var_3_348:byte[]
            }
        }
        
        Label_0272:
        
        if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_20C = and:int(var_0_20C:int, ldc:int(355454495))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0212)
            }
            
            if (cmpne:boolean(and:int(var_0_20C:int, ldc:int(8)), ldc:int(0))) {
                var_0_20C = and:int(var_0_20C:int, ldc:int(1309010613))
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_20C = and:int(var_0_20C:int, ldc:int(-1140998287))
            expr_145 = arraylength:int(stack_145_0:byte[])
            
            if (cmpne:boolean(expr_145:int, ldc:int(0))) {
                var_3_39E = newarray:byte[](byte.class, expr_145:int)
                var_5_39F = expr_145:int
                
                loop {
                    var_0_20C = and:int(var_0_20C:int, ldc:int(1920954167))
                    var_5_39F = add:int(var_5_39F:int, ldc:int(-1))
                    storeelement:byte(var_3_39E:byte[], var_5_39F:int, xor:byte(loadelement:byte(stack_3B0_0:byte[], var_5_39F:int), ldc:byte(89)))
                    
                    if (cmpne:boolean(var_5_39F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_CD_0 = stack_CF_0 = stack_107_0 = stack_109_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_227_0 = stack_286_0 = stack_309_0 = stack_35A_0 = stack_3B0_0 = var_3_39E:byte[]
            }
        }
        
        Label_0330:
        
        if (cmpne:boolean(and:int(var_0_20C:int, ldc:int(262144)), ldc:int(0))) {
            var_0_20C = and:int(var_0_20C:int, ldc:int(1082148089))
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0212)
        }
        
        if (cmpne:boolean(and:int(var_0_20C:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0162)
        }
        
        if (cmpeq:boolean(and:int(var_0_20C:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_20C = and:int(var_0_20C:int, ldc:int(-901624833))
            goto(Label_0112)
        }
        
        var_3_188 = initobject:String(String::<init>, stack_17C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1F1_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(671), ldc:int(9507)))
        expr_19A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17451), ldc:int(259)))
        storeelement:String(expr_19A:String[], xor:int(ldc:int(2432), ldc:int(2434)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(17088), ldc:int(-17089)), and:int(ldc:int(18554), ldc:int(794))))
        storeelement:String(expr_19A:String[], and:int(ldc:int(-21188), ldc:int(21186)), invokevirtual:String[expected:String](String::substring, var_3_188:String, xor:int(ldc:int(17606), ldc:int(17628)), xor:int(ldc:int(8311), ldc:int(8256))))
        storeelement:String(expr_19A:String[], xor:int(ldc:int(272), ldc:int(273)), invokevirtual:String[expected:String](String::substring, var_3_188:String, xor:int(ldc:int(13478), ldc:int(13457)), xor:int(ldc:int(1138), ldc:int(1063))))
        putstatic:String[](\u3e75\u3bd6\u4d85\ud217\u6435\u4179::\uc238\u0b8e\ub7dc\u8308\u8413\u4ab3, expr_19A:String[])
    }
    
    public void \u9937\uf94d\ud4fe\ub102\u4179\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62A : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_CF : double
        var_3_E1 : int
        var_11_F2 : int
        var_14_11C : double
        var_16_120 : int
        var_12_118 : double
        var_17_635 : int
        
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
        var_3_62A = and:int(ldc:int(-1145395284), ldc:int(-1620484467))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e75\u3bd6\u4d85\ud217\u6435\u4179[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_62A = and:int(var_3_62A:int, ldc:int(-577066524))
        }
        else {
            var_3_62A = and:int(var_3_62A:int, ldc:int(-5992450))
            var_5_89 = and:int(ldc:int(8649), ldc:int(-8666))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-103), ldc:int(102)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E1 = and:int(var_3_62A:int, ldc:int(1004580584))
                    var_9_CF = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F2 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F2:int, sub:int(var_6_90:int, and:int(ldc:int(13057), ldc:int(121)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F2:int, and:int(ldc:int(4629), ldc:int(19529)))), var_7_9F:double))) {
                        inc:int(var_11_F2, ldc:int(1))
                    }
                    
                    var_3_62A = and:int(var_3_E1:int, ldc:int(997614986))
                    var_14_11C = var_7_9F:double
                    var_16_120 = var_11_F2:int
                }
                else {
                    var_11_F2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(2579), ldc:int(4165)))
                    var_12_118 = var_14_11C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_120 = var_11_F2:int, var_6_90:int)) {
                        var_9_CF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F2:int)
                        var_16_120 = var_11_F2:int
                        var_14_11C = var_12_118:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1913584972))
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-113189179))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-702755591))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1686587125))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1892232640))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-5904438))
                        
                        if (cmplt:boolean(var_16_120:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-129810666))
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1331670158))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(23820244))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-1687409010))
                            var_11_F2 = and:int(ldc:int(12872), ldc:int(-12891))
                            goto(Label_1477)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1666797976))
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-2048071734))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1011222962))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-605419891))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1624176694))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11C = var_9_CF:double
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(461980610))
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1563420033))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-928612818))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(2066433500))
                        var_14_11C = mul:double(ldc:double(0.5), add:double(var_9_CF:double, var_14_11C:double))
                    }
                    
                    Label_0814:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(859134352))
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-464375382))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-811186104))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1566138704))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-424889181))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-614154275))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F2 = and:int(ldc:int(9321), ldc:int(261))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0946:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1829475516))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-1177664397))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1147112195))
                        var_11_F2 = and:int(ldc:int(-29747), ldc:int(28722))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1297401894))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(882086571))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-585063117))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(2141250781))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                                goto(Label_1309)
                            }
                        }
                    }
                    
                    Label_1195:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(458819840))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(1556425896))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(459953370))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11C:double, var_5_89:int, var_16_120:int)
                        goto(Label_1477)
                    }
                    
                    Label_1309:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1918705309))
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(450614599))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(17380827))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-2010552596))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1238866945))
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(2031094511))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1354065266))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1472861417))
                        loopcontinue()
                    }
                    
                    var_3_62A = and:int(var_3_62A:int, ldc:int(-1145192961))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11C:double, ldc:double(0.0))
                    Label_1477:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_635 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1488:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-2141483713))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-2001246558))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-613765973))
                        var_17_635 = add:int(var_16_120:int, and:int(ldc:int(17193), ldc:int(8215)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62A = and:int(var_3_62A:int, ldc:int(-541753396))
                
                if (cmple:boolean(var_5_89 = var_17_635:int, sub:int(var_6_90:int, and:int(ldc:int(1025), ldc:int(16967))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
            var_3_62A = and:int(var_3_62A:int, ldc:int(2000018539))
            goto(Label_0108)
        }
    }
}
