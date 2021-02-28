public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad {
    public void \u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Dynamic<?> \u4f52\u4ab3\ub70c\u446c\u8640\ud171(com.mojang.serialization.Dynamic<?> p0) {
        var_4_75 : Optional
        var_5_8C : Optional
        var_6_B3 : float
        
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
            var_4_75 = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asNumber, invokevirtual:OptionalDynamic(Dynamic::get, var_1_D8:Dynamic, loadelement:String(getstatic:String[](\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad::\u56bd\u76bc\u120d\ua3b4\u7873\u446c), and:int(ldc:int(19299), ldc:int(-19300))))))
            var_5_8C = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asNumber, invokevirtual:OptionalDynamic(Dynamic::get, var_1_D8:Dynamic, loadelement:String(getstatic:String[](\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad::\u56bd\u76bc\u120d\ua3b4\u7873\u446c), xor:int(ldc:int(8716), ldc:int(8717))))))
            
            if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_4_75:Optional))) {
                if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_5_8C:Optional))) {
                    return:Dynamic<?>(var_1_D8:Dynamic)
                }
                
                var_6_B3 = invokevirtual:float(Number::floatValue, checkcast:Number(java.lang.Number.class, invokevirtual:Number(Optional<Number>::get, var_5_8C:Optional<Number>)))
            }
            else {
                var_6_B3 = invokevirtual:float(Number::floatValue, checkcast:Number(java.lang.Number.class, invokevirtual:Number(Optional<Number>::get, var_4_75:Optional<Number>)))
                var_1_D8 = invokevirtual:Dynamic(Dynamic::remove, var_1_D8:Dynamic, loadelement:String(getstatic:String[](\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad::\u56bd\u76bc\u120d\ua3b4\u7873\u446c), and:int(ldc:int(9720), ldc:int(-9721))))
            }
            
            return:Dynamic<?>(invokevirtual:Dynamic(Dynamic::set, var_1_D8:Dynamic, loadelement:String(getstatic:String[](\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad::\u56bd\u76bc\u120d\ua3b4\u7873\u446c), xor:int(ldc:int(10497), ldc:int(10496))), invokevirtual:Dynamic(Dynamic::createFloat, var_1_D8:Dynamic, var_6_B3:float)))
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
    
    private com.mojang.datafixers.Typed lambda$\u760c\u4d85\ud171\u624e\u6ec6\u92ee$0(com.mojang.datafixers.Typed p0) {
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
            return:Typed(invokevirtual:Typed(Typed::update, p0:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:(L\u12b2\u9a18\uc7fe\u4c2b\u6c52/\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad;)Ljava/util/function/Function;, this:\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_769 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_77B_0 : byte[] [generated]
        stack_7B8_0 : byte[] [generated]
        stack_81B_0 : byte[] [generated]
        stack_884_0 : byte[] [generated]
        var_4_74F : int
        var_3_754 : byte[]
        var_5_755 : int
        expr_81B : byte [generated]
        var_0_87A : int
        expr_884 : byte [generated]
        stack_8B2_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_7A7 : byte[]
        var_5_7A8 : int
        expr_C3 : int [generated]
        expr_F6 : int [generated]
        var_3_122 : String
        expr_12A : String[] [generated]
        expr_134 : String[] [generated]
        var_3_565 : String[]
        expr_568 : String[] [generated]
        
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
        var_0_769 = and:int(ldc:int(493371684), ldc:int(-18267233))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_77B_0 = stack_7B8_0 = stack_81B_0 = stack_884_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("vrNG9+++Zz+CJxK/gvZbf+//+ibL+7Iy1wrK85qjjj8K8gNmR+euS+4/Z/uL7kdiL4OWr49Gw5vuu+Oeyz722+67jibLnw4/iiZWz2/jS+p2w6OKIxpW8+ZWzwInl+4fB+eiLrsaJ1fupwoL5+4P/++Pr//n54tKw4KqditDstOG1svq8jOqwvbOV++O83+a90aHg/oX66Of7x5ni+YKK+bHg7uT44Y2M4Ivs+5rdjovmmPjm6eGyvIe14vix+Ny94ryHtLyJ1+X+7IbTvLyF4v77zZax7Iy1646274DT7ba1ieTgsOyxteWJ5OCx1rGy4Jfo+bHvmdDvn/i3ifGIv7Of5OLtj++L+bHmDSoeH8=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_74F = expr_6B:int
        var_3_754 = newarray:byte[](byte.class, expr_6B:int)
        var_5_755 = expr_6B:int
        Label_1879:
        
        while (cmpeq:boolean(and:int(var_0_769:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_769:int, ldc:int(8192)), ldc:int(0))) {
                var_0_769 = and:int(var_0_769:int, ldc:int(1436793221))
                goto(Label_2047)
            }
            
            var_0_769 = and:int(var_0_769:int, ldc:int(1568662014))
            var_5_755 = add:int(var_5_755:int, ldc:int(-1))
            storeelement:byte(var_3_754:byte[], var_5_755:int, add:byte(xor:byte(loadelement:byte(stack_77B_0:byte[], var_5_755:int), ldc:byte(86)), ldc:byte(87)))
            
            if (cmpne:boolean(var_5_755:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_77B_0 = stack_7B8_0 = stack_81B_0 = stack_884_0 = var_3_754:byte[]
            goto(Label_0112)
        }
        
        goto(Label_2144)
        Label_2047:
        
        while (cmpeq:boolean(and:int(var_0_769:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_1879)
            }
            
            var_0_769 = and:int(var_0_769:int, ldc:int(-1116317785))
            var_5_755 = add:int(var_5_755:int, ldc:int(-1))
            expr_81B = loadelement:byte(stack_81B_0:byte[], var_5_755:int)
            storeelement:byte(var_3_754:byte[], var_5_755:int, or:int(and:int(shl:int(expr_81B:byte, and:int(ldc:int(17413), ldc:int(2052))), ldc:int(-16)), and:int(shr:int(expr_81B:byte[expected:int], and:int(ldc:int(6150), ldc:int(16388))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_755:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_77B_0 = stack_7B8_0 = stack_81B_0 = stack_884_0 = var_3_754:byte[]
            goto(Label_0200)
        }
        
        Label_2144:
        
        while (cmpne:boolean(and:int(var_0_769:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_769:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_1879)
            }
            
            var_0_87A = and:int(var_0_769:int, ldc:int(-1074282131))
            var_5_755 = add:int(var_5_755:int, ldc:int(-1))
            expr_884 = loadelement:byte(stack_884_0:byte[], var_5_755:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_755:int, ldc:int(4)), neg:int(var_4_74F:int)), ldc:int(0))) {
                var_0_87A = and:int(var_0_87A:int, ldc:int(476436823))
                stack_8B2_2 = add:byte(expr_884:byte, ldc:byte(4))
            }
            else {
                stack_8B2_2 = add:byte(expr_884:byte, loadelement:byte(var_3_754:byte[], add:int(var_5_755:int, ldc:int(4))))
            }
            
            var_0_769 = and:int(var_0_87A:int, ldc:int(1558857070))
            storeelement:byte(var_3_754:byte[], var_5_755:int, stack_8B2_2:byte)
            
            if (cmpne:boolean(var_5_755:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_77B_0 = stack_7B8_0 = stack_81B_0 = stack_884_0 = var_3_754:byte[]
            goto(Label_0251)
        }
        
        var_0_769 = and:int(var_0_769:int, ldc:int(1191231254))
        goto(Label_2047)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_769 = and:int(var_0_769:int, ldc:int(403547901))
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_769 = and:int(var_0_769:int, ldc:int(968416437))
        }
        else {
            var_0_769 = and:int(var_0_769:int, ldc:int(2121188228))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_7A7 = newarray:byte[](byte.class, expr_A0:int)
                var_5_7A8 = expr_A0:int
                
                loop {
                    var_0_769 = and:int(var_0_769:int, ldc:int(-1636341322))
                    var_5_7A8 = add:int(var_5_7A8:int, ldc:int(-1))
                    storeelement:byte(var_3_7A7:byte[], var_5_7A8:int, add:int(shl:int(loadelement:byte(stack_7B8_0:byte[], var_5_7A8:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_7A8:int, xor:int(ldc:int(17), ldc:int(16)))), ldc:int(6)), and:int(ldc:int(271), ldc:int(16483)))))
                    
                    if (cmpne:boolean(var_5_7A8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_77B_0 = stack_7B8_0 = stack_81B_0 = stack_884_0 = var_3_7A7:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_769:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_769:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_769 = and:int(var_0_769:int, ldc:int(526734764))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_74F = expr_C3:int
                var_3_754 = newarray:byte[](byte.class, expr_C3:int)
                var_5_755 = expr_C3:int
                goto(Label_2047)
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(256)), ldc:int(0))) {
            var_0_769 = and:int(var_0_769:int, ldc:int(-1492558253))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(4)), ldc:int(0))) {
                var_0_769 = and:int(var_0_769:int, ldc:int(-1861672632))
                goto(Label_0112)
            }
            
            var_0_769 = and:int(var_0_769:int, ldc:int(1064369007))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_4_74F = expr_F6:int
                var_3_754 = newarray:byte[](byte.class, expr_F6:int)
                var_5_755 = expr_F6:int
                goto(Label_2144)
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_0_769:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_769:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_769:int, ldc:int(8192)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_12A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2533), ldc:int(12325)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(885), ldc:int(2095)))
            storeelement:String(expr_12A:String[], and:int(ldc:int(7), ldc:int(4179)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-4533), ldc:int(4532)), xor:int(ldc:int(7169), ldc:int(7179))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(-28653), ldc:int(-28649)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(25546), ldc:int(1035)), and:int(ldc:int(6381), ldc:int(16653))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(533), ldc:int(69)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(2189), ldc:int(20845)), xor:int(ldc:int(25096), ldc:int(25114))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(523), ldc:int(525)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(402), ldc:int(118)), and:int(ldc:int(381), ldc:int(668))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(20559), ldc:int(8599)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(348), ldc:int(28188)), and:int(ldc:int(39), ldc:int(26491))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(648), ldc:int(12302)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(163), ldc:int(28783)), xor:int(ldc:int(-28529), ldc:int(-28503))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(1097), ldc:int(16907)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(4132), ldc:int(4098)), xor:int(ldc:int(8355), ldc:int(8334))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(16907), ldc:int(15434)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(45), ldc:int(17085)), and:int(ldc:int(313), ldc:int(29242))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(18510), ldc:int(18501)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(1082), ldc:int(12732)), and:int(ldc:int(10312), ldc:int(4197))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(1036), ldc:int(93)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(4816), ldc:int(69)), and:int(ldc:int(6217), ldc:int(17737))))
            storeelement:String(expr_134:String[], and:int(ldc:int(14), ldc:int(10322)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(10258), ldc:int(10331)), and:int(ldc:int(23643), ldc:int(732))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(5137), ldc:int(5148)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(1272), ldc:int(859)), and:int(ldc:int(26859), ldc:int(615))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(6446), ldc:int(142)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(635), ldc:int(7655)), and:int(ldc:int(105), ldc:int(7530))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(16386), ldc:int(16397)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(8310), ldc:int(8222)), xor:int(ldc:int(16953), ldc:int(16980))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(80), ldc:int(52)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(2610), ldc:int(2655)), and:int(ldc:int(17397), ldc:int(125))))
            storeelement:String(expr_134:String[], and:int(ldc:int(-16085), ldc:int(16020)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(17525), ldc:int(10487)), xor:int(ldc:int(-32748), ldc:int(-32658))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(40), ldc:int(41)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(13695), ldc:int(19066)), xor:int(ldc:int(23569), ldc:int(23697))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(-31654), ldc:int(-31669)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(1216), ldc:int(932)), and:int(ldc:int(233), ldc:int(19867))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(6541), ldc:int(6559)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(5785), ldc:int(24715)), and:int(ldc:int(4244), ldc:int(10135))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(4110), ldc:int(4125)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(2196), ldc:int(10133)), and:int(ldc:int(16798), ldc:int(1691))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(8788), ldc:int(7476)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(20666), ldc:int(1179)), xor:int(ldc:int(13154), ldc:int(13311))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(21129), ldc:int(21148)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(157), ldc:int(8863)), and:int(ldc:int(10422), ldc:int(17574))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(5142), ldc:int(950)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(2168), ldc:int(2270)), and:int(ldc:int(174), ldc:int(428))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(1622), ldc:int(1601)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(1197), ldc:int(18860)), and:int(ldc:int(945), ldc:int(15609))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(2076), ldc:int(9528)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(3505), ldc:int(12533)), xor:int(ldc:int(16607), ldc:int(16487))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(4121), ldc:int(18713)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(7356), ldc:int(8698)), xor:int(ldc:int(605), ldc:int(671))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(16415), ldc:int(5210)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(24610), ldc:int(24800)), and:int(ldc:int(1514), ldc:int(21195))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(24859), ldc:int(4123)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(16647), ldc:int(16845)), xor:int(ldc:int(18515), ldc:int(18588))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(4316), ldc:int(8766)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(5958), ldc:int(6025)), and:int(ldc:int(1238), ldc:int(4310))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(5277), ldc:int(287)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(6281), ldc:int(6239)), xor:int(ldc:int(-31565), ldc:int(-31633))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(2072), ldc:int(2054)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(6622), ldc:int(25852)), xor:int(ldc:int(-22425), ldc:int(-22394))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(12575), ldc:int(18623)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(-31931), ldc:int(-31836)), xor:int(ldc:int(-16160), ldc:int(-16375))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(-28405), ldc:int(-28373)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(11374), ldc:int(11399)), and:int(ldc:int(16631), ldc:int(254))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(20321), ldc:int(4147)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(-32340), ldc:int(-32422)), and:int(ldc:int(4351), ldc:int(3067))))
            storeelement:String(expr_12A:String[], and:int(ldc:int(8362), ldc:int(22054)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(604), ldc:int(679)), xor:int(ldc:int(8416), ldc:int(8677))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(19093), ldc:int(19126)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(9205), ldc:int(22789)), xor:int(ldc:int(17471), ldc:int(17718))))
            storeelement:String(expr_12A:String[], xor:int(ldc:int(774), ldc:int(802)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(12), ldc:int(261)), and:int(ldc:int(31119), ldc:int(1887))))
            putstatic:String[](\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad::\u56bd\u76bc\u120d\ua3b4\u7873\u446c, expr_134:String[])
            var_3_565 = expr_12A:String[]
            expr_568 = newarray:String[](java.lang.String.class, ldc:int(34))
            storeelement:String(expr_568:String[], and:int(ldc:int(28726), ldc:int(-29239)), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(5152), ldc:int(5155))))
            storeelement:String(expr_568:String[], and:int(ldc:int(65), ldc:int(401)), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(17623), ldc:int(260))))
            storeelement:String(expr_568:String[], xor:int(ldc:int(16388), ldc:int(16390)), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(-32576), ldc:int(-32571))))
            storeelement:String(expr_568:String[], xor:int(ldc:int(26), ldc:int(25)), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(199), ldc:int(3854))))
            storeelement:String(expr_568:String[], xor:int(ldc:int(3201), ldc:int(3205)), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(12295), ldc:int(1167))))
            storeelement:String(expr_568:String[], xor:int(ldc:int(2074), ldc:int(2079)), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(1352), ldc:int(26669))))
            storeelement:String(expr_568:String[], ldc:int(6), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(-16185), ldc:int(-16178))))
            storeelement:String(expr_568:String[], ldc:int(7), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(20618), ldc:int(8554))))
            storeelement:String(expr_568:String[], ldc:int(8), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(4294), ldc:int(4301))))
            storeelement:String(expr_568:String[], ldc:int(9), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(18444), ldc:int(8351))))
            storeelement:String(expr_568:String[], ldc:int(10), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(8207), ldc:int(6733))))
            storeelement:String(expr_568:String[], ldc:int(11), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(16500), ldc:int(16506))))
            storeelement:String(expr_568:String[], ldc:int(12), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(17162), ldc:int(17157))))
            storeelement:String(expr_568:String[], ldc:int(13), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(1306), ldc:int(1290))))
            storeelement:String(expr_568:String[], ldc:int(14), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(-16382), ldc:int(-16365))))
            storeelement:String(expr_568:String[], ldc:int(15), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(10769), ldc:int(10755))))
            storeelement:String(expr_568:String[], ldc:int(16), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(-32572), ldc:int(-32553))))
            storeelement:String(expr_568:String[], ldc:int(17), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(84), ldc:int(1044))))
            storeelement:String(expr_568:String[], ldc:int(18), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(533), ldc:int(7191))))
            storeelement:String(expr_568:String[], ldc:int(19), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(516), ldc:int(530))))
            storeelement:String(expr_568:String[], ldc:int(20), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(10135), ldc:int(4119))))
            storeelement:String(expr_568:String[], ldc:int(21), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(17978), ldc:int(152))))
            storeelement:String(expr_568:String[], ldc:int(22), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(212), ldc:int(205))))
            storeelement:String(expr_568:String[], ldc:int(23), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(666), ldc:int(17786))))
            storeelement:String(expr_568:String[], ldc:int(24), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(6183), ldc:int(6204))))
            storeelement:String(expr_568:String[], ldc:int(25), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(660), ldc:int(648))))
            storeelement:String(expr_568:String[], ldc:int(26), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(10291), ldc:int(10286))))
            storeelement:String(expr_568:String[], ldc:int(27), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(5214), ldc:int(8222))))
            storeelement:String(expr_568:String[], ldc:int(28), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(67), ldc:int(92))))
            storeelement:String(expr_568:String[], ldc:int(29), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(-32639), ldc:int(-32607))))
            storeelement:String(expr_568:String[], ldc:int(30), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(-23795), ldc:int(-23764))))
            storeelement:String(expr_568:String[], ldc:int(31), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(-32117), ldc:int(-32087))))
            storeelement:String(expr_568:String[], ldc:int(32), loadelement:String[expected:String](var_3_565:String[], and:int(ldc:int(18531), ldc:int(10023))))
            storeelement:String(expr_568:String[], ldc:int(33), loadelement:String[expected:String](var_3_565:String[], xor:int(ldc:int(18433), ldc:int(18469))))
            putstatic:Set<String>(\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad::\u12cb\u946b\ubb2b\ucb79\u718f\ub19c, invokestatic:HashSet(Sets::newHashSet, expr_568:String[][expected:Object[]]))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u5fe1\u92ee\u3504\u5bc4\u8753\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_695 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CC : double
        var_3_DE : int
        var_11_EF : int
        var_14_119 : double
        var_16_11D : int
        var_12_115 : double
        var_17_6A0 : int
        
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
        var_3_695 = and:int(ldc:int(-1969374343), ldc:int(-1707270338))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u93a2\u8aa5\u385b\uc9f6\u5bc4\u7bad[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2048)), ldc:int(0))) {
            var_3_695 = and:int(var_3_695:int, ldc:int(1084956253))
        }
        else {
            var_3_695 = and:int(var_3_695:int, ldc:int(-552698946))
            var_5_85 = and:int(ldc:int(-20420), ldc:int(19843))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2340), ldc:int(-2341)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DE = and:int(var_3_695:int, ldc:int(-1977802819))
                    var_9_CC = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EF = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EF:int, sub:int(var_6_8C:int, and:int(ldc:int(4609), ldc:int(8219)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EF:int, xor:int(ldc:int(16640), ldc:int(16641)))), var_7_9B:double))) {
                        inc:int(var_11_EF, ldc:int(1))
                    }
                    
                    var_3_695 = and:int(var_3_DE:int, ldc:int(-545498183))
                    var_14_119 = var_7_9B:double
                    var_16_11D = var_11_EF:int
                }
                else {
                    var_11_EF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(18577), ldc:int(12619)))
                    var_12_115 = var_14_119 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11D = var_11_EF:int, var_6_8C:int)) {
                        var_9_CC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EF:int)
                        var_16_11D = var_11_EF:int
                        var_14_119 = var_12_115:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1467504507))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(338276134))
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-537116807))
                        
                        if (cmplt:boolean(var_16_11D:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0539)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0394:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1619037278))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(489355225))
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1417766022))
                            var_11_EF = and:int(ldc:int(3878), ldc:int(-3879))
                            goto(Label_1555)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0539:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1324787402))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1283748768))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(676633793))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(346053189))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(807652243))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1745917469))
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-215427654))
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-615728263))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_119 = var_9_CC:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0691:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-252810766))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1341163742))
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1777160599))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1328187643))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1988806346))
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-79740999))
                        var_14_119 = mul:double(ldc:double(0.5), add:double(var_9_CC:double, var_14_119:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1818292337))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-847871382))
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-514334158))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1300125931))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1287911095))
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1355859141))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EF = xor:int(ldc:int(-32668), ldc:int(-32667))
                                goto(Label_1133)
                            }
                        }
                    }
                    
                    Label_0957:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(160223180))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(2016910503))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1518568377))
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(583935863))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1850538980))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1924737047))
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1370660996))
                        var_11_EF = and:int(ldc:int(-18183), ldc:int(18182))
                    }
                    
                    Label_1133:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1844967246))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-299446471))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0957)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-365572695))
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-414133342))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1836373423))
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1140965508))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                                goto(Label_1422)
                            }
                        }
                    }
                    
                    Label_1265:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1464568797))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-2136521260))
                            goto(Label_1133)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1948428019))
                            goto(Label_0957)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(997667185))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1320337796))
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(933647049))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1962934422))
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-364037315))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_119:double, var_5_85:int, var_16_11D:int)
                        goto(Label_1555)
                    }
                    
                    Label_1422:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1779197160))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1537881864))
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-375461529))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1652344878))
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_695 = and:int(var_3_695:int, ldc:int(-807634056))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_119:double, ldc:double(0.0))
                    Label_1555:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A0 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1566:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1804891167))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(841322189))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1893363326))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(665444249))
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1106436104))
                        var_17_6A0 = add:int(var_16_11D:int, and:int(ldc:int(9), ldc:int(16961)))
                        looporswitchbreak()
                    }
                    
                    var_3_695 = and:int(var_3_695:int, ldc:int(-1945071850))
                }
                
                var_3_695 = and:int(var_3_695:int, ldc:int(-1691476100))
                
                if (cmple:boolean(var_5_85 = var_17_6A0:int, sub:int(var_6_8C:int, and:int(ldc:int(18445), ldc:int(8705))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
            var_3_695 = and:int(var_3_695:int, ldc:int(1514394808))
            goto(Label_0106)
        }
    }
}
