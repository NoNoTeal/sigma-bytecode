public class \u71f1\uc910\u3bc9\u516c\u93a2.\uc29a\u873d\u6bb9\u6d99\u3c25\ube23 {
    public void \uc29a\u873d\u6bb9\u6d99\u3c25\ube23(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\uc29a\u873d\u6bb9\u6d99\u3c25\ube23, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\uf995\u4daf\u6bb9\u8389\u9033\u8bb0$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
        var_4_65 : Optional
        var_5_A7 : Dynamic
        
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
            var_4_65 = invokevirtual:Optional(Typed::getOptional, p1:Typed, p0:OpticFinder)
            
            if (invokevirtual:boolean(Optional::isPresent, var_4_65:Optional)) {
                if (invokestatic:boolean(Objects::equals, invokevirtual:Object(Pair::getSecond, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, var_4_65:Optional<Pair>))), loadelement:String[expected:Object](getstatic:String[](\uc29a\u873d\u6bb9\u6d99\u3c25\ube23::\u34df\u156b\u6198\ud51e\u5245\u98a4), xor:int(ldc:int(8977), ldc:int(8979))))) {
                    var_5_A7 = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, p1:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
                    
                    if (cmpeq:boolean(invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, var_5_A7:Dynamic, loadelement:String(getstatic:String[](\uc29a\u873d\u6bb9\u6d99\u3c25\ube23::\u34df\u156b\u6198\ud51e\u5245\u98a4), xor:int(ldc:int(20611), ldc:int(20608)))), and:int(ldc:int(-2670), ldc:int(2661))), ldc:int(0))) {
                        return:Typed(invokevirtual:Typed(Typed::set, p1:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokevirtual:Dynamic(Dynamic::set, var_5_A7:Dynamic, loadelement:String(getstatic:String[](\uc29a\u873d\u6bb9\u6d99\u3c25\ube23::\u34df\u156b\u6198\ud51e\u5245\u98a4), and:int(ldc:int(483), ldc:int(30723))), invokevirtual:Dynamic(Dynamic::createShort, var_5_A7:Dynamic, ldc:short(14)))))
                    }
                }
            }
            
            return:Typed(p1:Typed)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_23F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1CA_0 : byte[] [generated]
        stack_251_0 : byte[] [generated]
        stack_28E_0 : byte[] [generated]
        stack_2E3_0 : byte[] [generated]
        var_4_1AD : int
        var_3_1B2 : byte[]
        var_5_1B3 : int
        var_0_1C0 : int
        expr_1CA : byte [generated]
        stack_20E_2 : byte [generated]
        stack_1ED_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_27D : byte[]
        var_5_27E : int
        expr_E6 : int [generated]
        var_3_2D2 : byte[]
        var_5_2D3 : int
        expr_2E3 : byte [generated]
        var_3_122 : String
        stack_1A6_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_23F = and:int(ldc:int(1351243914), ldc:int(2009856190))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CA_0 = stack_251_0 = stack_28E_0 = stack_2E3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ZyLn+yfxBeolCN4H9xL1/RsACAcA9gIM8foZz//rBqmP16ippQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1AD = expr_6B:int
        var_3_1B2 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1B3 = expr_6B:int
        Label_0437:
        
        while (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_1C0 = and:int(var_0_23F:int, ldc:int(-709047858))
            var_5_1B3 = add:int(var_5_1B3:int, ldc:int(-1))
            expr_1CA = stack_20E_2 = loadelement(stack_1CA_0, var_5_1B3)
            
            if (cmplt:boolean(add:int(add:int(var_5_1B3:int, ldc:int(6)), neg:int(var_4_1AD:int)), ldc:int(0))) {
                stack_20E_2 = stack_1ED_0 = add:byte(expr_1CA:byte, loadelement:byte(var_3_1B2:byte[], add:int(var_5_1B3:int, ldc:int(6))))
                goto(Label_0509)
            }
            
            Label_0471:
            
            if (cmpne:boolean(and:int(var_0_1C0:int, ldc:int(256)), ldc:int(0))) {
                var_0_1C0 = and:int(var_0_1C0:int, ldc:int(-1951584451))
            }
            else {
                var_0_1C0 = and:int(var_0_1C0:int, ldc:int(2144229151))
                stack_20E_2 = stack_1ED_0 = add:byte(expr_1CA:byte, ldc:byte(6))
            }
            
            Label_0509:
            
            if (cmpne:boolean(and:int(var_0_1C0:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0471)
            }
            
            var_0_23F = and:int(var_0_1C0:int, ldc:int(-945273813))
            storeelement:byte(var_3_1B2:byte[], var_5_1B3:int, stack_20E_2:byte)
            
            if (cmpne:boolean(var_5_1B3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CA_0 = stack_251_0 = stack_28E_0 = stack_2E3_0 = var_3_1B2:byte[]
            goto(Label_0112)
        }
        
        Label_0564:
        
        while (cmpne:boolean(and:int(var_0_23F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_23F = and:int(var_0_23F:int, ldc:int(1737474639))
            var_5_1B3 = add:int(var_5_1B3:int, ldc:int(-1))
            storeelement:byte(var_3_1B2:byte[], var_5_1B3:int, xor:byte(add:byte(loadelement:byte(stack_251_0:byte[], var_5_1B3:int), ldc:byte(110)), ldc:byte(121)))
            
            if (cmpne:boolean(var_5_1B3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CA_0 = stack_251_0 = stack_28E_0 = stack_2E3_0 = var_3_1B2:byte[]
            goto(Label_0155)
        }
        
        var_0_23F = and:int(var_0_23F:int, ldc:int(201187554))
        goto(Label_0437)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_23F = and:int(var_0_23F:int, ldc:int(713214670))
        }
        else {
            var_0_23F = and:int(var_0_23F:int, ldc:int(-738364006))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_1AD = expr_96:int
                var_3_1B2 = newarray:byte[](byte.class, expr_96:int)
                var_5_1B3 = expr_96:int
                goto(Label_0564)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_23F = and:int(var_0_23F:int, ldc:int(-297392876))
                goto(Label_0112)
            }
            
            var_0_23F = and:int(var_0_23F:int, ldc:int(2129491258))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_27D = newarray:byte[](byte.class, expr_C3:int)
                var_5_27E = expr_C3:int
                
                loop {
                    var_0_23F = and:int(var_0_23F:int, ldc:int(1084877962))
                    var_5_27E = add:int(var_5_27E:int, ldc:int(-1))
                    storeelement:byte(var_3_27D:byte[], var_5_27E:int, add:int(shl:int(loadelement:byte(stack_28E_0:byte[], var_5_27E:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_27E:int, xor:int(ldc:int(-28096), ldc:int(-28095)))), ldc:int(4)), xor:int(ldc:int(17425), ldc:int(17438)))))
                    
                    if (cmpne:boolean(var_5_27E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CA_0 = stack_251_0 = stack_28E_0 = stack_2E3_0 = var_3_27D:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_23F = and:int(var_0_23F:int, ldc:int(1742652991))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_2D2 = newarray:byte[](byte.class, expr_E6:int)
                var_5_2D3 = expr_E6:int
                
                loop {
                    var_0_23F = and:int(var_0_23F:int, ldc:int(1921899514))
                    var_5_2D3 = add:int(var_5_2D3:int, ldc:int(-1))
                    expr_2E3 = loadelement:byte(stack_2E3_0:byte[], var_5_2D3:int)
                    storeelement:byte(var_3_2D2:byte[], var_5_2D3:int, or:int(and:int(shl:int(expr_2E3:byte, and:int(ldc:int(17668), ldc:int(8196))), ldc:int(-16)), and:int(shr:int(expr_2E3:byte[expected:int], and:int(ldc:int(1060), ldc:int(8838))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2D3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CA_0 = stack_251_0 = stack_28E_0 = stack_2E3_0 = var_3_2D2:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(256)), ldc:int(0))) {
            var_0_23F = and:int(var_0_23F:int, ldc:int(1425688730))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_23F = and:int(var_0_23F:int, ldc:int(1027360734))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1A6_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4608), ldc:int(4612)))
            expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(65), ldc:int(69)))
            storeelement:String(expr_134:String[], xor:int(ldc:int(6144), ldc:int(6145)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(2734), ldc:int(-11951)), and:int(ldc:int(16479), ldc:int(12047))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(557), ldc:int(558)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(27535), ldc:int(5215)), xor:int(ldc:int(-32758), ldc:int(-32737))))
            storeelement:String(expr_134:String[], and:int(ldc:int(-28637), ldc:int(20052)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(-25583), ldc:int(-25596)), xor:int(ldc:int(8463), ldc:int(8472))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(-12285), ldc:int(-12287)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(853), ldc:int(834)), and:int(ldc:int(2092), ldc:int(8230))))
            putstatic:String[](\uc29a\u873d\u6bb9\u6d99\u3c25\ube23::\u34df\u156b\u6198\ud51e\u5245\u98a4, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u3dd3\u4c04\uae87\ub8be\u0800\u0c95(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BB : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CC : double
        var_3_DE : int
        var_11_EF : int
        var_14_119 : double
        var_16_11D : int
        var_12_115 : double
        var_17_6C6 : int
        
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
        var_3_6BB = and:int(ldc:int(-864644019), ldc:int(-325658774))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc29a\u873d\u6bb9\u6d99\u3c25\ube23[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
            var_3_6BB = and:int(var_3_6BB:int, ldc:int(1102945376))
        }
        else {
            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-296749862))
            var_5_85 = and:int(ldc:int(-26808), ldc:int(26647))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(30112), ldc:int(-32184)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DE = and:int(var_3_6BB:int, ldc:int(-35136286))
                    var_9_CC = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EF = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EF:int, sub:int(var_6_8C:int, xor:int(ldc:int(34), ldc:int(35)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EF:int, and:int(ldc:int(12329), ldc:int(17685)))), var_7_9B:double))) {
                        inc:int(var_11_EF, ldc:int(1))
                    }
                    
                    var_3_6BB = and:int(var_3_DE:int, ldc:int(-589841211))
                    var_14_119 = var_7_9B:double
                    var_16_11D = var_11_EF:int
                }
                else {
                    var_11_EF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1410), ldc:int(1411)))
                    var_12_115 = var_14_119 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11D = var_11_EF:int, var_6_8C:int)) {
                        var_9_CC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EF:int)
                        var_16_11D = var_11_EF:int
                        var_14_119 = var_12_115:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1432432275))
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-100939595))
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1537231253))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-2131364429))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1292046876))
                        goto(Label_1016)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1995855000))
                        goto(Label_0884)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-389068649))
                        goto(Label_0736)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0605)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1911098127))
                        
                        if (cmplt:boolean(var_16_11D:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0605)
                            }
                            
                            goto(Label_0884)
                        }
                    }
                    
                    Label_0440:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(2013124208))
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-814008644))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1016)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-208857006))
                        goto(Label_0884)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(946601186))
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-591421875))
                            var_11_EF = and:int(ldc:int(7942), ldc:int(-32583))
                            goto(Label_1575)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0605:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1549794832))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-2090461030))
                        goto(Label_1016)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(405853397))
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1487783051))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(1473310486))
                            goto(Label_0440)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1657358625))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_119 = var_9_CC:double
                            goto(Label_0884)
                        }
                    }
                    
                    Label_0736:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(912963282))
                        goto(Label_1586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1603951144))
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-923856223))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1690282770))
                        goto(Label_1016)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0605)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(1480061646))
                            goto(Label_0440)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-811606924))
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-586171045))
                        var_14_119 = mul:double(ldc:double(0.5), add:double(var_9_CC:double, var_14_119:double))
                    }
                    
                    Label_0884:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(755106229))
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1431)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-369670123))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(447789984))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0736)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-683341045))
                            goto(Label_0605)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-630845214))
                            goto(Label_0440)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-603005625))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EF = and:int(ldc:int(21251), ldc:int(2049))
                                goto(Label_1166)
                            }
                        }
                    }
                    
                    Label_1016:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1431)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0884)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0736)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(1592135397))
                            goto(Label_0605)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(138740297))
                            goto(Label_0440)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(733177568))
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-268525844))
                        var_11_EF = and:int(ldc:int(604), ldc:int(-2653))
                    }
                    
                    Label_1166:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1326821400))
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1484789899))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1016)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1940144816))
                            goto(Label_0884)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0736)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1634151298))
                            goto(Label_0605)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1796850641))
                            goto(Label_0440)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1347505076))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                                goto(Label_1431)
                            }
                        }
                    }
                    
                    Label_1297:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-893997241))
                        goto(Label_1586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-736892254))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1166)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1016)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1363995739))
                            goto(Label_0884)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(2071570315))
                            goto(Label_0605)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0440)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-33040812))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_119:double, var_5_85:int, var_16_11D:int)
                            goto(Label_1575)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1431:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(2075548591))
                        goto(Label_1586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(192780265))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1162170672))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1016)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1901489411))
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1673827009))
                        goto(Label_0605)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6BB = and:int(var_3_6BB:int, ldc:int(-275860391))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_119:double, ldc:double(0.0))
                    Label_1575:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C6 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1586:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1556499476))
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1488713596))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(398400087))
                        goto(Label_1016)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1795555795))
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(607135315))
                        goto(Label_0605)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1493003053))
                        goto(Label_0440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-847849779))
                        var_17_6C6 = add:int(var_16_11D:int, xor:int(ldc:int(18752), ldc:int(18753)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BB = and:int(var_3_6BB:int, ldc:int(-819669766))
                }
                
                var_3_6BB = and:int(var_3_6BB:int, ldc:int(-561588243))
                
                if (cmple:boolean(var_5_85 = var_17_6C6:int, sub:int(var_6_8C:int, and:int(ldc:int(17419), ldc:int(8721))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_6BB = and:int(var_3_6BB:int, ldc:int(62428382))
            goto(Label_0106)
        }
    }
}
