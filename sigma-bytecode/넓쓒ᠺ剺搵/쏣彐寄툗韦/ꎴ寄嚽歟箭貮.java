public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae {
    public void \ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\ube23\u4bc8\u0800\u4f52\uf995\ua61f$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.Typed p2) {
        var_5_65 : Optional
        var_6_88 : String
        var_7_A7 : Typed
        var_8_B4 : Dynamic
        
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
            var_5_65 = invokevirtual:Optional(Typed::getOptional, p2:Typed, p0:OpticFinder)
            
            if (invokevirtual:boolean(Optional::isPresent, var_5_65:Optional)) {
                var_6_88 = checkcast:String(java.lang.String.class, invokevirtual:Object[expected:String](Pair::getSecond, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, var_5_65:Optional<Pair>))))
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae::\uc2e8\u7af6\u34df\u47c2\ud523\u7049), xor:int(ldc:int(3346), ldc:int(3345))), var_6_88:String[expected:Object]))) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae::\uc2e8\u7af6\u34df\u47c2\ud523\u7049), xor:int(ldc:int(10386), ldc:int(10390))), var_6_88:String[expected:Object]))) {
                        if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae::\uc2e8\u7af6\u34df\u47c2\ud523\u7049), and:int(ldc:int(2053), ldc:int(325))), var_6_88:String[expected:Object]))) {
                            if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae::\uc2e8\u7af6\u34df\u47c2\ud523\u7049), xor:int(ldc:int(12423), ldc:int(12417))), var_6_88:String[expected:Object]))) {
                                return:Typed(p2:Typed)
                            }
                        }
                    }
                }
                
                var_7_A7 = invokevirtual:Typed(Typed::getOrCreateTyped, p2:Typed, p1:OpticFinder)
                var_8_B4 = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, var_7_A7:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
                
                if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_8_B4:Dynamic, loadelement:String(getstatic:String[](\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae::\uc2e8\u7af6\u34df\u47c2\ud523\u7049), and:int(ldc:int(4119), ldc:int(11855))))))))) {
                    var_8_B4 = invokevirtual:Dynamic(Dynamic::set, var_8_B4:Dynamic, loadelement:String(getstatic:String[](\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae::\uc2e8\u7af6\u34df\u47c2\ud523\u7049), xor:int(ldc:int(16456), ldc:int(16463))), invokevirtual:Dynamic(Dynamic::createString, var_8_B4:Dynamic, loadelement:String(getstatic:String[](\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae::\uc2e8\u7af6\u34df\u47c2\ud523\u7049), and:int(ldc:int(4170), ldc:int(26776)))))
                }
                
                return:Typed(invokevirtual:Typed(Typed::set, p2:Typed, p1:OpticFinder, invokevirtual:Typed(Typed::set, var_7_A7:Typed, invokestatic:OpticFinder(DSL::remainderFinder), var_8_B4:Dynamic[expected:Object])))
            }
            
            return:Typed(p2:Typed)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_AE : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_219_0 : byte[] [generated]
        stack_279_0 : byte[] [generated]
        stack_2EE_0 : byte[] [generated]
        var_4_1FC : int
        var_3_201 : byte[]
        var_5_202 : int
        expr_21C : byte [generated]
        var_0_26F : int
        expr_279 : byte [generated]
        stack_2BD_2 : byte [generated]
        stack_29C_0 : byte [generated]
        expr_8F : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_2DD : byte[]
        var_5_2DE : int
        var_3_EA : String
        stack_1F5_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
        var_0_AE = and:int(ldc:int(-397933933), ldc:int(1873209331))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_219_0 = stack_279_0 = stack_2EE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("5dD1OF34SPUoZXgHcM2IvtX4ZXgYWGhApXgozQiFBbfdhUjeOMVItYXQtXjlxWB4OHhwKCjNCIUFt/21eO5oeDh4cCgozQiFBbcNzTCueDAA9VjdzWB4OHhwKCjNCIUFtx2FWC7wWOj45eX9LUAoeOggzQiFBbctQHjOWBXYheERsoq1")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1FC = expr_6B:int
        var_3_201 = newarray:byte[](byte.class, expr_6B:int)
        var_5_202 = expr_6B:int
        Label_0516:
        
        while (cmpne:boolean(and:int(var_0_AE:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_AE = and:int(var_0_AE:int, ldc:int(1794038431))
            var_5_202 = add:int(var_5_202:int, ldc:int(-1))
            expr_21C = add:byte(loadelement:byte(stack_219_0:byte[], var_5_202:int), ldc:byte(1))
            storeelement:byte(var_3_201:byte[], var_5_202:int, xor:int(or:int(and:int(shl:int(expr_21C:byte, xor:int(ldc:int(28801), ldc:int(28805))), ldc:int(-16)), and:int(shr:int(expr_21C:byte[expected:int], xor:int(ldc:int(9731), ldc:int(9735))), ldc:int(15))), ldc:int(23)))
            
            if (cmpne:boolean(var_5_202:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_219_0 = stack_279_0 = stack_2EE_0 = var_3_201:byte[]
            goto(Label_0112)
        }
        
        Label_0612:
        
        while (cmpne:boolean(and:int(var_0_AE:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_26F = and:int(var_0_AE:int, ldc:int(1828668411))
            var_5_202 = add:int(var_5_202:int, ldc:int(-1))
            expr_279 = stack_2BD_2 = loadelement(stack_279_0, var_5_202)
            
            if (cmplt:boolean(add:int(add:int(var_5_202:int, ldc:int(4)), neg:int(var_4_1FC:int)), ldc:int(0))) {
                stack_2BD_2 = stack_29C_0 = add:byte(expr_279:byte, loadelement:byte(var_3_201:byte[], add:int(var_5_202:int, ldc:int(4))))
                goto(Label_0684)
            }
            
            Label_0646:
            
            if (cmpne:boolean(and:int(var_0_26F:int, ldc:int(4096)), ldc:int(0))) {
                var_0_26F = and:int(var_0_26F:int, ldc:int(-1919849176))
            }
            else {
                var_0_26F = and:int(var_0_26F:int, ldc:int(-78963973))
                stack_2BD_2 = stack_29C_0 = add:byte(expr_279:byte, ldc:byte(4))
            }
            
            Label_0684:
            
            if (cmpeq:boolean(and:int(var_0_26F:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0646)
            }
            
            var_0_AE = and:int(var_0_26F:int, ldc:int(-277638209))
            storeelement:byte(var_3_201:byte[], var_5_202:int, stack_2BD_2:byte)
            
            if (cmpne:boolean(var_5_202:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_219_0 = stack_279_0 = stack_2EE_0 = var_3_201:byte[]
            goto(Label_0148)
        }
        
        goto(Label_0516)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_AE:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0186)
        }
        
        if (cmpne:boolean(and:int(var_0_AE:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_AE = and:int(var_0_AE:int, ldc:int(1632071844))
        }
        else {
            var_0_AE = and:int(var_0_AE:int, ldc:int(-65346881))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_1FC = expr_8F:int
                var_3_201 = newarray:byte[](byte.class, expr_8F:int)
                var_5_202 = expr_8F:int
                goto(Label_0612)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_AE:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_AE:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_AE = and:int(var_0_AE:int, ldc:int(-283569984))
                goto(Label_0112)
            }
            
            var_0_AE = and:int(var_0_AE:int, ldc:int(-121816425))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_2DD = newarray:byte[](byte.class, expr_B5:int)
                var_5_2DE = expr_B5:int
                
                loop {
                    var_0_AE = and:int(var_0_AE:int, ldc:int(2017654783))
                    var_5_2DE = add:int(var_5_2DE:int, ldc:int(-1))
                    storeelement:byte(var_3_2DD:byte[], var_5_2DE:int, add:int(shl:int(loadelement:byte(stack_2EE_0:byte[], var_5_2DE:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_2DE:int, and:int(ldc:int(35), ldc:int(16389)))), ldc:int(7)), xor:int(ldc:int(8737), ldc:int(8736)))))
                    
                    if (cmpne:boolean(var_5_2DE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_219_0 = stack_279_0 = stack_2EE_0 = var_3_2DD:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_AE:int, ldc:int(4)), ldc:int(0))) {
            var_0_AE = and:int(var_0_AE:int, ldc:int(-40480389))
            goto(Label_0148)
        }
        
        if (cmpeq:boolean(and:int(var_0_AE:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_AE = and:int(var_0_AE:int, ldc:int(108108153))
            goto(Label_0112)
        }
        
        var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1F5_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9234), ldc:int(9243)))
        expr_FC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8196), ldc:int(8205)))
        storeelement:String(expr_FC:String[], and:int(ldc:int(26763), ldc:int(1810)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(18008), ldc:int(-30554)), and:int(ldc:int(27442), ldc:int(154))))
        storeelement:String(expr_FC:String[], xor:int(ldc:int(47), ldc:int(40)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(274), ldc:int(2134)), and:int(ldc:int(1368), ldc:int(16446))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(-22858), ldc:int(18761)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(-29631), ldc:int(-29607)), and:int(ldc:int(4667), ldc:int(10522))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(8357), ldc:int(20741)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(25594), ldc:int(2075)), xor:int(ldc:int(-27606), ldc:int(-27618))))
        storeelement:String(expr_FC:String[], xor:int(ldc:int(-24190), ldc:int(-24191)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(20596), ldc:int(11957)), and:int(ldc:int(229), ldc:int(2124))))
        storeelement:String(expr_FC:String[], xor:int(ldc:int(42), ldc:int(46)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(16787), ldc:int(16855)), and:int(ldc:int(1759), ldc:int(24667))))
        storeelement:String(expr_FC:String[], xor:int(ldc:int(-28606), ldc:int(-28604)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(16987), ldc:int(8411)), and:int(ldc:int(1009), ldc:int(22643))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(2700), ldc:int(24)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(-28640), ldc:int(-28591)), and:int(ldc:int(240), ldc:int(19072))))
        storeelement:String(expr_FC:String[], xor:int(ldc:int(9225), ldc:int(9224)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(2240), ldc:int(128)), and:int(ldc:int(8331), ldc:int(4307))))
        putstatic:String[](\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae::\uc2e8\u7af6\u34df\u47c2\ud523\u7049, expr_FC:String[])
    }
    
    public void \u97e6\u1187\ucef1\u5245\uc4d2\uf9c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6CA : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6D5 : int
        
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
        var_3_6CA = and:int(ldc:int(-415953375), ldc:int(1065343731))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua3b4\u5bc4\u56bd\u6b5f\u7bad\u8cae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(32)), ldc:int(0))) {
            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-360301102))
        }
        else {
            var_3_6CA = and:int(var_3_6CA:int, ldc:int(1065271153))
            var_5_8A = and:int(ldc:int(-20595), ldc:int(20594))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20080), ldc:int(20006)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6CA:int, ldc:int(535120487))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(-26112), ldc:int(-26111)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(4432), ldc:int(4433)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6CA = and:int(var_3_E3:int, ldc:int(-1209938311))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(25233), ldc:int(2059)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(810498310))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-883820250))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-397164544))
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(183444598))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1811400033))
                        goto(Label_0734)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1740006678))
                        goto(Label_0619)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-992864700))
                    }
                    else {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(2147465973))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0619)
                            }
                            
                            goto(Label_0873)
                        }
                    }
                    
                    Label_0445:
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-321819230))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-250841352))
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-832705518))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1950456625))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0734)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1254588692))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(1194998515))
                            var_11_F4 = and:int(ldc:int(19057), ldc:int(-19194))
                            goto(Label_1607)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0619:
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-371267053))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-344812366))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(234984763))
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-680985671))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0873)
                        }
                    }
                    
                    Label_0734:
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(1866375790))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1281283675))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(754568898))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0619)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(1057503863))
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(1917064666))
                            loopcontinue()
                        }
                        
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-135963731))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1624365697))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1374551406))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(1437394980))
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(246378295))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(1355748600))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(398108847))
                            goto(Label_0734)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0619)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-939760865))
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-2014667865))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-32704), ldc:int(-32703))
                                goto(Label_1216)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(882696883))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(244916671))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(1645646473))
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1354771779))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(136716450))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1894748927))
                            goto(Label_0734)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(1110456419))
                            goto(Label_0619)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(14477105))
                            loopcontinue()
                        }
                        
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1477870659))
                        var_11_F4 = and:int(ldc:int(18540), ldc:int(-18541))
                    }
                    
                    Label_1216:
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(1064432213))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-178772088))
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0734)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0619)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1531982246))
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(1849805451))
                            loopcontinue()
                        }
                        
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(392847079))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1482)
                            }
                        }
                    }
                    
                    Label_1338:
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-79732756))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-252441015))
                            goto(Label_1216)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-714176087))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1942086515))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0734)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0619)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1034312599))
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6CA = and:int(var_3_6CA:int, ldc:int(1336028899))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1607)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1482:
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(1616951303))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0734)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(109784957))
                        goto(Label_0619)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-2134985855))
                        loopcontinue()
                    }
                    
                    var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1352414621))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1607:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6D5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1618:
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1443118490))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(-2085724808))
                        goto(Label_0734)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(13788599))
                        goto(Label_0619)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(1417230400))
                        goto(Label_0445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6CA = and:int(var_3_6CA:int, ldc:int(662514409))
                        var_17_6D5 = add:int(var_16_122:int, xor:int(ldc:int(2570), ldc:int(2571)))
                        looporswitchbreak()
                    }
                    
                    var_3_6CA = and:int(var_3_6CA:int, ldc:int(-920410087))
                }
                
                var_3_6CA = and:int(var_3_6CA:int, ldc:int(-1342320641))
                
                if (cmple:boolean(var_5_8A = var_17_6D5:int, sub:int(var_6_91:int, xor:int(ldc:int(8840), ldc:int(8841))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6CA:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6CA = and:int(var_3_6CA:int, ldc:int(1626624986))
            goto(Label_0108)
        }
    }
}
