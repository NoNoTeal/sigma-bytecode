public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562 {
    public void \u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.Dynamic<?> \ubb2b\ua6bd\ub102\u156b\ub1b9\u51fa(com.mojang.serialization.Dynamic<?> p0, boolean p1, boolean p2) {
        var_4_74 : int
        var_6_102 : int
        var_1_113 : Dynamic
        var_7_141 : int[]
        var_1_17A : Dynamic
        var_1_1B2 : Dynamic
        
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
        var_4_74 = and:int(ldc:int(2092753975), ldc:int(998239732))
        
        if (logicalnot:boolean(p1:boolean)) {
            if (logicalnot:boolean(p2:boolean)) {
                goto(Label_0145)
            }
        }
        
        Label_0103:
        
        if (cmpeq:boolean(and:int(var_4_74:int, ldc:int(16777216)), ldc:int(0))) {
            var_4_74 = and:int(var_4_74:int, ldc:int(-1203900931))
            
            if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asNumber, invokevirtual:OptionalDynamic(Dynamic::get, var_1_27B:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(-13444), ldc:int(13443))))))))) {
                if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asNumber, invokevirtual:OptionalDynamic(Dynamic::get, var_1_27B:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(3717), ldc:int(8241))))))))) {
                    var_4_74 = and:int(var_4_74:int, ldc:int(-29754252))
                    var_6_102 = rem:int(invokevirtual:byte[expected:int](OptionalDynamic::asByte, invokevirtual:OptionalDynamic(Dynamic::get, var_1_27B:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(24598), ldc:int(5062)))), and:int[expected:byte](ldc:int(2477), ldc:int(-2494))), arraylength:int(getstatic:int[][](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\uc7fe\u4cd9\u3d64\uc4d2\u8cae\u6435)))
                    var_1_113 = invokevirtual:Dynamic(Dynamic::remove, var_1_27B:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), xor:int(ldc:int(264), ldc:int(270))))
                }
                else {
                    var_6_102 = rem:int(invokevirtual:byte[expected:int](OptionalDynamic::asByte, invokevirtual:OptionalDynamic(Dynamic::get, var_1_27B:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), xor:int(ldc:int(1280), ldc:int(1281)))), and:int[expected:byte](ldc:int(-22838), ldc:int(22801))), arraylength:int(getstatic:int[][](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\uc7fe\u4cd9\u3d64\uc4d2\u8cae\u6435)))
                    var_7_141 = loadelement:int[](getstatic:int[][](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\uc7fe\u4cd9\u3d64\uc4d2\u8cae\u6435), var_6_102:int)
                    var_1_17A = invokevirtual:Dynamic(Dynamic::set, var_1_27B:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(4738), ldc:int(17410))), invokevirtual:Dynamic(Dynamic::createInt, var_1_27B:Dynamic, add:int(invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, var_1_27B:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(610), ldc:int(4358)))), and:int(ldc:int(31267), ldc:int(-31336))), loadelement:int(var_7_141:int[], and:int(ldc:int(-3986), ldc:int(1937))))))
                    var_1_1B2 = invokevirtual:Dynamic(Dynamic::set, var_1_17A:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(16431), ldc:int(275))), invokevirtual:Dynamic(Dynamic::createInt, var_1_17A:Dynamic, add:int(invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, var_1_17A:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(24611), ldc:int(1303)))), and:int(ldc:int(-18188), ldc:int(17923))), loadelement:int(var_7_141:int[], and:int(ldc:int(325), ldc:int(515))))))
                    var_1_113 = invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::set, var_1_1B2:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(2636), ldc:int(1046))), invokevirtual:Dynamic(Dynamic::createInt, var_1_1B2:Dynamic, add:int(invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, var_1_1B2:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(213), ldc:int(44)))), and:int(ldc:int(7345), ldc:int(-7346))), loadelement:int(var_7_141:int[], xor:int(ldc:int(20528), ldc:int(20530)))))), loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(65), ldc:int(20497))))
                    
                    if (p2:boolean) {
                        if (invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asNumber, invokevirtual:OptionalDynamic(Dynamic::get, var_1_113:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), xor:int(ldc:int(-24315), ldc:int(-24320)))))))) {
                            var_1_113 = invokevirtual:Dynamic(Dynamic::set, var_1_113:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(1141), ldc:int(2701))), invokevirtual:Dynamic(Dynamic::createByte, var_1_113:Dynamic, i2b:byte(mul:int(invokevirtual:byte(OptionalDynamic::asByte, invokevirtual:OptionalDynamic(Dynamic::get, var_1_113:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), xor:int(ldc:int(2592), ldc:int(2597)))), and:int[expected:byte](ldc:int(20051), ldc:int(-28276))), xor:int(ldc:int(16440), ldc:int(16442))))))
                        }
                    }
                }
                
                var_1_27B = invokevirtual:Dynamic(Dynamic::set, var_1_113:Dynamic, loadelement:String(getstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068), and:int(ldc:int(26152), ldc:int(-26282))), invokevirtual:Dynamic(Dynamic::createByte, var_1_113:Dynamic, i2b:byte(var_6_102:int)))
            }
        }
        
        Label_0145:
        
        if (cmpeq:boolean(and:int(var_4_74:int, ldc:int(524288)), ldc:int(0))) {
            var_4_74 = and:int(var_4_74:int, ldc:int(1974485472))
            goto(Label_0103)
        }
        
        return:Dynamic<?>(var_1_27B:Dynamic)
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
    
    private com.mojang.datafixers.Typed lambda$\u416d\u97e6\u3504\u92ff\u960f\ua068$5(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.Typed p2) {
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
    
    private com.mojang.datafixers.Typed lambda$\u527a\u8aa5\u647c\u7049\u7330\u600f$4(com.mojang.datafixers.Typed p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$null$3(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(invokespecial:Dynamic<?>(\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\ubb2b\ua6bd\ub102\u156b\ub1b9\u51fa, this:\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562, p0:Dynamic, and:int[expected:boolean](ldc:int(4340), ldc:int(-4343)), and:int[expected:boolean](ldc:int(25617), ldc:int(4655))))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.Typed lambda$\ucb79\u5fe1\u385b\uc84e\u6c52\u7bad$2(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.Typed p2) {
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
    
    private com.mojang.datafixers.Typed lambda$null$1(com.mojang.datafixers.Typed p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$\u8258\u6b0d\u71ae\u7ce1\ub113\u8258$0(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(invokespecial:Dynamic<?>(\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\ubb2b\ua6bd\ub102\u156b\ub1b9\u51fa, this:\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562, p0:Dynamic, xor:int[expected:boolean](ldc:int(8704), ldc:int(8705)), and:int[expected:boolean](ldc:int(-7307), ldc:int(7178))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3A3 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_3B6_0 : byte[] [generated]
        stack_407_0 : byte[] [generated]
        stack_46E_0 : byte[] [generated]
        stack_4E2_0 : byte[] [generated]
        var_4_38E : int
        var_3_393 : byte[]
        var_5_394 : int
        expr_3B6 : byte [generated]
        var_0_464 : int
        expr_46E : byte [generated]
        stack_4AD_2 : byte [generated]
        stack_48A_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_3F5 : byte[]
        var_5_3F6 : int
        expr_C3 : int [generated]
        expr_FC : int [generated]
        var_3_4D0 : byte[]
        var_5_4D1 : int
        var_3_13D : String
        stack_27E_0 : String[] [generated]
        expr_14F : String[] [generated]
        expr_286 : int[][] [generated]
        stack_2CA_1 : int [generated]
        expr_298 : int[] [generated]
        stack_306_1 : int [generated]
        expr_2DA : int[] [generated]
        stack_342_1 : int [generated]
        expr_316 : int[] [generated]
        stack_384_1 : int [generated]
        expr_352 : int[] [generated]
        
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
        var_0_3A3 = and:int(ldc:int(404928651), ldc:int(-987169632))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_3B6_0 = stack_407_0 = stack_46E_0 = stack_4E2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("QAavTAbv+yTvBgSzQh7lFgqnUNseoV7pEvmxTiqTRh7lFgq3Eh4AFuUG589CKpM0+xwE589c2x6hXukS+cFY2x7BNhbXJusGBMMcHgAW5Qbn7yYG6+/7KAbr7/kqBuvvRgQ=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_38E = expr_6B:int
        var_3_393 = newarray:byte[](byte.class, expr_6B:int)
        var_5_394 = expr_6B:int
        Label_0918:
        
        while (cmpeq:boolean(and:int(var_0_3A3:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(-446485254))
            var_5_394 = add:int(var_5_394:int, ldc:int(-1))
            expr_3B6 = loadelement:byte(stack_3B6_0:byte[], var_5_394:int)
            storeelement:byte(var_3_393:byte[], var_5_394:int, or:int(and:int(shl:int(expr_3B6:byte, and:int(ldc:int(300), ldc:int(19974))), ldc:int(-16)), and:int(shr:int(expr_3B6:byte[expected:int], xor:int(ldc:int(20752), ldc:int(20756))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_394:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_3B6_0 = stack_407_0 = stack_46E_0 = stack_4E2_0 = var_3_393:byte[]
            goto(Label_0112)
        }
        
        var_0_3A3 = and:int(var_0_3A3:int, ldc:int(1075975490))
        Label_1102:
        
        while (cmpne:boolean(and:int(var_0_3A3:int, ldc:int(128)), ldc:int(0))) {
            var_0_464 = and:int(var_0_3A3:int, ldc:int(-1397757542))
            var_5_394 = add:int(var_5_394:int, ldc:int(-1))
            expr_46E = stack_4AD_2 = loadelement(stack_46E_0, var_5_394)
            
            if (cmplt:boolean(add:int(add:int(var_5_394:int, ldc:int(1)), neg:int(var_4_38E:int)), ldc:int(0))) {
                stack_4AD_2 = stack_48A_0 = add:byte(expr_46E:byte, loadelement:byte(var_3_393:byte[], add:int(var_5_394:int, ldc:int(1))))
                goto(Label_1178)
            }
            
            Label_1147:
            
            if (cmpeq:boolean(and:int(var_0_464:int, ldc:int(32)), ldc:int(0))) {
                var_0_464 = and:int(var_0_464:int, ldc:int(685817315))
                stack_4AD_2 = stack_48A_0 = add:byte(expr_46E:byte, ldc:byte(1))
            }
            
            Label_1178:
            
            if (cmpeq:boolean(and:int(var_0_464:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_1147)
            }
            
            var_0_3A3 = and:int(var_0_464:int, ldc:int(-969118842))
            storeelement:byte(var_3_393:byte[], var_5_394:int, stack_4AD_2:byte)
            
            if (cmpne:boolean(var_5_394:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_3B6_0 = stack_407_0 = stack_46E_0 = stack_4E2_0 = var_3_393:byte[]
            goto(Label_0200)
        }
        
        var_0_3A3 = and:int(var_0_3A3:int, ldc:int(-1950757239))
        goto(Label_0918)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_3A3:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0257)
        }
        
        if (cmpne:boolean(and:int(var_0_3A3:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A3:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(105410217))
        }
        else {
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(1404532981))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_3F5 = newarray:byte[](byte.class, expr_98:int)
                var_5_3F6 = expr_98:int
                
                loop {
                    var_0_3A3 = and:int(var_0_3A3:int, ldc:int(-399315544))
                    var_5_3F6 = add:int(var_5_3F6:int, ldc:int(-1))
                    storeelement:byte(var_3_3F5:byte[], var_5_3F6:int, add:int(shl:int(loadelement:byte(stack_407_0:byte[], var_5_3F6:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_3F6:int, xor:int(ldc:int(1037), ldc:int(1036)))), ldc:int(5)), xor:int(ldc:int(705), ldc:int(710)))))
                    
                    if (cmpne:boolean(var_5_3F6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_3B6_0 = stack_407_0 = stack_46E_0 = stack_4E2_0 = var_3_3F5:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_3A3:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(1077151325))
            goto(Label_0257)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A3:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3A3:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(456998553))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_38E = expr_C3:int
                var_3_393 = newarray:byte[](byte.class, expr_C3:int)
                var_5_394 = expr_C3:int
                goto(Label_1102)
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_3A3:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(-519664510))
        }
        else {
            if (cmpne:boolean(and:int(var_0_3A3:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpne:boolean(and:int(var_0_3A3:int, ldc:int(512)), ldc:int(0))) {
                var_0_3A3 = and:int(var_0_3A3:int, ldc:int(1484925636))
                goto(Label_0112)
            }
            
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(1493023390))
            expr_FC = arraylength:int(stack_FC_0:byte[])
            
            if (cmpne:boolean(expr_FC:int, ldc:int(0))) {
                var_3_4D0 = newarray:byte[](byte.class, expr_FC:int)
                var_5_4D1 = expr_FC:int
                
                loop {
                    var_0_3A3 = and:int(var_0_3A3:int, ldc:int(1126788527))
                    var_5_4D1 = add:int(var_5_4D1:int, ldc:int(-1))
                    storeelement:byte(var_3_4D0:byte[], var_5_4D1:int, xor:byte(add:byte(loadelement:byte(stack_4E2_0:byte[], var_5_4D1:int), ldc:byte(67)), ldc:byte(60)))
                    
                    if (cmpne:boolean(var_5_4D1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_3B6_0 = stack_407_0 = stack_46E_0 = stack_4E2_0 = var_3_4D0:byte[]
            }
        }
        
        Label_0257:
        
        if (cmpne:boolean(and:int(var_0_3A3:int, ldc:int(512)), ldc:int(0))) {
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(2011331307))
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A3:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_3A3:int, ldc:int(32)), ldc:int(0))) {
            var_0_3A3 = and:int(var_0_3A3:int, ldc:int(-1427610573))
            goto(Label_0112)
        }
        
        var_3_13D = initobject:String(String::<init>, stack_131_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_27E_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16421), ldc:int(16430)))
        expr_14F = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1035), ldc:int(143)))
        storeelement:String(expr_14F:String[], xor:int(ldc:int(8372), ldc:int(8370)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, and:int(ldc:int(-26786), ldc:int(26753)), xor:int(ldc:int(-29696), ldc:int(-29693))))
        storeelement:String(expr_14F:String[], and:int(ldc:int(25089), ldc:int(4155)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(22786), ldc:int(22785)), xor:int(ldc:int(18628), ldc:int(18632))))
        storeelement:String(expr_14F:String[], and:int(ldc:int(266), ldc:int(17038)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, and:int(ldc:int(4364), ldc:int(18990)), and:int(ldc:int(16479), ldc:int(542))))
        storeelement:String(expr_14F:String[], and:int(ldc:int(10153), ldc:int(9)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, and:int(ldc:int(31), ldc:int(21694)), xor:int(ldc:int(4653), ldc:int(4610))))
        storeelement:String(expr_14F:String[], and:int(ldc:int(5316), ldc:int(-5357)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, and:int(ldc:int(1071), ldc:int(4671)), and:int(ldc:int(20733), ldc:int(2101))))
        storeelement:String(expr_14F:String[], and:int(ldc:int(14378), ldc:int(600)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(1117), ldc:int(1128)), and:int(ldc:int(1086), ldc:int(63))))
        storeelement:String(expr_14F:String[], and:int(ldc:int(1109), ldc:int(4519)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(82), ldc:int(108)), xor:int(ldc:int(4600), ldc:int(4530))))
        storeelement:String(expr_14F:String[], xor:int(ldc:int(2179), ldc:int(2180)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(2277), ldc:int(2223)), xor:int(ldc:int(4117), ldc:int(4167))))
        storeelement:String(expr_14F:String[], and:int(ldc:int(8330), ldc:int(531)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(-27616), ldc:int(-27534)), and:int(ldc:int(16511), ldc:int(3927))))
        storeelement:String(expr_14F:String[], and:int(ldc:int(2123), ldc:int(25267)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(-24540), ldc:int(-24461)), and:int(ldc:int(25180), ldc:int(126))))
        storeelement:String(expr_14F:String[], xor:int(ldc:int(321), ldc:int(325)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, and:int(ldc:int(10844), ldc:int(382)), xor:int(ldc:int(2233), ldc:int(2264))))
        putstatic:String[](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\u88c5\u6fb0\u64ab\u92ff\u3dd3\ua068, expr_14F:String[])
        expr_286 = newarray:int[][](int[].class, and:int(ldc:int(20503), ldc:int(9220)))
        stack_2CA_1 = and:int(ldc:int(-8748), ldc:int(8745))
        expr_298 = newarray:int[](int.class, xor:int(ldc:int(18688), ldc:int(18691)))
        storeelement:int(expr_298:int[], and:int(ldc:int(19168), ldc:int(-19169)), and:int(ldc:int(-7326), ldc:int(7324)))
        storeelement:int(expr_298:int[], xor:int(ldc:int(3208), ldc:int(3209)), and:int(ldc:int(10802), ldc:int(-27187)))
        storeelement:int(expr_298:int[], xor:int(ldc:int(8230), ldc:int(8228)), xor:int(ldc:int(66), ldc:int(67)))
        storeelement:int[](expr_286:int[][], stack_2CA_1:int, expr_298:int[])
        stack_306_1 = xor:int(ldc:int(9236), ldc:int(9237))
        expr_2DA = newarray:int[](int.class, and:int(ldc:int(1287), ldc:int(2563)))
        storeelement:int(expr_2DA:int[], and:int(ldc:int(-18938), ldc:int(18865)), ldc:int(-1))
        storeelement:int(expr_2DA:int[], xor:int(ldc:int(2316), ldc:int(2317)), and:int(ldc:int(-2872), ldc:int(805)))
        storeelement:int(expr_2DA:int[], and:int(ldc:int(5402), ldc:int(514)), and:int(ldc:int(5205), ldc:int(-5758)))
        storeelement:int[](expr_286:int[][], stack_306_1:int, expr_2DA:int[])
        stack_342_1 = and:int(ldc:int(9486), ldc:int(35))
        expr_316 = newarray:int[](int.class, xor:int(ldc:int(5252), ldc:int(5255)))
        storeelement:int(expr_316:int[], and:int(ldc:int(5446), ldc:int(-5959)), and:int(ldc:int(-4034), ldc:int(3905)))
        storeelement:int(expr_316:int[], and:int(ldc:int(1157), ldc:int(8195)), and:int(ldc:int(-32508), ldc:int(30418)))
        storeelement:int(expr_316:int[], and:int(ldc:int(35), ldc:int(29702)), ldc:int(-1))
        storeelement:int[](expr_286:int[][], stack_342_1:int, expr_316:int[])
        stack_384_1 = xor:int(ldc:int(4705), ldc:int(4706))
        expr_352 = newarray:int[](int.class, and:int(ldc:int(131), ldc:int(595)))
        storeelement:int(expr_352:int[], and:int(ldc:int(222), ldc:int(-5087)), and:int(ldc:int(13), ldc:int(707)))
        storeelement:int(expr_352:int[], and:int(ldc:int(327), ldc:int(18561)), and:int(ldc:int(-1299), ldc:int(1298)))
        storeelement:int(expr_352:int[], xor:int(ldc:int(1032), ldc:int(1034)), and:int(ldc:int(-11455), ldc:int(2230)))
        storeelement:int[](expr_286:int[][], stack_384_1:int, expr_352:int[])
        putstatic:int[][](\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562::\uc7fe\u4cd9\u3d64\uc4d2\u8cae\u6435, expr_286:int[][])
    }
    
    public void \u3dd3\u7ce1\uc2e8\u965f\uc3e3\u93a2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_663 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66E : int
        
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
        var_3_663 = and:int(ldc:int(-124438196), ldc:int(-129951908))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u36d3\u6ec6\u836c\u8bb0\ua6bd\ua562[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(-1197433976))
            var_5_81 = and:int(ldc:int(-6509), ldc:int(6472))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4945), ldc:int(4944)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_663:int, ldc:int(-58401925))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(16387), ldc:int(14149)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-28663), ldc:int(-28664)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_663 = and:int(var_3_DA:int, ldc:int(-14606374))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(163), ldc:int(8221)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-948975882))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-930739256))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-666615531))
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1223869828))
                    }
                    else {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1089636982))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0574)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1887579410))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1582367008))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1892441525))
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-338734695))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1092061301))
                            var_11_EB = and:int(ldc:int(17455), ldc:int(-17456))
                            goto(Label_1502)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0574:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(858862850))
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1542169360))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(539499286))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-571656934))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0689:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-2011873032))
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-575527776))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1943001547))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-724283186))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(968924333))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-111436518))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1388419066))
                        goto(Label_1513)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-572028074))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1226267536))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-646424099))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(17361), ldc:int(8233))
                                goto(Label_1114)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-2045927417))
                        goto(Label_1375)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1516926170))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-378804190))
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1154542777))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-679941949))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1126760565))
                        var_11_EB = and:int(ldc:int(-24804), ldc:int(8417))
                    }
                    
                    Label_1114:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1093648907))
                        goto(Label_1375)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(415023855))
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1039417840))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1730591109))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-599204456))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1375)
                            }
                        }
                    }
                    
                    Label_1239:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-783068903))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-825849614))
                            goto(Label_1114)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1108628595))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-233359629))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1702397681))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1502)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1375:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(923641163))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-2070853149))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1923900413))
                        loopcontinue()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(-87549685))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1502:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66E = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1513:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(452060512))
                        goto(Label_1375)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1849074817))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1866599634))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-906128527))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-127681144))
                        var_17_66E = add:int(var_16_119:int, xor:int(ldc:int(16640), ldc:int(16641)))
                        looporswitchbreak()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(-246168792))
                }
                
                var_3_663 = and:int(var_3_663:int, ldc:int(-656590417))
                
                if (cmple:boolean(var_5_81 = var_17_66E:int, sub:int(var_6_88:int, and:int(ldc:int(33), ldc:int(4227))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(564199413))
            goto(Label_0108)
        }
    }
}
