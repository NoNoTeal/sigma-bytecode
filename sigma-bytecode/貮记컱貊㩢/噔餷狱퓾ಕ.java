public abstract class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<C> {
    private static F extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> \ud217\ubefe\u836c\u7049\u3a62\uc2bd(java.lang.String p0, F extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p1, \ud36e\u6bb9\u960f\u4c04\u64ab.\u527a\u5f50\u92ff\ud36e\u3e75\u51fa p2) {
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
            invokeinterface:Object(BiMap::put, getstatic:BiMap<String, \u5654\u9937\u72f1\ud4fe\u0c95<?>>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub1b9\uc229\ub6ab\ud51e\u624e\u6bb9), invokevirtual:String[expected:Object](String::toLowerCase, p0:String, getstatic:Locale(Locale::ROOT)), p1:F extends \u5654\u9937\u72f1\ud4fe\u0c95<?>[expected:Object])
            invokeinterface:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u527a\u5f50\u92ff\ud36e\u3e75\u51fa>::put, getstatic:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u527a\u5f50\u92ff\ud36e\u3e75\u51fa>(\u5654\u9937\u72f1\ud4fe\u0c95::\u98a4\ucfaf\u6d69\ub171\u8308\u718f), p1:F extends \u5654\u9937\u72f1\ud4fe\u0c95<?>[expected:\u5654\u9937\u72f1\ud4fe\u0c95<?>], p2:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa)
            return:F extends \u5654\u9937\u72f1\ud4fe\u0c95<?>(checkcast:F extends \u5654\u9937\u72f1\ud4fe\u0c95<?>(F extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>.class, invokestatic:F extends \u5654\u9937\u72f1\ud4fe\u0c95<?>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u5654\u9937\u72f1\ud4fe\u0c95<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u8389\ub70c\u3e75\u718f\u9af2\uc87f), invokevirtual:String(String::toLowerCase, p0:String, getstatic:Locale(Locale::ROOT)), p1:F extends \u5654\u9937\u72f1\ud4fe\u0c95<?>)))
        }
        
        goto(Label_0006)
    }
    
    public void \u5654\u9937\u72f1\ud4fe\u0c95(com.mojang.serialization.Codec<C> p0) {
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
    
    public \ud36e\u6bb9\u960f\u4c04\u64ab.\u527a\u5f50\u92ff\ud36e\u3e75\u51fa \u7c6b\u88c5\u69d9\u8753\u71ae\ucfaf() {
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
            return:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(checkcast:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\ud36e\u6bb9\u960f\u4c04\u64ab.\u527a\u5f50\u92ff\ud36e\u3e75\u51fa.class, invokeinterface:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u527a\u5f50\u92ff\ud36e\u3e75\u51fa>::get, getstatic:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u527a\u5f50\u92ff\ud36e\u3e75\u51fa>(\u5654\u9937\u72f1\ud4fe\u0c95::\u98a4\ucfaf\u6d69\ub171\u8308\u718f), this:\u5654\u9937\u72f1\ud4fe\u0c95<C>[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public static void \u5140\u120d\u8d90\ua562\u7ce1\u7873() {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?> \u59ec\ufe34\u72f1\u56bd\ub32d\u71ae(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, long p2) {
        var_4_10E : int
        var_6_70 : String
        var_7_FF : \u5654\u9937\u72f1\ud4fe\u0c95<?>
        var_8_1D0 : int
        var_4_1D8 : int
        var_9_1E1 : int
        var_4_227 : int
        var_10_1F2 : int
        stack_249_0 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 [generated]
        var_4_247 : int
        var_11_249 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_4_251 : int
        var_12_25C : \ud158\u8308\u76bc\u0a06\ud36e
        var_13_274 : \u34df\uceb8\u34df\u8640\u1187<?>
        var_14_285 : int
        var_15_30C : \uc31c\uc87f\uc246\u3776\ub7dc
        var_16_323 : String
        var_17_336 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_18_34F : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_19_364 : \uc87f\ud12e\u0b8e\u7049\u7e3f
        var_20_423 : \uc7fe\u12cb\u1833\u67e9\u92ff
        var_20_464 : Exception
        stack_4C7_0 : \u34df\uceb8\u34df\u8640\u1187<?> [generated]
        var_13_4CC : Exception
        
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
        var_4_10E = and:int(and:int(ldc:int(-1671968331), ldc:int(-538044037)), ldc:int(-1614558444))
        var_6_70 = invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, p1:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("id"))
        
        loop {
            if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_10E = and:int(var_4_10E:int, ldc:int(893717441))
                goto(Label_0190)
            }
            
            if (cmpne:boolean(and:int(var_4_10E:int, ldc:int(8192)), ldc:int(0))) {
                var_4_10E = and:int(var_4_10E:int, ldc:int(1338650537))
            }
            else {
                var_4_10E = and:int(var_4_10E:int, ldc:int(-1627726405))
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, ldc:String("INVALID"), var_6_70:String[expected:Object]))) {
                    var_7_FF = checkcast:\u5654\u9937\u72f1\ud4fe\u0c95<?>(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>.class, invokevirtual:\u5654\u9937\u72f1\ud4fe\u0c95<?>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u5654\u9937\u72f1\ud4fe\u0c95<?>>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u5654\u9937\u72f1\ud4fe\u0c95<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u8389\ub70c\u3e75\u718f\u9af2\uc87f), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(String::toLowerCase, var_6_70:String, getstatic:Locale(Locale::ROOT)))))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_4_10E = and:int(var_4_10E:int, ldc:int(1036805546))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_10E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0334)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(2)), ldc:int(0))) {
                            var_4_10E = and:int(var_4_10E:int, ldc:int(-587784353))
                            
                            if (cmpne:boolean(var_7_FF:\u5654\u9937\u72f1\ud4fe\u0c95<?>, aconstnull:\u5654\u9937\u72f1\ud4fe\u0c95<?>())) {
                                var_8_1D0 = invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("ChunkX"))
                                var_4_1D8 = and:int(var_4_10E:int, ldc:int(-53748778))
                                var_9_1E1 = invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("ChunkZ"))
                                var_4_227 = and:int(var_4_1D8:int, ldc:int(-1630336400))
                                var_10_1F2 = invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("references"))
                                
                                do {
                                    if (cmpeq:boolean(and:int(var_4_227:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_4_227 = and:int(var_4_227:int, ldc:int(1888951255))
                                    }
                                    else {
                                        var_4_227 = and:int(var_4_227:int, ldc:int(-1664386338))
                                        
                                        if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("BB"))) {
                                            loopcontinue()
                                        }
                                        
                                        stack_249_0 = invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u98a4\u8258\u5d20\u64f2\ua068\uc4d2)
                                        Label_0577:
                                        var_4_247 = and:int(var_4_227:int, ldc:int(-51929250))
                                        var_11_249 = stack_249_0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
                                        var_4_251 = and:int(var_4_247:int, ldc:int(-565252720))
                                        var_12_25C = invokevirtual:\ud158\u8308\u76bc\u0a06\ud36e(\uc31c\uc87f\uc246\u3776\ub7dc::\uff55\u40a9\u8753\u4975\u120d\u4daf, p1:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("Children"), ldc:int(10))
                                        
                                        try {
                                            var_4_251 = and:int(var_4_251:int, ldc:int(-42770627))
                                            var_13_274 = invokespecial:\u34df\uceb8\u34df\u8640\u1187<?>(\u5654\u9937\u72f1\ud4fe\u0c95<?>::\u64f2\u718f\u6bb9\ub6ab\u6bb9\u12cb, var_7_FF:\u5654\u9937\u72f1\ud4fe\u0c95<?>, var_8_1D0:int, var_9_1E1:int, var_11_249:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_10_1F2:int, p2:long)
                                            var_4_251 = and:int(var_4_251:int, ldc:int(-19661417))
                                            var_14_285 = and:int(ldc:int(18080), ldc:int(-18081))
                                            
                                            loop {
                                                if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(2048)), ldc:int(0))) {
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(1626036712))
                                                    goto(Label_0738)
                                                }
                                                
                                                if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(8192)), ldc:int(0))) {
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-1135683143))
                                                    
                                                    if (cmpge:boolean(var_14_285:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, var_12_25C:\ud158\u8308\u76bc\u0a06\ud36e))) {
                                                        looporswitchbreak()
                                                    }
                                                }
                                                
                                                Label_0692:
                                                
                                                if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(134217728)), ldc:int(0))) {
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(252839287))
                                                }
                                                else {
                                                    if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(2147483647)), ldc:int(0))) {
                                                        var_4_251 = and:int(var_4_251:int, ldc:int(1129692938))
                                                        loopcontinue()
                                                    }
                                                    
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-1638985732))
                                                }
                                                
                                                Label_0738:
                                                
                                                if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(4194304)), ldc:int(0))) {
                                                    goto(Label_0692)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_4_251:int, ldc:int(2)), ldc:int(0))) {
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(794420919))
                                                }
                                                else {
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-1612502125))
                                                    var_15_30C = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ud158\u8308\u76bc\u0a06\ud36e::\u93a2\uc84e\u3e2a\u8d98\u51fa\u4492, var_12_25C:\ud158\u8308\u76bc\u0a06\ud36e, var_14_285:int)
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-572277609))
                                                    var_16_323 = invokevirtual:String(String::toLowerCase, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, var_15_30C:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("id")), getstatic:Locale(Locale::ROOT))
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-1646838700))
                                                    var_17_336 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, var_16_323:String)
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-1638254087))
                                                    var_18_34F = checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::getOrDefault, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u5654\u9937\u72f1\ud4fe\u0c95::\u92ff\u2dcc\ub70c\u494c\u7af6\u6bb9), var_17_336:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], var_17_336:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-1612722310))
                                                    var_19_364 = checkcast:\uc87f\ud12e\u0b8e\u7049\u7e3f(\u3504\ufe34\u600f\u6b0d\u69d9.\uc87f\ud12e\u0b8e\u7049\u7e3f.class, invokevirtual:\uc87f\ud12e\u0b8e\u7049\u7e3f(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc87f\ud12e\u0b8e\u7049\u7e3f>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc87f\ud12e\u0b8e\u7049\u7e3f>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u527a\u7043\u4c04\ufe34\ubefe\u183a), var_18_34F:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
                                                    
                                                    loop {
                                                        if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(4194304)), ldc:int(0))) {
                                                            goto(Label_1149)
                                                        }
                                                        
                                                        if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(268435456)), ldc:int(0))) {
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-214508521))
                                                            goto(Label_0984)
                                                        }
                                                        
                                                        if (cmpne:boolean(and:int(var_4_251:int, ldc:int(16777216)), ldc:int(0))) {
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-71116191))
                                                        }
                                                        else {
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-1628746630))
                                                            
                                                            if (cmpne:boolean(var_19_364:\uc87f\ud12e\u0b8e\u7049\u7e3f, aconstnull:\uc87f\ud12e\u0b8e\u7049\u7e3f())) {
                                                                try {
                                                                    var_20_423 = invokeinterface:\uc7fe\u12cb\u1833\u67e9\u92ff(\uc87f\ud12e\u0b8e\u7049\u7e3f::\u3e75\u7bad\ubefe\u7049\ubff1\u4f52, var_19_364:\uc87f\ud12e\u0b8e\u7049\u7e3f, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, var_15_30C:\uc31c\uc87f\uc246\u3776\ub7dc)
                                                                    
                                                                    do {
                                                                        if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(16)), ldc:int(0))) {
                                                                            var_4_251 = and:int(var_4_251:int, ldc:int(1220665383))
                                                                        }
                                                                        else {
                                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-19243781))
                                                                            invokeinterface:boolean(List<\uc7fe\u12cb\u1833\u67e9\u92ff>::add, invokevirtual:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\u34df\uceb8\u34df\u8640\u1187<C>::\u3e75\ufcaf\uc87f\u7049\u927d\u8aa5, var_13_274:\u34df\uceb8\u34df\u8640\u1187<?>), var_20_423:\uc7fe\u12cb\u1833\u67e9\u92ff)
                                                                        }
                                                                    } while (cmpeq:boolean(and:int(var_4_251:int, ldc:int(16)), ldc:int(0)))
                                                                    
                                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-1663103341))
                                                                }
                                                                catch (java.lang.Exception var_20_464) {
                                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-556348329))
                                                                    invokeinterface:void(Logger::error, getstatic:Logger(\u5654\u9937\u72f1\ud4fe\u0c95::\u927d\u446c\u69d9\u6435\u8258\u5654), ldc:String("Exception loading structure piece with id {}"), var_18_34F:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], var_20_464:Exception[expected:Object])
                                                                }
                                                                
                                                                goto(Label_1149)
                                                            }
                                                        }
                                                        
                                                        Label_0930:
                                                        
                                                        if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(134217728)), ldc:int(0))) {
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-1999001075))
                                                            goto(Label_1149)
                                                        }
                                                        
                                                        if (cmpne:boolean(and:int(var_4_251:int, ldc:int(67108864)), ldc:int(0))) {
                                                            if (cmpne:boolean(and:int(var_4_251:int, ldc:int(2)), ldc:int(0))) {
                                                                var_4_251 = and:int(var_4_251:int, ldc:int(1785372345))
                                                                loopcontinue()
                                                            }
                                                            
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-1937766))
                                                        }
                                                        
                                                        Label_0984:
                                                        
                                                        if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(131072)), ldc:int(0))) {
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(947402326))
                                                        }
                                                        else {
                                                            if (cmpne:boolean(and:int(var_4_251:int, ldc:int(512)), ldc:int(0))) {
                                                                goto(Label_0930)
                                                            }
                                                            
                                                            if (cmpne:boolean(and:int(var_4_251:int, ldc:int(16777216)), ldc:int(0))) {
                                                                loopcontinue()
                                                            }
                                                            
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-12083948))
                                                            invokeinterface:void(Logger::error, getstatic:Logger(\u5654\u9937\u72f1\ud4fe\u0c95::\u927d\u446c\u69d9\u6435\u8258\u5654), ldc:String("Unknown structure piece id: {}"), var_18_34F:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                                                        }
                                                        
                                                        Label_1149:
                                                        
                                                        if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(2048)), ldc:int(0))) {
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-62613934))
                                                            goto(Label_0984)
                                                        }
                                                        
                                                        if (cmpeq:boolean(and:int(var_4_251:int, ldc:int(2147483647)), ldc:int(0))) {
                                                            var_4_251 = and:int(var_4_251:int, ldc:int(-1385259616))
                                                            goto(Label_0930)
                                                        }
                                                        
                                                        if (cmpne:boolean(and:int(var_4_251:int, ldc:int(134217728)), ldc:int(0))) {
                                                            looporswitchbreak()
                                                        }
                                                    }
                                                    
                                                    var_4_251 = and:int(var_4_251:int, ldc:int(-1662298064))
                                                    inc:int(var_14_285, ldc:int(1))
                                                }
                                            }
                                            
                                            stack_4C7_0 = var_13_274:\u34df\uceb8\u34df\u8640\u1187<?>
                                            var_4_251 = and:int(var_4_251:int, ldc:int(-1638954158))
                                            return:\u34df\uceb8\u34df\u8640\u1187<?>(stack_4C7_0:\u34df\uceb8\u34df\u8640\u1187<?>)
                                        }
                                        catch (java.lang.Exception var_13_4CC) {
                                            invokeinterface:void(Logger::error, getstatic:Logger(\u5654\u9937\u72f1\ud4fe\u0c95::\u927d\u446c\u69d9\u6435\u8258\u5654), ldc:String("Failed Start with id {}"), var_6_70:String[expected:Object], var_13_4CC:Exception[expected:Object])
                                            return:\u34df\uceb8\u34df\u8640\u1187<?>(aconstnull:\u34df\uceb8\u34df\u8640\u1187<?>())
                                        }
                                    }
                                } while (cmpeq:boolean(and:int(var_4_227:int, ldc:int(268435456)), ldc:int(0)))
                                
                                var_4_227 = and:int(var_4_227:int, ldc:int(-1639737195))
                                stack_249_0 = initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, invokevirtual:int[](\uc31c\uc87f\uc246\u3776\ub7dc::\u527a\ub18d\uc238\uf995\u7d52\uc7fe, p1:\uc31c\uc87f\uc246\u3776\ub7dc, ldc:String("BB")))
                                goto(Label_0577)
                            }
                        }
                        
                        Label_0303:
                        
                        if (cmpne:boolean(and:int(var_4_10E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_10E:int, ldc:int(268435456)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(2048)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_4_10E = and:int(var_4_10E:int, ldc:int(-562137000))
                        }
                        
                        Label_0334:
                        
                        if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_4_10E = and:int(var_4_10E:int, ldc:int(-1126881310))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_0303)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_10E:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_10E = and:int(var_4_10E:int, ldc:int(1579549785))
                                loopcontinue()
                            }
                            
                            var_4_10E = and:int(var_4_10E:int, ldc:int(-571593168))
                            invokeinterface:void(Logger::error, getstatic:Logger(\u5654\u9937\u72f1\ud4fe\u0c95::\u927d\u446c\u69d9\u6435\u8258\u5654), ldc:String("Unknown feature id: {}"), var_6_70:String[expected:Object])
                        }
                        
                        Label_0397:
                        
                        if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(16)), ldc:int(0))) {
                            var_4_10E = and:int(var_4_10E:int, ldc:int(886157755))
                            goto(Label_0334)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0303)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(2)), ldc:int(0))) {
                            return:\u34df\uceb8\u34df\u8640\u1187<?>(aconstnull:\u34df\uceb8\u34df\u8640\u1187<?>())
                        }
                        
                        var_4_10E = and:int(var_4_10E:int, ldc:int(-2084745671))
                    }
                }
            }
            
            Label_0167:
            
            if (cmpne:boolean(and:int(var_4_10E:int, ldc:int(134217728)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_10E:int, ldc:int(268435456)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_10E = and:int(var_4_10E:int, ldc:int(-1102177601))
            }
            
            Label_0190:
            
            if (cmpne:boolean(and:int(var_4_10E:int, ldc:int(8192)), ldc:int(0))) {
                var_4_10E = and:int(var_4_10E:int, ldc:int(1967506200))
                goto(Label_0167)
            }
            
            if (cmpne:boolean(and:int(var_4_10E:int, ldc:int(2147483647)), ldc:int(0))) {
                return:\u34df\uceb8\u34df\u8640\u1187<?>(getstatic:\u34df\uceb8\u34df\u8640\u1187<?>(\u34df\uceb8\u34df\u8640\u1187::\u8d98\u3c25\uc87f\u34df\u0a06\u5fe1))
            }
        }
    }
    
    public com.mojang.serialization.Codec<\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<C, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<C>>> \u8753\u7c6b\ub102\u8258\u3bd6\ua61f() {
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
            return:Codec<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<C, \u5654\u9937\u72f1\ud4fe\u0c95<C>>>(getfield:Codec<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<C, \u5654\u9937\u72f1\ud4fe\u0c95<C>>>(\u5654\u9937\u72f1\ud4fe\u0c95::\u7af6\ub7dc\u12b2\u7330\u9af2\u647c, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<C, ? extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<C>> \uc246\u12cb\u7006\uc4d2\ube23\u6bb9(C extends \u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 p0) {
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
            return:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<C, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<C>>(initobject:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<C, \u5654\u9937\u72f1\ud4fe\u0c95<C>>(\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<C, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<C>>::<init>, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>[expected:? extends \u5654\u9937\u72f1\ud4fe\u0c95<C>], p0:C extends \ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6))
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u8aa5\ub1b9\u51b2\u600f\u516c\u8bb0(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u97e6\uf995\ucef1\ubff1\u7049\u4f4a p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8753\u4975\ubf56\u6b0d\u7e3f p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3, boolean p4, long p5, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u718f\ubefe\u6b0d\ub18d\u71ae p6) {
        var_9_142 : int
        var_11_6A : int
        var_12_78 : int
        var_13_86 : int
        var_14_8F : int
        var_15_98 : \u6fb0\u93a2\u8350\u3a62\u760c\ucfaf
        var_16_D6 : int
        var_9_244 : int
        stack_1F1_0 : int [generated]
        var_17_1F1 : int
        var_18_1F6 : int
        stack_3A6_0 : int [generated]
        var_19_3A6 : int
        var_9_3BB : int
        var_22_3DF : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_23_3F4 : \u8aa5\ubded\ub18d\u4f4a\u4f52
        var_24_40E : \u34df\uceb8\u34df\u8640\u1187<?>
        
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
        var_9_142 = and:int(ldc:int(-76130237), ldc:int(-226492933))
        var_11_6A = invokevirtual:int(\u718f\ubefe\u6b0d\ub18d\u71ae::\ub83f\uc246\ufe34\u67d0\u156b\ud523, p6:\u718f\ubefe\u6b0d\ub18d\u71ae)
        var_12_78 = shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(15), ldc:int(4164)))
        var_13_86 = shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(1291), ldc:int(1295)))
        var_14_8F = and:int(ldc:int(-12439), ldc:int(12436))
        var_15_98 = initobject:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf(\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf::<init>)
        
        loop {
            Label_0154:
            
            if (cmpne:boolean(and:int(var_9_142:int, ldc:int(2)), ldc:int(0))) {
                var_9_142 = and:int(var_9_142:int, ldc:int(-11075885))
                
                if (cmple:boolean(var_14_8F:int, p3:int)) {
                    var_16_D6 = neg:int(var_14_8F:int)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_9_142:int, ldc:int(4)), ldc:int(0))) {
                            var_9_244 = and:int(var_9_142:int, ldc:int(-1480954516))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_9_142:int, ldc:int(2048)), ldc:int(0))) {
                            var_9_244 = and:int(var_9_142:int, ldc:int(-196937864))
                            goto(Label_0353)
                        }
                        
                        if (cmpeq:boolean(and:int(var_9_142:int, ldc:int(2048)), ldc:int(0))) {
                            var_9_244 = and:int(var_9_142:int, ldc:int(424700378))
                        }
                        else {
                            var_9_244 = and:int(var_9_142:int, ldc:int(-140543766))
                            
                            if (cmple:boolean(var_16_D6:int, var_14_8F:int)) {
                                if (cmpeq:boolean(var_16_D6:int, neg:int(var_14_8F:int))) {
                                    goto(Label_0353)
                                }
                                
                                if (cmpne:boolean(var_16_D6:int, var_14_8F:int)) {
                                    goto(Label_0419)
                                }
                                
                                goto(Label_0353)
                            }
                        }
                        
                        Label_0289:
                        
                        if (cmpne:boolean(and:int(var_9_244:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(4)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(4)), ldc:int(0))) {
                                var_9_142 = and:int(var_9_244:int, ldc:int(699685140))
                                loopcontinue()
                            }
                            
                            var_9_142 = and:int(var_9_244:int, ldc:int(-141100142))
                            inc:int(var_14_8F, ldc:int(1))
                            loopcontinue(Label_0154)
                        }
                        
                        Label_0353:
                        
                        if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(8)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_0289)
                            }
                            
                            if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(1048576)), ldc:int(0))) {
                                var_9_142 = and:int(var_9_244:int, ldc:int(1416208822))
                                loopcontinue()
                            }
                            
                            var_9_244 = and:int(var_9_244:int, ldc:int(-76121390))
                            stack_1F1_0 = xor:int(ldc:int(708), ldc:int(709))
                            goto(Label_0497)
                        }
                        
                        Label_0419:
                        
                        if (cmpne:boolean(and:int(var_9_244:int, ldc:int(32)), ldc:int(0))) {
                            var_9_244 = and:int(var_9_244:int, ldc:int(-1704307803))
                            goto(Label_0353)
                        }
                        
                        if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0289)
                        }
                        
                        if (cmpne:boolean(and:int(var_9_244:int, ldc:int(8)), ldc:int(0))) {
                            var_9_142 = and:int(var_9_244:int, ldc:int(-1866279359))
                            loopcontinue()
                        }
                        
                        var_9_244 = and:int(var_9_244:int, ldc:int(-203949318))
                        stack_1F1_0 = and:int(ldc:int(-19395), ldc:int(2882))
                        Label_0497:
                        var_17_1F1 = stack_1F1_0:int
                        var_18_1F6 = neg:int(var_14_8F:int)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_0828)
                            }
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(4)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(-401822127))
                                goto(Label_0730)
                            }
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_0657)
                            }
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(4096)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(-224470169))
                                
                                if (cmple:boolean(var_18_1F6:int, var_14_8F:int)) {
                                    if (cmpeq:boolean(var_18_1F6:int, neg:int(var_14_8F:int))) {
                                        goto(Label_0730)
                                    }
                                    
                                    if (cmpne:boolean(var_18_1F6:int, var_14_8F:int)) {
                                        goto(Label_0828)
                                    }
                                    
                                    goto(Label_0730)
                                }
                            }
                            
                            Label_0565:
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(524288)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(23738423))
                                goto(Label_0828)
                            }
                            
                            if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(33554432)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(-419046884))
                                goto(Label_0730)
                            }
                            
                            if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(1420907388))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_9_244 = and:int(var_9_244:int, ldc:int(-1531955042))
                                    loopcontinue()
                                }
                                
                                var_9_244 = and:int(var_9_244:int, ldc:int(-90801809))
                                
                                if (cmpeq:boolean(var_14_8F:int, ldc:int(0))) {
                                    goto(Label_0289)
                                }
                            }
                            
                            Label_0657:
                            
                            if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_0828)
                            }
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(4096)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_9_244 = and:int(var_9_244:int, ldc:int(1667261017))
                                    goto(Label_0565)
                                }
                                
                                if (cmpne:boolean(and:int(var_9_244:int, ldc:int(16384)), ldc:int(0))) {
                                    var_9_142 = and:int(var_9_244:int, ldc:int(-29885018))
                                    inc:int(var_16_D6, ldc:int(1))
                                    looporswitchbreak()
                                }
                                
                                loopcontinue()
                            }
                            
                            Label_0730:
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(1073741824)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_9_244 = and:int(var_9_244:int, ldc:int(928132024))
                                    goto(Label_0657)
                                }
                                
                                if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_9_244 = and:int(var_9_244:int, ldc:int(1502273084))
                                    goto(Label_0565)
                                }
                                
                                if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_9_244 = and:int(var_9_244:int, ldc:int(948190370))
                                    loopcontinue()
                                }
                                
                                var_9_244 = and:int(var_9_244:int, ldc:int(-2196233))
                                stack_3A6_0 = and:int(ldc:int(273), ldc:int(9769))
                                goto(Label_0934)
                            }
                            
                            Label_0828:
                            
                            if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(268435456)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(-205054985))
                                goto(Label_0730)
                            }
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(32768)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(-834663944))
                                goto(Label_0657)
                            }
                            
                            if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(2)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(1299620216))
                                goto(Label_0565)
                            }
                            
                            if (cmpeq:boolean(and:int(var_9_244:int, ldc:int(268435456)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(2103326141))
                                loopcontinue()
                            }
                            
                            var_9_244 = and:int(var_9_244:int, ldc:int(-222339586))
                            stack_3A6_0 = and:int(ldc:int(-3785), ldc:int(3784))
                            Label_0934:
                            var_19_3A6 = stack_3A6_0:int
                            
                            if (cmpeq:boolean(var_17_1F1:int, ldc:int(0))) {
                                if (cmpeq:boolean(var_19_3A6:int, ldc:int(0))) {
                                    goto(Label_1058)
                                }
                            }
                            
                            Label_0941:
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_9_3BB = and:int(var_9_244:int, ldc:int(-201328606))
                                var_22_3DF = invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u183a\ud36e\u51fa\ub1b9\ua6bd\u385b, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>, p6:\u718f\ubefe\u6b0d\ub18d\u71ae, p5:long, var_15_98:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf, add:int(var_12_78:int, mul:int(var_11_6A:int, var_16_D6:int)), add:int(var_13_86:int, mul:int(var_11_6A:int, var_18_1F6:int)))
                                var_23_3F4 = invokeinterface:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, p0:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, var_22_3DF:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, var_22_3DF:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u9033\u7bad\ubefe\uc3e3\u3dd3\u6d99))
                                var_24_40E = invokevirtual:\u34df\uceb8\u34df\u8640\u1187<?>(\u8753\u4975\ubf56\u6b0d\u7e3f::\u7c6b\ua6bd\u61a4\u8413\u5140\ucfaf, p1:\u8753\u4975\ubf56\u6b0d\u7e3f, invokestatic:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\uc910\u4975\ub7dc\u8258\u839e\u99f7, invokeinterface:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, var_23_3F4:\u8aa5\ubded\ub18d\u4f4a\u4f52), and:int(ldc:int(-10672), ldc:int(8495))), this:\u5654\u9937\u72f1\ud4fe\u0c95<C>, var_23_3F4:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\uc87f\u4daf\u7bad\ub83f\ubb2b\ubded])
                                
                                if (cmpne:boolean(var_24_40E:\u34df\uceb8\u34df\u8640\u1187<?>, aconstnull:\u34df\uceb8\u34df\u8640\u1187<?>())) {
                                    if (invokevirtual:boolean(\u34df\uceb8\u34df\u8640\u1187::\u4e72\ufe34\u0c95\u3e2a\u8d98\ud36e, var_24_40E:\u34df\uceb8\u34df\u8640\u1187)) {
                                        if (logicaland:boolean(p4:boolean, invokevirtual:boolean(\u34df\uceb8\u34df\u8640\u1187::\u839e\u7d52\u6b0d\u416d\u4f52\u6cfe, var_24_40E:\u34df\uceb8\u34df\u8640\u1187<?>))) {
                                            invokevirtual:void(\u34df\uceb8\u34df\u8640\u1187<C>::\u4e72\ubff1\ua562\u7d52\u64ab\u3a62, var_24_40E:\u34df\uceb8\u34df\u8640\u1187<?>)
                                            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u34df\uceb8\u34df\u8640\u1187<C>::\u6bb9\u0a06\u965f\u647c\u5f50\u6cfe, var_24_40E:\u34df\uceb8\u34df\u8640\u1187<?>))
                                        }
                                        
                                        var_9_3BB = and:int(var_9_3BB:int, ldc:int(-205621170))
                                        
                                        if (logicalnot:boolean(p4:boolean)) {
                                            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u34df\uceb8\u34df\u8640\u1187<C>::\u6bb9\u0a06\u965f\u647c\u5f50\u6cfe, var_24_40E:\u34df\uceb8\u34df\u8640\u1187<?>))
                                        }
                                    }
                                }
                                
                                var_9_244 = and:int(var_9_3BB:int, ldc:int(-90317378))
                                
                                if (cmpeq:boolean(var_14_8F:int, ldc:int(0))) {
                                    goto(Label_0565)
                                }
                            }
                            
                            Label_1058:
                            
                            if (cmpne:boolean(and:int(var_9_244:int, ldc:int(32768)), ldc:int(0))) {
                                var_9_244 = and:int(var_9_244:int, ldc:int(-302030779))
                                goto(Label_0941)
                            }
                            
                            var_9_244 = and:int(var_9_244:int, ldc:int(-25239702))
                            inc:int(var_18_1F6, ldc:int(1))
                        }
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_9_142:int, ldc:int(536870912)), ldc:int(0))) {
                return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())
            }
            
            var_9_142 = and:int(var_9_142:int, ldc:int(1874172695))
        }
    }
    
    public boolean \uf94d\u67e9\u9af2\u718f\ucb79\ubf56() {
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
            return:boolean(xor:int[expected:boolean](ldc:int(-28607), ldc:int(-28608)))
        }
        
        goto(Label_0006)
    }
    
    public final \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c \u183a\ud36e\u51fa\ub1b9\ua6bd\u385b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u718f\ubefe\u6b0d\ub18d\u71ae p0, long p1, \u3504\ufe34\u600f\u6b0d\u69d9.\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf p2, int p3, int p4) {
        var_7_63 : int
        var_9_69 : int
        var_10_6F : int
        var_11_78 : int
        var_12_81 : int
        var_13_BE : int
        var_14_DD : int
        
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
            var_7_63 = and:int(ldc:int(-1819130104), ldc:int(-140983229))
            var_9_69 = invokevirtual:int(\u718f\ubefe\u6b0d\ub18d\u71ae::\ub83f\uc246\ufe34\u67d0\u156b\ud523, p0:\u718f\ubefe\u6b0d\ub18d\u71ae)
            var_10_6F = invokevirtual:int(\u718f\ubefe\u6b0d\ub18d\u71ae::\u5d20\u4c04\u97e6\u8d98\ua61f\u92ff, p0:\u718f\ubefe\u6b0d\ub18d\u71ae)
            var_11_78 = invokestatic:int(Math::floorDiv, p3:int, var_9_69:int)
            var_12_81 = invokestatic:int(Math::floorDiv, p4:int, var_9_69:int)
            invokevirtual:long(\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf::\u385b\uae5d\u8df4\u6b0d\u7330\u9033, p2:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf, p1:long, var_11_78:int, var_12_81:int, invokevirtual:int(\u718f\ubefe\u6b0d\ub18d\u71ae::\ub19c\u6fb0\u12b2\uf94d\u516c\u5db4, p0:\u718f\ubefe\u6b0d\ub18d\u71ae))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\uf94d\u67e9\u9af2\u718f\ucb79\ubf56, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>))) {
                var_7_63 = and:int(var_7_63:int, ldc:int(-578261659))
                var_13_BE = div:int(add:int(invokevirtual:int(Random::nextInt, p2:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf[expected:Random], sub:int(var_9_69:int, var_10_6F:int)), invokevirtual:int(Random::nextInt, p2:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf[expected:Random], sub:int(var_9_69:int, var_10_6F:int))), and:int(ldc:int(10363), ldc:int(1158)))
                var_14_DD = div:int(add:int(invokevirtual:int(Random::nextInt, p2:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf[expected:Random], sub:int(var_9_69:int, var_10_6F:int)), invokevirtual:int(Random::nextInt, p2:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf[expected:Random], sub:int(var_9_69:int, var_10_6F:int))), xor:int(ldc:int(113), ldc:int(115)))
            }
            else {
                var_13_BE = invokevirtual:int(Random::nextInt, p2:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf[expected:Random], sub:int(var_9_69:int, var_10_6F:int))
                var_14_DD = invokevirtual:int(Random::nextInt, p2:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf[expected:Random], sub:int(var_9_69:int, var_10_6F:int))
            }
            
            return:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, add:int(mul:int(var_11_78:int, var_9_69:int), var_13_BE:int), add:int(mul:int(var_12_81:int, var_9_69:int), var_14_DD:int)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4492\u6435\ucfaf\u47c2\ubf56\ub18d(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u56bd\uc4d2\u61a4\u4ab3\u1187 p1, long p2, \u3504\ufe34\u600f\u6b0d\u69d9.\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf p3, int p4, int p5, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p6, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p7, C extends \u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 p8) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(320), ldc:int(321)))
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<C> \u64f2\u718f\u6bb9\ub6ab\u6bb9\u12cb(int p0, int p1, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p2, int p3, long p4) {
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
            return:\u34df\uceb8\u34df\u8640\u1187<C>(invokeinterface:\u34df\uceb8\u34df\u8640\u1187<C>(\ud51e\u4c04\u97b7\u624e\u494c\ua6bd<C>::\u4492\u446c\u6d99\ubff1\uc246\ud7e8, invokevirtual:\ud51e\u4c04\u97b7\u624e\u494c\ua6bd<C>(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u4c04\u4975\ucef1\u3dd3\u6fb0\u92ff, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>), this:\u5654\u9937\u72f1\ud4fe\u0c95<C>, p0:int, p1:int, p2:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p3:int, p4:long))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?> \u600f\uae87\u6b0d\u8bb0\u71ae\u9af2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u56bd\uc4d2\u61a4\u4ab3\u1187 p2, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p3, long p4, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p5, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p6, int p7, \u3504\ufe34\u600f\u6b0d\u69d9.\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf p8, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u718f\ubefe\u6b0d\ub18d\u71ae p9, C extends \u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 p10) {
        var_15_79 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_16_E5 : \u34df\uceb8\u34df\u8640\u1187<C>
        
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
            var_15_79 = invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u183a\ud36e\u51fa\ub1b9\ua6bd\u385b, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>, p9:\u718f\ubefe\u6b0d\ub18d\u71ae, p4:long, p8:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))
            
            if (cmpeq:boolean(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, var_15_79:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))) {
                if (cmpeq:boolean(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, var_15_79:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))) {
                    if (invokevirtual:boolean(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u4492\u6435\ucfaf\u47c2\ubf56\ub18d, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p2:\u56bd\uc4d2\u61a4\u4ab3\u1187, p4:long, p8:\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), p6:\uc2e8\u9255\u647c\ud171\ubf56, var_15_79:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, p10:C extends \ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6)) {
                        var_16_E5 = invokespecial:\u34df\uceb8\u34df\u8640\u1187<C>(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u64f2\u718f\u6bb9\ub6ab\u6bb9\u12cb, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u98a4\u8258\u5d20\u64f2\ua068\uc4d2), p7:int, p4:long)
                        invokevirtual:void(\u34df\uceb8\u34df\u8640\u1187<C>::\u64f2\u7bad\u62da\u4179\u6435\uafe7, var_16_E5:\u34df\uceb8\u34df\u8640\u1187<C>, p0:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p3:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p5:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), p6:\uc2e8\u9255\u647c\ud171\ubf56, p10:C extends \ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6)
                        
                        if (invokevirtual:boolean(\u34df\uceb8\u34df\u8640\u1187::\u4e72\ufe34\u0c95\u3e2a\u8d98\ud36e, var_16_E5:\u34df\uceb8\u34df\u8640\u1187)) {
                            return:\u34df\uceb8\u34df\u8640\u1187<?>(var_16_E5:\u34df\uceb8\u34df\u8640\u1187<C>)
                        }
                    }
                }
            }
            
            return:\u34df\uceb8\u34df\u8640\u1187<?>(getstatic:\u34df\uceb8\u34df\u8640\u1187<?>(\u34df\uceb8\u34df\u8640\u1187::\u8d98\u3c25\uc87f\u34df\u0a06\u5fe1))
        }
        
        goto(Label_0006)
    }
    
    public abstract \u36d3\u9033\u6b0d\u983f\u8d90.\ud51e\u4c04\u97b7\u624e\u494c\ua6bd<C> \u4c04\u4975\ucef1\u3dd3\u6fb0\u92ff();
    
    public java.lang.String \u4e72\u1833\u3a62\u5f50\u183a\u9af2() {
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
            return:String(checkcast:String(java.lang.String.class, invokeinterface:Object[expected:String](BiMap::get, invokeinterface:BiMap(BiMap::inverse, getstatic:BiMap<String, \u5654\u9937\u72f1\ud4fe\u0c95<?>>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub1b9\uc229\ub6ab\ud51e\u624e\u6bb9)), this:\u5654\u9937\u72f1\ud4fe\u0c95<C>[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u624e\u0b8e\ud158\ud158\ubf56> \ubefe\ub8be\ub83f\u3a62\u6d99\ua6bd() {
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
            return:List<\u624e\u0b8e\ud158\ud158\ubf56>(invokestatic:ImmutableList[expected:List<\u624e\u0b8e\ud158\ud158\ubf56>](ImmutableList::of))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u624e\u0b8e\ud158\ud158\ubf56> \u3d64\ubb2b\u0800\u64ab\u47c2\u36d3() {
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
            return:List<\u624e\u0b8e\ud158\ud158\ubf56>(invokestatic:ImmutableList[expected:List<\u624e\u0b8e\ud158\ud158\ubf56>](ImmutableList::of))
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 lambda$\u5fe1\ud217\u4c04\uf995\u8640\ub7dc$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d p0) {
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
            return:\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6(getfield:FC extends \ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6[expected:\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6](\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d::\u946b\u9937\u385b\u516c\u9af2\u6cfe, p0:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d lambda$\u647c\u446c\u5245\u7e3f\u72f1\u9af2$0(\u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 p0) {
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
            return:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d(initobject:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d(\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<FC, F>::<init>, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>[expected:F extends \u5654\u9937\u72f1\ud4fe\u0c95<FC>], p0:\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6[expected:FC extends \ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6]))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            putstatic:BiMap<String, \u5654\u9937\u72f1\ud4fe\u0c95<?>>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub1b9\uc229\ub6ab\ud51e\u624e\u6bb9, invokestatic:HashBiMap[expected:BiMap<String, \u5654\u9937\u72f1\ud4fe\u0c95<?>>](HashBiMap::create))
            putstatic:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u527a\u5f50\u92ff\ud36e\u3e75\u51fa>(\u5654\u9937\u72f1\ud4fe\u0c95::\u98a4\ucfaf\u6d69\ub171\u8308\u718f, invokestatic:HashMap[expected:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u527a\u5f50\u92ff\ud36e\u3e75\u51fa>](Maps::newHashMap))
            putstatic:Logger(\u5654\u9937\u72f1\ud4fe\u0c95::\u927d\u446c\u69d9\u6435\u8258\u5654, invokestatic:Logger(LogManager::getLogger))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u5654\u9937\u72f1\ud4fe\u0c95::\u0a06\u3711\u3d4b\u2dcc\ud523\u8aa5, invokestatic:\u4d85\u3dd3\u983f\u7043\u97e6[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Pillager_Outpost"), initobject:\u4d85\u3dd3\u983f\u7043\u97e6(\u4d85\u3dd3\u983f\u7043\u97e6::<init>, getstatic:Codec<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u4bc8\u7bad\u92ff\ubefe\u8d90::\ud7e8\u4cd9\ua61f\ub7dc\u67d0\u40a9)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>(\u5654\u9937\u72f1\ud4fe\u0c95::\uc2e8\ube23\ub102\u5140\u51b2\ucb79, invokestatic:\u7873\u7049\u99f7\uc7fe\u67e9[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Mineshaft"), initobject:\u7873\u7049\u99f7\uc7fe\u67e9(\u7873\u7049\u99f7\uc7fe\u67e9::<init>, getstatic:Codec<\u836c\ub102\u836c\ucef1\u647c>(\u836c\ub102\u836c\ucef1\u647c::\u6ec6\u6d69\ucef1\u5fe1\u4975\ua562)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u9937\u7049\uff55\u9af2\u8753\u92ee)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\ubcb0\uc246\u4ab3\uf9c5\u7049\ucef1, invokestatic:\u156b\ud7e8\u7873\uc2bd\u0800[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Mansion"), initobject:\u156b\ud7e8\u7873\uc2bd\u0800(\u156b\ud7e8\u7873\uc2bd\u0800::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u4f4a\ua068\u8753\ub7dc\u88c5\u71ae, invokestatic:\u1187\u3d64\u7330\u836c\u7330[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Jungle_Pyramid"), initobject:\u1187\u3d64\u7330\u836c\u7330(\u1187\u3d64\u7330\u836c\u7330::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\ud171\ub83f\ub18d\u624e\u97e6\ud36e, invokestatic:\u99f7\u12b2\u7d52\u3c25\ud51e\u3e2a[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Desert_Pyramid"), initobject:\u99f7\u12b2\u7d52\u3c25\ud51e\u3e2a(\u99f7\u12b2\u7d52\u3c25\ud51e\u3e2a::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\ubf56\ubded\ua6bd\u62da\ua562\u516c, invokestatic:\u839e\u3bd6\u97e6\ub70c\u7c6b[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Igloo"), initobject:\u839e\u3bd6\u97e6\ub70c\u7c6b(\u839e\u3bd6\u97e6\ub70c\u7c6b::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>(\u5654\u9937\u72f1\ud4fe\u0c95::\u3e75\u93a2\u839e\u8aa5\u873d\u3d64, invokestatic:\uceb8\u8640\u156b\uc3e3\ub171\u6435[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Ruined_Portal"), initobject:\uceb8\u8640\u156b\uc3e3\ub171\u6435(\uceb8\u8640\u156b\uc3e3\ub171\u6435::<init>, getstatic:Codec<\u7043\u0a06\u7e3f\u3e2a\u392e>(\u7043\u0a06\u7e3f\u3e2a\u392e::\uc87f\u12b2\ud4fe\u7e3f\u120d\uc9f6)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1>(\u5654\u9937\u72f1\ud4fe\u0c95::\u494c\u2dcc\u6b0d\ud171\ubb2b\ud4fe, invokestatic:\u416d\u416d\u6b0d\ud12e\u839e\u7049[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Shipwreck"), initobject:\u416d\u416d\u6b0d\ud12e\u839e\u7049(\u416d\u416d\u6b0d\ud12e\u839e\u7049::<init>, getstatic:Codec<\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1>(\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1::\u760c\u98a4\ub113\u64f2\u6cfe\u927d)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\ub102\ua61f\ua61f\u69d9\u98a4(\u5654\u9937\u72f1\ud4fe\u0c95::\u9af2\u760c\ud217\u6cfe\ub32d\ud523, checkcast:\ub102\ua61f\ua61f\u69d9\u98a4(\u59ec\u8413\u97e6\uc229\u3776.\ub102\ua61f\ua61f\u69d9\u98a4.class, invokestatic:\ub102\ua61f\ua61f\u69d9\u98a4(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Swamp_Hut"), initobject:\ub102\ua61f\ua61f\u69d9\u98a4(\ub102\ua61f\ua61f\u69d9\u98a4::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da))))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub6ab\u97e6\u4492\uc3e3\u965f\u1187, invokestatic:\u7ce1\ua562\u5245\u61a4\ucef1[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Stronghold"), initobject:\u7ce1\ua562\u5245\u61a4\ucef1(\u7ce1\ua562\u5245\u61a4\ucef1::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u67e9\u516c\u385b\u6435\u0a06\u93a2)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u946b\u071d\uc7fe\ud36e\uae87\u9a18, invokestatic:\u4c2b\ua61f\u8258\ua562\uafe7\u8258[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Monument"), initobject:\u4c2b\ua61f\u8258\ua562\uafe7\u8258(\u4c2b\ua61f\u8258\ua562\uafe7\u8258::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>(\u5654\u9937\u72f1\ud4fe\u0c95::\u34df\u6bb9\ub113\u8389\u1187\ua3b4, invokestatic:\u5245\u7049\u5bc4\u59ec\u385b\u92ff[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Ocean_Ruin"), initobject:\u5245\u7049\u5bc4\u59ec\u385b\u92ff(\u5245\u7049\u5bc4\u59ec\u385b\u92ff::<init>, getstatic:Codec<\ub70c\u516c\ud523\uafe7\ud217>(\ub70c\u516c\ud523\uafe7\ud217::\u3dd3\u61a4\ufcaf\u56bd\uceb8\u494c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u69d9\ub18d\u4179\u3dd3\u67e9\u4bc8, invokestatic:\uc9f6\uc29a\u8bb0\uc84e\u183a[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Fortress"), initobject:\uc9f6\uc29a\u8bb0\uc84e\u183a(\uc9f6\uc29a\u8bb0\uc84e\u183a::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u51fa\u120d\u8258\u3bd6\uc246\uc229, invokestatic:\uae5d\u873d\u516c\u92ff\u7d52[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("EndCity"), initobject:\uae5d\u873d\u516c\u92ff\u7d52(\uae5d\u873d\u516c\u92ff\u7d52::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u5654\u9937\u72f1\ud4fe\u0c95::\u183a\u873d\u3c25\ubf56\u40a9\ua3b4, invokestatic:\ub113\uc229\u7330\u12b2\u8bb0[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Buried_Treasure"), initobject:\ub113\uc229\u7330\u12b2\u8bb0(\ub113\uc229\u7330\u12b2\u8bb0::<init>, getstatic:Codec<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937::\ub70c\u99f7\u4d85\u71ae\u9255\ud36e)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u9937\u7049\uff55\u9af2\u8753\u92ee)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u5654\u9937\u72f1\ud4fe\u0c95::\u4492\u3a62\u5db4\uae87\ua61f\u93a2, invokestatic:\u5d20\u3711\u839e\ucef1\u960f[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Village"), initobject:\u5d20\u3711\u839e\ucef1\u960f(\u5d20\u3711\u839e\ucef1\u960f::<init>, getstatic:Codec<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u4bc8\u7bad\u92ff\ubefe\u8d90::\ud7e8\u4cd9\ua61f\ub7dc\u67d0\u40a9)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u5f50\u385b\u392e\ub171\uf94d\ubded, invokestatic:\u12cb\u5140\ud51e\u40a9\u99f7[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Nether_Fossil"), initobject:\u12cb\u5140\ud51e\u40a9\u99f7(\u12cb\u5140\ud51e\u40a9\u99f7::<init>, getstatic:Codec<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u6cfe\ud51e\u071d\u6b5f\u392e\u8389)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a)))
            putstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub102\u97e6\u183a\u8cae\uc4d2\u64f2, invokestatic:\ubb2b\ucef1\ua562\u873d\u4f52[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>](\u5654\u9937\u72f1\ud4fe\u0c95<C>::\ud217\ubefe\u836c\u7049\u3a62\uc2bd, ldc:String("Bastion_Remnant"), initobject:\ubb2b\ucef1\ua562\u873d\u4f52(\ubb2b\ucef1\ua562\u873d\u4f52::<init>, getstatic:Codec<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u4bc8\u7bad\u92ff\ubefe\u8d90::\ud7e8\u4cd9\ua61f\ub7dc\u67d0\u40a9)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))
            putstatic:List<\u5654\u9937\u72f1\ud4fe\u0c95<?>>(\u5654\u9937\u72f1\ud4fe\u0c95::\u7d52\u946b\u67e9\u69d9\u6435\u6b5f, invokestatic:ImmutableList[expected:List<\u5654\u9937\u72f1\ud4fe\u0c95<?>>](ImmutableList::of, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>[expected:Object](\u5654\u9937\u72f1\ud4fe\u0c95::\u0a06\u3711\u3d4b\u2dcc\ud523\u8aa5), getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>[expected:Object](\u5654\u9937\u72f1\ud4fe\u0c95::\u4492\u3a62\u5db4\uae87\ua61f\u93a2), getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>[expected:Object](\u5654\u9937\u72f1\ud4fe\u0c95::\u5f50\u385b\u392e\ub171\uf94d\ubded)))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5654\u9937\u72f1\ud4fe\u0c95::\ub102\uc2bd\u8aa5\ub7dc\u960f\ub83f, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("jigsaw")))
            putstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u5654\u9937\u72f1\ud4fe\u0c95::\u92ff\u2dcc\ub70c\u494c\u7af6\u6bb9, invokevirtual:ImmutableMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](ImmutableMap$Builder::build, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokestatic:ImmutableMap$Builder(ImmutableMap::builder), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("nvi")), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5654\u9937\u72f1\ud4fe\u0c95::\ub102\uc2bd\u8aa5\ub7dc\u960f\ub83f)), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("pcp")), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5654\u9937\u72f1\ud4fe\u0c95::\ub102\uc2bd\u8aa5\ub7dc\u960f\ub83f)), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("bastionremnant")), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5654\u9937\u72f1\ud4fe\u0c95::\ub102\uc2bd\u8aa5\ub7dc\u960f\ub83f)), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("runtime")), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u5654\u9937\u72f1\ud4fe\u0c95::\ub102\uc2bd\u8aa5\ub7dc\u960f\ub83f))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\u5fe1\ud12e\u64ab\ub83f\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_693 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_69E : int
        
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
        var_3_693 = and:int(ldc:int(1576643228), ldc:int(-407158858))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5654\u9937\u72f1\ud4fe\u0c95<C>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(2)), ldc:int(0))) {
            var_3_693 = and:int(var_3_693:int, ldc:int(1326023533))
        }
        else {
            var_3_693 = and:int(var_3_693:int, ldc:int(937375383))
            var_5_89 = and:int(ldc:int(4412), ldc:int(-4413))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(7220), ldc:int(-7735)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_693:int, ldc:int(-1110463529))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(1824), ldc:int(1825)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(16393), ldc:int(10789)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_693 = and:int(var_3_E2:int, ldc:int(-806657355))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(7591), ldc:int(8769)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(2)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(183109094))
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(256)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-1172526975))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-1805667010))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-1514424577))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0864)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(122149107))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-1890395470))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(32)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-304930928))
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1794435539))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1031966513))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(807186996))
                            loopcontinue()
                        }
                        
                        var_3_693 = and:int(var_3_693:int, ldc:int(-576115721))
                        var_11_F3 = and:int(ldc:int(-21283), ldc:int(21282))
                        goto(Label_1560)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1735729086))
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(512)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1153646422))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(128)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(609242381))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(64)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-950111740))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(914928814))
                            loopcontinue()
                        }
                        
                        var_3_693 = and:int(var_3_693:int, ldc:int(1609115572))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0864)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-266145574))
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1973549633))
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(16)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-897570854))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(2079098363))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1483156832))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(256)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(-992460449))
                            loopcontinue()
                        }
                        
                        var_3_693 = and:int(var_3_693:int, ldc:int(-34903330))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0864:
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(2)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-68528559))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(-428808379))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(90491282))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(128)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(-1837235569))
                            loopcontinue()
                        }
                        
                        var_3_693 = and:int(var_3_693:int, ldc:int(1442541566))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(3321), ldc:int(263))
                                goto(Label_1153)
                            }
                        }
                    }
                    
                    Label_0987:
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(16)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1142533422))
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(32)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(255666511))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(29043009))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(-1954476072))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(151453960))
                            loopcontinue()
                        }
                        
                        var_3_693 = and:int(var_3_693:int, ldc:int(-136742217))
                        var_11_F3 = and:int(ldc:int(25492), ldc:int(-25494))
                    }
                    
                    Label_1153:
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(16)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(587707327))
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(32)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1279380205))
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-941158136))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(16)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(-868267463))
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(-58359012))
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(1527535088))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_693 = and:int(var_3_693:int, ldc:int(1301917655))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1408)
                            }
                        }
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(256)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(2040344665))
                            goto(Label_1153)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(1314234172))
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0864)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_693:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_693 = and:int(var_3_693:int, ldc:int(-1780635690))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1560)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1408:
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1767175233))
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(2132251444))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(661238050))
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(512)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-702094552))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(32)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-875131983))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-1681293244))
                        loopcontinue()
                    }
                    
                    var_3_693 = and:int(var_3_693:int, ldc:int(-137648201))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1560:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69E = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1571:
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-203979298))
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(32)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(-1850912251))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(1012843454))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_693:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_693 = and:int(var_3_693:int, ldc:int(401189527))
                        var_17_69E = add:int(var_16_121:int, xor:int(ldc:int(8206), ldc:int(8207)))
                        looporswitchbreak()
                    }
                    
                    var_3_693 = and:int(var_3_693:int, ldc:int(299575094))
                }
                
                var_3_693 = and:int(var_3_693:int, ldc:int(766342071))
                
                if (cmple:boolean(var_5_89 = var_17_69E:int, sub:int(var_6_90:int, and:int(ldc:int(385), ldc:int(4665))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_693:int, ldc:int(4)), ldc:int(0))) {
            var_3_693 = and:int(var_3_693:int, ldc:int(914712042))
            goto(Label_0108)
        }
    }
}
