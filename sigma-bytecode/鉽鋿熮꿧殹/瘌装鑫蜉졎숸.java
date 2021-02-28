public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u88c5\u946b\u8709\uc84e\uc238 {
    public void \u760c\u88c5\u946b\u8709\uc84e\uc238(com.mojang.datafixers.schemas.Schema p0) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u760c\u88c5\u946b\u8709\uc84e\uc238, p0:Schema, and:int[expected:boolean](ldc:int(19508), ldc:int(-23605)))
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
    
    private com.mojang.datafixers.Typed<?> \u76bc\u6c56\u6c56\ubff1\uc9f6\u34df(com.mojang.datafixers.Typed<?> p0) {
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
    
    private static com.mojang.datafixers.Typed<?> \u12cb\u7af6\u5245\u8308\u51fa\u3dd3(com.mojang.datafixers.OpticFinder<?> p0, com.mojang.datafixers.OpticFinder<?> p1, com.mojang.datafixers.OpticFinder<java.util.List<com.mojang.datafixers.util.Pair<java.lang.String, com.mojang.serialization.Dynamic<?>>>> p2, com.mojang.datafixers.Typed<?> p3) {
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
    
    private static com.mojang.serialization.Dynamic<?> \u3bc9\u4f52\u4cd9\u92ff\ub19c\u3bd6(com.mojang.serialization.Dynamic<?> p0, com.mojang.serialization.Dynamic<?> p1, int p2, int p3) {
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
            return:Dynamic<?>(invokevirtual:Dynamic(Dynamic::createLongList, p0:Dynamic<?>, invokestatic:LongStream(LongStream::of, invokestatic:long[](\u760c\u88c5\u946b\u8709\uc84e\uc238::\u61a4\ua068\u6c52\u8413\ud523\u4f52, p2:int, p3:int, invokeinterface:long[](LongStream::toArray, invokevirtual:LongStream(Dynamic::asLongStream, p1:Dynamic<?>))))))
        }
        
        goto(Label_0006)
    }
    
    public static long[] \u61a4\ua068\u6c52\u8413\ud523\u4f52(int p0, int p1, long[] p2) {
        var_3_5F : int
        var_5_62 : int
        var_3_6D : int
        var_6_73 : long
        var_8_79 : int
        var_10_90 : long[]
        var_11_99 : int
        var_12_A2 : int
        var_13_A5 : long
        var_15_AE : int
        var_16_B9 : long
        stack_EB_0 : long [generated]
        var_3_1D6 : int
        var_18_EB : long
        var_20_F4 : int
        var_21_167 : int
        var_22_16E : int
        var_23_187 : int
        var_24_191 : int
        stack_23C_0 : long [generated]
        var_26_1EC : long
        var_3_257 : int
        var_25_25C : int
        
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
        var_3_5F = and:int(ldc:int(1171414208), ldc:int(1568242936))
        var_5_62 = arraylength:int(p2:long[])
        
        if (cmpne:boolean(var_5_62:int, ldc:int(0))) {
            var_3_6D = and:int(var_3_5F:int, ldc:int(1742069115))
            var_6_73 = sub:long(shl:long(ldc:long(1L), p1:int), ldc:long(1L))
            var_8_79 = div:int(ldc:int(64), p1:int)
            var_10_90 = newarray:long[](long.class, div:int(sub:int(add:int(p0:int, var_8_79:int), and:int(ldc:int(517), ldc:int(193))), var_8_79:int))
            var_11_99 = and:int(ldc:int(-1537), ldc:int(1536))
            var_12_A2 = and:int(ldc:int(-23875), ldc:int(22850))
            var_13_A5 = ldc:long(0L)
            var_15_AE = and:int(ldc:int(24321), ldc:int(-24394))
            var_16_B9 = loadelement:long(p2:long[], and:int(ldc:int(-19029), ldc:int(19028)))
            
            if (cmple:boolean(var_5_62:int, and:int(ldc:int(5383), ldc:int(16913)))) {
                var_3_6D = and:int(var_3_6D:int, ldc:int(-807863231))
                stack_EB_0 = ldc:long(0L)
            }
            else {
                stack_EB_0 = loadelement:long(p2:long[], and:int(ldc:int(1537), ldc:int(4107)))
            }
            
            var_3_1D6 = and:int(var_3_6D:int, ldc:int(1607589079))
            var_18_EB = stack_EB_0:long
            var_20_F4 = and:int(ldc:int(8869), ldc:int(-8888))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_1D6:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0313)
                }
                
                if (cmpne:boolean(and:int(var_3_1D6:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_1D6 = and:int(var_3_1D6:int, ldc:int(-814457649))
                    
                    if (cmplt:boolean(var_20_F4:int, p0:int)) {
                        var_21_167 = mul:int(var_20_F4:int, p1:int)
                        var_22_16E = shr:int(var_21_167:int, ldc:int(6))
                        var_23_187 = shr:int(sub:int(mul:int(add:int(var_20_F4:int, and:int(ldc:int(1643), ldc:int(129))), p1:int), and:int(ldc:int(3), ldc:int(4113))), ldc:int(6))
                        var_24_191 = xor:int(var_21_167:int, shl:int(var_22_16E:int, ldc:int(6)))
                        
                        if (cmpne:boolean(var_22_16E:int, var_15_AE:int)) {
                            var_16_B9 = var_18_EB:long
                            
                            if (cmpge:boolean(add:int(var_22_16E:int, and:int(ldc:int(641), ldc:int(29731))), var_5_62:int)) {
                                goto(Label_0520)
                            }
                            
                            stack_23C_0 = loadelement:long(p2:long[], add:int(var_22_16E:int, and:int(ldc:int(2561), ldc:int(13569))))
                            goto(Label_0567)
                        }
                        
                        Label_0410:
                        
                        if (cmpne:boolean(and:int(var_3_1D6:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_1D6 = and:int(var_3_1D6:int, ldc:int(-1784004567))
                            goto(Label_0520)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_1D6:int, ldc:int(64)), ldc:int(0))) {
                            var_3_1D6 = and:int(var_3_1D6:int, ldc:int(-673495435))
                        }
                        else {
                            var_3_1D6 = and:int(var_3_1D6:int, ldc:int(1341612008))
                            
                            if (cmpeq:boolean(var_22_16E:int, var_23_187:int)) {
                                var_26_1EC = and:long(ushr:long(var_16_B9:long, var_24_191:int), var_6_73:long)
                                goto(Label_0595)
                            }
                        }
                        
                        Label_0452:
                        
                        if (cmpne:boolean(and:int(var_3_1D6:int, ldc:int(64)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_1D6:int, ldc:int(256)), ldc:int(0))) {
                                var_3_1D6 = and:int(var_3_1D6:int, ldc:int(-44761625))
                                var_26_1EC = and:long(or:long(ushr:long(var_16_B9:long, var_24_191:int), shl:long(var_18_EB:long, sub:int(ldc:int(64), var_24_191:int))), var_6_73:long)
                                goto(Label_0595)
                            }
                            
                            goto(Label_0410)
                        }
                        
                        Label_0520:
                        
                        if (cmpeq:boolean(and:int(var_3_1D6:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0452)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_1D6:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_1D6 = and:int(var_3_1D6:int, ldc:int(-631325291))
                            goto(Label_0410)
                        }
                        
                        var_3_1D6 = and:int(var_3_1D6:int, ldc:int(-841458217))
                        stack_23C_0 = ldc:long(0L)
                        Label_0567:
                        var_3_1D6 = and:int(var_3_1D6:int, ldc:int(1565809730))
                        var_18_EB = stack_23C_0:long
                        var_15_AE = var_22_16E:int
                        goto(Label_0410)
                        Label_0595:
                        var_3_257 = and:int(var_3_1D6:int, ldc:int(-671163041))
                        var_25_25C = add:int(var_12_A2:int, p1:int)
                        
                        if (cmplt:boolean(var_25_25C:int, ldc:int(64))) {
                            var_3_257 = and:int(var_3_257:int, ldc:int(2136374768))
                            var_13_A5 = or:long(var_13_A5:long, shl:long(var_26_1EC:long, var_12_A2:int))
                            var_12_A2 = var_25_25C:int
                        }
                        else {
                            storeelement:long(var_10_90:long[], postincrement:int(1, var_11_99:int), var_13_A5:long)
                            var_13_A5 = var_26_1EC:long
                            var_12_A2 = p1:int
                        }
                        
                        var_3_1D6 = and:int(var_3_257:int, ldc:int(-707265333))
                        inc:int(var_20_F4, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                Label_0271:
                
                if (cmpeq:boolean(and:int(var_3_1D6:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_1D6 = and:int(var_3_1D6:int, ldc:int(-1100138119))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_1D6:int, ldc:int(512)), ldc:int(0))) {
                        var_3_1D6 = and:int(var_3_1D6:int, ldc:int(367145426))
                        loopcontinue()
                    }
                    
                    var_3_1D6 = and:int(var_3_1D6:int, ldc:int(1339751675))
                    
                    if (cmpne:boolean(var_13_A5:long, ldc:long(0L))) {
                        storeelement:long(var_10_90:long[], var_11_99:int, var_13_A5:long)
                    }
                }
                
                Label_0313:
                
                if (cmpeq:boolean(and:int(var_3_1D6:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_1D6 = and:int(var_3_1D6:int, ldc:int(-1368817447))
                    goto(Label_0271)
                }
                
                if (cmpne:boolean(and:int(var_3_1D6:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_1D6 = and:int(var_3_1D6:int, ldc:int(1913646434))
            }
            
            return:long[](var_10_90:long[])
        }
        
        return:long[](p2:long[])
    }
    
    private static com.mojang.datafixers.Typed lambda$\u5654\u624e\ua068\ub83f\u8d90\uc29a$10(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.Typed p2) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u0a06\uc246\u6ec6\uf94d\ud36e\u7c6b$9(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u0c95\u4bc8\ubff1\u960f\u8258\ua61f$8(int p0, com.mojang.serialization.Dynamic p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u3a62\u6198\u7e3f\ub171\ud36e\u120d$7(com.mojang.serialization.Dynamic p0, int p1, com.mojang.serialization.Dynamic p2) {
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
            return:Dynamic(invokestatic:Dynamic<?>(\u760c\u88c5\u946b\u8709\uc84e\uc238::\u3bc9\u4f52\u4cd9\u92ff\ub19c\u3bd6, p0:Dynamic, p2:Dynamic, and:int(ldc:int(4353), ldc:int(13346)), p1:int))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u4c2b\u4f4a\u7af6\uc9f6\u071d\u3504$6(java.util.List p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, invokestatic:int(Math::max, and:int(ldc:int(8470), ldc:int(16900)), invokestatic:int(DataFixUtils::ceillog2, invokeinterface:int(List::size, p0:List)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\ubff1\u6198\u494c\u6198\u6fb0\uc9f6$5(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\ua61f\u527a\u516c\u527a\uc4d2\ufe34$4(com.mojang.serialization.Dynamic p0, com.mojang.serialization.Dynamic p1) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$null$3(com.mojang.serialization.Dynamic p0, com.mojang.datafixers.util.Pair p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u8640\ub32d\u3c25\u8350\u156b\u6c52$2(com.mojang.serialization.Dynamic p0, com.mojang.serialization.Dynamic p1) {
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
            return:Dynamic(invokestatic:Dynamic<?>(\u760c\u88c5\u946b\u8709\uc84e\uc238::\u3bc9\u4f52\u4cd9\u92ff\ub19c\u3bd6, p0:Dynamic, p1:Dynamic, xor:int(ldc:int(159), ldc:int(415)), ldc:int(9)))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.Typed lambda$\uc2bd\uf995\u8350\u67d0\u071d\u983f$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.Typed p4) {
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
    
    private com.mojang.datafixers.Typed lambda$\u5f50\uc238\u71ae\uc229\u3d64\ub83f$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.Typed p3) {
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
            return:Typed(invokespecial:Typed<?>(\u760c\u88c5\u946b\u8709\uc84e\uc238::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df, this:\u760c\u88c5\u946b\u8709\uc84e\uc238, invokestatic:Typed<?>(\u760c\u88c5\u946b\u8709\uc84e\uc238::\u12cb\u7af6\u5245\u8308\u51fa\u3dd3, p0:OpticFinder, p1:OpticFinder, p2:OpticFinder, p3:Typed)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2D3 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_22B_0 : byte[] [generated]
        stack_27F_0 : byte[] [generated]
        stack_2E6_0 : byte[] [generated]
        stack_364_0 : byte[] [generated]
        var_4_20C : int
        var_3_211 : byte[]
        var_5_212 : int
        expr_22E : byte [generated]
        var_0_300 : int
        expr_2E6 : byte [generated]
        stack_32F_2 : byte [generated]
        stack_303_0 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_26D : byte[]
        var_5_26E : int
        expr_D9 : int [generated]
        expr_109 : int [generated]
        var_3_352 : byte[]
        var_5_353 : int
        var_3_14B : String
        stack_205_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
        var_0_2D3 = and:int(ldc:int(1320830706), ldc:int(-17137998))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_22B_0 = stack_27F_0 = stack_2E6_0 = stack_364_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("hKdDt1h7WqJcpKNfp3VRhlNSuatculuydKhYr1qPoFyso3FcvF9fo1hQXqSMqEhdRFWkuKCjZHNoZmVS")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_20C = expr_6E:int
        var_3_211 = newarray:byte[](byte.class, expr_6E:int)
        var_5_212 = expr_6E:int
        Label_0532:
        
        while (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_2D3 = and:int(var_0_2D3:int, ldc:int(2012106742))
            var_5_212 = add:int(var_5_212:int, ldc:int(-1))
            expr_22E = xor:byte(loadelement:byte(stack_22B_0:byte[], var_5_212:int), ldc:byte(84))
            storeelement:byte(var_3_211:byte[], var_5_212:int, or:int(and:int(shl:int(expr_22E:byte, and:int(ldc:int(10447), ldc:int(5684))), ldc:int(-16)), and:int(shr:int(expr_22E:byte[expected:int], and:int(ldc:int(525), ldc:int(5124))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_212:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_22B_0 = stack_27F_0 = stack_2E6_0 = stack_364_0 = var_3_211:byte[]
            goto(Label_0115)
        }
        
        Label_0710:
        
        while (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_300 = and:int(var_0_2D3:int, ldc:int(-982526021))
            var_5_212 = add:int(var_5_212:int, ldc:int(-1))
            expr_2E6 = stack_32F_2 = loadelement(stack_2E6_0, var_5_212)
            
            if (cmplt:boolean(add:int(add:int(var_5_212:int, ldc:int(5)), neg:int(var_4_20C:int)), ldc:int(0))) {
                stack_32F_2 = stack_303_0 = add:byte(expr_2E6:byte, loadelement:byte(var_3_211:byte[], add:int(var_5_212:int, ldc:int(5))))
                goto(Label_0787)
            }
            
            Label_0755:
            
            if (cmpne:boolean(and:int(var_0_300:int, ldc:int(524288)), ldc:int(0))) {
                var_0_300 = and:int(var_0_300:int, ldc:int(-819246662))
                stack_32F_2 = stack_303_0 = add:byte(expr_2E6:byte, ldc:byte(5))
            }
            
            Label_0787:
            
            if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(2)), ldc:int(0))) {
                var_0_300 = and:int(var_0_300:int, ldc:int(1615096545))
                goto(Label_0755)
            }
            
            var_0_2D3 = and:int(var_0_300:int, ldc:int(-939858954))
            storeelement:byte(var_3_211:byte[], var_5_212:int, stack_32F_2:byte)
            
            if (cmpne:boolean(var_5_212:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_22B_0 = stack_27F_0 = stack_2E6_0 = stack_364_0 = var_3_211:byte[]
            goto(Label_0222)
        }
        
        var_0_2D3 = and:int(var_0_2D3:int, ldc:int(336047000))
        goto(Label_0532)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(16)), ldc:int(0))) {
            var_0_2D3 = and:int(var_0_2D3:int, ldc:int(1106500075))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2D3 = and:int(var_0_2D3:int, ldc:int(-1342042126))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_2D3 = and:int(var_0_2D3:int, ldc:int(1684962743))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_26D = newarray:byte[](byte.class, expr_A9:int)
                var_5_26E = expr_A9:int
                
                loop {
                    var_0_2D3 = and:int(var_0_2D3:int, ldc:int(1852800959))
                    var_5_26E = add:int(var_5_26E:int, ldc:int(-1))
                    storeelement:byte(var_3_26D:byte[], var_5_26E:int, add:int(shl:int(loadelement:byte(stack_27F_0:byte[], var_5_26E:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_26E:int, xor:int(ldc:int(16481), ldc:int(16480)))), ldc:int(4)), and:int(ldc:int(15), ldc:int(4207)))))
                    
                    if (cmpne:boolean(var_5_26E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_22B_0 = stack_27F_0 = stack_2E6_0 = stack_364_0 = var_3_26D:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_2D3 = and:int(var_0_2D3:int, ldc:int(1691621761))
                goto(Label_0115)
            }
            
            var_0_2D3 = and:int(var_0_2D3:int, ldc:int(-813801734))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_20C = expr_D9:int
                var_3_211 = newarray:byte[](byte.class, expr_D9:int)
                var_5_212 = expr_D9:int
                goto(Label_0710)
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_2D3 = and:int(var_0_2D3:int, ldc:int(1620031464))
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2D3 = and:int(var_0_2D3:int, ldc:int(-18123269))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_352 = newarray:byte[](byte.class, expr_109:int)
                var_5_353 = expr_109:int
                
                loop {
                    var_0_2D3 = and:int(var_0_2D3:int, ldc:int(1861187506))
                    var_5_353 = add:int(var_5_353:int, ldc:int(-1))
                    storeelement:byte(var_3_352:byte[], var_5_353:int, add:byte(loadelement:byte(stack_364_0:byte[], var_5_353:int), ldc:byte(56)))
                    
                    if (cmpne:boolean(var_5_353:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_22B_0 = stack_27F_0 = stack_2E6_0 = stack_364_0 = var_3_352:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(32)), ldc:int(0))) {
            var_0_2D3 = and:int(var_0_2D3:int, ldc:int(616805752))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(2)), ldc:int(0))) {
            var_0_2D3 = and:int(var_0_2D3:int, ldc:int(-1719303565))
            goto(Label_0174)
        }
        
        if (cmpeq:boolean(and:int(var_0_2D3:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_205_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3094), ldc:int(4358)))
            expr_15D = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(25095), ldc:int(25089)))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(2125), ldc:int(2126)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-20203), ldc:int(19562)), xor:int(ldc:int(2127), ldc:int(2141))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(98), ldc:int(102)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(630), ldc:int(18)), xor:int(ldc:int(513), ldc:int(540))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(1285), ldc:int(25167)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(326), ldc:int(347)), and:int(ldc:int(2279), ldc:int(8743))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(16765), ldc:int(-16766)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(47), ldc:int(18087)), and:int(ldc:int(44), ldc:int(30701))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(651), ldc:int(649)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(8940), ldc:int(6189)), xor:int(ldc:int(-12241), ldc:int(-12260))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(4124), ldc:int(4125)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(8424), ldc:int(8411)), xor:int(ldc:int(-31936), ldc:int(-31877))))
            putstatic:String[](\u760c\u88c5\u946b\u8709\uc84e\uc238::\u56bd\ubcb0\u446c\u3776\u3e2a\u56bd, expr_15D:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ud158\uc4d2\u624e\u7bad\u4f52\u3504(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_669 : int
        
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
        var_3_65E = and:int(ldc:int(1076605508), ldc:int(2129615183))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u760c\u88c5\u946b\u8709\uc84e\uc238[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
            var_3_65E = and:int(var_3_65E:int, ldc:int(669744680))
            var_5_81 = and:int(ldc:int(-11924), ldc:int(3218))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19474), ldc:int(19473)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_65E:int, ldc:int(945281562))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, and:int(ldc:int(16465), ldc:int(803)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(6144), ldc:int(6145)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_65E = and:int(var_3_D0:int, ldc:int(-1101825941))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(20737), ldc:int(20736)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1424563038))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1095696100))
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(2142586151))
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(214474956))
                        goto(Label_0570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1587414899))
                    }
                    else {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-864576158))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0570)
                            }
                            
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0408:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1863398007))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1881222317))
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1696464700))
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(12967092))
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1272450051))
                        var_11_E1 = and:int(ldc:int(2077), ldc:int(-2078))
                        goto(Label_1499)
                    }
                    
                    Label_0570:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(670195750))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1717212702))
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-783100694))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-629870366))
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-559818995))
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1943013329))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0701:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(484214476))
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1630179584))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1255250552))
                            goto(Label_0570)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(2038141523))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0821:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(839256136))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1473774173))
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1766786661))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1852189318))
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-878766967))
                            goto(Label_0570)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-265237946))
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-520754247))
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-50651636))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = xor:int(ldc:int(4272), ldc:int(4273))
                                goto(Label_1147)
                            }
                        }
                    }
                    
                    Label_0971:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1240366355))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(696925109))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-55449943))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1203669415))
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1818900466))
                            goto(Label_0570)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-851537849))
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1607929889))
                        var_11_E1 = and:int(ldc:int(1566), ldc:int(-3615))
                    }
                    
                    Label_1147:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-637394219))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0971)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1467236835))
                            goto(Label_0570)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1282950991))
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-143683459))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1384)
                            }
                        }
                    }
                    
                    Label_1259:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(787947909))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(192775023))
                            goto(Label_1147)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0971)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-259939251))
                            goto(Label_0570)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(793753699))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1384:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1081095685))
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(417464840))
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65E = and:int(var_3_65E:int, ldc:int(392419535))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_669 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-951001296))
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1401674561))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-36668131))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1555302668))
                        goto(Label_0570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-187525891))
                        goto(Label_0408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1608018624))
                        var_17_669 = add:int(var_16_10F:int, xor:int(ldc:int(-32574), ldc:int(-32573)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65E = and:int(var_3_65E:int, ldc:int(-195084359))
                
                if (cmple:boolean(var_5_81 = var_17_669:int, sub:int(var_6_88:int, xor:int(ldc:int(4160), ldc:int(4161))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
