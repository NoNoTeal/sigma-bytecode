public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u4c04\u7330\uc3e3\u4492\uae87 {
    public void \u4c04\u7330\uc3e3\u4492\uae87() {
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
            invokespecial:Object(Object::<init>, this:\u4c04\u7330\uc3e3\u4492\uae87)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<java.lang.String> \ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e(java.io.File p0, java.util.Map<java.lang.String, java.lang.String[]> p1) {
        var_2_5F : int
        var_4_67 : List
        var_5_70 : Iterator<String>
        var_6_B4 : String
        var_7_FB : String[]
        
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
            var_2_5F = and:int(ldc:int(594007074), ldc:int(-1543540425))
            var_4_67 = invokestatic:List(Files::readLines, p0:File, getstatic:Charset(StandardCharsets::UTF_8))
            var_5_70 = invokeinterface:Iterator<String>(List<String>::iterator, var_4_67:List<String>)
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-761080130))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1275626887))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_70:Iterator<String>)) {
                        var_6_B4 = invokevirtual:String(String::trim, checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_70:Iterator<String>)))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_6_B4:String, loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(31874), ldc:int(-31971)))))) {
                            if (cmpge:boolean(invokevirtual:int(String::length, var_6_B4:String), xor:int(ldc:int(12), ldc:int(13)))) {
                                var_7_FB = invokevirtual:String[](String::split, var_6_B4:String, loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(10241), ldc:int(16561))))
                                invokeinterface:String[](Map<String, String[]>::put, p1:Map<String, String[]>, invokevirtual:String(String::toLowerCase, loadelement:String(var_7_FB:String[], and:int(ldc:int(9863), ldc:int(-26536))), getstatic:Locale(Locale::ROOT)), var_7_FB:String[])
                            }
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-1284088900))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:List<String>(var_4_67:List<String>)
        }
        
        goto(Label_0006)
    }
    
    private static void \u99f7\uff55\u52d3\ub171\u983f\u97e6(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0, java.util.Collection<java.lang.String> p1, com.mojang.authlib.ProfileLookupCallback p2) {
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
    
    public static boolean \u183a\ufcaf\u6ec6\u2dcc\u4f4a\u071d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
        var_1_4BB : int
        var_3_6F : \uc31c\uff55\u6fb0\u4c04\u8753
        var_4_3BB : HashMap
        var_5_3FE : \u71f1\uf94d\u71ae\u88c5\u4bc8
        stack_4C9_0 : int [generated]
        var_4_536 : \u0c95\u76bc\ub113\u965f\u8389
        
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
            var_1_4BB = and:int(and:int(ldc:int(-1715955848), ldc:int(-136796887)), ldc:int(1039711677))
            var_3_6F = initobject:\uc31c\uff55\u6fb0\u4c04\u8753(\uc31c\uff55\u6fb0\u4c04\u8753::<init>, getstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe))
            
            loop {
                Label_0112:
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(2029036836))
                    goto(Label_0849)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0704)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0623)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(702646383))
                    goto(Label_0527)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(8)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(621894286))
                    goto(Label_0414)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0319)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(8)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1439887851))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0199:
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1227400613))
                    goto(Label_0849)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1736925231))
                    goto(Label_0704)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(2)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1731885069))
                    goto(Label_0623)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1254289993))
                    goto(Label_0527)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(8)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(-150985635))
                    goto(Label_0414)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1889843515))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1778588306))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::isFile, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0319:
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0849)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(2)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1425733742))
                    goto(Label_0704)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(32)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(550380542))
                    goto(Label_0623)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0527)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(330269800))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-950227401))
                        goto(Label_0199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1442426860))
                }
                
                Label_0414:
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(2087569742))
                    goto(Label_0849)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1379957608))
                    goto(Label_0704)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1313213689))
                    goto(Label_0623)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-2002489607))
                        goto(Label_0319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0199)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1187268088))
                        loopcontinue()
                    }
                    
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(-208153736))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, invokevirtual:File(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc87f\u6c52\u2dcc\u3e75\u5f50\u7d52, var_3_6F:\uc31c\uff55\u6fb0\u4c04\u8753[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \ucef1\u4c2b\uc229\u7ce1\ud158>])))) {
                        goto(Label_0849)
                    }
                }
                
                Label_0527:
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(4)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1224487262))
                    goto(Label_0849)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(-98732292))
                    goto(Label_0704)
                }
                
                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1499571266))
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0319)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0199)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-2126604519))
                        loopcontinue()
                    }
                    
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(433184187))
                }
                
                try {
                    Label_0623:
                    
                    while (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(2147483647)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_0527)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(256)), ldc:int(0))) {
                                goto(Block_45)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(8)), ldc:int(0))) {
                                goto(Block_46)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_0199)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(256)), ldc:int(0))) {
                                loopcontinue(Label_0112)
                            }
                            
                            var_1_4BB = and:int(var_1_4BB:int, ldc:int(1979357544))
                            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\ubcb0\u12b2\u97e6\u3bd6\u9a18\u8cae, var_3_6F:\uc31c\uff55\u6fb0\u4c04\u8753[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \ucef1\u4c2b\uc229\u7ce1\ud158>])
                        }
                        
                        Label_0704:
                        
                        if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(32768)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0728)
                        }
                        
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1084959675))
                    }
                    
                    goto(Label_0849)
                    Block_45:
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(2135988353))
                    goto(Label_0414)
                    Block_46:
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1648149589))
                    goto(Label_0319)
                    Label_0728:
                    
                    if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(659177609))
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0319)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-607768))
                        goto(Label_0849)
                    }
                    
                    loopcontinue()
                }
                catch (java.io.IOException stack_314_0) {
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1000220176))
                    goto(Label_1293)
                }
                
                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1232)
                }
                
                var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1856379015))
                invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(28704), ldc:int(28706))), invokevirtual:String[expected:Object](File::getName, invokevirtual:File(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc87f\u6c52\u2dcc\u3e75\u5f50\u7d52, var_3_6F:\uc31c\uff55\u6fb0\u4c04\u8753[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \ucef1\u4c2b\uc229\u7ce1\ud158>])), var_4_3BB:HashMap[expected:Object])
                
                try {
                    Label_0849:
                    
                    if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(809143665))
                        goto(Label_0623)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(1830777586))
                        goto(Label_0527)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(741982044))
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(4)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(2067520530))
                        goto(Label_0319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1468893034))
                        goto(Label_0199)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(256)), ldc:int(0))) {
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(933079338))
                        var_4_3BB = invokestatic:HashMap(Maps::newHashMap)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1086714635))
                            }
                            else {
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(1073004863))
                                invokestatic:List<String>(\u4c04\u7330\uc3e3\u4492\uae87::\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229), var_4_3BB:HashMap<String, String[]>[expected:Map<String, String[]>])
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(128)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_4BB = and:int(var_1_4BB:int, ldc:int(2127514988))
                        }
                        
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1814068228))
                        var_5_3FE = initobject:\u71f1\uf94d\u71ae\u88c5\u4bc8(\u71f1\uf94d\u71ae\u88c5\u4bc8::<init>, p0:\u88c5\ud171\ub113\u6435\ud51e, var_4_3BB:HashMap<Object, Object>[expected:Map], var_3_6F:\uc31c\uff55\u6fb0\u4c04\u8753)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_1175)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1676074958))
                                goto(Label_1123)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(16384)), ldc:int(0))) {
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(352827286))
                            }
                            else {
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1720155153))
                                invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\u99f7\uff55\u52d3\ub171\u983f\u97e6, p0:\u88c5\ud171\ub113\u6435\ud51e, invokeinterface:Set<Object>[expected:Collection<String>](Map<Object, Object>::keySet, var_4_3BB:HashMap<Object, Object>[expected:Map<Object, Object>]), var_5_3FE:ProfileLookupCallback)
                            }
                            
                            Label_1083:
                            
                            if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(2113847489))
                                goto(Label_1175)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(67108864)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_4BB:int, ldc:int(33554432)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(1541177663))
                                invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc2bd\ub8be\ud36e\ub171\u3711\uc229, var_3_6F:\uc31c\uff55\u6fb0\u4c04\u8753[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \ucef1\u4c2b\uc229\u7ce1\ud158>])
                            }
                            
                            Label_1123:
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(128)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1367233277))
                                    goto(Label_1083)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(8)), ldc:int(0))) {
                                    var_1_4BB = and:int(var_1_4BB:int, ldc:int(1507491062))
                                    loopcontinue()
                                }
                                
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(1601557308))
                                invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\ud7e8\u7006\u9af2\u9255\u5bc4\u59ec, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229))
                            }
                            
                            Label_1175:
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_1123)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(8)), ldc:int(0))) {
                                var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1906814002))
                                goto(Label_1083)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_4BB:int, ldc:int(262144)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(-1286491266))
                        stack_4C9_0 = and:int(ldc:int(45), ldc:int(10241))
                        var_1_4BB = and:int(var_1_4BB:int, ldc:int(2105400686))
                        return:boolean(stack_4C9_0:int)
                    }
                    
                    loopcontinue()
                }
                catch (java.io.IOException stack_4CE_0) {
                }
                catch (\u59ec\u8413\u97e6\uc229\u3776.\u0c95\u76bc\ub113\u965f\u8389 var_4_536) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(17414), ldc:int(37))), var_4_536:\u0c95\u76bc\ub113\u965f\u8389[expected:Throwable])
                    return:boolean(and:int[expected:boolean](ldc:int(3719), ldc:int(-3752)))
                }
                
                looporswitchbreak()
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(-32380), ldc:int(-32379)))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ufcaf\ubf56\uc246\u3711\u5140\uc238(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
        var_1_449 : int
        var_3_72 : \u3d4b\uc4d2\u9937\u98a4\u6198
        var_4_393 : HashMap
        var_5_3D7 : Iterator<String>
        var_6_454 : String
        var_7_468 : String[]
        stack_4B4_0 : Date [generated]
        stack_59E_0 : int [generated]
        
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
            var_1_449 = and:int(and:int(ldc:int(-18017489), ldc:int(1607302962)), ldc:int(1592755052))
            var_3_72 = initobject:\u3d4b\uc4d2\u9937\u98a4\u6198(\u3d4b\uc4d2\u9937\u98a4\u6198::<init>, getstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u416d\u3e2a\u4975\u3a62\u8df4\u7049))
            
            loop {
                Label_0115:
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(613866636))
                    goto(Label_0807)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0688)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0598)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(-351685576))
                    goto(Label_0511)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(1397962677))
                    goto(Label_0414)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(1035073832))
                    goto(Label_0317)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(1609893675))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u600f\u416d\uae5d\ud158\u8d90\u7049)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0219:
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(512)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(857970730))
                    goto(Label_0807)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0688)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(128)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(-400703854))
                    goto(Label_0598)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0511)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(-1300191719))
                    goto(Label_0414)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_449 = and:int(var_1_449:int, ldc:int(-540582030))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::isFile, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u600f\u416d\uae5d\ud158\u8d90\u7049)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0317:
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(851305952))
                    goto(Label_0807)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0688)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(512)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(-1019530648))
                    goto(Label_0598)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0511)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(-1375348688))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(-683245179))
                        loopcontinue()
                    }
                    
                    var_1_449 = and:int(var_1_449:int, ldc:int(-540735629))
                }
                
                Label_0414:
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(-378534437))
                    goto(Label_0807)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0688)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0598)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0317)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(32)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(989915899))
                        goto(Label_0219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(-703662841))
                        loopcontinue()
                    }
                    
                    var_1_449 = and:int(var_1_449:int, ldc:int(-3171331))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, invokevirtual:File(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc87f\u6c52\u2dcc\u3e75\u5f50\u7d52, var_3_72:\u3d4b\uc4d2\u9937\u98a4\u6198[expected:\u9937\u7049\ubefe\u3bc9\u446c<String, \ud51e\u494c\uc910\u3e75\u34df>])))) {
                        goto(Label_0807)
                    }
                }
                
                Label_0511:
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0807)
                }
                
                if (cmpne:boolean(and:int(var_1_449:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(-766502223))
                    goto(Label_0688)
                }
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(67019500))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0317)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_449:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(-148325191))
                        goto(Label_0219)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_449:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_449 = and:int(var_1_449:int, ldc:int(1610567484))
                }
                
                try {
                    Label_0598:
                    
                    while (cmpne:boolean(and:int(var_1_449:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_449:int, ldc:int(33554432)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_0511)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0414)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(134217728)), ldc:int(0))) {
                                var_1_449 = and:int(var_1_449:int, ldc:int(-1491743615))
                                goto(Label_0317)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_449:int, ldc:int(32768)), ldc:int(0))) {
                                var_1_449 = and:int(var_1_449:int, ldc:int(316046990))
                                goto(Label_0219)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(65536)), ldc:int(0))) {
                                loopcontinue(Label_0115)
                            }
                            
                            var_1_449 = and:int(var_1_449:int, ldc:int(1592638463))
                            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\ubcb0\u12b2\u97e6\u3bd6\u9a18\u8cae, var_3_72:\u3d4b\uc4d2\u9937\u98a4\u6198)
                        }
                        
                        Label_0688:
                        
                        if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(512)), ldc:int(0))) {
                            var_1_449 = and:int(var_1_449:int, ldc:int(-321880227))
                            goto(Label_0511)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0317)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_449:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0219)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_1_449 = and:int(var_1_449:int, ldc:int(1608452067))
                            goto(Label_0807)
                        }
                        
                        loopcontinue(Label_0115)
                    }
                    
                    var_1_449 = and:int(var_1_449:int, ldc:int(-22254768))
                    goto(Label_0807)
                }
                catch (java.io.IOException stack_2FB_0) {
                }
                
                Label_0765:
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1445)
                }
                
                var_1_449 = and:int(var_1_449:int, ldc:int(1607953249))
                invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(1155), ldc:int(294))), invokevirtual:String[expected:Object](File::getName, invokevirtual:File(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc87f\u6c52\u2dcc\u3e75\u5f50\u7d52, var_3_72:\u9937\u7049\ubefe\u3bc9\u446c<K, \ud51e\u494c\uc910\u3e75\u34df>)), var_4_393:HashMap[expected:Object])
                
                try {
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(-1576126373))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(-1257955720))
                        goto(Label_0598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(-682376455))
                        goto(Label_0511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(512)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(1069695729))
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_449:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0317)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_449:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(512)), ldc:int(0))) {
                        var_1_449 = and:int(var_1_449:int, ldc:int(-979903450))
                        loopcontinue()
                    }
                    
                    var_1_449 = and:int(var_1_449:int, ldc:int(2146271101))
                    var_4_393 = invokestatic:HashMap(Maps::newHashMap)
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_449 = and:int(var_1_449:int, ldc:int(780811211))
                        }
                        else {
                            var_1_449 = and:int(var_1_449:int, ldc:int(2145888243))
                            invokestatic:List<String>(\u4c04\u7330\uc3e3\u4492\uae87::\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u600f\u416d\uae5d\ud158\u8d90\u7049), var_4_393:HashMap<String, String[]>[expected:Map<String, String[]>])
                        }
                        
                        if (cmpne:boolean(and:int(var_1_449:int, ldc:int(134217728)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_449 = and:int(var_1_449:int, ldc:int(290483670))
                    }
                    
                    var_1_449 = and:int(var_1_449:int, ldc:int(1607418729))
                    var_5_3D7 = invokeinterface:Iterator<String>(Set<String>::iterator, invokeinterface:Set<String>(Map<String, V>::keySet, var_4_393:HashMap<String, V>[expected:Map<String, V>]))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(8388608)), ldc:int(0))) {
                            var_1_449 = and:int(var_1_449:int, ldc:int(-1428697787))
                            goto(Label_1344)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_449:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_449 = and:int(var_1_449:int, ldc:int(-1136224327))
                        }
                        else {
                            var_1_449 = and:int(var_1_449:int, ldc:int(2144705461))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_3D7:Iterator))) {
                                invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc2bd\ub8be\ud36e\ub171\u3711\uc229, var_3_72:\u3d4b\uc4d2\u9937\u98a4\u6198)
                                goto(Label_1344)
                            }
                        }
                        
                        Label_1043:
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_449 = and:int(var_1_449:int, ldc:int(1726853339))
                            goto(Label_1396)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_449:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_449 = and:int(var_1_449:int, ldc:int(151738187))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_449 = and:int(var_1_449:int, ldc:int(-95964812))
                                loopcontinue()
                            }
                            
                            var_1_449 = and:int(var_1_449:int, ldc:int(1591055353))
                            var_6_454 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_3D7:Iterator<String>))
                            var_1_449 = and:int(var_1_449:int, ldc:int(1610448742))
                            var_7_468 = checkcast:String[](java.lang.String[].class, invokeinterface:String[](Map<K, String[]>::get, var_4_393:HashMap<K, String[]>[expected:Map<K, String[]>], var_6_454:String[expected:Object]))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_449 = and:int(var_1_449:int, ldc:int(-553835532))
                                    
                                    if (cmple:boolean(arraylength:int(var_7_468:String[]), and:int(ldc:int(12387), ldc:int(3345)))) {
                                        stack_4B4_0 = aconstnull:Date()
                                        looporswitchbreak()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(2048)), ldc:int(0))) {
                                    var_1_449 = and:int(var_1_449:int, ldc:int(-20099086))
                                    stack_4B4_0 = invokestatic:Date(\u4c04\u7330\uc3e3\u4492\uae87::\ub83f\u72f1\u836c\ucfaf\u51fa\u8753, loadelement:String(var_7_468:String[], and:int(ldc:int(8675), ldc:int(13))), checkcast:Date(java.util.Date.class, aconstnull:Date()))
                                    looporswitchbreak()
                                }
                                
                                var_1_449 = and:int(var_1_449:int, ldc:int(1711725422))
                            }
                            
                            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, \ud51e\u494c\uc910\u3e75\u34df>::\ud36e\u7330\u67d0\u8389\ub171\u647c, var_3_72:\u9937\u7049\ubefe\u3bc9\u446c<K, \ud51e\u494c\uc910\u3e75\u34df>, initobject:\ud51e\u494c\uc910\u3e75\u34df(\ud51e\u494c\uc910\u3e75\u34df::<init>, var_6_454:String, stack_4B4_0:Date, ternaryop:String(cmpgt:boolean(arraylength:int(var_7_468:String[]), xor:int(ldc:int(93), ldc:int(95))), loadelement:String(var_7_468:String[], xor:int(ldc:int(1), ldc:int(3))), aconstnull:String()), ternaryop:Date(cmpgt:boolean(arraylength:int(var_7_468:String[]), and:int(ldc:int(3), ldc:int(1195))), invokestatic:Date(\u4c04\u7330\uc3e3\u4492\uae87::\ub83f\u72f1\u836c\ucfaf\u51fa\u8753, loadelement:String(var_7_468:String[], xor:int(ldc:int(3714), ldc:int(3713))), checkcast:Date(java.util.Date.class, aconstnull:Date())), aconstnull:Date()), ternaryop:String(cmpgt:boolean(arraylength:int(var_7_468:String[]), and:int(ldc:int(7972), ldc:int(68))), loadelement:String(var_7_468:String[], xor:int(ldc:int(387), ldc:int(391))), aconstnull:String())))
                            loopcontinue()
                        }
                        
                        Label_1344:
                        
                        if (cmpne:boolean(and:int(var_1_449:int, ldc:int(65536)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_449 = and:int(var_1_449:int, ldc:int(617439205))
                                goto(Label_1043)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_449 = and:int(var_1_449:int, ldc:int(-1672149061))
                                loopcontinue()
                            }
                            
                            var_1_449 = and:int(var_1_449:int, ldc:int(1590124538))
                            invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\ud7e8\u7006\u9af2\u9255\u5bc4\u59ec, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u600f\u416d\uae5d\ud158\u8d90\u7049))
                        }
                        
                        Label_1396:
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1344)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(8192)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_1_449 = and:int(var_1_449:int, ldc:int(1593249578))
                    stack_59E_0 = xor:int(ldc:int(8338), ldc:int(8339))
                    var_1_449 = and:int(var_1_449:int, ldc:int(1591599019))
                    return:boolean(stack_59E_0:int)
                }
                catch (java.io.IOException stack_5A3_0) {
                }
                
                Label_1445:
                
                if (cmpeq:boolean(and:int(var_1_449:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_449 = and:int(var_1_449:int, ldc:int(52807778))
                    goto(Label_0765)
                }
                
                invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(20485), ldc:int(2061))), var_4_393:Throwable)
                return:boolean(and:int[expected:boolean](ldc:int(13888), ldc:int(-13889)))
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(1410), ldc:int(1411)))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \uae87\uceb8\ubf56\u6ec6\u59ec\u36d3(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
        var_1_2FF : int
        var_3_72 : \ub113\u1833\u392e\ubf56\u97e6
        var_4_370 : List
        var_5_381 : \u927d\u8389\ud7e8\u3d4b\u59ec
        stack_445_0 : int [generated]
        var_4_4B1 : \u0c95\u76bc\ub113\u965f\u8389
        
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
            var_1_2FF = and:int(and:int(ldc:int(844203143), ldc:int(-1280312077)), ldc:int(1052101939))
            var_3_72 = initobject:\ub113\u1833\u392e\ubf56\u97e6(\ub113\u1833\u392e\ubf56\u97e6::<init>, getstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\ub102\u0c95\u8d98\u6435\ud158\u960f))
            
            loop {
                Label_0115:
                
                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0805)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0651)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0559)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0463)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0368)
                }
                
                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-399785864))
                    goto(Label_0280)
                }
                
                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-205283429))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\uc29a\u1187\ubded\ubf56\ucfaf\ucb79)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0192:
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0805)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0651)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0559)
                }
                
                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-934446639))
                    goto(Label_0463)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1298718222))
                    goto(Label_0368)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-100025081))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::isFile, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\uc29a\u1187\ubded\ubf56\ucfaf\ucb79)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0280:
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-216079254))
                    goto(Label_0805)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0651)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(16)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(879649655))
                    goto(Label_0559)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0463)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(268435456)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(1900757333))
                        loopcontinue()
                    }
                    
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1084115209))
                }
                
                Label_0368:
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0805)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0651)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(8)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-2079884805))
                    goto(Label_0559)
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(-469600840))
                        goto(Label_0192)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(1362563103))
                        loopcontinue()
                    }
                    
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-215249361))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, invokevirtual:File(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc87f\u6c52\u2dcc\u3e75\u5f50\u7d52, var_3_72:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u98a4\ua562\u624e\ud4fe\ubb2b>])))) {
                        goto(Label_0805)
                    }
                }
                
                Label_0463:
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(794943004))
                    goto(Label_0805)
                }
                
                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(2001175967))
                    goto(Label_0651)
                }
                
                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(1520512309))
                        goto(Label_0368)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(-615170303))
                        goto(Label_0280)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0192)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1080711969))
                }
                
                try {
                    Label_0559:
                    
                    while (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_2FF = and:int(var_1_2FF:int, ldc:int(875565825))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(268435456)), ldc:int(0))) {
                                goto(Label_0463)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(16)), ldc:int(0))) {
                                goto(Block_45)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(64)), ldc:int(0))) {
                                goto(Block_46)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(4096)), ldc:int(0))) {
                                goto(Label_0192)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(32768)), ldc:int(0))) {
                                loopcontinue(Label_0115)
                            }
                            
                            var_1_2FF = and:int(var_1_2FF:int, ldc:int(1916261911))
                            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\ubcb0\u12b2\u97e6\u3bd6\u9a18\u8cae, var_3_72:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u98a4\ua562\u624e\ud4fe\ubb2b>])
                        }
                        
                        Label_0651:
                        
                        if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Block_49)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(-136752533))
                    }
                    
                    goto(Label_0805)
                    Block_45:
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(-680734945))
                    goto(Label_0368)
                    Block_46:
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(1947686288))
                    goto(Label_0280)
                    Block_49:
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(47774721))
                    goto(Label_0805)
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0463)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0368)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0280)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0192)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(1)), ldc:int(0))) {
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(1054207991))
                        goto(Label_0805)
                    }
                    
                    loopcontinue()
                }
                catch (java.io.IOException stack_2DF_0) {
                }
                
                if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_1151)
                }
                
                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(2)), ldc:int(0))) {
                    var_1_2FF = and:int(var_1_2FF:int, ldc:int(182590696))
                    goto(Label_1100)
                }
                
                var_1_2FF = and:int(var_1_2FF:int, ldc:int(-98848797))
                invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(8482), ldc:int(10))), invokevirtual:String[expected:Object](File::getName, invokevirtual:File(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc87f\u6c52\u2dcc\u3e75\u5f50\u7d52, var_3_72:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u98a4\ua562\u624e\ud4fe\ubb2b>])), var_4_370:List[expected:Object])
                
                try {
                    Label_0805:
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0651)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0463)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(2054817307))
                        goto(Label_0280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(8)), ldc:int(0))) {
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1229746297))
                        var_4_370 = invokestatic:List(Files::readLines, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\uc29a\u1187\ubded\ubf56\ucfaf\ucb79), getstatic:Charset(StandardCharsets::UTF_8))
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(909236091))
                        var_5_381 = initobject:\u927d\u8389\ud7e8\u3d4b\u59ec(\u927d\u8389\ud7e8\u3d4b\u59ec::<init>, p0:\u88c5\ud171\ub113\u6435\ud51e, var_3_72:\ub113\u1833\u392e\ubf56\u97e6)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1794453398))
                                goto(Label_1033)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(16777216)), ldc:int(0))) {
                                var_1_2FF = and:int(var_1_2FF:int, ldc:int(1534820913))
                                goto(Label_0997)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(64)), ldc:int(0))) {
                                var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1358850439))
                            }
                            else {
                                var_1_2FF = and:int(var_1_2FF:int, ldc:int(1071642203))
                                invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\u99f7\uff55\u52d3\ub171\u983f\u97e6, p0:\u88c5\ud171\ub113\u6435\ud51e, var_4_370:List<String>[expected:Collection<String>], var_5_381:ProfileLookupCallback)
                            }
                            
                            Label_0964:
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_1033)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(512)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(33554432)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1229877601))
                                invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc2bd\ub8be\ud36e\ub171\u3711\uc229, var_3_72:\ub113\u1833\u392e\ubf56\u97e6[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u98a4\ua562\u624e\ud4fe\ubb2b>])
                            }
                            
                            Label_0997:
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(2)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_0964)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(65536)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_2FF = and:int(var_1_2FF:int, ldc:int(858111403))
                                invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\ud7e8\u7006\u9af2\u9255\u5bc4\u59ec, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\uc29a\u1187\ubded\ubf56\ucfaf\ucb79))
                            }
                            
                            Label_1033:
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_2FF = and:int(var_1_2FF:int, ldc:int(-907607584))
                                goto(Label_0997)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_2FF:int, ldc:int(8)), ldc:int(0))) {
                                goto(Label_0964)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_2FF:int, ldc:int(16)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1045521214))
                        }
                        
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(-1098651961))
                        stack_445_0 = and:int(ldc:int(22037), ldc:int(10241))
                        var_1_2FF = and:int(var_1_2FF:int, ldc:int(1006609715))
                        return:boolean(stack_445_0:int)
                    }
                    
                    loopcontinue()
                }
                catch (java.io.IOException stack_44A_0) {
                }
                catch (\u59ec\u8413\u97e6\uc229\u3776.\u0c95\u76bc\ub113\u965f\u8389 var_4_4B1) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(0), ldc:int(4))), var_4_4B1:\u0c95\u76bc\ub113\u965f\u8389[expected:Throwable])
                    return:boolean(and:int[expected:boolean](ldc:int(-8040), ldc:int(6980)))
                }
                
                looporswitchbreak()
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(17552), ldc:int(17553)))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u8df4\ud36e\u3d64\u5140\u5d20\u839e(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
        var_1_317 : int
        var_3_72 : \u71f1\ub18d\u62da\u9255\u7ce1
        var_4_3AE : List
        var_5_3BF : \uf995\uc3e3\uc2e8\u59ec\u4ab3
        stack_47B_0 : int [generated]
        var_4_4E9 : \u0c95\u76bc\ub113\u965f\u8389
        
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
            var_1_317 = and:int(and:int(ldc:int(1271823525), ldc:int(-809806201)), ldc:int(1605105599))
            var_3_72 = initobject:\u71f1\ub18d\u62da\u9255\u7ce1(\u71f1\ub18d\u62da\u9255\u7ce1::<init>, getstatic:File(\ucb79\u8350\u7bad\u392e\u51fa::\u6cfe\u67e9\u6b0d\u3e75\u8709\u98a4))
            
            loop {
                Label_0115:
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-100000052))
                    goto(Label_0837)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0673)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-252895978))
                    goto(Label_0583)
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(512)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(945542139))
                    goto(Label_0495)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-510199486))
                    goto(Label_0396)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0318)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-1612848390))
                }
                else {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-1617365651))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u5d20\u8df4\ufcaf\ub70c\u5db4\u183a)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0230:
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0837)
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0673)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0583)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-1947754327))
                    goto(Label_0495)
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-1686376635))
                    goto(Label_0396)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_317 = and:int(var_1_317:int, ldc:int(-540518857))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::isFile, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u5d20\u8df4\ufcaf\ub70c\u5db4\u183a)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0318:
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-1340125347))
                    goto(Label_0837)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(42504299))
                    goto(Label_0673)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0583)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0495)
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_317:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_317 = and:int(var_1_317:int, ldc:int(-1143571385))
                }
                
                Label_0396:
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(256)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(1834906269))
                    goto(Label_0837)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0673)
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(512)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-1143879327))
                    goto(Label_0583)
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(256)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(1670673746))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0318)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_317:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_317 = and:int(var_1_317:int, ldc:int(-1952882947))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, invokevirtual:File(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc87f\u6c52\u2dcc\u3e75\u5f50\u7d52, var_3_72:\u71f1\ub18d\u62da\u9255\u7ce1[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u960f\u7049\u71f1\u61a4\u67d0>])))) {
                        goto(Label_0837)
                    }
                }
                
                Label_0495:
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-2137599684))
                    goto(Label_0837)
                }
                
                if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-447917645))
                    goto(Label_0673)
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_317:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0318)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_317:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(-1056362458))
                        loopcontinue()
                    }
                    
                    var_1_317 = and:int(var_1_317:int, ldc:int(1874130471))
                }
                
                try {
                    Label_0583:
                    
                    while (cmpeq:boolean(and:int(var_1_317:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16384)), ldc:int(0))) {
                            var_1_317 = and:int(var_1_317:int, ldc:int(1602959499))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0495)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_317:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_0396)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(4096)), ldc:int(0))) {
                                goto(Block_46)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Block_47)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16777216)), ldc:int(0))) {
                                loopcontinue(Label_0115)
                            }
                            
                            var_1_317 = and:int(var_1_317:int, ldc:int(-1347461187))
                            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\ubcb0\u12b2\u97e6\u3bd6\u9a18\u8cae, var_3_72:\u71f1\ub18d\u62da\u9255\u7ce1[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u960f\u7049\u71f1\u61a4\u67d0>])
                        }
                        
                        Label_0673:
                        
                        if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Block_49)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_317:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Block_50)
                        }
                    }
                    
                    goto(Label_0837)
                    Block_46:
                    var_1_317 = and:int(var_1_317:int, ldc:int(797714529))
                    goto(Label_0318)
                    Block_47:
                    var_1_317 = and:int(var_1_317:int, ldc:int(-746922261))
                    goto(Label_0230)
                    Block_49:
                    var_1_317 = and:int(var_1_317:int, ldc:int(715672926))
                    goto(Label_0837)
                    Block_50:
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(1555054819))
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(-1398730318))
                        goto(Label_0318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(4)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(-230917125))
                        goto(Label_0230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_317:int, ldc:int(4)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(-805577595))
                        goto(Label_0837)
                    }
                    
                    loopcontinue()
                }
                catch (java.io.IOException stack_308_0) {
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(512)), ldc:int(0))) {
                    var_1_317 = and:int(var_1_317:int, ldc:int(-946106239))
                    goto(Label_1214)
                }
                
                if (cmpne:boolean(and:int(var_1_317:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_1154)
                }
                
                var_1_317 = and:int(var_1_317:int, ldc:int(-1411615689))
                invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(25216), ldc:int(25218))), invokevirtual:String[expected:Object](File::getName, invokevirtual:File(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc87f\u6c52\u2dcc\u3e75\u5f50\u7d52, var_3_72:\u71f1\ub18d\u62da\u9255\u7ce1[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u960f\u7049\u71f1\u61a4\u67d0>])), var_4_3AE:List[expected:Object])
                
                try {
                    Label_0837:
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(-1767901535))
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(-1486660694))
                        goto(Label_0318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(-1960129889))
                        goto(Label_0230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_317:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_317 = and:int(var_1_317:int, ldc:int(860797371))
                        loopcontinue()
                    }
                    
                    var_1_317 = and:int(var_1_317:int, ldc:int(-338068019))
                    var_4_3AE = invokestatic:List(Files::readLines, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u5d20\u8df4\ufcaf\ub70c\u5db4\u183a), getstatic:Charset(StandardCharsets::UTF_8))
                    var_1_317 = and:int(var_1_317:int, ldc:int(1603657415))
                    var_5_3BF = initobject:\uf995\uc3e3\uc2e8\u59ec\u4ab3(\uf995\uc3e3\uc2e8\u59ec\u4ab3::<init>, p0:\u88c5\ud171\ub113\u6435\ud51e, var_3_72:\u71f1\ub18d\u62da\u9255\u7ce1)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_317:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_317 = and:int(var_1_317:int, ldc:int(-1542037324))
                            goto(Label_1105)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(16777216)), ldc:int(0))) {
                            var_1_317 = and:int(var_1_317:int, ldc:int(-2061462660))
                            goto(Label_1060)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1)), ldc:int(0))) {
                            var_1_317 = and:int(var_1_317:int, ldc:int(-593000362))
                        }
                        else {
                            var_1_317 = and:int(var_1_317:int, ldc:int(465304989))
                            invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\u99f7\uff55\u52d3\ub171\u983f\u97e6, p0:\u88c5\ud171\ub113\u6435\ud51e, var_4_3AE:List<String>[expected:Collection<String>], var_5_3BF:ProfileLookupCallback)
                        }
                        
                        Label_1026:
                        
                        if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1105)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_317:int, ldc:int(16384)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_317:int, ldc:int(536870912)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_317 = and:int(var_1_317:int, ldc:int(-543105353))
                            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\uc2bd\ub8be\ud36e\ub171\u3711\uc229, var_3_72:\u71f1\ub18d\u62da\u9255\u7ce1[expected:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, \u960f\u7049\u71f1\u61a4\u67d0>])
                        }
                        
                        Label_1060:
                        
                        if (cmpne:boolean(and:int(var_1_317:int, ldc:int(1024)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(1)), ldc:int(0))) {
                                var_1_317 = and:int(var_1_317:int, ldc:int(-1190373266))
                                goto(Label_1026)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_317:int, ldc:int(256)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_317 = and:int(var_1_317:int, ldc:int(-1949731251))
                            invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\ud7e8\u7006\u9af2\u9255\u5bc4\u59ec, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u5d20\u8df4\ufcaf\ub70c\u5db4\u183a))
                        }
                        
                        Label_1105:
                        
                        if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1060)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_317:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1026)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_317:int, ldc:int(512)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_1_317 = and:int(var_1_317:int, ldc:int(529227767))
                    stack_47B_0 = xor:int(ldc:int(25602), ldc:int(25603))
                    var_1_317 = and:int(var_1_317:int, ldc:int(1876481869))
                    return:boolean(stack_47B_0:int)
                }
                catch (java.io.IOException stack_480_0) {
                }
                catch (\u59ec\u8413\u97e6\uc229\u3776.\u0c95\u76bc\ub113\u965f\u8389 var_4_4E9) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(1028), ldc:int(1024))), var_4_4E9:\u0c95\u76bc\ub113\u965f\u8389[expected:Throwable])
                    return:boolean(and:int[expected:boolean](ldc:int(-12820), ldc:int(8723)))
                }
                
                looporswitchbreak()
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(26753), ldc:int(1281)))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.UUID \u4cd9\u1833\ua61f\u7043\u36d3\u92ee(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0, java.lang.String p1) {
        var_2_4B3 : int
        var_2_110 : int
        var_4_119 : GameProfile
        var_2_377 : int
        var_5_37B : ArrayList
        var_2_382 : int
        var_6_38D : \u8753\u5fe1\u51fa\ud171\ub32d
        expr_3CE : String[] [generated]
        stack_491_0 : UUID [generated]
        stack_4B4_0 : UUID [generated]
        
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
        var_2_4B3 = and:int(ldc:int(1069328565), ldc:int(-1645412967))
        
        loop {
            if (cmpne:boolean(and:int(var_2_4B3:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0228)
            }
            
            if (cmpeq:boolean(and:int(var_2_4B3:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0181)
            }
            
            if (cmpne:boolean(and:int(var_2_4B3:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_4B3 = and:int(var_2_4B3:int, ldc:int(1384178273))
            }
            else {
                var_2_4B3 = and:int(var_2_4B3:int, ldc:int(2025630578))
                
                if (invokestatic:boolean(\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u56bd\u0800\ub171\uc31c\u99f7\uc9f6, p1:String)) {
                    looporswitchbreak()
                }
            }
            
            Label_0144:
            
            if (cmpeq:boolean(and:int(var_2_4B3:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0228)
            }
            
            if (cmpne:boolean(and:int(var_2_4B3:int, ldc:int(524288)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_4B3:int, ldc:int(2147483647)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_4B3 = and:int(var_2_4B3:int, ldc:int(-185701076))
                
                if (cmpgt:boolean(invokevirtual:int(String::length, p1:String), ldc:int(16))) {
                    looporswitchbreak()
                }
            }
            
            Label_0181:
            
            if (cmpeq:boolean(and:int(var_2_4B3:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_4B3 = and:int(var_2_4B3:int, ldc:int(-1061889304))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_4B3:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0144)
                }
                
                if (cmpeq:boolean(and:int(var_2_4B3:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_4B3 = and:int(var_2_4B3:int, ldc:int(-965416082))
                    loopcontinue()
                }
                
                var_2_4B3 = and:int(var_2_4B3:int, ldc:int(447737181))
            }
            
            Label_0228:
            
            if (cmpne:boolean(and:int(var_2_4B3:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0181)
            }
            
            if (cmpne:boolean(and:int(var_2_4B3:int, ldc:int(8)), ldc:int(0))) {
                var_2_4B3 = and:int(var_2_4B3:int, ldc:int(-747004164))
                goto(Label_0144)
            }
            
            if (cmpeq:boolean(and:int(var_2_4B3:int, ldc:int(8)), ldc:int(0))) {
                var_2_110 = and:int(var_2_4B3:int, ldc:int(-789710163))
                var_4_119 = invokevirtual:GameProfile(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u3dd3\u98a4\ud7e8\u34df\u873d\u6bb9, invokevirtual:\ub1b9\u983f\uf9c5\u6fb0\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u62da\u8df4\ua3b4\u64f2\u3bc9\u927d, p0:\u88c5\ud171\ub113\u6435\ud51e), p1:String)
                
                loop {
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(8)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(1868400149))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0638)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(2)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(2131931383))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-913139060))
                        goto(Label_0460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(8)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-21009519))
                        
                        if (cmpeq:boolean(var_4_119:GameProfile, aconstnull:GameProfile())) {
                            goto(Label_0631)
                        }
                    }
                    
                    Label_0365:
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-1009143632))
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(98046585))
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0638)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(1101842867))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(425194238))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_110 = and:int(var_2_110:int, ldc:int(-1178632982))
                        
                        if (cmpeq:boolean(invokevirtual:UUID(GameProfile::getId, var_4_119:GameProfile), aconstnull:UUID())) {
                            goto(Label_0631)
                        }
                    }
                    
                    Label_0460:
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-1810460709))
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(2)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-108583796))
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0638)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_110:int, ldc:int(64)), ldc:int(0))) {
                            var_2_110 = and:int(var_2_110:int, ldc:int(1661252869))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_110 = and:int(var_2_110:int, ldc:int(1593814584))
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-2011840864))
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(1496133243))
                        goto(Label_0638)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-1671348212))
                        goto(Label_0460)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(4194304)), ldc:int(0))) {
                        return:UUID(invokevirtual:UUID(GameProfile::getId, var_4_119:GameProfile))
                    }
                    
                    loopcontinue()
                    Label_0631:
                    
                    if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u946b\u965f\u2dcc\ud217\u40a9\u3504, p0:\u88c5\ud171\ub113\u6435\ud51e)) {
                        looporswitchbreak()
                    }
                    
                    Label_0638:
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(64)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-970892839))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-1782566336))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_110:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0460)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_110:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_110 = and:int(var_2_110:int, ldc:int(-621893341))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u8413\ub19c\ube23\u71ae\ud36e\ubff1, p0:\u88c5\ud171\ub113\u6435\ud51e))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0714:
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_110:int, ldc:int(131072)), ldc:int(0))) {
                            var_2_110 = and:int(var_2_110:int, ldc:int(-1781584023))
                            goto(Label_0638)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_110 = and:int(var_2_110:int, ldc:int(484419394))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_110:int, ldc:int(2)), ldc:int(0))) {
                            var_2_110 = and:int(var_2_110:int, ldc:int(999918207))
                            goto(Label_0460)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_110:int, ldc:int(8)), ldc:int(0))) {
                            var_2_110 = and:int(var_2_110:int, ldc:int(1834289320))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_110:int, ldc:int(8)), ldc:int(0))) {
                            var_2_110 = and:int(var_2_110:int, ldc:int(-1819216522))
                            loopcontinue()
                        }
                        
                        var_2_110 = and:int(var_2_110:int, ldc:int(-756106001))
                    }
                    
                    Label_0809:
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(64)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-828379512))
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_110 = and:int(var_2_110:int, ldc:int(-303291746))
                        goto(Label_0638)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_110:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_377 = and:int(var_2_110:int, ldc:int(284126270))
                        var_5_37B = invokestatic:ArrayList(Lists::newArrayList)
                        var_2_382 = and:int(var_2_377:int, ldc:int(922500776))
                        var_6_38D = initobject:\u8753\u5fe1\u51fa\ud171\ub32d(\u8753\u5fe1\u51fa\ud171\ub32d::<init>, p0:\u88c5\ud171\ub113\u6435\ud51e, var_5_37B:ArrayList<Object>[expected:List])
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_2_382:int, ldc:int(262144)), ldc:int(0))) {
                                var_2_382 = and:int(var_2_382:int, ldc:int(973642032))
                                goto(Label_1113)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_382:int, ldc:int(64)), ldc:int(0))) {
                                var_2_382 = and:int(var_2_382:int, ldc:int(970290979))
                                goto(Label_1052)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_382:int, ldc:int(2048)), ldc:int(0))) {
                                var_2_382 = and:int(var_2_382:int, ldc:int(100313602))
                            }
                            else {
                                var_2_382 = and:int(var_2_382:int, ldc:int(2147417469))
                                expr_3CE = newarray:String[](java.lang.String.class, and:int(ldc:int(9381), ldc:int(2307)))
                                storeelement:String(expr_3CE:String[], and:int(ldc:int(20292), ldc:int(-32726)), p1:String)
                                invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\u99f7\uff55\u52d3\ub171\u983f\u97e6, p0:\u88c5\ud171\ub113\u6435\ud51e, invokestatic:ArrayList(Lists::newArrayList, expr_3CE:String[][expected:Object[]]), var_6_38D:ProfileLookupCallback)
                            }
                            
                            Label_0995:
                            
                            if (cmpeq:boolean(and:int(var_2_382:int, ldc:int(2097152)), ldc:int(0))) {
                                var_2_382 = and:int(var_2_382:int, ldc:int(-176033639))
                                goto(Label_1113)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_382:int, ldc:int(268435456)), ldc:int(0))) {
                                var_2_382 = and:int(var_2_382:int, ldc:int(268350426))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_2_382:int, ldc:int(2147483647)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_382 = and:int(var_2_382:int, ldc:int(-1648366959))
                                
                                if (invokeinterface:boolean(List::isEmpty, var_5_37B:ArrayList)) {
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_1052:
                            
                            if (cmpne:boolean(and:int(var_2_382:int, ldc:int(64)), ldc:int(0))) {
                                var_2_382 = and:int(var_2_382:int, ldc:int(-1833955851))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_2_382:int, ldc:int(268435456)), ldc:int(0))) {
                                    goto(Label_0995)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_382:int, ldc:int(2147483647)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_382 = and:int(var_2_382:int, ldc:int(-1728266936))
                                
                                if (cmpeq:boolean(invokevirtual:UUID(GameProfile::getId, checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokeinterface:Object(List<Object>::get, var_5_37B:ArrayList<Object>[expected:List<Object>], and:int(ldc:int(-1806), ldc:int(1805))))), aconstnull:UUID())) {
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_1113:
                            
                            if (cmpne:boolean(and:int(var_2_382:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Label_1052)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_382:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_0995)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_382:int, ldc:int(2147483647)), ldc:int(0))) {
                                stack_491_0 = invokevirtual:UUID(GameProfile::getId, checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokeinterface:GameProfile(List<GameProfile>::get, var_5_37B:ArrayList<GameProfile>[expected:List<GameProfile>], and:int(ldc:int(-24256), ldc:int(22062)))))
                                return:UUID(stack_491_0:UUID)
                            }
                        }
                        
                        stack_491_0 = aconstnull:UUID()
                        return:UUID(stack_491_0:UUID)
                    }
                    
                    var_2_110 = and:int(var_2_110:int, ldc:int(-458842459))
                }
                
                return:UUID(invokestatic:UUID(\ua3b4\u8aa5\ub113\ubf56\u873d::\ub7dc\ub83f\u0c95\ub83f\u8bb0\u516c, initobject:GameProfile(GameProfile::<init>, checkcast:UUID(java.util.UUID.class, aconstnull:UUID()), p1:String)))
            }
            
            var_2_4B3 = and:int(var_2_4B3:int, ldc:int(-771925827))
        }
        
        try {
            stack_4B4_0 = invokestatic:UUID(UUID::fromString, p1:String)
            var_2_4B3 = and:int(var_2_4B3:int, ldc:int(-725697575))
            return:UUID(stack_4B4_0:UUID)
        }
        catch (java.lang.IllegalArgumentException var_4_4B9) {
            return:UUID(aconstnull:UUID())
        }
    }
    
    public static boolean \u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u12b2\u4bc8\ub1b9\u516c\u61a4 p0) {
        var_1_67 : int
        var_3_6C : File
        var_1_72 : int
        var_4_89 : File
        var_1_CE : int
        var_5_A7 : File
        var_1_BD : int
        var_1_171 : int
        var_6_176 : File[]
        var_1_17D : int
        var_7_181 : ArrayList
        var_1_287 : int
        var_8_18B : File[]
        var_9_190 : int
        var_10_199 : int
        var_12_1D3 : String
        var_13_20E : String
        var_8_240 : String[]
        var_9_257 : \ubff1\u983f\u4cd9\uf94d\u946b
        stack_295_0 : int [generated]
        var_8_29A : \u0c95\u76bc\ub113\u965f\u8389
        
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
            var_1_67 = and:int(and:int(ldc:int(-1917351914), ldc:int(1708362967)), ldc:int(515219334))
            var_3_6C = invokestatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u8bb0\u6ec6\u8aa5\u600f\u3e2a\u3a62, p0:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e])
            var_1_72 = and:int(var_1_67:int, ldc:int(636587118))
            var_4_89 = initobject:File(File::<init>, invokevirtual:File(File::getParentFile, var_3_6C:File), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(1608), ldc:int(31000))))
            var_1_CE = and:int(var_1_72:int, ldc:int(-2030568305))
            var_5_A7 = initobject:File(File::<init>, invokevirtual:File(File::getParentFile, var_3_6C:File), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(13115), ldc:int(77))))
            
            loop {
                if (cmpne:boolean(and:int(var_1_CE:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0332)
                }
                
                if (cmpeq:boolean(and:int(var_1_CE:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_BD = and:int(var_1_CE:int, ldc:int(723488231))
                    goto(Label_0276)
                }
                
                if (cmpeq:boolean(and:int(var_1_CE:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_CE = and:int(var_1_CE:int, ldc:int(-440956625))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, var_3_6C:File))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0214:
                
                if (cmpeq:boolean(and:int(var_1_CE:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_CE = and:int(var_1_CE:int, ldc:int(-698855145))
                    goto(Label_0332)
                }
                
                if (cmpne:boolean(and:int(var_1_CE:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_BD = and:int(var_1_CE:int, ldc:int(1001223569))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_CE:int, ldc:int(8)), ldc:int(0))) {
                        var_1_CE = and:int(var_1_CE:int, ldc:int(1059719052))
                        loopcontinue()
                    }
                    
                    var_1_BD = and:int(var_1_CE:int, ldc:int(-660617))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::isDirectory, var_3_6C:File))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0276:
                
                if (cmpeq:boolean(and:int(var_1_BD:int, ldc:int(4)), ldc:int(0))) {
                    var_1_CE = and:int(var_1_BD:int, ldc:int(-1276173671))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_BD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_CE = and:int(var_1_BD:int, ldc:int(-445034938))
                        goto(Label_0214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_BD:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_CE = and:int(var_1_BD:int, ldc:int(1482762710))
                        loopcontinue()
                    }
                    
                    var_1_CE = and:int(var_1_BD:int, ldc:int(-2048930058))
                }
                
                Label_0332:
                
                if (cmpeq:boolean(and:int(var_1_CE:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_BD = and:int(var_1_CE:int, ldc:int(1192537708))
                    goto(Label_0276)
                }
                
                if (cmpeq:boolean(and:int(var_1_CE:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0214)
                }
                
                if (cmpne:boolean(and:int(var_1_CE:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_171 = and:int(var_1_CE:int, ldc:int(1744288956))
                    var_6_176 = invokevirtual:File[](File::listFiles, var_3_6C:File)
                    var_1_17D = and:int(var_1_171:int, ldc:int(1303488966))
                    var_7_181 = invokestatic:ArrayList(Lists::newArrayList)
                    var_1_287 = and:int(var_1_17D:int, ldc:int(-157679817))
                    var_8_18B = var_6_176:File[]
                    var_9_190 = arraylength:int(var_8_18B:File[])
                    var_10_199 = and:int(ldc:int(13441), ldc:int(-13442))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_287:int, ldc:int(256)), ldc:int(0))) {
                            var_1_287 = and:int(var_1_287:int, ldc:int(905549893))
                            
                            if (cmpge:boolean(var_10_199:int, var_9_190:int)) {
                                looporswitchbreak()
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_1_287:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_287 = and:int(var_1_287:int, ldc:int(-1718180260))
                        }
                        else {
                            var_1_287 = and:int(var_1_287:int, ldc:int(-1076769202))
                            var_12_1D3 = invokevirtual:String(File::getName, loadelement:File(var_8_18B:File[], var_10_199:int))
                            
                            if (invokevirtual:boolean(String::endsWith, invokevirtual:String(String::toLowerCase, var_12_1D3:String, getstatic:Locale(Locale::ROOT)), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(339), ldc:int(345))))) {
                                var_13_20E = invokevirtual:String(String::substring, var_12_1D3:String, and:int(ldc:int(14377), ldc:int(-30954)), sub:int(invokevirtual:int(String::length, var_12_1D3:String), invokevirtual:int(String::length, loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(17092), ldc:int(17102))))))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_13_20E:String))) {
                                    invokeinterface:boolean(List<String>::add, var_7_181:ArrayList<String>[expected:List<String>], var_13_20E:String)
                                }
                            }
                            
                            inc:int(var_10_199, ldc:int(1))
                        }
                    }
                    
                    try {
                        var_8_240 = checkcast:String[](java.lang.String[].class, invokeinterface:String[](List<E>::toArray, var_7_181:ArrayList<String>[expected:List<String>], newarray:String[](java.lang.String.class, invokeinterface:int(List<E>::size, var_7_181:ArrayList<String>[expected:List<String>]))))
                        var_1_287 = and:int(var_1_287:int, ldc:int(1974840253))
                        var_9_257 = initobject:\ubff1\u983f\u4cd9\uf94d\u946b(\ubff1\u983f\u4cd9\uf94d\u946b::<init>, p0:\u12b2\u4bc8\ub1b9\u516c\u61a4, var_4_89:File, var_5_A7:File, var_3_6C:File, var_8_240:String[])
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_287:int, ldc:int(8388608)), ldc:int(0))) {
                                var_1_287 = and:int(var_1_287:int, ldc:int(-1112307372))
                                invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\u99f7\uff55\u52d3\ub171\u983f\u97e6, p0:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e], invokestatic:ArrayList[expected:Collection<String>](Lists::newArrayList, var_8_240:String[][expected:Object[]]), var_9_257:ProfileLookupCallback)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_287:int, ldc:int(8)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_287 = and:int(var_1_287:int, ldc:int(-1378543564))
                        }
                        
                        var_1_287 = and:int(var_1_287:int, ldc:int(1723198836))
                        stack_295_0 = xor:int(ldc:int(-12272), ldc:int(-12271))
                        var_1_287 = and:int(var_1_287:int, ldc:int(117431806))
                        return:boolean(stack_295_0:int)
                    }
                    catch (\u59ec\u8413\u97e6\uc229\u3776.\u0c95\u76bc\ub113\u965f\u8389 var_8_29A) {
                        invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(25620), ldc:int(2630))), var_8_29A:\u0c95\u76bc\ub113\u965f\u8389[expected:Throwable])
                        return:boolean(and:int[expected:boolean](ldc:int(-2157), ldc:int(2156)))
                    }
                    
                    looporswitchbreak()
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(643), ldc:int(8257)))
        }
        
        goto(Label_0006)
    }
    
    private static void \ub32d\ufcaf\u3d4b\u5d20\u16f6\ud7e8(java.io.File p0) {
        var_1_61 : int
        
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
            var_1_61 = and:int(ldc:int(595225323), ldc:int(-1074026777))
            
            if (logicalnot:boolean(invokevirtual:boolean(File::exists, p0:File))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-479518550))
                
                if (logicalnot:boolean(invokevirtual:boolean(File::mkdirs, p0:File))) {
                    athrow(initobject:\u0c95\u76bc\ub113\u965f\u8389(\u0c95\u76bc\ub113\u965f\u8389::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(-24045), ldc:int(-24040)))), invokevirtual:String(File::getName, p0:File)), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(8716), ldc:int(7647))))), aconstnull:\u71f1\uf94d\u71ae\u88c5\u4bc8()))
                }
            }
            else {
                if (logicalnot:boolean(invokevirtual:boolean(File::isDirectory, p0:File))) {
                    athrow(initobject:\u0c95\u76bc\ub113\u965f\u8389(\u0c95\u76bc\ub113\u965f\u8389::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(1280), ldc:int(1291)))), invokevirtual:String(File::getName, p0:File)), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(-27584), ldc:int(-27572))))), aconstnull:\u71f1\uf94d\u71ae\u88c5\u4bc8()))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ud12e\u120d\u52d3\u5654\u527a\u960f(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
        var_1_61 : int
        stack_99_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(119876144), ldc:int(864136182))
            
            if (logicaland:boolean(invokestatic:boolean(\u4c04\u7330\uc3e3\u4492\uae87::\u3711\u34df\ubded\u3d64\u494c\u6198), invokestatic:boolean(\u4c04\u7330\uc3e3\u4492\uae87::\u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d, p0:\u88c5\ud171\ub113\u6435\ud51e))) {
                stack_99_0 = and:int(ldc:int(325), ldc:int(16545))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(920497079))
                stack_99_0 = and:int(ldc:int(11789), ldc:int(-11790))
            }
            
            return:boolean(stack_99_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u3711\u34df\ubded\u3d64\u494c\u6198() {
        var_0_61 : int
        var_2_69 : int
        var_0_78 : int
        var_3_80 : int
        var_0_8F : int
        var_4_97 : int
        var_0_A7 : int
        var_5_AF : int
        
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
        var_0_61 = and:int(ldc:int(57873782), ldc:int(-579121308))
        var_2_69 = and:int(ldc:int(25985), ldc:int(-30594))
        
        if (invokevirtual:boolean(File::exists, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229))) {
            if (invokevirtual:boolean(File::isFile, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229))) {
                var_2_69 = and:int(ldc:int(193), ldc:int(4613))
            }
        }
        
        var_0_78 = and:int(var_0_61:int, ldc:int(511383288))
        var_3_80 = and:int(ldc:int(922), ldc:int(-923))
        
        if (invokevirtual:boolean(File::exists, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u600f\u416d\uae5d\ud158\u8d90\u7049))) {
            if (invokevirtual:boolean(File::isFile, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u600f\u416d\uae5d\ud158\u8d90\u7049))) {
                var_3_80 = and:int(ldc:int(833), ldc:int(8353))
            }
        }
        
        var_0_8F = and:int(var_0_78:int, ldc:int(225904126))
        var_4_97 = and:int(ldc:int(-3162), ldc:int(3161))
        
        if (invokevirtual:boolean(File::exists, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\uc29a\u1187\ubded\ubf56\ucfaf\ucb79))) {
            if (invokevirtual:boolean(File::isFile, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\uc29a\u1187\ubded\ubf56\ucfaf\ucb79))) {
                var_4_97 = and:int(ldc:int(2567), ldc:int(20529))
            }
        }
        
        var_0_A7 = and:int(var_0_8F:int, ldc:int(-1829282569))
        var_5_AF = and:int(ldc:int(14434), ldc:int(-14447))
        
        if (invokevirtual:boolean(File::exists, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u5d20\u8df4\ufcaf\ub70c\u5db4\u183a))) {
            if (invokevirtual:boolean(File::isFile, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u5d20\u8df4\ufcaf\ub70c\u5db4\u183a))) {
                var_5_AF = xor:int(ldc:int(-24528), ldc:int(-24527))
            }
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0432)
            }
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0372)
            }
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0322)
            }
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(32)), ldc:int(0))) {
                var_0_A7 = and:int(var_0_A7:int, ldc:int(1702095463))
                
                if (cmpeq:boolean(var_2_69:int, ldc:int(0))) {
                    if (cmpeq:boolean(var_3_80:int, ldc:int(0))) {
                        if (cmpeq:boolean(var_4_97:int, ldc:int(0))) {
                            if (cmpeq:boolean(var_5_AF:int, ldc:int(0))) {
                                return:boolean(xor:int[expected:boolean](ldc:int(71), ldc:int(70)))
                            }
                        }
                    }
                }
            }
            
            Label_0226:
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0432)
            }
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(8192)), ldc:int(0))) {
                var_0_A7 = and:int(var_0_A7:int, ldc:int(463505319))
                goto(Label_0372)
            }
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(32)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_A7 = and:int(var_0_A7:int, ldc:int(1301274234))
                    loopcontinue()
                }
                
                var_0_A7 = and:int(var_0_A7:int, ldc:int(-1115998089))
                invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(2116), ldc:int(2121))))
                invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(20877), ldc:int(20867))))
                
                if (cmpne:boolean(var_2_69:int, ldc:int(0))) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(16902), ldc:int(16905))), invokevirtual:String[expected:Object](File::getName, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229)))
                }
            }
            
            Label_0322:
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0432)
            }
            
            if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(536870912)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_A7 = and:int(var_0_A7:int, ldc:int(-1004415684))
                    goto(Label_0226)
                }
                
                if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(2097152)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_0_A7 = and:int(var_0_A7:int, ldc:int(1937496444))
                
                if (cmpne:boolean(var_3_80:int, ldc:int(0))) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(271), ldc:int(10831))), invokevirtual:String[expected:Object](File::getName, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u600f\u416d\uae5d\ud158\u8d90\u7049)))
                }
            }
            
            Label_0372:
            
            if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(128)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_A7 = and:int(var_0_A7:int, ldc:int(614902169))
                    goto(Label_0322)
                }
                
                if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0226)
                }
                
                if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(64)), ldc:int(0))) {
                    var_0_A7 = and:int(var_0_A7:int, ldc:int(-335443146))
                    loopcontinue()
                }
                
                var_0_A7 = and:int(var_0_A7:int, ldc:int(141795320))
                
                if (cmpne:boolean(var_4_97:int, ldc:int(0))) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(1026), ldc:int(1037))), invokevirtual:String[expected:Object](File::getName, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\uc29a\u1187\ubded\ubf56\ucfaf\ucb79)))
                }
            }
            
            Label_0432:
            
            if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_A7 = and:int(var_0_A7:int, ldc:int(1417160873))
                goto(Label_0372)
            }
            
            if (cmpeq:boolean(and:int(var_0_A7:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_A7 = and:int(var_0_A7:int, ldc:int(-2099143769))
                goto(Label_0322)
            }
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(128)), ldc:int(0))) {
                var_0_A7 = and:int(var_0_A7:int, ldc:int(1762884255))
                goto(Label_0226)
            }
            
            if (cmpne:boolean(and:int(var_0_A7:int, ldc:int(1048576)), ldc:int(0))) {
                if (cmpne:boolean(var_5_AF:int, ldc:int(0))) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(4159), ldc:int(9231))), invokevirtual:String[expected:Object](File::getName, getstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u5d20\u8df4\ufcaf\ub70c\u5db4\u183a)))
                }
                
                return:boolean(and:int[expected:boolean](ldc:int(20660), ldc:int(-21685)))
            }
        }
    }
    
    private static boolean \u9af2\u0b8e\u3d64\u7c6b\u7e3f\u071d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
        var_3_66 : File
        
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
            var_3_66 = invokestatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u8bb0\u6ec6\u8aa5\u600f\u3e2a\u3a62, p0:\u88c5\ud171\ub113\u6435\ud51e)
            
            if (invokevirtual:boolean(File::exists, var_3_66:File)) {
                if (invokevirtual:boolean(File::isDirectory, var_3_66:File)) {
                    if (logicalor:boolean(cmpgt:boolean(arraylength:int(invokevirtual:String[](File::list, var_3_66:File)), ldc:int(0)), logicalnot:boolean(invokevirtual:boolean(File::delete, var_3_66:File)))) {
                        invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(924), ldc:int(908))))
                        invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(8467), ldc:int(20497))))
                        invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), xor:int(ldc:int(4876), ldc:int(4894))), invokevirtual:String(File::getPath, var_3_66:File))
                        return:boolean(and:int[expected:boolean](ldc:int(26668), ldc:int(-26670)))
                    }
                }
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(-32704), ldc:int(-32703)))
        }
        
        goto(Label_0006)
    }
    
    private static java.io.File \u8bb0\u6ec6\u8aa5\u600f\u3e2a\u3a62(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
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
            return:File(invokeinterface:File(Path::toFile, invokevirtual:Path(\u88c5\ud171\ub113\u6435\ud51e::\ucb79\u8df4\u3711\u9af2\u5bc4\u6c52, p0:\u88c5\ud171\ub113\u6435\ud51e, getstatic:\u51b2\ub6ab\u5654\u647c\ub102\u8d90(\u51b2\ub6ab\u5654\u647c\ub102\u8d90::\u0a06\uc2e8\u5f50\u4975\ua6bd\u4c04))))
        }
        
        goto(Label_0006)
    }
    
    private static void \ud7e8\u7006\u9af2\u9255\u5bc4\u59ec(java.io.File p0) {
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
            invokevirtual:boolean(File::renameTo, p0:File, initobject:File(File::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(File::getName, p0:File)), loadelement:String(getstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3), and:int(ldc:int(12315), ldc:int(17175)))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Date \ub83f\u72f1\u836c\ucfaf\u51fa\u8753(java.lang.String p0, java.util.Date p1) {
        var_2_85 : int
        var_4_6F : Date
        
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
            var_2_85 = and:int(ldc:int(2031113377), ldc:int(-210634270))
            
            try {
                var_2_85 = and:int(var_2_85:int, ldc:int(2130409908))
                var_4_6F = invokevirtual:Date(DateFormat::parse, getstatic:SimpleDateFormat[expected:DateFormat](\u51b2\u156b\ub19c\u8640\ud4fe::\u47c2\u40a9\u9033\u759a\u5db4\u5d20), p0:String)
                var_2_85 = and:int(var_2_85:int, ldc:int(-203434516))
            }
            catch (java.text.ParseException var_5_7E) {
                var_2_85 = and:int(var_2_85:int, ldc:int(2033744884))
                var_4_6F = p1:Date
            }
            
            return:Date(var_4_6F:Date)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String[] lambda$\uf9c5\u183a\uf94d\u16f6\u760c\u527a$1(int p0) {
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
            return:String[](newarray:String[](java.lang.String.class, p0:int))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc229\u6c56\u516c\u3711\ud36e\u7af6$0(java.lang.String p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-680638148), ldc:int(-545273163))
            
            if (invokestatic:boolean(\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u56bd\u0800\ub171\uc31c\u99f7\uc9f6, p0:String)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-8546051))
                stack_8A_0 = and:int(ldc:int(444), ldc:int(-2493))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(9216), ldc:int(9217))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \ubf56\u7bad\u40a9\ub70c\u6c56\uc3e3() {
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
            return:Logger(getstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Date \u6b0d\u98a4\u6c56\u9033\u5db4\u071d(java.lang.String p0, java.util.Date p1) {
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
            return:Date(invokestatic:Date(\u4c04\u7330\uc3e3\u4492\uae87::\ub83f\u72f1\u836c\ucfaf\u51fa\u8753, p0:String, p1:Date))
        }
        
        goto(Label_0006)
    }
    
    public static void \u8389\u64f2\u5d20\u7c6b\u7e3f\u494c(java.io.File p0) {
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
            invokestatic:void(\u4c04\u7330\uc3e3\u4492\uae87::\ub32d\ufcaf\u3d4b\u5d20\u16f6\ud7e8, p0:File)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_4C3 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_C8_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_46B_0 : byte[] [generated]
        stack_4D6_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_3FB : byte[]
        var_4_3FC : int
        expr_98 : int [generated]
        var_5_44C : int
        var_3_451 : byte[]
        var_4_452 : int
        expr_46B : byte [generated]
        var_0_4CC : int
        expr_4D6 : byte [generated]
        stack_506_2 : byte [generated]
        expr_C8 : int [generated]
        var_3_F8 : String
        expr_100 : String[] [generated]
        expr_10A : String[] [generated]
        var_3_3A0 : String[]
        
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
            var_0_4C3 = and:int(ldc:int(895851324), ldc:int(927661863))
            expr_68 = var_2_6C = stack_96_0 = stack_98_0 = stack_C6_0 = stack_C8_0 = stack_EC_0 = stack_46B_0 = stack_4D6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("A0XzMIHYs24387PtsrOwQ7UzsLZnXmMcM0Vzs7DvbkF8ROye9LIyNQRuYXHvbmECcLFzR/YwMnPfb7MzMEYhrDNy3ASw87fDs3bfsXBunEfuN/TDcOWcnmMwPkF8ROye9LOzd8Ozdt+xcG6cR+439MNyY22vcx3A8B+1grIjhzFy8oTuc9817vUxwHN38d1fc+4wQQRuYXHvbmCA7jewQ7UzsLbgXrZ3HjRzXt3uOno+eHu3s65qta9yq77w7PT4MKRzrvRse7UzsLbo73MmcbqwJX5yNXC54LNuN/I1Zeimarl3eDj7M2p0cmt0vuxwvuexcG6kf+439Ptya2+vdGw/anNvMvD+9/borjOwMPt0snHt82Vn6mqrcj87efuz8na3Lr1tMmVw7LFs+TA3pXBxbnOy87OwJ/vytjb/s3DsrGQycPB0+3Syce3zJG2uMzD7M2uwMmt3fLFvsLAutehBtv75f3Txby3gLu93aH41I7LoMLMC7IQzH3GzM7BDtTOwtuNnsrLww3yyce3zHG2uMzDDMmVcsXPw/ETsn3f1MmPAb2+vB2DzsnVsBWc38XAu63IxsqKH8C+vse3xs3SEsS8y3C+zMzOw9LVmNMftautyMbKjhGxzcMOfNjPuYcPwnzPA8rHD9HQdsTLfb0YxcMN08Bxvd19nRrWsQutyMbKgBWwvr7LxcHKjR/Ow8ETznbEy329GMXDDdPAcb3dfZ0a1rELrcjGyoAVsL6+y8XByoMSx7zey7y3yMcP0dB2xMt9vRjFww3TwHG93X2dGtaxC63IxsqAFbC+vsvFwcqFF7vO0wO/yN7JhsTLfb0YxcMN08Bxvd12qie7uxDXoMqZwMzYlQ3SzbH4xL+wypDMysPW8MXLmcHQysANxH7HwsvMC7/PsMa+ycrByNjYzNDOw8zAsMWwxcTdssDAtHLOzc3fxs3fz1WfW19Q="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_3FB = newarray:byte[](byte.class, expr_70:int)
                var_4_3FC = expr_70:int
                
                loop {
                    var_0_4C3 = and:int(var_0_4C3:int, ldc:int(1033493409))
                    var_4_3FC = add:int(var_4_3FC:int, ldc:int(-1))
                    storeelement:byte(var_3_3FB:byte[], var_4_3FC:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_3FC:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_3FC:int, xor:int(ldc:int(-32446), ldc:int(-32445)))), ldc:int(2)), xor:int(ldc:int(8577), ldc:int(8638)))))
                    
                    if (cmpne:boolean(var_4_3FC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_EC_0 = stack_46B_0 = stack_4D6_0 = var_3_3FB:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_4C3:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_4C3 = and:int(var_0_4C3:int, ldc:int(676860844))
                    goto(Label_0205)
                }
                
                if (cmpeq:boolean(and:int(var_0_4C3:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_0_4C3 = and:int(var_0_4C3:int, ldc:int(-1113808916))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_44C = expr_98:int
                var_3_451 = newarray:byte[](byte.class, expr_98:int)
                var_4_452 = expr_98:int
                Label_1108:
                
                while (cmpeq:boolean(and:int(var_0_4C3:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_4C3 = and:int(var_0_4C3:int, ldc:int(-143458394))
                    var_4_452 = add:int(var_4_452:int, ldc:int(-1))
                    expr_46B = loadelement:byte(stack_46B_0:byte[], var_4_452:int)
                    storeelement:byte(var_3_451:byte[], var_4_452:int, add:int(xor:int(or:int(and:int(shl:int(expr_46B:byte, xor:int(ldc:int(386), ldc:int(390))), ldc:int(-16)), and:int(shr:int(expr_46B:byte[expected:int], and:int(ldc:int(780), ldc:int(11270))), ldc:int(15))), ldc:int(119)), ldc:int(71)))
                    
                    if (cmpne:boolean(var_4_452:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_EC_0 = stack_46B_0 = stack_4D6_0 = var_3_451:byte[]
                    goto(Label_0157)
                }
                
                Label_1206:
                
                while (cmpne:boolean(and:int(var_0_4C3:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_4CC = and:int(var_0_4C3:int, ldc:int(-1113407514))
                    var_4_452 = add:int(var_4_452:int, ldc:int(-1))
                    expr_4D6 = loadelement:byte(stack_4D6_0:byte[], var_4_452:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_452:int, ldc:int(5)), neg:int(var_5_44C:int)), ldc:int(0))) {
                        var_0_4CC = and:int(var_0_4CC:int, ldc:int(2140401642))
                        stack_506_2 = add:byte(expr_4D6:byte, ldc:byte(5))
                    }
                    else {
                        stack_506_2 = add:byte(expr_4D6:byte, loadelement:byte(var_3_451:byte[], add:int(var_4_452:int, ldc:int(5))))
                    }
                    
                    var_0_4C3 = and:int(var_0_4CC:int, ldc:int(1061362550))
                    storeelement:byte(var_3_451:byte[], var_4_452:int, stack_506_2:byte)
                    
                    if (cmpne:boolean(var_4_452:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_EC_0 = stack_46B_0 = stack_4D6_0 = var_3_451:byte[]
                    goto(Label_0205)
                }
                
                var_0_4C3 = and:int(var_0_4C3:int, ldc:int(-606326192))
                goto(Label_1108)
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_0_4C3:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_4C3 = and:int(var_0_4C3:int, ldc:int(1294369999))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_4C3:int, ldc:int(256)), ldc:int(0))) {
                        var_0_4C3 = and:int(var_0_4C3:int, ldc:int(-717602705))
                        loopcontinue()
                    }
                    
                    var_0_4C3 = and:int(var_0_4C3:int, ldc:int(-1211138261))
                    expr_C8 = arraylength:int(stack_C8_0:byte[])
                    
                    if (cmpne:boolean(expr_C8:int, ldc:int(0))) {
                        var_5_44C = expr_C8:int
                        var_3_451 = newarray:byte[](byte.class, expr_C8:int)
                        var_4_452 = expr_C8:int
                        goto(Label_1206)
                    }
                }
                
                Label_0205:
                
                if (cmpne:boolean(and:int(var_0_4C3:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_4C3:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_4C3 = and:int(var_0_4C3:int, ldc:int(-269827755))
            }
            
            var_3_F8 = initobject:String(String::<init>, stack_EC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_100 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16409), ldc:int(6362)))
            expr_10A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2128), ldc:int(2120)))
            storeelement:String(expr_10A:String[], and:int(ldc:int(2574), ldc:int(5324)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(16459), ldc:int(-26956)), and:int(ldc:int(16475), ldc:int(153))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(6752), ldc:int(-6770)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(20524), ldc:int(20533)), and:int(ldc:int(2271), ldc:int(4122))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(5128), ldc:int(5127)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(5184), ldc:int(5210)), and:int(ldc:int(31), ldc:int(4318))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(1025), ldc:int(1039)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(382), ldc:int(20511)), and:int(ldc:int(606), ldc:int(2266))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(1043), ldc:int(24658)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(5214), ldc:int(90)), xor:int(ldc:int(5981), ldc:int(6128))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(4097), ldc:int(4113)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(8365), ldc:int(20397)), xor:int(ldc:int(4138), ldc:int(4299))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(6223), ldc:int(6210)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(4131), ldc:int(4290)), xor:int(ldc:int(3516), ldc:int(3238))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(17665), ldc:int(17680)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-32447), ldc:int(-32677)), xor:int(ldc:int(270), ldc:int(106))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(3087), ldc:int(3100)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(5), ldc:int(353)), and:int(ldc:int(28142), ldc:int(4462))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(-29687), ldc:int(-29693)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(511), ldc:int(878)), and:int(ldc:int(1394), ldc:int(29170))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(1576), ldc:int(1571)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(10747), ldc:int(370)), and:int(ldc:int(4057), ldc:int(425))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(5), ldc:int(16422)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(1997), ldc:int(18857)), and:int(ldc:int(20922), ldc:int(2483))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(16454), ldc:int(1682)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(434), ldc:int(9650)), and:int(ldc:int(10193), ldc:int(467))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(4368), ldc:int(4373)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(981), ldc:int(18905)), xor:int(ldc:int(-31325), ldc:int(-31651))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(1058), ldc:int(1060)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(2558), ldc:int(29694)), and:int(ldc:int(806), ldc:int(8742))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(5139), ldc:int(5136)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(422), ldc:int(896)), xor:int(ldc:int(8348), ldc:int(8904))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(-24043), ldc:int(-24046)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(6748), ldc:int(25460)), xor:int(ldc:int(534), ldc:int(105))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(10297), ldc:int(1601)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(4643), ldc:int(4188)), xor:int(ldc:int(241), ldc:int(624))))
            storeelement:String(expr_100:String[], and:int(ldc:int(8340), ldc:int(22652)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(905), ldc:int(4743)), xor:int(ldc:int(8518), ldc:int(9161))))
            storeelement:String(expr_100:String[], and:int(ldc:int(27165), ldc:int(1367)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(16), ldc:int(671)), and:int(ldc:int(12199), ldc:int(689))))
            storeelement:String(expr_100:String[], xor:int(ldc:int(43), ldc:int(61)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(17527), ldc:int(18134)), and:int(ldc:int(11000), ldc:int(17064))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(22537), ldc:int(8334)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(5806), ldc:int(760)), and:int(ldc:int(2042), ldc:int(8886))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(266), ldc:int(259)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-26150), ldc:int(-25752)), xor:int(ldc:int(295), ldc:int(999))))
            storeelement:String(expr_100:String[], and:int(ldc:int(2207), ldc:int(4631)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(46), ldc:int(750)), and:int(ldc:int(974), ldc:int(17118))))
            putstatic:String[](\u4c04\u7330\uc3e3\u4492\uae87::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3, expr_10A:String[])
            var_3_3A0 = expr_100:String[]
            putstatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3, invokestatic:Logger(LogManager::getLogger))
            putstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u600f\u416d\uae5d\ud158\u8d90\u7049, initobject:File(File::<init>, loadelement:String(var_3_3A0:String[], xor:int(ldc:int(-31730), ldc:int(-31718)))))
            putstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229, initobject:File(File::<init>, loadelement:String(var_3_3A0:String[], and:int(ldc:int(16919), ldc:int(11485)))))
            putstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\uc29a\u1187\ubded\ubf56\ucfaf\ucb79, initobject:File(File::<init>, loadelement:String(var_3_3A0:String[], xor:int(ldc:int(18), ldc:int(4)))))
            putstatic:File(\u4c04\u7330\uc3e3\u4492\uae87::\u5d20\u8df4\ufcaf\ub70c\u5db4\u183a, initobject:File(File::<init>, loadelement:String(var_3_3A0:String[], xor:int(ldc:int(21577), ldc:int(21598)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3711\u5245\u6d99\u98a4\u8df4\u51b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_646 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_651 : int
        
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
        var_3_646 = and:int(ldc:int(1092644561), ldc:int(-584089613))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4c04\u7330\uc3e3\u4492\uae87[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(-180883469))
            var_5_81 = and:int(ldc:int(15376), ldc:int(-15377))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18154), ldc:int(17129)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_646:int, ldc:int(1342078713))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(528), ldc:int(529)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(16546), ldc:int(16547)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_646 = and:int(var_3_DA:int, ldc:int(-379457583))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(9), ldc:int(12423)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-25945188))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(72948779))
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(849961676))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1141859253))
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(989800843))
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1132342350))
                    }
                    else {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-912183597))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0599)
                            }
                            
                            goto(Label_0884)
                        }
                    }
                    
                    Label_0426:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-350854857))
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(70286281))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-429574476))
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(467568797))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1732879145))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(1730854647))
                        var_11_EB = and:int(ldc:int(22798), ldc:int(-24335))
                        goto(Label_1494)
                    }
                    
                    Label_0599:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1318366141))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1587689039))
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(2104401518))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(306206506))
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1261713664))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(2142883763))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(1998761939))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0884)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-164358683))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1739602998))
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(448965777))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1940225356))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1143248516))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(2028586646))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(1931800287))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0884:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(595631531))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-806653076))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1309688801))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(343945775))
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-637767715))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(18625), ldc:int(785))
                                goto(Label_1170)
                            }
                        }
                    }
                    
                    Label_1006:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-429068560))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1908219199))
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1055948493))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-296428575))
                            goto(Label_0884)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(392890954))
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-840290347))
                        var_11_EB = and:int(ldc:int(-24471), ldc:int(7958))
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0884)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1234393005))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-647053345))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1372)
                            }
                        }
                    }
                    
                    Label_1264:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1170)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-649906957))
                            goto(Label_0884)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1740095475))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1494)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1372:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1440813498))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1195913226))
                        goto(Label_0426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1741603538))
                        loopcontinue()
                    }
                    
                    var_3_646 = and:int(var_3_646:int, ldc:int(1631256283))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1494:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_651 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1505:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1896229931))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(451110552))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(296769842))
                        goto(Label_0884)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-739852295))
                        var_17_651 = add:int(var_16_119:int, and:int(ldc:int(21), ldc:int(7713)))
                        looporswitchbreak()
                    }
                }
                
                var_3_646 = and:int(var_3_646:int, ldc:int(-143626497))
                
                if (cmple:boolean(var_5_81 = var_17_651:int, sub:int(var_6_88:int, xor:int(ldc:int(2384), ldc:int(2385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(-259652757))
            goto(Label_0108)
        }
    }
}
