public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe {
    public void \uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u7330\u47c2\u12b2\ubefe\ub7dc\ua3b4$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.Typed p2) {
        var_5_65 : Optional
        var_6_A7 : Dynamic
        var_7_AE : Optional
        var_8_CA : short
        var_9_DC : Typed
        var_10_EF : Dynamic
        var_12_138 : String
        
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
                if (invokestatic:boolean(Objects::equals, invokevirtual:Object(Pair::getSecond, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, var_5_65:Optional<Pair>))), loadelement:String[expected:Object](getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(17504), ldc:int(17507))))) {
                    var_6_A7 = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, p2:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
                    var_7_AE = invokevirtual:Optional(Typed::getOptionalTyped, p2:Typed, p1:OpticFinder)
                    var_8_CA = invokevirtual:short(OptionalDynamic::asShort, invokevirtual:OptionalDynamic(Dynamic::get, var_6_A7:Dynamic, loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(25156), ldc:int(12)))), and:int[expected:short](ldc:int(5469), ldc:int(-15710)))
                    
                    if (invokevirtual:boolean(Optional::isPresent, var_7_AE:Optional)) {
                        var_9_DC = p2:Typed
                        var_10_EF = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Typed(Optional<Typed>::get, var_7_AE:Optional<Typed>)), invokestatic:OpticFinder(DSL::remainderFinder)))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_10_EF:Dynamic, loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(24611), ldc:int(24614))))))))) {
                            var_12_138 = loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\u7043\u67d0\u4f4a\u7bad\ud217\u983f), and:short[expected:int](var_8_CA:short, ldc:short(127)))
                            var_9_DC = invokevirtual:Typed(Typed::set, p2:Typed, p1:OpticFinder, invokevirtual:Typed(Typed::set, checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Typed(Optional<Typed>::get, var_7_AE:Optional<Typed>)), invokestatic:OpticFinder(DSL::remainderFinder), invokevirtual:Dynamic(Dynamic::set, var_10_EF:Dynamic, loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(669), ldc:int(5))), invokevirtual:Dynamic(Dynamic::createString, var_10_EF:Dynamic, ternaryop:String(cmpne:boolean(var_12_138:String, aconstnull:String()), var_12_138:String, loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(70), ldc:int(26798))))))))
                            
                            if (cmpeq:boolean(and:int(var_8_CA:short[expected:int], xor:int(ldc:int(10073), ldc:int(26457))), and:int(ldc:int(17088), ldc:int(16396)))) {
                                var_9_DC = invokevirtual:Typed(Typed::set, var_9_DC:Typed, p0:OpticFinder, invokestatic:Pair[expected:Object](Pair::of, invokeinterface:String[expected:Object](DSL$TypeReference::typeName, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u516c\u67d0\u97b7\uc246\ub6ab)), loadelement:String[expected:Object](getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(4391), ldc:int(18071)))))
                            }
                        }
                        
                        if (cmpne:boolean(var_8_CA:short, ldc:short(0))) {
                            var_6_A7 = invokevirtual:Dynamic(Dynamic::set, var_6_A7:Dynamic, loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-30077), ldc:int(-30073))), invokevirtual:Dynamic(Dynamic::createShort, var_6_A7:Dynamic, and:int[expected:short](ldc:int(-25208), ldc:int(24631))))
                        }
                        
                        return:Typed(invokevirtual:Typed(Typed::set, var_9_DC:Typed, invokestatic:OpticFinder(DSL::remainderFinder), var_6_A7:Dynamic[expected:Object]))
                    }
                }
            }
            
            return:Typed(p2:Typed)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ube23\u8cae\ub8be\u93a2\uf995\u3c25$0(java.lang.String[] p0) {
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
            storeelement:String(p0:String[], and:int(ldc:int(17094), ldc:int(-19400)), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(6166), ldc:int(1159))))
            storeelement:String(p0:String[], xor:int(ldc:int(1286), ldc:int(1287)), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(280), ldc:int(7304))))
            storeelement:String(p0:String[], xor:int(ldc:int(-32767), ldc:int(-32765)), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(16456), ldc:int(16449))))
            storeelement:String(p0:String[], xor:int(ldc:int(324), ldc:int(327)), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(8193), ldc:int(8203))))
            storeelement:String(p0:String[], and:int(ldc:int(8996), ldc:int(17436)), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(16776), ldc:int(16771))))
            storeelement:String(p0:String[], xor:int(ldc:int(515), ldc:int(518)), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(140), ldc:int(128))))
            storeelement:String(p0:String[], ldc:int(6), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(28173), ldc:int(4301))))
            storeelement:String(p0:String[], ldc:int(7), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(8), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(1054), ldc:int(18607))))
            storeelement:String(p0:String[], ldc:int(9), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(1610), ldc:int(1605))))
            storeelement:String(p0:String[], ldc:int(10), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(6673), ldc:int(18))))
            storeelement:String(p0:String[], ldc:int(11), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(4721), ldc:int(145))))
            storeelement:String(p0:String[], ldc:int(12), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(16489), ldc:int(16507))))
            storeelement:String(p0:String[], ldc:int(13), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(9011), ldc:int(21527))))
            storeelement:String(p0:String[], ldc:int(14), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(2069), ldc:int(5406))))
            storeelement:String(p0:String[], ldc:int(15), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(16), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(16597), ldc:int(4125))))
            storeelement:String(p0:String[], ldc:int(17), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-28126), ldc:int(-28118))))
            storeelement:String(p0:String[], ldc:int(18), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(1384), ldc:int(1377))))
            storeelement:String(p0:String[], ldc:int(19), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(13321), ldc:int(13315))))
            storeelement:String(p0:String[], ldc:int(20), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(1039), ldc:int(24715))))
            storeelement:String(p0:String[], ldc:int(21), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(12929), ldc:int(12941))))
            storeelement:String(p0:String[], ldc:int(22), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(4173), ldc:int(1069))))
            storeelement:String(p0:String[], ldc:int(23), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(24), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-32749), ldc:int(-32739))))
            storeelement:String(p0:String[], ldc:int(25), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(175), ldc:int(24927))))
            storeelement:String(p0:String[], ldc:int(26), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(1171), ldc:int(14676))))
            storeelement:String(p0:String[], ldc:int(27), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(1459), ldc:int(601))))
            storeelement:String(p0:String[], ldc:int(28), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-32721), ldc:int(-32707))))
            storeelement:String(p0:String[], ldc:int(29), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(10774), ldc:int(10757))))
            storeelement:String(p0:String[], ldc:int(30), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(532), ldc:int(24757))))
            storeelement:String(p0:String[], ldc:int(31), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(32), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(285), ldc:int(267))))
            storeelement:String(p0:String[], ldc:int(33), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(1247), ldc:int(4663))))
            storeelement:String(p0:String[], ldc:int(34), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(26650), ldc:int(26626))))
            storeelement:String(p0:String[], ldc:int(35), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(1032), ldc:int(1026))))
            storeelement:String(p0:String[], ldc:int(36), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(9218), ldc:int(9243))))
            storeelement:String(p0:String[], ldc:int(37), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(3354), ldc:int(26))))
            storeelement:String(p0:String[], ldc:int(38), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(8269), ldc:int(20781))))
            storeelement:String(p0:String[], ldc:int(39), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(40), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(47), ldc:int(30))))
            storeelement:String(p0:String[], ldc:int(41), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(10267), ldc:int(16475))))
            storeelement:String(p0:String[], ldc:int(42), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(4280), ldc:int(4264))))
            storeelement:String(p0:String[], ldc:int(43), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(9), ldc:int(21))))
            storeelement:String(p0:String[], ldc:int(44), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(10285), ldc:int(10288))))
            storeelement:String(p0:String[], ldc:int(45), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(25363), ldc:int(1115))))
            storeelement:String(p0:String[], ldc:int(46), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(2204), ldc:int(9493))))
            storeelement:String(p0:String[], ldc:int(48), storeelement:String(p0:String[], ldc:int(47), aconstnull:String()))
            storeelement:String(p0:String[], ldc:int(49), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-30714), ldc:int(-30703))))
            storeelement:String(p0:String[], ldc:int(50), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(17432), ldc:int(2138))))
            storeelement:String(p0:String[], ldc:int(51), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(2058), ldc:int(24895))))
            storeelement:String(p0:String[], ldc:int(52), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(6166), ldc:int(6159))))
            storeelement:String(p0:String[], ldc:int(53), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(1626), ldc:int(10399))))
            storeelement:String(p0:String[], ldc:int(54), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(18605), ldc:int(9997))))
            storeelement:String(p0:String[], ldc:int(55), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(56), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(25351), ldc:int(25353))))
            storeelement:String(p0:String[], ldc:int(57), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(8507), ldc:int(16411))))
            storeelement:String(p0:String[], ldc:int(58), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(80), ldc:int(7323))))
            storeelement:String(p0:String[], ldc:int(59), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(8208), ldc:int(8204))))
            storeelement:String(p0:String[], ldc:int(60), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(17430), ldc:int(17419))))
            storeelement:String(p0:String[], ldc:int(61), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(16791), ldc:int(7251))))
            storeelement:String(p0:String[], ldc:int(62), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(1), ldc:int(21))))
            storeelement:String(p0:String[], ldc:int(63), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(64), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(3103), ldc:int(12510))))
            storeelement:String(p0:String[], ldc:int(65), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-13289), ldc:int(-13304))))
            storeelement:String(p0:String[], ldc:int(66), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(11104), ldc:int(1068))))
            storeelement:String(p0:String[], ldc:int(67), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(4257), ldc:int(9761))))
            storeelement:String(p0:String[], ldc:int(68), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(32042), ldc:int(166))))
            storeelement:String(p0:String[], ldc:int(69), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(20772), ldc:int(20776))))
            storeelement:String(p0:String[], ldc:int(70), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-22470), ldc:int(-22503))))
            storeelement:String(p0:String[], ldc:int(71), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(72), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(2075), ldc:int(2111))))
            storeelement:String(p0:String[], ldc:int(73), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(8511), ldc:int(1125))))
            storeelement:String(p0:String[], ldc:int(74), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-32747), ldc:int(-32717))))
            storeelement:String(p0:String[], ldc:int(75), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(8295), ldc:int(2111))))
            storeelement:String(p0:String[], ldc:int(76), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(29), ldc:int(15))))
            storeelement:String(p0:String[], ldc:int(77), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-11763), ldc:int(-11739))))
            storeelement:String(p0:String[], ldc:int(78), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(16555), ldc:int(13865))))
            storeelement:String(p0:String[], ldc:int(79), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(80), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(8475), ldc:int(8462))))
            storeelement:String(p0:String[], ldc:int(81), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(1663), ldc:int(20639))))
            storeelement:String(p0:String[], ldc:int(82), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-32749), ldc:int(-32717))))
            storeelement:String(p0:String[], ldc:int(83), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(11536), ldc:int(11569))))
            storeelement:String(p0:String[], ldc:int(84), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(3427), ldc:int(21050))))
            storeelement:String(p0:String[], ldc:int(85), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(60), ldc:int(16910))))
            storeelement:String(p0:String[], ldc:int(86), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(291), ldc:int(4135))))
            storeelement:String(p0:String[], ldc:int(87), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(88), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(10292), ldc:int(4647))))
            storeelement:String(p0:String[], ldc:int(89), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(28197), ldc:int(37))))
            storeelement:String(p0:String[], ldc:int(90), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(16742), ldc:int(4142))))
            storeelement:String(p0:String[], ldc:int(91), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(1064), ldc:int(1039))))
            storeelement:String(p0:String[], ldc:int(92), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(1414), ldc:int(1428))))
            storeelement:String(p0:String[], ldc:int(93), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(3088), ldc:int(3128))))
            storeelement:String(p0:String[], ldc:int(94), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(28673), ldc:int(28712))))
            storeelement:String(p0:String[], ldc:int(95), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(96), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(24584), ldc:int(24606))))
            storeelement:String(p0:String[], ldc:int(97), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-32767), ldc:int(-32759))))
            storeelement:String(p0:String[], ldc:int(98), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(10637), ldc:int(73))))
            storeelement:String(p0:String[], ldc:int(99), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(20913), ldc:int(9765))))
            storeelement:String(p0:String[], ldc:int(100), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(8331), ldc:int(3147))))
            storeelement:String(p0:String[], ldc:int(101), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(8238), ldc:int(8244))))
            storeelement:String(p0:String[], ldc:int(102), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(3171), ldc:int(8371))))
            storeelement:String(p0:String[], ldc:int(103), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(104), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(1058), ldc:int(1030))))
            storeelement:String(p0:String[], ldc:int(105), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(15), ldc:int(8255))))
            storeelement:String(p0:String[], ldc:int(106), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(807), ldc:int(21542))))
            storeelement:String(p0:String[], ldc:int(107), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(18773), ldc:int(4113))))
            storeelement:String(p0:String[], ldc:int(108), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-30522), ldc:int(-30501))))
            storeelement:String(p0:String[], ldc:int(109), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(23785), ldc:int(40))))
            storeelement:String(p0:String[], ldc:int(110), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(24681), ldc:int(3627))))
            storeelement:String(p0:String[], ldc:int(112), storeelement:String(p0:String[], ldc:int(111), aconstnull:String()))
            storeelement:String(p0:String[], ldc:int(113), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(17548), ldc:int(6664))))
            storeelement:String(p0:String[], ldc:int(114), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(41), ldc:int(2777))))
            storeelement:String(p0:String[], ldc:int(115), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-32444), ldc:int(-32411))))
            storeelement:String(p0:String[], ldc:int(116), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(4170), ldc:int(4161))))
            storeelement:String(p0:String[], ldc:int(117), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(12352), ldc:int(12378))))
            storeelement:String(p0:String[], ldc:int(118), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(2099), ldc:int(8487))))
            storeelement:String(p0:String[], ldc:int(119), aconstnull:String())
            storeelement:String(p0:String[], ldc:int(120), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(4102), ldc:int(4130))))
            storeelement:String(p0:String[], ldc:int(121), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(8719), ldc:int(17487))))
            storeelement:String(p0:String[], ldc:int(122), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(-20336), ldc:int(-20298))))
            storeelement:String(p0:String[], ldc:int(123), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(9593), ldc:int(2065))))
            storeelement:String(p0:String[], ldc:int(124), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(127), ldc:int(25885))))
            storeelement:String(p0:String[], ldc:int(125), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), and:int(ldc:int(4329), ldc:int(40))))
            storeelement:String(p0:String[], ldc:int(126), loadelement:String(getstatic:String[](\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe::\ub32d\u156b\u0c95\u5d20\u47c2\u8cae), xor:int(ldc:int(29190), ldc:int(29231))))
            storeelement:String(p0:String[], ldc:int(127), aconstnull:String())
            return:void()
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
    
    public void \ud158\ub6ab\u8389\u64f2\u64f2\ud171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67F : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_68A : int
        
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
        var_3_67F = and:int(ldc:int(1038633902), ldc:int(753299392))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc4d2\ua562\u4d85\u7ce1\u4d85\u6cfe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-1383338023))
        }
        else {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-303431816))
            var_5_8A = and:int(ldc:int(9708), ldc:int(-10237))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5891), ldc:int(-5900)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_67F:int, ldc:int(-269721713))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(23045), ldc:int(97)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(28747), ldc:int(545)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_67F = and:int(var_3_DA:int, ldc:int(-152405216))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1088), ldc:int(1089)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-837101318))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1481328621))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2110470828))
                    }
                    else {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-169481425))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0582)
                            }
                            
                            goto(Label_0851)
                        }
                    }
                    
                    Label_0401:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1607670407))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-865957892))
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1313511383))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1773705137))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0851)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-109520564))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-158021858))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1693577005))
                        var_11_EB = and:int(ldc:int(12056), ldc:int(-12057))
                        goto(Label_1543)
                    }
                    
                    Label_0582:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-470953341))
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1946583948))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(202926004))
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-238594056))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1962372856))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-329819109))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-35599576))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0851)
                        }
                    }
                    
                    Label_0721:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1041828129))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1174172325))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(263313544))
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1205220416))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2146593695))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0851:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-890582590))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1631590619))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(655748976))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2021392177))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0721)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(364907867))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-2041588778))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(787409891))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(1536), ldc:int(1537))
                                goto(Label_1158)
                            }
                        }
                    }
                    
                    Label_0992:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-847918589))
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(605151314))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(305762344))
                            goto(Label_0851)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0721)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1934480227))
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1605832705))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1476502624))
                        var_11_EB = and:int(ldc:int(-11132), ldc:int(2938))
                    }
                    
                    Label_1158:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1698495839))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0992)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0851)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1263165506))
                            goto(Label_0721)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1663500227))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(548322852))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-185013411))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1390)
                            }
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1158)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0992)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0851)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0721)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1500169738))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-167907379))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1543)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1390:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1235591929))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1991955067))
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-659714024))
                        goto(Label_0851)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1388221229))
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1712765450))
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1251719383))
                        loopcontinue()
                    }
                    
                    var_3_67F = and:int(var_3_67F:int, ldc:int(-302261306))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1543:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68A = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1554:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2047712253))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1904109836))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-406909018))
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(333775433))
                        goto(Label_0401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1743081293))
                        var_17_68A = add:int(var_16_119:int, and:int(ldc:int(24611), ldc:int(1025)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67F = and:int(var_3_67F:int, ldc:int(803426084))
                
                if (cmple:boolean(var_5_8A = var_17_68A:int, sub:int(var_6_91:int, and:int(ldc:int(5657), ldc:int(385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
