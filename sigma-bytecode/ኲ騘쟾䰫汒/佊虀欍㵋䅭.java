public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u4f4a\u8640\u6b0d\u3d4b\u416d {
    public void \u4f4a\u8640\u6b0d\u3d4b\u416d() {
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
    
    public void \ub6ab\ube23\uae87\uc84e\u1833() {
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
            invokevirtual:void(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u836c\u6c52\u40a9\uc2e8\ud36e, this:\u4f4a\u8640\u6b0d\u3d4b\u416d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u836c\u6c52\u40a9\uc2e8\ud36e() {
        var_1_1B3 : int
        var_3_74 : String
        var_4_76 : int
        
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
            var_1_1B3 = and:int(and:int(ldc:int(1963060616), ldc:int(2133576559)), ldc:int(1969872780))
            var_3_74 = invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\u4f4a\u8640\u6b0d\u3d4b\u416d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u4f4a\u8640\u6b0d\u3d4b\u416d::\uc229\ub83f\ub19c\u7006\u59ec), and:int(ldc:int(12810), ldc:int(2434))))
            var_4_76 = ldc:int(-1)
            
            switch (invokevirtual:int(String::hashCode, var_3_74:String)) {
                case -1955878649:
                    if (invokevirtual:boolean(String::equals, var_3_74:String, loadelement:String[expected:Object](getstatic:String[](\u4f4a\u8640\u6b0d\u3d4b\u416d::\uc229\ub83f\ub19c\u7006\u59ec), xor:int(ldc:int(2192), ldc:int(2196))))) {
                        looporswitchbreak()
                    }
                    
                    goto(Label_0299)
                
                case 79996135:
                    if (invokevirtual:boolean(String::equals, var_3_74:String, loadelement:String[expected:Object](getstatic:String[](\u4f4a\u8640\u6b0d\u3d4b\u416d::\uc229\ub83f\ub19c\u7006\u59ec), and:int(ldc:int(4101), ldc:int(18957))))) {
                        goto(Label_0241)
                    }
                    
                    goto(Label_0299)
            }
            
            Label_0174:
            
            if (cmpeq:boolean(and:int(var_1_1B3:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0450)
            }
            
            if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0387)
            }
            
            if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0299)
            }
            
            if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_1B3 = and:int(var_1_1B3:int, ldc:int(1999895867))
                var_4_76 = and:int(ldc:int(1469), ldc:int(-5566))
                goto(Label_0299)
            }
            
            Label_0241:
            
            if (cmpeq:boolean(and:int(var_1_1B3:int, ldc:int(256)), ldc:int(0))) {
                var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-1865169623))
                goto(Label_0450)
            }
            
            if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0387)
            }
            
            if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_1B3:int, ldc:int(8)), ldc:int(0))) {
                    var_1_1B3 = and:int(var_1_1B3:int, ldc:int(1069810426))
                    goto(Label_0174)
                }
                
                var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-310382785))
                var_4_76 = and:int(ldc:int(8225), ldc:int(16409))
            }
            
            Label_0299:
            
            if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(4)), ldc:int(0))) {
                var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-919740236))
                goto(Label_0450)
            }
            
            if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_1B3:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0241)
                }
                
                if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-1240338410))
                    goto(Label_0174)
                }
                
                var_1_1B3 = and:int(var_1_1B3:int, ldc:int(1963442479))
                
                switch (var_4_76:int) {
                    case 0:
                        putfield:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u92ee\u72f1\u8df4\u446c\u5140, this:\u4f4a\u8640\u6b0d\u3d4b\u416d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua3b4\u4d85\u3e75\u6198\u7330))
                        looporswitchbreak()
                    
                    case 1:
                        putfield:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u92ee\u72f1\u8df4\u446c\u5140, this:\u4f4a\u8640\u6b0d\u3d4b\u416d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\uc87f\uc29a\u8d98\u4ab3\u8aa5))
                        goto(Label_0450)
                    
                    default:
                        putfield:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u92ee\u72f1\u8df4\u446c\u5140, this:\u4f4a\u8640\u6b0d\u3d4b\u416d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u92ff\u3776\ua6bd\uc87f\u8bb0))
                        return:void()
                }
            }
            
            Label_0387:
            
            if (cmpeq:boolean(and:int(var_1_1B3:int, ldc:int(16)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-629524122))
                    goto(Label_0299)
                }
                
                if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0241)
                }
                
                if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(4)), ldc:int(0))) {
                    var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-1917062452))
                    goto(Label_0174)
                }
                
                var_1_1B3 = and:int(var_1_1B3:int, ldc:int(1831853549))
                return:void()
            }
            
            Label_0450:
            
            if (cmpeq:boolean(and:int(var_1_1B3:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0387)
            }
            
            if (cmpne:boolean(and:int(var_1_1B3:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0299)
            }
            
            if (cmpeq:boolean(and:int(var_1_1B3:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0241)
            }
            
            if (cmpeq:boolean(and:int(var_1_1B3:int, ldc:int(8)), ldc:int(0))) {
                var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-370177534))
                goto(Label_0174)
            }
            
            var_1_1B3 = and:int(var_1_1B3:int, ldc:int(-506669208))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\ub83f\u7e3f\ud51e\uafe7() {
        var_1_150 : int
        var_3_7C : Iterator<\ud158\u839e\u7006\uc3e3\u446c>
        var_4_C3 : \ud158\u839e\u7006\uc3e3\u446c
        stack_164_0 : \u8d98\ua068\u4492\u9af2\u5f50 [generated]
        stack_164_1 : \u3711\u71f1\u7006\u92ee\ucef1 [generated]
        
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
            var_1_150 = and:int(ldc:int(1710795640), ldc:int(1803086121))
            invokeinterface:void(List<E>::clear, getfield:List<\ud158\u839e\u7006\uc3e3\u446c>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u156b\uc229\u64f2\u6d69\uc7fe, this:\u4f4a\u8640\u6b0d\u3d4b\u416d))
            var_3_7C = invokeinterface:Iterator<\ud158\u839e\u7006\uc3e3\u446c>(Collection<\ud158\u839e\u7006\uc3e3\u446c>::iterator, invokeinterface:Collection<\ud158\u839e\u7006\uc3e3\u446c>(Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, \ud158\u839e\u7006\uc3e3\u446c>::values, invokevirtual:Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, \ud158\u839e\u7006\uc3e3\u446c>(\u3776\u647c\u51fa\u7e3f\ub32d::\uc246\ud171\u8709\u6435\u416d, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))))
            
            loop {
                if (cmpne:boolean(and:int(var_1_150:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_150 = and:int(var_1_150:int, ldc:int(1084518093))
                }
                else {
                    var_1_150 = and:int(var_1_150:int, ldc:int(-850137679))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_3_7C:Iterator)) {
                        var_4_C3 = checkcast:\ud158\u839e\u7006\uc3e3\u446c(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, invokeinterface:\ud158\u839e\u7006\uc3e3\u446c(Iterator<\ud158\u839e\u7006\uc3e3\u446c>::next, var_3_7C:Iterator<\ud158\u839e\u7006\uc3e3\u446c>))
                        
                        if (cmpne:boolean(invokevirtual:\ucef1\u3504\u64f2\u6cfe\u52d3(\ud158\u839e\u7006\uc3e3\u446c::\u74b1\u8cae\u3d4b\u873d\uc910, var_4_C3:\ud158\u839e\u7006\uc3e3\u446c), getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\u946b\ube23\uafe7\u67d0\u416d))) {
                            loop {
                                if (cmpeq:boolean(and:int(var_1_150:int, ldc:int(16384)), ldc:int(0))) {
                                    var_1_150 = and:int(var_1_150:int, ldc:int(-1487823004))
                                    invokeinterface:boolean(List<\ud158\u839e\u7006\uc3e3\u446c>::add, getfield:List<\ud158\u839e\u7006\uc3e3\u446c>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u156b\uc229\u64f2\u6d69\uc7fe, this:\u4f4a\u8640\u6b0d\u3d4b\u416d), var_4_C3:\ud158\u839e\u7006\uc3e3\u446c)
                                    invokevirtual:\u8d98\ua068\u4492\u9af2\u5f50(HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>::put, getfield:HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ucfaf\u8308\u9a18\u156b\u67e9, this:\u4f4a\u8640\u6b0d\u3d4b\u416d), var_4_C3:\ud158\u839e\u7006\uc3e3\u446c, initobject:\u8d98\ua068\u4492\u9af2\u5f50(\u8d98\ua068\u4492\u9af2\u5f50::<init>, and:int(ldc:int(158), ldc:int(19670)), and:int(ldc:int(4286), ldc:int(406)), getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\u7049\u16f6\u8389\u392e\u5140)))
                                    
                                    if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\u4f4a\u8640\u6b0d\u3d4b\u416d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u4f4a\u8640\u6b0d\u3d4b\u416d::\uc229\ub83f\ub19c\u7006\u59ec), xor:int(ldc:int(18695), ldc:int(18688))))) {
                                        stack_164_0 = checkcast:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50.class, invokevirtual:\u8d98\ua068\u4492\u9af2\u5f50(HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>::get, getfield:HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ucfaf\u8308\u9a18\u156b\u67e9, this:\u4f4a\u8640\u6b0d\u3d4b\u416d), var_4_C3:\ud158\u839e\u7006\uc3e3\u446c[expected:Object]))
                                        
                                        if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, var_4_C3:\ud158\u839e\u7006\uc3e3\u446c))) {
                                            var_1_150 = and:int(var_1_150:int, ldc:int(351353699))
                                            stack_164_1 = getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\u7049\u16f6\u8389\u392e\u5140)
                                        }
                                        else {
                                            stack_164_1 = getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\uf9c5\u5140\ud158\u4492\u3dd3)
                                        }
                                        
                                        var_1_150 = and:int(var_1_150:int, ldc:int(285055271))
                                        invokevirtual:void(\u8d98\ua068\u4492\u9af2\u5f50::\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, stack_164_0:\u8d98\ua068\u4492\u9af2\u5f50, stack_164_1:\u3711\u71f1\u7006\u92ee\ucef1)
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_1_150:int, ldc:int(2147483647)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_1_150 = and:int(var_1_150:int, ldc:int(-227455642))
                            loopcontinue()
                        }
                        
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_150:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokestatic:void(Collections::sort, getfield:List<\ud158\u839e\u7006\uc3e3\u446c>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u156b\uc229\u64f2\u6d69\uc7fe, this:\u4f4a\u8640\u6b0d\u3d4b\u416d), initobject:\ucef1\ud4fe\u4d85\u6ec6\u4ab3[expected:Comparator<? super \ud158\u839e\u7006\uc3e3\u446c>](\ucef1\ud4fe\u4d85\u6ec6\u4ab3::<init>, this:\u4f4a\u8640\u6b0d\u3d4b\u416d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u61a4\u9a18\ub70c\u7bad\uceb8(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ud51e\uff55\u8d98\u4492\u6d99 p0) {
        var_2_CC : int
        var_4_F1 : \u7c6b\ud36e\u8d90\u0800\ua6bd
        var_5_F4 : \u4c04\u34df\ua3b4\uc29a\ub70c
        var_6_104 : \u3e2a\u8413\ud12e\u4f4a\ud7e8
        var_7_12B : int
        var_8_15C : Collection<\u4c04\ub102\ufcaf\u8d90\u8aa5>
        var_9_165 : int
        var_10_170 : Iterator<\ud158\u839e\u7006\uc3e3\u446c>
        var_10_191 : int
        var_11_19A : int
        stack_1D8_0 : int [generated]
        var_13_1D9 : int
        
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
            var_2_CC = and:int(ldc:int(-1395442582), ldc:int(-1434796070))
            
            if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u4f4a\u8640\u6b0d\u3d4b\u416d[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
                if (cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u64f2\u8350\u0b8e\u64f2\u946b)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                    goto(Label_0149)
                }
            }
            
            Label_0105:
            
            if (cmpeq:boolean(and:int(var_2_CC:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0176)
            }
            
            if (cmpeq:boolean(and:int(var_2_CC:int, ldc:int(262144)), ldc:int(0))) {
                return:void()
            }
            
            var_2_CC = and:int(var_2_CC:int, ldc:int(-1283453320))
            Label_0149:
            
            if (cmpeq:boolean(and:int(var_2_CC:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_CC:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0105)
                }
                
                var_2_CC = and:int(var_2_CC:int, ldc:int(-53757718))
                
                if (invokevirtual:boolean(\ud51e\uff55\u8d98\u4492\u6d99::\ub7dc\ufcaf\u6d69\u61a4\u8389, p0:\ud51e\uff55\u8d98\u4492\u6d99)) {
                    var_4_F1 = invokevirtual:\u7c6b\ud36e\u8d90\u0800\ua6bd(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8df4\ub113\u9937\u4cd9\u4c04\u6d69, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u64f2\u8350\u0b8e\u64f2\u946b)))
                    var_5_F4 = aconstnull:\u4c04\u34df\ua3b4\uc29a\ub70c()
                    var_6_104 = invokevirtual:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u8413\u960f\u8df4\uc87f\u6b5f\u1187, var_4_F1:\u7c6b\ud36e\u8d90\u0800\ua6bd, invokevirtual:String(\ua3b4\u8aa5\ub113\ubf56\u873d::\u34df\u4f52\u1187\u6c52\ub1b9\uae87, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u64f2\u8350\u0b8e\u64f2\u946b))))
                    
                    if (cmpne:boolean(var_6_104:\u3e2a\u8413\ud12e\u4f4a\ud7e8, aconstnull:\u3e2a\u8413\ud12e\u4f4a\ud7e8())) {
                        var_7_12B = invokevirtual:int(TextFormatting::getColorIndex, invokevirtual:TextFormatting(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u97b7\u9033\uc2e8\u836c\u8640\u156b, var_6_104:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
                        
                        if (cmpge:boolean(var_7_12B:int, ldc:int(0))) {
                            var_5_F4 = invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u4179\u9937\u3bd6\u7e3f\ud217\uf9c5, var_4_F1:\u7c6b\ud36e\u8d90\u0800\ua6bd, add:int(xor:int(ldc:int(2117), ldc:int(2118)), var_7_12B:int))
                        }
                    }
                    
                    var_8_15C = invokevirtual:Collection<\u4c04\ub102\ufcaf\u8d90\u8aa5>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u4492\ud12e\u0b8e\u8753\u0b8e\ube23, var_4_F1:\u7c6b\ud36e\u8d90\u0800\ua6bd, ternaryop:\u4c04\u34df\ua3b4\uc29a\ub70c(cmpeq:boolean(var_5_F4:\u4c04\u34df\ua3b4\uc29a\ub70c, aconstnull:\u4c04\u34df\ua3b4\uc29a\ub70c()), invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u4179\u9937\u3bd6\u7e3f\ud217\uf9c5, var_4_F1:\u7c6b\ud36e\u8d90\u0800\ua6bd, xor:int(ldc:int(6161), ldc:int(6160))), var_5_F4:\u4c04\u34df\ua3b4\uc29a\ub70c))
                    var_9_165 = and:int(ldc:int(24801), ldc:int(-24810))
                    var_10_170 = invokeinterface:Iterator<\ud158\u839e\u7006\uc3e3\u446c>(List<\ud158\u839e\u7006\uc3e3\u446c>::iterator, getfield:List<\ud158\u839e\u7006\uc3e3\u446c>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u156b\uc229\u64f2\u6d69\uc7fe, this:\u4f4a\u8640\u6b0d\u3d4b\u416d))
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_10_170:Iterator)) {
                        if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, checkcast:\ud158\u839e\u7006\uc3e3\u446c(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, invokeinterface:\ud158\u839e\u7006\uc3e3\u446c(Iterator<\ud158\u839e\u7006\uc3e3\u446c>::next, var_10_170:Iterator<\ud158\u839e\u7006\uc3e3\u446c>))))) {
                            loopcontinue()
                        }
                        
                        inc:int(var_9_165, ldc:int(1))
                    }
                    
                    var_10_191 = add:int(ldc:int(23), mul:int(var_9_165:int, add:int(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\ud523\u64f2\u52d3\u97b7\ub113\u7873, getfield:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u92ee\u72f1\u8df4\u446c\u5140, this:\u4f4a\u8640\u6b0d\u3d4b\u416d)), xor:int(ldc:int(12288), ldc:int(12289)))))
                    var_11_19A = invokeinterface:int(Collection::size, var_8_15C:Collection)
                    stack_1D8_0 = div:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uff55\ua068\ubcb0\u67e9\u56bd\u071d, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))), xor:int(ldc:int(7), ldc:int(5)))
                    invokevirtual:Class<? extends \ucef1\u99f7\u4e72\u7873\u0800\u72f1>(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::getClass, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u64f2\u8350\u0b8e\u64f2\u946b)))
                    var_13_1D9 = sub:int(stack_1D8_0:int, mul:int(add:int(ldc:int(9), and:int(ldc:int(14621), ldc:int(16391))), add:int(sub:int(var_11_19A:int, and:int(ldc:int(5175), ldc:int(19331))), and:int(ldc:int(16978), ldc:int(2)))))
                    
                    if (cmple:boolean(var_10_191:int, var_13_1D9:int)) {
                        putfield:int(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ud7e8\u9937\u4c04\ub1b9\ub19c, this:\u4f4a\u8640\u6b0d\u3d4b\u416d, and:int(ldc:int(30112), ldc:int(-32753)))
                        return:void()
                    }
                    
                    putfield:int(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ud7e8\u9937\u4c04\ub1b9\ub19c, this:\u4f4a\u8640\u6b0d\u3d4b\u416d, div:int(sub:int(var_10_191:int, var_13_1D9:int), and:int(ldc:int(2), ldc:int(39))))
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\uae87\u8308\u6fb0\u3bd6\uae5d\uc229, ldc:float(0.0f), i2f:float(getfield:int(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ud7e8\u9937\u4c04\ub1b9\ub19c, this:\u4f4a\u8640\u6b0d\u3d4b\u416d)), ldc:float(0.0f))
                    return:void()
                }
            }
            
            Label_0176:
            
            if (cmpne:boolean(and:int(var_2_CC:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_2_CC:int, ldc:int(262144)), ldc:int(0))) {
                var_2_CC = and:int(var_2_CC:int, ldc:int(207640960))
                goto(Label_0105)
            }
            
            var_2_CC = and:int(var_2_CC:int, ldc:int(-381485073))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\uae87\u8308\u6fb0\u3bd6\uae5d\uc229, ldc:float(0.0f), i2f:float(neg:int(getfield:int(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ud7e8\u9937\u4c04\ub1b9\ub19c, this:\u4f4a\u8640\u6b0d\u3d4b\u416d))), ldc:float(0.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u40a9\u9af2\ubcb0\u4d85\u3d64(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u647c\u8389\u92ee\u9033\uc31c p0) {
        var_2_61 : int
        var_2_1C3 : int
        var_4_9D : Iterator<\ud158\u839e\u7006\uc3e3\u446c>
        var_5_189 : \ud158\u839e\u7006\uc3e3\u446c
        stack_1D7_0 : \u8d98\ua068\u4492\u9af2\u5f50 [generated]
        stack_1D7_1 : \u3711\u71f1\u7006\u92ee\ucef1 [generated]
        var_2_C3 : int
        var_2_137 : int
        var_4_F1 : int
        var_5_FA : int
        var_6_105 : int
        var_8_10F : \u6fb0\u1187\u12b2\ua068\u5245\u67e9
        var_7_11E : int
        var_2_268 : int
        var_10_162 : int
        var_11_16B : int
        var_12_176 : Iterator<\ud158\u839e\u7006\uc3e3\u446c>
        var_13_242 : \ud158\u839e\u7006\uc3e3\u446c
        var_14_245 : float
        var_15_248 : float
        var_16_37F : \u8d98\ua068\u4492\u9af2\u5f50
        var_2_287 : int
        var_16_28D : String
        var_17_2B2 : int
        var_18_2B9 : int
        stack_3C1_0 : \u6fb0\u1187\u12b2\ua068\u5245\u67e9 [generated]
        stack_3C1_1 : float [generated]
        stack_3C1_2 : float [generated]
        stack_3C1_3 : String [generated]
        stack_3C1_4 : int [generated]
        
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
        var_2_61 = and:int(ldc:int(1121988320), ldc:int(-470689320))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u4f4a\u8640\u6b0d\u3d4b\u416d[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            if (cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u64f2\u8350\u0b8e\u64f2\u946b)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                goto(Label_0132)
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        Label_0132:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0105)
        }
        
        var_2_1C3 = and:int(var_2_61:int, ldc:int(-822731096))
        var_4_9D = invokeinterface:Iterator<\ud158\u839e\u7006\uc3e3\u446c>(Set<\ud158\u839e\u7006\uc3e3\u446c>::iterator, invokevirtual:Set<\ud158\u839e\u7006\uc3e3\u446c>(HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>::keySet, getfield:HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ucfaf\u8308\u9a18\u156b\u67e9, this:\u4f4a\u8640\u6b0d\u3d4b\u416d)))
        
        while (invokeinterface:boolean(Iterator::hasNext, var_4_9D:Iterator)) {
            var_5_189 = checkcast:\ud158\u839e\u7006\uc3e3\u446c(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, invokeinterface:\ud158\u839e\u7006\uc3e3\u446c(Iterator<\ud158\u839e\u7006\uc3e3\u446c>::next, var_4_9D:Iterator<\ud158\u839e\u7006\uc3e3\u446c>))
            
            if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\u4f4a\u8640\u6b0d\u3d4b\u416d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u4f4a\u8640\u6b0d\u3d4b\u416d::\uc229\ub83f\ub19c\u7006\u59ec), xor:int(ldc:int(18435), ldc:int(18436))))) {
                stack_1D7_0 = checkcast:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50.class, invokevirtual:\u8d98\ua068\u4492\u9af2\u5f50(HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>::get, getfield:HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ucfaf\u8308\u9a18\u156b\u67e9, this:\u4f4a\u8640\u6b0d\u3d4b\u416d), var_5_189:\ud158\u839e\u7006\uc3e3\u446c[expected:Object]))
                
                if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, var_5_189:\ud158\u839e\u7006\uc3e3\u446c))) {
                    var_2_1C3 = and:int(var_2_1C3:int, ldc:int(1203994594))
                    stack_1D7_1 = getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\u7049\u16f6\u8389\u392e\u5140)
                }
                else {
                    stack_1D7_1 = getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\uf9c5\u5140\ud158\u4492\u3dd3)
                }
                
                var_2_1C3 = and:int(var_2_1C3:int, ldc:int(-204292475))
                invokevirtual:void(\u8d98\ua068\u4492\u9af2\u5f50::\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, stack_1D7_0:\u8d98\ua068\u4492\u9af2\u5f50, stack_1D7_1:\u3711\u71f1\u7006\u92ee\ucef1)
            }
            
            var_2_1C3 = and:int(var_2_1C3:int, ldc:int(-808572767))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_1C3:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_C3 = and:int(var_2_1C3:int, ldc:int(-1196367952))
            }
            else {
                var_2_C3 = and:int(var_2_1C3:int, ldc:int(1741881268))
                
                if (getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ud217\u8640\u760c\u92ee\ub6ab\u7006, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))) {
                    return:void()
                }
            }
            
            if (cmpne:boolean(and:int(var_2_C3:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_137 = and:int(var_2_C3:int, ldc:int(-1027404913))
                var_4_F1 = ldc:int(10)
                var_5_FA = xor:int(ldc:int(610), ldc:int(611))
                var_6_105 = invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc910\u0c95\u5d20\u6435\ucfaf\u836c, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))
                var_8_10F = getfield:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u92ee\u72f1\u8df4\u446c\u5140, this:\u4f4a\u8640\u6b0d\u3d4b\u416d)
                var_7_11E = sub:int(var_4_F1:int, xor:int(ldc:int(8196), ldc:int(8192)))
                
                if (cmpeq:boolean(getfield:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u92ee\u72f1\u8df4\u446c\u5140, this:\u4f4a\u8640\u6b0d\u3d4b\u416d), getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u92ff\u3776\ua6bd\uc87f\u8bb0))) {
                    inc:int(var_4_F1, ldc:int(-3))
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_137:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_137 = and:int(var_2_137:int, ldc:int(-219128094))
                        
                        if (getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u8413\u3d64\u2dcc\u6b0d\u960f\u56bd, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))) {
                            var_7_11E = d2i:int(add:double(mul:double(i2d:double(mul:int(invokeinterface:int(List<E>::size, getfield:List<String>(\uf9c5\u983f\u8308\ud4fe\u7c6b\uae5d::\u98a4\u61a4\u6c52\uc238\uc229\u16f6, getfield:\uf9c5\u983f\u8308\ud4fe\u7c6b\uae5d(\u120d\u446c\uff55\u3d64\u494c\u69d9::\u52d3\u4c2b\u5fe1\u61a4\u600f\ub102, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u64f2\u8350\u0b8e\u64f2\u946b))))), ldc:int(9))), invokevirtual:double(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u600f\u6b0d\u8389\u8cae\u4179\u7049, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u64f2\u8350\u0b8e\u64f2\u946b)))), ldc:double(7.0)))
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_2_137:int, ldc:int(2048)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_137 = and:int(var_2_137:int, ldc:int(940792140))
                }
                
                var_2_268 = and:int(var_2_137:int, ldc:int(1123614173))
                var_10_162 = and:int(ldc:int(-26164), ldc:int(26145))
                var_11_16B = invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, ldc:int(-1), ldc:float(0.95f))
                var_12_176 = invokeinterface:Iterator<\ud158\u839e\u7006\uc3e3\u446c>(List<\ud158\u839e\u7006\uc3e3\u446c>::iterator, getfield:List<\ud158\u839e\u7006\uc3e3\u446c>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u156b\uc229\u64f2\u6d69\uc7fe, this:\u4f4a\u8640\u6b0d\u3d4b\u416d))
                
                while (invokeinterface:boolean(Iterator::hasNext, var_12_176:Iterator)) {
                    var_13_242 = checkcast:\ud158\u839e\u7006\uc3e3\u446c(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, invokeinterface:\ud158\u839e\u7006\uc3e3\u446c(Iterator<\ud158\u839e\u7006\uc3e3\u446c>::next, var_12_176:Iterator<\ud158\u839e\u7006\uc3e3\u446c>))
                    var_14_245 = ldc:float(1.0f)
                    var_15_248 = ldc:float(1.0f)
                    
                    if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\u4f4a\u8640\u6b0d\u3d4b\u416d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u4f4a\u8640\u6b0d\u3d4b\u416d::\uc229\ub83f\ub19c\u7006\u59ec), xor:int(ldc:int(526), ldc:int(521))))) {
                        var_16_37F = checkcast:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50.class, invokevirtual:\u8d98\ua068\u4492\u9af2\u5f50(HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>::get, getfield:HashMap<\ud158\u839e\u7006\uc3e3\u446c, \u8d98\ua068\u4492\u9af2\u5f50>(\u4f4a\u8640\u6b0d\u3d4b\u416d::\ucfaf\u8308\u9a18\u156b\u67e9, this:\u4f4a\u8640\u6b0d\u3d4b\u416d), var_13_242:\ud158\u839e\u7006\uc3e3\u446c[expected:Object]))
                        
                        if (cmpne:boolean(invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, var_16_37F:\u8d98\ua068\u4492\u9af2\u5f50), ldc:float(0.0f))) {
                            var_2_268 = and:int(var_2_268:int, ldc:int(1139167162))
                            var_15_248 = invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, var_16_37F:\u8d98\ua068\u4492\u9af2\u5f50)
                            var_14_245 = add:float(ldc:float(0.86f), mul:float(ldc:float(0.14f), var_15_248:float))
                            goto(Label_0634)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0604:
                    
                    if (cmpeq:boolean(and:int(var_2_268:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_268 = and:int(var_2_268:int, ldc:int(1820709611))
                    }
                    else {
                        var_2_268 = and:int(var_2_268:int, ldc:int(1256832224))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, var_13_242:\ud158\u839e\u7006\uc3e3\u446c))) {
                            loopcontinue()
                        }
                    }
                    
                    Label_0634:
                    
                    if (cmpne:boolean(and:int(var_2_268:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    var_2_287 = and:int(var_2_268:int, ldc:int(-943317597))
                    var_16_28D = invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u8709\u183a\ubefe\u62da\u8308, var_13_242:\ud158\u839e\u7006\uc3e3\u446c)
                    invokestatic:void(GL11::glAlphaFunc, and:int(ldc:int(855), ldc:int(17031)), ldc:float(0.0f))
                    invokestatic:void(GL11::glPushMatrix)
                    var_17_2B2 = sub:int(sub:int(var_6_105:int, var_4_F1:int), div:int(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, var_8_10F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, var_16_28D:String), xor:int(ldc:int(12385), ldc:int(12387))))
                    var_18_2B9 = add:int(var_7_11E:int, ldc:int(12))
                    invokestatic:void(GL11::glTranslatef, i2f:float(var_17_2B2:int), i2f:float(var_18_2B9:int), ldc:float(0.0f))
                    invokestatic:void(GL11::glScalef, var_14_245:float, var_14_245:float, ldc:float(1.0f))
                    invokestatic:void(GL11::glTranslatef, i2f:float(neg:int(var_17_2B2:int)), i2f:float(neg:int(var_18_2B9:int)), ldc:float(0.0f))
                    invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, sub:float(sub:float(sub:float(i2f:float(var_6_105:int), mul:float(i2f:float(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, var_8_10F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, var_16_28D:String)), ldc:float(1.5f))), i2f:float(var_4_F1:int)), ldc:float(20.0f)), i2f:float(sub:int(var_7_11E:int, ldc:int(20))), mul:float(i2f:float(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, var_8_10F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, var_16_28D:String)), ldc:float(3.0f)), i2f:float(add:int(add:int(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\ud523\u64f2\u52d3\u97b7\ub113\u7873, var_8_10F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9), var_5_FA:int), ldc:int(40))), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\u71f1\u3e2a\u12cb\u8aa5\ub18d), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), mul:float(mul:float(ldc:float(0.36f), var_15_248:float), d2f:float(invokestatic:double(Math::sqrt, f2d:double(invokestatic:float(Math::min, ldc:float(1.2f), div:float(i2f:float(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, var_8_10F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, var_16_28D:String)), ldc:float(63.0f)))))))))
                    stack_3C1_0 = var_8_10F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9
                    stack_3C1_1 = i2f:float(sub:int(sub:int(var_6_105:int, var_4_F1:int), invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, var_8_10F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, var_16_28D:String)))
                    stack_3C1_2 = i2f:float(var_7_11E:int)
                    stack_3C1_3 = var_16_28D:String
                    
                    if (cmpne:boolean(var_15_248:float, ldc:float(1.0f))) {
                        var_2_287 = and:int(var_2_287:int, ldc:int(-204195121))
                        stack_3C1_4 = invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, ldc:int(-1), mul:float(var_15_248:float, ldc:float(0.95f)))
                    }
                    else {
                        stack_3C1_4 = var_11_16B:int
                    }
                    
                    var_2_268 = and:int(var_2_287:int, ldc:int(2009145342))
                    invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, stack_3C1_0:\u6fb0\u1187\u12b2\ua068\u5245\u67e9, stack_3C1_1:float, stack_3C1_2:float, stack_3C1_3:String, stack_3C1_4:int)
                    invokestatic:void(GL11::glPopMatrix)
                    inc:int(var_10_162, ldc:int(-100))
                    var_7_11E = f2i:int(add:float(i2f:float(var_7_11E:int), mul:float(i2f:float(add:int(invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\ud523\u64f2\u52d3\u97b7\ub113\u7873, var_8_10F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9), var_5_FA:int)), invokestatic:float(\u960f\u385b\u93a2\uc84e\u7006::\u64f2\u718f\ub6ab\u9033\u8d90\u9033, var_15_248:float, ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f)))))
                }
                
                putfield:int(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u8753\u92ff\u927d\u0b8e\u3d4b, this:\u4f4a\u8640\u6b0d\u3d4b\u416d, var_7_11E:int)
                return:void()
            }
            
            var_2_1C3 = and:int(var_2_C3:int, ldc:int(-384229089))
        }
    }
    
    public int \ua562\ud7e8\u40a9\ub70c\u71f1() {
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
            return:int(getfield:int(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u8753\u92ff\u927d\u0b8e\u3d4b, this:\u4f4a\u8640\u6b0d\u3d4b\u416d))
        }
        
        goto(Label_0006)
    }
    
    private java.awt.Color \u8350\ud12e\u4f52\u4f4a\u4daf(int p0, int p1, java.awt.Color p2) {
        var_6_6F : ByteBuffer
        var_7_F9 : Color
        
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
            var_6_6F = invokestatic:ByteBuffer(ByteBuffer::allocateDirect, xor:int(ldc:int(12424), ldc:int(12427)))
            invokestatic:void(GL11::glPixelStorei, xor:int(ldc:int(-30264), ldc:int(-31427)), and:int(ldc:int(113), ldc:int(1025)))
            invokestatic:void(GL11::glReadPixels, p0:int, sub:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uff55\ua068\ubcb0\u67e9\u56bd\u071d, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))), p1:int), and:int(ldc:int(3617), ldc:int(4233)), xor:int(ldc:int(16992), ldc:int(16993)), and:int(ldc:int(23447), ldc:int(7439)), and:int(ldc:int(7245), ldc:int(30610)), var_6_6F:ByteBuffer)
            var_7_F9 = initobject:Color(Color::<init>, mul:int(invokevirtual:byte[expected:int](ByteBuffer::get, var_6_6F:ByteBuffer, and:int(ldc:int(13318), ldc:int(-13319))), and:int(ldc:int(8458), ldc:int(130))), mul:int(invokevirtual:byte[expected:int](ByteBuffer::get, var_6_6F:ByteBuffer, xor:int(ldc:int(1112), ldc:int(1113))), and:int(ldc:int(16426), ldc:int(5314))), mul:int(invokevirtual:byte[expected:int](ByteBuffer::get, var_6_6F:ByteBuffer, xor:int(ldc:int(22), ldc:int(20))), and:int(ldc:int(514), ldc:int(5378))), and:int(ldc:int(2081), ldc:int(515)))
            
            if (cmpne:boolean(p2:Color, aconstnull:Color())) {
                var_7_F9 = invokestatic:Color(\u3bd6\u6d99\ub113\u4d85\u71f1::\u12b2\u0800\u34df\u6fb0\u8bb0, var_7_F9:Color, p2:Color, ldc:float(0.08f))
            }
            
            return:Color(var_7_F9:Color)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3776\u8753\uff55\u1187\ub8be$0(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokevirtual:void(\u4f4a\u8640\u6b0d\u3d4b\u416d::\u836c\u6c52\u40a9\uc2e8\ud36e, this:\u4f4a\u8640\u6b0d\u3d4b\u416d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2AD : int
        expr_6E : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_E1_0 : byte[] [generated]
        stack_10D_0 : byte[] [generated]
        stack_10F_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_2C0_0 : byte[] [generated]
        stack_2FB_0 : byte[] [generated]
        stack_358_0 : byte[] [generated]
        stack_3D5_0 : byte[] [generated]
        var_4_299 : int
        var_3_29E : byte[]
        var_5_29F : int
        var_0_371 : int
        expr_358 : byte [generated]
        stack_3A0_2 : byte [generated]
        stack_374_0 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_2E9 : byte[]
        var_5_2EA : int
        expr_E1 : int [generated]
        expr_10F : int [generated]
        var_3_3C3 : byte[]
        var_5_3C4 : int
        expr_3D5 : byte [generated]
        var_3_151 : String
        stack_292_0 : String[] [generated]
        expr_163 : String[] [generated]
        
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
        var_0_2AD = and:int(ldc:int(-1066413924), ldc:int(-1176012691))
        expr_6E = arraylength:int(stack_9B_0 = stack_9D_0 = stack_DF_0 = stack_E1_0 = stack_10D_0 = stack_10F_0 = stack_145_0 = stack_2C0_0 = stack_2FB_0 = stack_358_0 = stack_3D5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("DQ39VNDZDYUJOR25KSTIkVjFMRls5Q1hLST5kDEBAOFxKgAVEVEJBHItCTkIZdEAKRkaLTEt3TkpJF0lDSxBBfE1RE3cyR0caeUQXREVzNAx8RDhPJoRfNSVMcUFDUzs3QT1ATyH94/zi30=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_299 = expr_6E:int
        var_3_29E = newarray:byte[](byte.class, expr_6E:int)
        var_5_29F = expr_6E:int
        Label_0673:
        
        while (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-1117535699))
            var_5_29F = add:int(var_5_29F:int, ldc:int(-1))
            storeelement:byte(var_3_29E:byte[], var_5_29F:int, add:byte(loadelement:byte(stack_2C0_0:byte[], var_5_29F:int), ldc:byte(3)))
            
            if (cmpne:boolean(var_5_29F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_10D_0 = stack_10F_0 = stack_145_0 = stack_2C0_0 = stack_2FB_0 = stack_358_0 = stack_3D5_0 = var_3_29E:byte[]
            goto(Label_0115)
        }
        
        var_0_2AD = and:int(var_0_2AD:int, ldc:int(-485490253))
        Label_0834:
        
        while (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_371 = and:int(var_0_2AD:int, ldc:int(-830518549))
            var_5_29F = add:int(var_5_29F:int, ldc:int(-1))
            expr_358 = stack_3A0_2 = loadelement(stack_358_0, var_5_29F)
            
            if (cmplt:boolean(add:int(add:int(var_5_29F:int, ldc:int(6)), neg:int(var_4_299:int)), ldc:int(0))) {
                stack_3A0_2 = stack_374_0 = add:byte(expr_358:byte, loadelement:byte(var_3_29E:byte[], add:int(var_5_29F:int, ldc:int(6))))
                goto(Label_0900)
            }
            
            Label_0869:
            
            if (cmpeq:boolean(and:int(var_0_371:int, ldc:int(256)), ldc:int(0))) {
                var_0_371 = and:int(var_0_371:int, ldc:int(678131224))
                stack_3A0_2 = stack_374_0 = add:byte(expr_358:byte, ldc:byte(6))
            }
            
            Label_0900:
            
            if (cmpeq:boolean(and:int(var_0_371:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_371 = and:int(var_0_371:int, ldc:int(-1505503433))
                goto(Label_0869)
            }
            
            var_0_2AD = and:int(var_0_371:int, ldc:int(-2047650306))
            storeelement:byte(var_3_29E:byte[], var_5_29F:int, stack_3A0_2:byte)
            
            if (cmpne:boolean(var_5_29F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_10D_0 = stack_10F_0 = stack_145_0 = stack_2C0_0 = stack_2FB_0 = stack_358_0 = stack_3D5_0 = var_3_29E:byte[]
            goto(Label_0230)
        }
        
        goto(Label_0673)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0276)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(8)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-841977599))
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-1535654119))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_2E9 = newarray:byte[](byte.class, expr_9F:int)
                var_5_2EA = expr_9F:int
                
                loop {
                    var_0_2AD = and:int(var_0_2AD:int, ldc:int(-1838941218))
                    var_5_2EA = add:int(var_5_2EA:int, ldc:int(-1))
                    storeelement:byte(var_3_2E9:byte[], var_5_2EA:int, add:int(shl:int(loadelement:byte(stack_2FB_0:byte[], var_5_2EA:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_2EA:int, and:int(ldc:int(20513), ldc:int(8333)))), ldc:int(6)), and:int(ldc:int(9551), ldc:int(4099)))))
                    
                    if (cmpne:boolean(var_5_2EA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_10D_0 = stack_10F_0 = stack_145_0 = stack_2C0_0 = stack_2FB_0 = stack_358_0 = stack_3D5_0 = var_3_2E9:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-1740172028))
            goto(Label_0276)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(1725083461))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_2AD = and:int(var_0_2AD:int, ldc:int(-578477288))
                goto(Label_0115)
            }
            
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(419387996))
            expr_E1 = arraylength:int(stack_E1_0:byte[])
            
            if (cmpne:boolean(expr_E1:int, ldc:int(0))) {
                var_4_299 = expr_E1:int
                var_3_29E = newarray:byte[](byte.class, expr_E1:int)
                var_5_29F = expr_E1:int
                goto(Label_0834)
            }
        }
        
        Label_0230:
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(2054095473))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(1635511343))
            expr_10F = arraylength:int(stack_10F_0:byte[])
            
            if (cmpne:boolean(expr_10F:int, ldc:int(0))) {
                var_3_3C3 = newarray:byte[](byte.class, expr_10F:int)
                var_5_3C4 = expr_10F:int
                
                loop {
                    var_0_2AD = and:int(var_0_2AD:int, ldc:int(661112639))
                    var_5_3C4 = add:int(var_5_3C4:int, ldc:int(-1))
                    expr_3D5 = loadelement:byte(stack_3D5_0:byte[], var_5_3C4:int)
                    storeelement:byte(var_3_3C3:byte[], var_5_3C4:int, xor:int(or:int(and:int(shl:int(expr_3D5:byte, xor:int(ldc:int(-31693), ldc:int(-31689))), ldc:int(-16)), and:int(shr:int(expr_3D5:byte[expected:int], and:int(ldc:int(16662), ldc:int(6340))), ldc:int(15))), ldc:int(96)))
                    
                    if (cmpne:boolean(var_5_3C4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_10D_0 = stack_10F_0 = stack_145_0 = stack_2C0_0 = stack_2FB_0 = stack_358_0 = stack_3D5_0 = var_3_3C3:byte[]
            }
        }
        
        Label_0276:
        
        if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(462831082))
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-844487783))
            goto(Label_0164)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_151 = initobject:String(String::<init>, stack_145_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_292_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(14351), ldc:int(14340)))
            expr_163 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8336), ldc:int(8347)))
            storeelement:String(expr_163:String[], and:int(ldc:int(23092), ldc:int(-24119)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(3025), ldc:int(-24542)), xor:int(ldc:int(513), ldc:int(523))))
            storeelement:String(expr_163:String[], and:int(ldc:int(4111), ldc:int(16983)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(1066), ldc:int(4238)), xor:int(ldc:int(17457), ldc:int(17445))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(12291), ldc:int(12295)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(2094), ldc:int(2106)), xor:int(ldc:int(16523), ldc:int(16529))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(6161), ldc:int(6160)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(1562), ldc:int(8250)), and:int(ldc:int(4141), ldc:int(11373))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(4418), ldc:int(4426)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(2727), ldc:int(2698)), and:int(ldc:int(959), ldc:int(28735))))
            storeelement:String(expr_163:String[], and:int(ldc:int(79), ldc:int(274)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(817), ldc:int(782)), xor:int(ldc:int(8323), ldc:int(8384))))
            storeelement:String(expr_163:String[], and:int(ldc:int(2309), ldc:int(26245)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(71), ldc:int(3019)), and:int(ldc:int(17528), ldc:int(328))))
            storeelement:String(expr_163:String[], and:int(ldc:int(17965), ldc:int(4313)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(16504), ldc:int(6216)), xor:int(ldc:int(3096), ldc:int(3157))))
            storeelement:String(expr_163:String[], and:int(ldc:int(6159), ldc:int(16387)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(589), ldc:int(11469)), xor:int(ldc:int(-32625), ldc:int(-32555))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(4872), ldc:int(4878)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(3451), ldc:int(20698)), xor:int(ldc:int(-31731), ldc:int(-31661))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(9245), ldc:int(9239)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(12638), ldc:int(18526)), and:int(ldc:int(9338), ldc:int(6506))))
            putstatic:String[](\u4f4a\u8640\u6b0d\u3d4b\u416d::\uc229\ub83f\ub19c\u7006\u59ec, expr_163:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62A : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
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
        var_3_62A = and:int(ldc:int(-1541520178), ldc:int(720881281))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f4a\u8640\u6b0d\u3d4b\u416d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_62A = and:int(var_3_62A:int, ldc:int(-113355557))
            var_5_80 = and:int(ldc:int(11388), ldc:int(-11903))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29206), ldc:int(-29239)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_62A:int, ldc:int(2049855433))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(1793), ldc:int(207)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(144), ldc:int(145)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_62A = and:int(var_3_D0:int, ldc:int(1749965489))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(2629), ldc:int(29825)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(414682393))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1955585538))
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(446423095))
                        goto(Label_0788)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1256565756))
                        goto(Label_0659)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1491600554))
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(2144757716))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0555)
                            }
                            
                            goto(Label_0788)
                        }
                    }
                    
                    Label_0404:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(860554014))
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-381301575))
                        goto(Label_0659)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(897460291))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1246864477))
                        var_11_E1 = and:int(ldc:int(9610), ldc:int(-9611))
                        goto(Label_1478)
                    }
                    
                    Label_0555:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(953679977))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(349672915))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-394899719))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0788)
                        }
                    }
                    
                    Label_0659:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(964850402))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1202522494))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-511069489))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(178820934))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-467145274))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0788:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-611285285))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1367178669))
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-842909017))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-471527226))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-747328106))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0659)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(689324682))
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(479948648))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(1961265438))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1216362350))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(28837), ldc:int(3649))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0944:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1057357117))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0788)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0659)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-566850455))
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(649324569))
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-1682777624))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1997499573))
                        var_11_E1 = and:int(ldc:int(-22004), ldc:int(1139))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-50335167))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1589719623))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0788)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0659)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-756526968))
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-486546220))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1337)
                            }
                        }
                    }
                    
                    Label_1214:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(448961385))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1100)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0788)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-93048579))
                            goto(Label_0659)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(669808768))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1725887107))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1478)
                    }
                    
                    Label_1337:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1633945150))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-369916918))
                        goto(Label_0788)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(361977656))
                        goto(Label_0659)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1768862315))
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-966657262))
                        loopcontinue()
                    }
                    
                    var_3_62A = and:int(var_3_62A:int, ldc:int(578284441))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1478:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_635 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1489:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0659)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1048461138))
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(2131214581))
                        var_17_635 = add:int(var_16_10F:int, and:int(ldc:int(2307), ldc:int(657)))
                        looporswitchbreak()
                    }
                    
                    var_3_62A = and:int(var_3_62A:int, ldc:int(118509318))
                }
                
                var_3_62A = and:int(var_3_62A:int, ldc:int(1899973551))
                
                if (cmple:boolean(var_5_80 = var_17_635:int, sub:int(var_6_87:int, and:int(ldc:int(21507), ldc:int(8201))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
