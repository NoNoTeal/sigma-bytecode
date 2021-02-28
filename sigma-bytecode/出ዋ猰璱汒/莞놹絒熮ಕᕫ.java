public abstract class \u51fa\u12cb\u7330\u74b1\u6c52.\u839e\ub1b9\u7d52\u71ae\u0c95\u156b {
    public void \u839e\ub1b9\u7d52\u71ae\u0c95\u156b(java.lang.String p0) {
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
            invokespecial:\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf(\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf::<init>, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b)
            putfield:Set<Integer>(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u62da\u446c\u34df\u7049\u6b0d\u7c6b, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, initobject:HashSet<Integer>[expected:Set<Integer>](HashSet<E>::<init>))
            putfield:Map<Byte, Integer>(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u72f1\uae5d\ub6ab\ud217\u7d52\u873d, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, initobject:HashMap<Byte, Integer>[expected:Map<Byte, Integer>](HashMap<K, V>::<init>))
            putfield:String(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u4c04\u7043\u2dcc\ufcaf\uae87\u416d, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ud7e8\u600f\u72f1\u7d52\u8709\ud158 \u5654\u4975\u7049\u8350\u88c5\u759a(java.lang.String p0) {
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
    
    public byte \uf94d\ub1b9\ub70c\u4975\u156b\ub113(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9 p0) {
        var_2_82 : int
        var_4_67 : int
        
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
            var_2_82 = and:int(ldc:int(907888259), ldc:int(-207939674))
            var_4_67 = and:int(ldc:int(-18165), ldc:int(16628))
            
            if (invokevirtual:boolean(String::equals, invokevirtual:String(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u3bc9\ud158\u71f1\u71ae\ub7dc\ub32d, p0:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9, ldc:String("east")), ldc:String[expected:Object]("true"))) {
                var_4_67 = i2b:byte(or:int(var_4_67:int, and:int(ldc:int(9223), ldc:int(4609))))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_82:int, ldc:int(16)), ldc:int(0))) {
                    var_2_82 = and:int(var_2_82:int, ldc:int(1857691639))
                    goto(Label_0201)
                }
                
                if (cmpne:boolean(and:int(var_2_82:int, ldc:int(2)), ldc:int(0))) {
                    var_2_82 = and:int(var_2_82:int, ldc:int(1987698687))
                    
                    if (invokevirtual:boolean(String::equals, invokevirtual:String(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u3bc9\ud158\u71f1\u71ae\ub7dc\ub32d, p0:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9, ldc:String("north")), ldc:String[expected:Object]("true"))) {
                        var_4_67 = i2b:byte(or:int(var_4_67:int, xor:int(ldc:int(1124), ldc:int(1126))))
                    }
                }
                
                Label_0160:
                
                if (cmpeq:boolean(and:int(var_2_82:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_82:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_82 = and:int(var_2_82:int, ldc:int(1912952590))
                        loopcontinue()
                    }
                    
                    var_2_82 = and:int(var_2_82:int, ldc:int(1052579791))
                    
                    if (invokevirtual:boolean(String::equals, invokevirtual:String(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u3bc9\ud158\u71f1\u71ae\ub7dc\ub32d, p0:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9, ldc:String("south")), ldc:String[expected:Object]("true"))) {
                        var_4_67 = i2b:byte(or:int(var_4_67:int, xor:int(ldc:int(25090), ldc:int(25094))))
                    }
                }
                
                Label_0201:
                
                if (cmpne:boolean(and:int(var_2_82:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0160)
                }
                
                if (cmpeq:boolean(and:int(var_2_82:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_82 = and:int(var_2_82:int, ldc:int(-456758068))
            }
            
            if (invokevirtual:boolean(String::equals, invokevirtual:String(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u3bc9\ud158\u71f1\u71ae\ub7dc\ub32d, p0:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9, ldc:String("west")), ldc:String[expected:Object]("true"))) {
                var_4_67 = i2b:byte(or:int(var_4_67:int, ldc:int(8)))
            }
            
            return:byte(var_4_67:int)
        }
        
        goto(Label_0006)
    }
    
    public byte \uf94d\ub1b9\ub70c\u4975\u156b\ub113(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a p1, int p2) {
        var_4_61 : int
        var_6_6A : int
        stack_9F_0 : int [generated]
        var_4_D8 : int
        var_7_9F : int
        
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
            var_4_61 = and:int(ldc:int(-972879465), ldc:int(1857871290))
            var_6_6A = and:int(ldc:int(21812), ldc:int(-21877))
            
            if (cmpge:boolean(invokevirtual:int(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u7d52\u8aa5\u5fe1\u4daf\u4cd9\ub32d, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)), invokevirtual:int(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u927d\u8350\u93a2\u5f50\uf94d\ub6ab, getstatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u983f\u4179\ua068\ubded\ub32d\uc2bd)))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(639825840))
                stack_9F_0 = and:int(ldc:int(24601), ldc:int(-24602))
            }
            else {
                stack_9F_0 = xor:int(ldc:int(768), ldc:int(769))
            }
            
            var_4_D8 = and:int(var_4_61:int, ldc:int(267981273))
            var_7_9F = stack_9F_0:int
            
            if (invokevirtual:boolean(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u69d9\u64f2\u4daf\ub83f\ubefe\u4c04, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\u120d\ubb2b\u6ec6\uc7fe\uc29a\uafe7), invokevirtual:int(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\uc910\u3dd3\u56bd\ua562\ubff1\ud217, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u6cfe\u7049\u8389\ucfaf\ube23\u9033, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\u120d\ubb2b\u6ec6\uc7fe\uc29a\uafe7))), var_7_9F:boolean)) {
                var_6_6A = i2b:byte(or:int(var_6_6A:int, xor:int(ldc:int(-24571), ldc:int(-24572))))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_D8:int, ldc:int(262144)), ldc:int(0))) {
                    var_4_D8 = and:int(var_4_D8:int, ldc:int(-925659070))
                    goto(Label_0309)
                }
                
                if (cmpeq:boolean(and:int(var_4_D8:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_D8 = and:int(var_4_D8:int, ldc:int(1602772978))
                    
                    if (invokevirtual:boolean(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u69d9\u64f2\u4daf\ub83f\ubefe\u4c04, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\ua61f\u4daf\ufe34\u071d\u7af6\u7330), invokevirtual:int(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\uc910\u3dd3\u56bd\ua562\ubff1\ud217, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u6cfe\u7049\u8389\ucfaf\ube23\u9033, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\ua61f\u4daf\ufe34\u071d\u7af6\u7330))), var_7_9F:boolean)) {
                        var_6_6A = i2b:byte(or:int(var_6_6A:int, xor:int(ldc:int(27649), ldc:int(27651))))
                    }
                }
                
                Label_0242:
                
                if (cmpne:boolean(and:int(var_4_D8:int, ldc:int(32)), ldc:int(0))) {
                    var_4_D8 = and:int(var_4_D8:int, ldc:int(1977744841))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_D8:int, ldc:int(16)), ldc:int(0))) {
                        var_4_D8 = and:int(var_4_D8:int, ldc:int(-1183845853))
                        loopcontinue()
                    }
                    
                    var_4_D8 = and:int(var_4_D8:int, ldc:int(1061140887))
                    
                    if (invokevirtual:boolean(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u69d9\u64f2\u4daf\ub83f\ubefe\u4c04, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\ub70c\uc910\u8d90\u62da\u6d99\uc910), invokevirtual:int(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\uc910\u3dd3\u56bd\ua562\ubff1\ud217, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u6cfe\u7049\u8389\ucfaf\ube23\u9033, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\ub70c\uc910\u8d90\u62da\u6d99\uc910))), var_7_9F:boolean)) {
                        var_6_6A = i2b:byte(or:int(var_6_6A:int, xor:int(ldc:int(-32767), ldc:int(-32763))))
                    }
                }
                
                Label_0309:
                
                if (cmpne:boolean(and:int(var_4_D8:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0242)
                }
                
                if (cmpeq:boolean(and:int(var_4_D8:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (invokevirtual:boolean(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u69d9\u64f2\u4daf\ub83f\ubefe\u4c04, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\u4daf\u8753\u3504\u8389\u983f\u5fe1), invokevirtual:int(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\uc910\u3dd3\u56bd\ua562\ubff1\ud217, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u6cfe\u7049\u8389\ucfaf\ube23\u9033, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\u4daf\u8753\u3504\u8389\u983f\u5fe1))), var_7_9F:boolean)) {
                var_6_6A = i2b:byte(or:int(var_6_6A:int, ldc:int(8)))
            }
            
            return:byte(var_6_6A:byte)
        }
        
        goto(Label_0006)
    }
    
    public int \uc910\u3dd3\u56bd\ua562\ubff1\ud217(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a p1) {
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
            return:int(invokevirtual:int(\ub70c\u92ee\u3e2a\ub70c\ud4fe\u0c95::\u7049\u4c04\u12b2\u88c5\u600f\ub6ab, getstatic:\ub70c\u92ee\u3e2a\ub70c\ud4fe\u0c95(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\uc9f6\u72f1\u0800\u3c25\u2dcc\u40a9), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, invokespecial:int(\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf::\uc910\u3dd3\u56bd\ua562\ubff1\ud217, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b[expected:\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf], p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a)))
        }
        
        goto(Label_0006)
    }
    
    public int \u7049\u4c04\u12b2\u88c5\u600f\ub6ab(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a p1, int p2) {
        var_4_61 : int
        var_6_79 : Integer
        stack_9B_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(-1702095746), ldc:int(-1384310657))
            var_6_79 = checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Map<Byte, Integer>::get, getfield:Map<Byte, Integer>(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u72f1\uae5d\ub6ab\ud217\u7d52\u873d, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b), invokestatic:Byte[expected:Object](Byte::valueOf, invokevirtual:byte(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\uf94d\ub1b9\ub70c\u4975\u156b\ub113, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, p2:int))))
            
            if (cmpne:boolean(var_6_79:Integer, aconstnull:Integer())) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1731351299))
                stack_9B_0 = invokevirtual:int(Integer::intValue, var_6_79:Integer)
            }
            else {
                stack_9B_0 = p2:int
            }
            
            return:int(stack_9B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u69d9\u64f2\u4daf\ub83f\ubefe\u4c04(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e p0, int p1, boolean p2) {
        var_4_80 : int
        var_4_A0 : int
        var_6_AE : \u4daf\u88c5\uae5d\u960f\uceb8\u6b5f
        stack_109_0 : int [generated]
        
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
        var_4_80 = and:int(ldc:int(1002514146), ldc:int(1072387826))
        
        if (invokeinterface:boolean(Set<E>::contains, getfield:Set<Integer>(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u62da\u446c\u34df\u7049\u6b0d\u7c6b, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))) {
            return:boolean(xor:int[expected:boolean](ldc:int(16532), ldc:int(16533)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_4_80:int, ldc:int(2097152)), ldc:int(0))) {
                var_4_80 = and:int(var_4_80:int, ldc:int(-6651969))
                
                if (cmpeq:boolean(getfield:String(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u4c04\u7043\u2dcc\ufcaf\uae87\u416d, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b), aconstnull:String())) {
                    return:boolean(and:int[expected:boolean](ldc:int(4834), ldc:int(-15083)))
                }
            }
            
            if (cmpne:boolean(and:int(var_4_80:int, ldc:int(128)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_80:int, ldc:int(-1209997642))
                var_6_AE = checkcast:\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f(\u36d3\u9033\u6b0d\u983f\u8d90.\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f.class, invokeinterface:Object[expected:\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f](Int2ObjectMap::get, getstatic:Int2ObjectMap<\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f>(\uc87f\u69d9\u7d52\u40a9\u64f2\u3d64::\u76bc\u4daf\u8cae\u93a2\u0b8e\u7ce1), p1:int))
                
                if (logicaland:boolean(cmpne:boolean(var_6_AE:\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f, aconstnull:\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f()), invokevirtual:boolean(\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f::\u4975\u34df\uc87f\u3d4b\u7ce1\ucb79, var_6_AE:\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f, getfield:String(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u4c04\u7043\u2dcc\ufcaf\uae87\u416d, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b), invokevirtual:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\u71ae\u74b1\ubcb0\u61a4\u071d\ub113, p0:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e), p2:boolean))) {
                    stack_109_0 = xor:int(ldc:int(17984), ldc:int(17985))
                }
                else {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-7907341))
                    stack_109_0 = and:int(ldc:int(-21053), ldc:int(20540))
                }
                
                return:boolean(stack_109_0:int)
            }
            
            var_4_80 = and:int(var_4_80:int, ldc:int(-550072847))
        }
    }
    
    public java.util.Set<java.lang.Integer> \u600f\u6fb0\u983f\uafe7\u8aa5\ub171() {
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
            return:Set<Integer>(getfield:Set<Integer>(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u62da\u446c\u34df\u7049\u6b0d\u7c6b, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub7dc\u7330\u3e75\u156b\u9937\u9033$0(java.lang.String p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u839e\ub1b9\u7d52\u71ae\u0c95\u156b p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9 p2) {
        var_4_63 : int
        
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
            var_4_63 = and:int(ldc:int(-367545294), ldc:int(-677924933))
            
            if (invokevirtual:boolean(String::equals, p0:String, invokevirtual:String[expected:Object](\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u61a4\ud36e\u446c\u8350\u3bd6\uc3e3, p2:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9))) {
                if (logicaland:boolean(invokevirtual:boolean(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u5f50\u6d69\u61a4\u4f4a\ucb79\u47c2, p2:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9, ldc:String("waterlogged")), invokevirtual:boolean(String::equals, invokevirtual:String(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u3bc9\ud158\u71f1\u71ae\ub7dc\ub32d, p2:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9, ldc:String("waterlogged")), ldc:String[expected:Object]("true")))) {
                    return:void()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-1955092905))
                invokeinterface:boolean(Set<Integer>::add, getfield:Set<Integer>(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u62da\u446c\u34df\u7049\u6b0d\u7c6b, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u40a9\ud523\u120d\uc7fe\u6d99\u0b8e, p2:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9)))
                invokeinterface:Object(Int2ObjectMap::put, getstatic:Int2ObjectMap<\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf>(\uc87f\u69d9\u7d52\u40a9\u64f2\u3d64::\ud171\u9af2\u9a18\u59ec\u8350\u718f), invokevirtual:int(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u40a9\ud523\u120d\uc7fe\u6d99\u0b8e, p2:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9), p1:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b[expected:Object])
                invokeinterface:Integer(Map<Byte, Integer>::put, getfield:Map<Byte, Integer>(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\u72f1\uae5d\ub6ab\ud217\u7d52\u873d, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b), invokestatic:Byte(Byte::valueOf, invokevirtual:byte(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\uf94d\ub1b9\ub70c\u4975\u156b\ub113, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b, p2:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9)), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u40a9\ud523\u120d\uc7fe\u6d99\u0b8e, p2:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9)))
            }
            
            return:void()
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
            putstatic:\ub70c\u92ee\u3e2a\ub70c\ud4fe\u0c95(\u839e\ub1b9\u7d52\u71ae\u0c95\u156b::\uc9f6\u72f1\u0800\u3c25\u2dcc\u40a9, initobject:\ub70c\u92ee\u3e2a\ub70c\ud4fe\u0c95(\ub70c\u92ee\u3e2a\ub70c\ud4fe\u0c95::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\ua61f\ucef1\u156b\ud171\uc84e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68A : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_695 : int
        
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
        var_3_68A = and:int(ldc:int(-1874199280), ldc:int(-515113479))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\ub1b9\u7d52\u71ae\u0c95\u156b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(1689219390))
        }
        else {
            var_3_68A = and:int(var_3_68A:int, ldc:int(-1126056962))
            var_5_89 = and:int(ldc:int(-3612), ldc:int(1563))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21776), ldc:int(21773)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_68A:int, ldc:int(-305398851))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(26688), ldc:int(26689)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(24579), ldc:int(24578)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_68A = and:int(var_3_E2:int, ldc:int(-1948140612))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(17537), ldc:int(17536)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1481108403))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-835732384))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1922673608))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1711476541))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1337852077))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1284041806))
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1896519488))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1903337273))
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1496700177))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1719879548))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1150567951))
                            var_11_F3 = and:int(ldc:int(-7572), ldc:int(3219))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0590:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(446144991))
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1756607033))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1799227082))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1764766393))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(261699503))
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1619007857))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(504388556))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1673459141))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1856128803))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-982402593))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(247791601))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1524287139))
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-630115239))
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1239740112))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(784397231))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1991376997))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(4577), ldc:int(18451))
                                goto(Label_1148)
                            }
                        }
                    }
                    
                    Label_0972:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(104609057))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1441876197))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-493948387))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-655893645))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1318337681))
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1018202058))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1770930927))
                        var_11_F3 = and:int(ldc:int(1660), ldc:int(-1661))
                    }
                    
                    Label_1148:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1999064113))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-924895777))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-273051661))
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(113210134))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1192102049))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-764821607))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1421)
                            }
                        }
                    }
                    
                    Label_1277:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1137982247))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1998258665))
                            goto(Label_1148)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-730256126))
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1405160140))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(2068890781))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1695940642))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                        goto(Label_1562)
                    }
                    
                    Label_1421:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1737603283))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2018321787))
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1856360275))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1576644338))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1769837710))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68A = and:int(var_3_68A:int, ldc:int(-162152513))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_695 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(276763824))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(347399353))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(177525704))
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-2031372005))
                        var_17_695 = add:int(var_16_121:int, xor:int(ldc:int(-20416), ldc:int(-20415)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68A = and:int(var_3_68A:int, ldc:int(-1949958178))
                
                if (cmple:boolean(var_5_89 = var_17_695:int, sub:int(var_6_90:int, and:int(ldc:int(12829), ldc:int(16577))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(-817355181))
            goto(Label_0108)
        }
    }
}
