public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\ub113\ufe34\u7e3f\u3c25\u156b\u718f {
    public void \ub113\ufe34\u7e3f\u3c25\u156b\u718f(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ub113\ufe34\u7e3f\u3c25\u156b\u718f, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
    
    private static com.mojang.datafixers.Typed lambda$\u67d0\u8258\u0b8e\u0800\u34df\u4ab3$1(com.mojang.datafixers.Typed p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u960f\u0800\u3504\ufcaf\ubf56\u93a2$0(com.mojang.serialization.Dynamic p0) {
        var_3_75 : Optional
        var_4_92 : UUID
        
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
        var_3_75 = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\ub113\ufe34\u7e3f\u3c25\u156b\u718f::\u8df4\u8350\u6c56\u0a06\u5db4\ud217), xor:int(ldc:int(40), ldc:int(41))))))
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_3_75:Optional))) {
            return:Dynamic(p0:Dynamic)
        }
        
        var_4_92 = invokestatic:UUID(UUID::fromString, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::get, var_3_75:Optional<String>)))
        return:Dynamic(invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, p0:Dynamic, loadelement:String(getstatic:String[](\ub113\ufe34\u7e3f\u3c25\u156b\u718f::\u8df4\u8350\u6c56\u0a06\u5db4\ud217), xor:int(ldc:int(-28480), ldc:int(-28479)))), loadelement:String(getstatic:String[](\ub113\ufe34\u7e3f\u3c25\u156b\u718f::\u8df4\u8350\u6c56\u0a06\u5db4\ud217), and:int(ldc:int(43), ldc:int(28934))), invokevirtual:Dynamic(Dynamic::createLong, p0:Dynamic, invokevirtual:long(UUID::getMostSignificantBits, var_4_92:UUID))), loadelement:String(getstatic:String[](\ub113\ufe34\u7e3f\u3c25\u156b\u718f::\u8df4\u8350\u6c56\u0a06\u5db4\ud217), xor:int(ldc:int(-20462), ldc:int(-20463))), invokevirtual:Dynamic(Dynamic::createLong, p0:Dynamic, invokevirtual:long(UUID::getLeastSignificantBits, var_4_92:UUID))))
    }
    
    static {
        var_0_1DF : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_1F1_0 : byte[] [generated]
        stack_25D_0 : byte[] [generated]
        stack_2E3_0 : byte[] [generated]
        stack_31D_0 : byte[] [generated]
        var_4_1C5 : int
        var_3_1CA : byte[]
        var_5_1CB : int
        expr_1F4 : byte [generated]
        var_0_253 : int
        expr_25D : byte [generated]
        stack_299_2 : byte [generated]
        stack_278_0 : byte [generated]
        expr_96 : int [generated]
        expr_C1 : int [generated]
        var_2_FA : byte[]
        expr_FE : int [generated]
        var_3_30C : byte[]
        var_5_30D : int
        var_3_13A : String
        stack_1BE_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_1DF = and:int(ldc:int(-1034196831), ldc:int(-597953647))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1F1_0 = stack_25D_0 = stack_2E3_0 = stack_31D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("/a6iTfLycR6yqo0mea7a3rIaGqLuncptXc3lTeI+boKBFdWYU9BIOIQ=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1C5 = expr_6B:int
        var_3_1CA = newarray:byte[](byte.class, expr_6B:int)
        var_5_1CB = expr_6B:int
        Label_0461:
        
        while (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(64)), ldc:int(0))) {
                var_0_1DF = and:int(var_0_1DF:int, ldc:int(-589260826))
                goto(Label_0569)
            }
            
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-980949045))
            var_5_1CB = add:int(var_5_1CB:int, ldc:int(-1))
            expr_1F4 = add:byte(loadelement:byte(stack_1F1_0:byte[], var_5_1CB:int), ldc:byte(98))
            storeelement:byte(var_3_1CA:byte[], var_5_1CB:int, or:int(and:int(shl:int(expr_1F4:byte, xor:int(ldc:int(18512), ldc:int(18516))), ldc:int(-16)), and:int(shr:int(expr_1F4:byte[expected:int], xor:int(ldc:int(10763), ldc:int(10767))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1F1_0 = stack_25D_0 = stack_2E3_0 = stack_31D_0 = var_3_1CA:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0703)
        Label_0569:
        
        while (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(8192)), ldc:int(0))) {
                var_0_1DF = and:int(var_0_1DF:int, ldc:int(-623355397))
                goto(Label_0461)
            }
            
            var_0_253 = and:int(var_0_1DF:int, ldc:int(-442009717))
            var_5_1CB = add:int(var_5_1CB:int, ldc:int(-1))
            expr_25D = stack_299_2 = loadelement(stack_25D_0, var_5_1CB)
            
            if (cmplt:boolean(add:int(add:int(var_5_1CB:int, ldc:int(5)), neg:int(var_4_1C5:int)), ldc:int(0))) {
                stack_299_2 = stack_278_0 = add:byte(expr_25D:byte, loadelement:byte(var_3_1CA:byte[], add:int(var_5_1CB:int, ldc:int(5))))
                goto(Label_0648)
            }
            
            Label_0618:
            
            if (cmpeq:boolean(and:int(var_0_253:int, ldc:int(4)), ldc:int(0))) {
                var_0_253 = and:int(var_0_253:int, ldc:int(-288132171))
                stack_299_2 = stack_278_0 = add:byte(expr_25D:byte, ldc:byte(5))
            }
            
            Label_0648:
            
            if (cmpne:boolean(and:int(var_0_253:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0618)
            }
            
            var_0_1DF = and:int(var_0_253:int, ldc:int(-1015583025))
            storeelement:byte(var_3_1CA:byte[], var_5_1CB:int, stack_299_2:byte)
            
            if (cmpne:boolean(var_5_1CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1F1_0 = stack_25D_0 = stack_2E3_0 = stack_31D_0 = var_3_1CA:byte[]
            goto(Label_0155)
        }
        
        Label_0703:
        
        while (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0461)
            }
            
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-956341813))
            var_5_1CB = add:int(var_5_1CB:int, ldc:int(-1))
            storeelement:byte(var_3_1CA:byte[], var_5_1CB:int, xor:byte(loadelement:byte(stack_2E3_0:byte[], var_5_1CB:int), ldc:byte(115)))
            
            if (cmpne:boolean(var_5_1CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1F1_0 = stack_25D_0 = stack_2E3_0 = stack_31D_0 = var_3_1CA:byte[]
            goto(Label_0198)
        }
        
        var_0_1DF = and:int(var_0_1DF:int, ldc:int(-708837117))
        goto(Label_0569)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-1926672447))
        }
        else {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-430969969))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_1C5 = expr_96:int
                var_3_1CA = newarray:byte[](byte.class, expr_96:int)
                var_5_1CB = expr_96:int
                goto(Label_0569)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(64)), ldc:int(0))) {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-81194888))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-253267741))
            expr_C1 = arraylength:int(stack_C1_0:byte[])
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_4_1C5 = expr_C1:int
                var_3_1CA = newarray:byte[](byte.class, expr_C1:int)
                var_5_1CB = expr_C1:int
                goto(Label_0703)
            }
        }
        
        Label_0198:
        
        if (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(788575352))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(8192)), ldc:int(0))) {
                var_0_1DF = and:int(var_0_1DF:int, ldc:int(-2052406648))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1DF = and:int(var_0_1DF:int, ldc:int(877366820))
                goto(Label_0112)
            }
            
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-987500817))
            var_2_FA = stack_FA_0:byte[]
            expr_FE = add:int(arraylength:int(stack_FC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_30C = newarray:byte[](byte.class, expr_FE:int)
                var_5_30D = expr_FE:int
                
                loop {
                    var_0_1DF = and:int(var_0_1DF:int, ldc:int(-83364725))
                    var_5_30D = add:int(var_5_30D:int, ldc:int(-1))
                    storeelement:byte(var_3_30C:byte[], var_5_30D:int, add:int(shl:int(loadelement:byte(stack_31D_0:byte[], var_5_30D:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_FA:byte[], add:int(var_5_30D:int, and:int(ldc:int(801), ldc:int(16393)))), ldc:int(6)), and:int(ldc:int(519), ldc:int(1323)))))
                    
                    if (cmpne:boolean(var_5_30D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1F1_0 = stack_25D_0 = stack_2E3_0 = stack_31D_0 = var_3_30C:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-1157501443))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(1)), ldc:int(0))) {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(227713698))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1BE_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2048), ldc:int(2052)))
        expr_14C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5), ldc:int(5636)))
        storeelement:String(expr_14C:String[], and:int(ldc:int(-4338), ldc:int(4337)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(-30222), ldc:int(30217)), and:int(ldc:int(275), ldc:int(22679))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(22593), ldc:int(257)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(31255), ldc:int(59)), xor:int(ldc:int(12300), ldc:int(12315))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(1091), ldc:int(8451)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(3127), ldc:int(8599)), and:int(ldc:int(4328), ldc:int(37))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(3298), ldc:int(4127)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(3616), ldc:int(24894)), xor:int(ldc:int(17536), ldc:int(17576))))
        putstatic:String[](\ub113\ufe34\u7e3f\u3c25\u156b\u718f::\u8df4\u8350\u6c56\u0a06\u5db4\ud217, expr_14C:String[])
    }
    
    public void \u647c\u12b2\u92ff\u183a\u516c\u88c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AC : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BA : double
        var_3_CC : int
        var_11_DD : int
        var_14_107 : double
        var_16_10B : int
        var_12_103 : double
        var_17_6B7 : int
        
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
        var_3_6AC = and:int(ldc:int(-477576754), ldc:int(-1148228233))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub113\ufe34\u7e3f\u3c25\u156b\u718f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1286617706))
            var_5_7D = and:int(ldc:int(-5899), ldc:int(5898))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29360), ldc:int(-31478)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BA = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CC = and:int(var_3_6AC:int, ldc:int(-275063529))
                    var_9_BA = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DD = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DD:int, sub:int(var_6_84:int, xor:int(ldc:int(18948), ldc:int(18949)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DD:int, and:int(ldc:int(10305), ldc:int(1315)))), var_7_93:double))) {
                        inc:int(var_11_DD, ldc:int(1))
                    }
                    
                    var_3_6AC = and:int(var_3_CC:int, ldc:int(-418775561))
                    var_14_107 = var_7_93:double
                    var_16_10B = var_11_DD:int
                }
                else {
                    var_11_DD = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-16319), ldc:int(-16320)))
                    var_12_103 = var_14_107 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10B = var_11_DD:int, var_6_84:int)) {
                        var_9_BA = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DD:int)
                        var_16_10B = var_11_DD:int
                        var_14_107 = var_12_103:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1004803523))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(366521472))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-905726854))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(239727584))
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1969459178))
                    }
                    else {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-83107970))
                        
                        if (cmplt:boolean(var_16_10B:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1299423734))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-417546111))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(121454726))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-953743490))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1986807121))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-282462746))
                            var_11_DD = and:int(ldc:int(19681), ldc:int(-19682))
                            goto(Label_1597)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0571:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(184487065))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(782354146))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-26447661))
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-257270384))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(627724635))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1088788105))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_107 = var_9_BA:double
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1702603097))
                        goto(Label_1608)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-251368583))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(404883517))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1091760952))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1806309925))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1848657029))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1419189393))
                        var_14_107 = mul:double(ldc:double(0.5), add:double(var_9_BA:double, var_14_107:double))
                    }
                    
                    Label_0846:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(905121344))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(181505840))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1432719780))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1534846757))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1213465762))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DD = and:int(ldc:int(1025), ldc:int(16795))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0964:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1427940742))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(832991554))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1070006608))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1280445577))
                        var_11_DD = and:int(ldc:int(-322), ldc:int(321))
                    }
                    
                    Label_1111:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(168676419))
                        goto(Label_1608)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-2132354317))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1005538713))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1247488392))
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-223201814))
                            goto(Label_0846)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(503870037))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1489308651))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1778540681))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1076157489))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1488391258))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DD:int, ldc:int(0))) {
                                goto(Label_1417)
                            }
                        }
                    }
                    
                    Label_1278:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-204018629))
                        goto(Label_1608)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(2074975017))
                            goto(Label_1111)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-205432690))
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-459532163))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(964475859))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-336633426))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_107:double, var_5_7D:int, var_16_10B:int)
                        goto(Label_1597)
                    }
                    
                    Label_1417:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-2038392184))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-754141057))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1773211024))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1149135736))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1302037776))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2070327839))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1458768281))
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-596501575))
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1711900494))
                        loopcontinue()
                    }
                    
                    var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1212416177))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_107:double, ldc:double(0.0))
                    Label_1597:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B7 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DD:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1608:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1337113976))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1375300102))
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1555497137))
                        var_17_6B7 = add:int(var_16_10B:int, and:int(ldc:int(1219), ldc:int(8193)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AC = and:int(var_3_6AC:int, ldc:int(743632384))
                }
                
                var_3_6AC = and:int(var_3_6AC:int, ldc:int(-217426481))
                
                if (cmple:boolean(var_5_7D = var_17_6B7:int, sub:int(var_6_84:int, and:int(ldc:int(18561), ldc:int(13825))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
