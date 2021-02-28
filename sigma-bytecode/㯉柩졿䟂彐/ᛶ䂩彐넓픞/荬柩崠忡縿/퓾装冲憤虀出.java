public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa {
    public void \ud4fe\u88c5\u51b2\u61a4\u8640\u51fa(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u5db4\uc29a\u8709\u92ee\u5fe1\u67d0$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.Typed p4) {
        var_7_69 : Optional
        var_10_BA : Optional
        
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
            var_7_69 = invokevirtual:Optional(Typed::getOptional, p4:Typed, p0:OpticFinder)
            
            if (invokevirtual:boolean(Optional::isPresent, var_7_69:Optional)) {
                if (invokestatic:boolean(Objects::equals, invokevirtual:Object(Pair::getSecond, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, var_7_69:Optional<Pair>))), loadelement:String[expected:Object](getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(3), ldc:int(7))))) {
                    var_10_BA = invokevirtual:Optional(Typed::getOptional, invokevirtual:Typed(Typed::getOrCreateTyped, invokevirtual:Typed(Typed::getOrCreateTyped, p4:Typed, p1:OpticFinder), p2:OpticFinder), p3:OpticFinder)
                    
                    if (invokevirtual:boolean(Optional::isPresent, var_10_BA:Optional)) {
                        return:Typed(invokevirtual:Typed(Typed::set, p4:Typed, p0:OpticFinder, invokestatic:Pair(Pair::of, invokeinterface:String[expected:Object](DSL$TypeReference::typeName, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u516c\u67d0\u97b7\uc246\ub6ab)), invokeinterface:String(Map<String, String>::getOrDefault, getstatic:Map<String, String>(\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ubf56\u6fb0\uc9f6\u62da\u3d64\u92ff), invokevirtual:Object(Optional<Object>::get, var_10_BA:Optional<Object>), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(-31360), ldc:int(-31355)))))))
                    }
                }
            }
            
            return:Typed(p4:Typed)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u416d\u34df\u8753\u6d69\u4f4a\u7ce1$0(java.util.HashMap p0) {
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
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(263), ldc:int(2670))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(17967), ldc:int(2055))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2248), ldc:int(4366))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(3224), ldc:int(3217))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(8291), ldc:int(8297))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(6), ldc:int(13))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(11532), ldc:int(4126))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(25677), ldc:int(4125))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(270), ldc:int(2606))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(8655), ldc:int(1583))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(8206), ldc:int(8222))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(131), ldc:int(146))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(103), ldc:int(117))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(20506), ldc:int(20489))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2844), ldc:int(24726))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(17685), ldc:int(2621))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(3234), ldc:int(3252))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(94), ldc:int(73))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2682), ldc:int(284))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(4187), ldc:int(8857))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(22554), ldc:int(8475))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(8720), ldc:int(8715))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(14428), ldc:int(17471))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(163), ldc:int(190))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(14622), ldc:int(16959))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(13337), ldc:int(13318))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2343), ldc:int(560))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(13489), ldc:int(2091))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(24483), ldc:int(8242))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(16435), ldc:int(1963))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(1408), ldc:int(1444))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(8621), ldc:int(6183))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(167), ldc:int(4902))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(-24431), ldc:int(-24394))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(21540), ldc:int(21516))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(7209), ldc:int(297))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2410), ldc:int(12474))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(635), ldc:int(5167))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(20765), ldc:int(20785))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(9732), ldc:int(9769))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(46), ldc:int(27247))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(47), ldc:int(8623))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(31865), ldc:int(434))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(1905), ldc:int(14395))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(1315), ldc:int(1297))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(8330), ldc:int(8335))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(17023), ldc:int(8627))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(6196), ldc:int(1269))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(5194), ldc:int(5247))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(16394), ldc:int(16444))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2231), ldc:int(8503))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(120), ldc:int(184))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(1627), ldc:int(1634))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(-28320), ldc:int(-28326))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2683), ldc:int(447))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(13845), ldc:int(13865))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(1341), ldc:int(10301))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(8254), ldc:int(7230))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(4159), ldc:int(16447))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(1218), ldc:int(853))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(2212), ldc:int(2277))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(45), ldc:int(111))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(17487), ldc:int(10851))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(18465), ldc:int(18533))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(15717), ldc:int(69))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2374), ldc:int(8270))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(1048), ldc:int(1119))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(10303), ldc:int(10359))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(16427), ldc:int(16482))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(18795), ldc:int(12362))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(-31194), ldc:int(-31123))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(92), ldc:int(108))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(8269), ldc:int(5453))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(82), ldc:int(28))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(847), ldc:int(23631))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(75), ldc:int(27))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(27221), ldc:int(4433))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(1042), ldc:int(1088))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(28), ldc:int(79))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(20852), ldc:int(727))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(4309), ldc:int(93))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(210), ldc:int(132))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), xor:int(ldc:int(2324), ldc:int(2371))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(760), ldc:int(9306))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(19417), ldc:int(12379))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(123), ldc:int(16474))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(25691), ldc:int(6235))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(2140), ldc:int(606))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(8671), ldc:int(20605))), loadelement:String(getstatic:String[](\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa::\ua6bd\u7006\u7043\u8bb0\u3e2a\u47c2), and:int(ldc:int(223), ldc:int(29054))))
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
    
    public void \u4cd9\u8308\u5fe1\uc31c\u3c25\u392e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_692 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_69D : int
        
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
        var_3_692 = and:int(ldc:int(1743334285), ldc:int(-86772771))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud4fe\u88c5\u51b2\u61a4\u8640\u51fa[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(1722643918))
            var_5_81 = and:int(ldc:int(-14255), ldc:int(13996))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12599), ldc:int(-15800)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_692:int, ldc:int(1656615084))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(1032), ldc:int(1033)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(1029), ldc:int(67)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_692 = and:int(var_3_D1:int, ldc:int(-341233988))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1033), ldc:int(965)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1677254069))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(444608789))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(8412884))
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-515596162))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-571195215))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1324611278))
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1651259264))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1770485659))
                    }
                    else {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-474926897))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0820)
                        }
                    }
                    
                    Label_0434:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(274195755))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-206585765))
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(751655976))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(159566790))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-477533235))
                        var_11_E2 = and:int(ldc:int(-2776), ldc:int(2711))
                        goto(Label_1551)
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(508789714))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1321254675))
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1621479455))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-141479956))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0820)
                        }
                    }
                    
                    Label_0710:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(287072197))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-160716600))
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(1790409613))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0820:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1891065838))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1288753170))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1227311652))
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1423645823))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(2139990204))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(-31998), ldc:int(-31997))
                                goto(Label_1086)
                            }
                        }
                    }
                    
                    Label_0940:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-496948108))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1812635466))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-296384161))
                            goto(Label_0820)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(2078093773))
                        var_11_E2 = and:int(ldc:int(4546), ldc:int(-4547))
                    }
                    
                    Label_1086:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-648904678))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1853143487))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1758695426))
                            goto(Label_0940)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0820)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-167321916))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-826823752))
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1617880692))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-494458403))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1382)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(2076338265))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1660016972))
                            goto(Label_1086)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1894978299))
                            goto(Label_0940)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1136050661))
                            goto(Label_0820)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-887232801))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1331959182))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(197964579))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(2079569629))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1551)
                    }
                    
                    Label_1382:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-734621789))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1977979390))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1194435047))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-321378215))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-727260861))
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-2071029023))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(796708262))
                        goto(Label_0434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(2044987274))
                        loopcontinue()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(1674001070))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1551:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1562:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-533269748))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1965507223))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-246091616))
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-756457559))
                        goto(Label_0434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(2074345453))
                        var_17_69D = add:int(var_16_110:int, and:int(ldc:int(785), ldc:int(7265)))
                        looporswitchbreak()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(-1865584377))
                }
                
                var_3_692 = and:int(var_3_692:int, ldc:int(2077179581))
                
                if (cmple:boolean(var_5_81 = var_17_69D:int, sub:int(var_6_88:int, and:int(ldc:int(9353), ldc:int(20839))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
