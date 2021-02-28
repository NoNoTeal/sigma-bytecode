public class \ub113\uc4d2\u183a\u527a\u6435.\u97e6\u647c\u93a2\uc87f\ud523 {
    public void \u97e6\u647c\u93a2\uc87f\ud523() {
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
            invokespecial:Object(Object::<init>, this:\u97e6\u647c\u93a2\uc87f\ud523)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
        var_2_5F : int
        var_2_6B : int
        var_4_73 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_5_79 : \ud158\u8308\u76bc\u0a06\ud36e
        var_6_82 : int
        var_7_BC : \uc31c\uc87f\uc246\u3776\ub7dc
        var_8_D1 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
        var_2_5F = and:int(ldc:int(-773644213), ldc:int(-706420613))
        
        if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
            var_2_6B = and:int(var_2_5F:int, ldc:int(-440636545))
            var_4_73 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u965f\u7043\ufcaf\uae87\u839e>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u965f\u7043\ufcaf\uae87\u839e>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u3776\u3504\u4daf\u8753\u59ec\u7c6b), p0:\u965f\u7043\ufcaf\uae87\u839e)
            var_5_79 = invokevirtual:\ud158\u8308\u76bc\u0a06\ud36e(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uc238\u98a4\u6198\ufcaf\u1833\ub102, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            var_6_82 = and:int(ldc:int(-30322), ldc:int(29265))
            
            while (cmplt:boolean(var_6_82:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, var_5_79:\ud158\u8308\u76bc\u0a06\ud36e))) {
                var_7_BC = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ud158\u8308\u76bc\u0a06\ud36e::\u93a2\uc84e\u3e2a\u8d98\u51fa\u4492, var_5_79:\ud158\u8308\u76bc\u0a06\ud36e, var_6_82:int)
                var_8_D1 = invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u76bc\u0c95\u873d\u3e2a\u71ae\u8bb0, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, var_7_BC:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u97e6\u647c\u93a2\uc87f\ud523::\u4f52\u99f7\u5245\u3dd3\u97e6\u40a9), and:int(ldc:int(-31958), ldc:int(31892)))))
                
                if (logicaland:boolean(cmpne:boolean(var_8_D1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753()), invokevirtual:boolean(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::equals, var_8_D1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_73:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))) {
                    return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_7_BC:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u97e6\u647c\u93a2\uc87f\ud523::\u4f52\u99f7\u5245\u3dd3\u97e6\u40a9), and:int(ldc:int(10573), ldc:int(35)))), and:int(ldc:int(-2305), ldc:int(2304)), xor:int(ldc:int(8404), ldc:int(8235))))
                }
                
                var_2_6B = and:int(var_2_6B:int, ldc:int(-541826697))
                inc:int(var_6_82, ldc:int(1))
            }
            
            return:int(and:int(ldc:int(-19172), ldc:int(2721)))
        }
        
        return:int(and:int(ldc:int(15664), ldc:int(-15734)))
    }
    
    public static java.util.Map<\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e, java.lang.Integer> \u8389\u3e75\ud12e\u965f\uff55\u385b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
        var_1_5F : int
        stack_83_0 : \ud158\u8308\u76bc\u0a06\ud36e [generated]
        
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
            var_1_5F = and:int(ldc:int(-194399478), ldc:int(-287499478))
            
            if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u7873\ua6bd\ube23\u8640\uff55\u9937))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-286556177))
                stack_83_0 = invokevirtual:\ud158\u8308\u76bc\u0a06\ud36e(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uc238\u98a4\u6198\ufcaf\u1833\ub102, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            }
            else {
                stack_83_0 = invokestatic:\ud158\u8308\u76bc\u0a06\ud36e(\u7af6\u392e\u8cae\u494c\ub8be\uf9c5::\u8aa5\u7043\u624e\u12cb\u40a9\u7e3f, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            }
            
            return:Map<\u965f\u7043\ufcaf\uae87\u839e, Integer>(invokestatic:Map<\u965f\u7043\ufcaf\uae87\u839e, Integer>(\u97e6\u647c\u93a2\uc87f\ud523::\ud36e\u93a2\u7ce1\ucef1\ubded\u1187, stack_83_0:\ud158\u8308\u76bc\u0a06\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map<\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e, java.lang.Integer> \ud36e\u93a2\u7ce1\ucef1\ubded\u1187(\u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e p0) {
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
    
    public static void \u8d90\u8df4\u8350\ub19c\u9255\u4bc8(java.util.Map<\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e, java.lang.Integer> p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
        var_2_AD : int
        var_4_67 : \ud158\u8308\u76bc\u0a06\ud36e
        var_5_74 : Iterator<Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>>
        var_6_141 : Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>
        var_7_14D : \u965f\u7043\ufcaf\uae87\u839e
        var_8_16D : int
        var_9_176 : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
            var_2_AD = and:int(ldc:int(990189414), ldc:int(-1677915164))
            var_4_67 = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
            var_5_74 = invokeinterface:Iterator<Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>>(Set<Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>>::iterator, invokeinterface:Set<Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>>(Map<\u965f\u7043\ufcaf\uae87\u839e, Integer>::entrySet, p0:Map<\u965f\u7043\ufcaf\uae87\u839e, Integer>))
            
            loop {
                if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0256)
                }
                
                if (cmpeq:boolean(and:int(var_2_AD:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0212)
                }
                
                if (cmpeq:boolean(and:int(var_2_AD:int, ldc:int(256)), ldc:int(0))) {
                    var_2_AD = and:int(var_2_AD:int, ldc:int(2032651690))
                }
                else {
                    var_2_AD = and:int(var_2_AD:int, ldc:int(1524065059))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_74:Iterator<Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>>)) {
                        var_6_141 = checkcast:Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>(java.util.Map.Entry<\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e, java.lang.Integer>.class, invokeinterface:Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>(Iterator<Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>>::next, var_5_74:Iterator<Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>>))
                        var_7_14D = checkcast:\u965f\u7043\ufcaf\uae87\u839e(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e.class, invokeinterface:\u965f\u7043\ufcaf\uae87\u839e(Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>::getKey, var_6_141:Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>))
                        
                        if (cmpne:boolean(var_7_14D:\u965f\u7043\ufcaf\uae87\u839e, aconstnull:\u965f\u7043\ufcaf\uae87\u839e())) {
                            var_8_16D = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>::getValue, var_6_141:Entry<\u965f\u7043\ufcaf\uae87\u839e, Integer>)))
                            var_9_176 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_9_176:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u97e6\u647c\u93a2\uc87f\ud523::\u4f52\u99f7\u5245\u3dd3\u97e6\u40a9), and:int(ldc:int(-22557), ldc:int(22556))), invokestatic:String(String::valueOf, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u965f\u7043\ufcaf\uae87\u839e>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u965f\u7043\ufcaf\uae87\u839e>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u3776\u3504\u4daf\u8753\u59ec\u7c6b), var_7_14D:\u965f\u7043\ufcaf\uae87\u839e)))
                            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u6c56\u76bc\ud51e\u8640\u51fa\u7af6, var_9_176:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u97e6\u647c\u93a2\uc87f\ud523::\u4f52\u99f7\u5245\u3dd3\u97e6\u40a9), and:int(ldc:int(8513), ldc:int(27))), i2s:short(var_8_16D:int))
                            invokevirtual:boolean(AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>::add, var_4_67:AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>, var_9_176:\uc31c\uc87f\uc246\u3776\ub7dc)
                            
                            if (cmpeq:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u7873\ua6bd\ube23\u8640\uff55\u9937))) {
                                invokestatic:void(\u7af6\u392e\u8cae\u494c\ub8be\uf9c5::\uc3e3\u72f1\u3bd6\u5bc4\u4f4a\ucfaf, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, initobject:\u8c8a\u88c5\u0a06\ud51e\ub18d(\u8c8a\u88c5\u0a06\ud51e\ub18d::<init>, var_7_14D:\u965f\u7043\ufcaf\uae87\u839e, var_8_16D:int))
                            }
                        }
                        
                        var_2_AD = and:int(var_2_AD:int, ldc:int(-1187083352))
                        loopcontinue()
                    }
                }
                
                Label_0162:
                
                if (cmpeq:boolean(and:int(var_2_AD:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_AD = and:int(var_2_AD:int, ldc:int(375188418))
                    goto(Label_0256)
                }
                
                if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_AD = and:int(var_2_AD:int, ldc:int(1932324775))
                        loopcontinue()
                    }
                    
                    var_2_AD = and:int(var_2_AD:int, ldc:int(-124416197))
                    
                    if (invokevirtual:boolean(\ud158\u8308\u76bc\u0a06\ud36e::isEmpty, var_4_67:\ud158\u8308\u76bc\u0a06\ud36e)) {
                        invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uae5d\u3e75\u92ee\ud158\u9a18\uc246, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, loadelement:String(getstatic:String[](\u97e6\u647c\u93a2\uc87f\ud523::\u4f52\u99f7\u5245\u3dd3\u97e6\u40a9), and:int(ldc:int(259), ldc:int(6))))
                        goto(Label_0256)
                    }
                }
                
                Label_0212:
                
                if (cmpeq:boolean(and:int(var_2_AD:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_AD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_AD = and:int(var_2_AD:int, ldc:int(148963757))
                        goto(Label_0162)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_AD = and:int(var_2_AD:int, ldc:int(-1639119000))
                    
                    if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u7873\ua6bd\ube23\u8640\uff55\u9937))) {
                        invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u6b0d\uc2bd\u0800\u71ae\ub19c\u5654, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, loadelement:String(getstatic:String[](\u97e6\u647c\u93a2\uc87f\ud523::\u4f52\u99f7\u5245\u3dd3\u97e6\u40a9), and:int(ldc:int(5891), ldc:int(2050))), var_4_67:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
                    }
                }
                
                Label_0256:
                
                if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_AD = and:int(var_2_AD:int, ldc:int(-627090452))
                    goto(Label_0212)
                }
                
                if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_AD = and:int(var_2_AD:int, ldc:int(-2102611697))
                    goto(Label_0162)
                }
                
                if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(32)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_AD = and:int(var_2_AD:int, ldc:int(-391371315))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u5654\u8350\u8d90\u624e\uc2e8\u8709(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ubded\u6c56\uae5d\u3a62\u3776 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
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
    
    private static void \u7ce1\uf995\ubff1\u72f1\u4f4a\u071d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ubded\u6c56\uae5d\u3a62\u3776 p0, java.lang.Iterable<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p1) {
        var_2_61 : int
        var_4_68 : Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        
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
            var_2_61 = and:int(ldc:int(-1913929010), ldc:int(-1549277196))
            var_4_68 = invokeinterface:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(Iterable<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::iterator, p1:Iterable<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1313357850))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_68:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))) {
                    looporswitchbreak()
                }
                
                invokestatic:void(\u97e6\u647c\u93a2\uc87f\ud523::\u5654\u8350\u8d90\u624e\uc2e8\u8709, p0:\ubded\u6c56\uae5d\u3a62\u3776, checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_4_68:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u8bb0\ua61f\uc87f\ub19c\u8413\u8aa5(java.lang.Iterable<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u64f2\u718f\ub6ab\u9033\u8d90\u9033 p1) {
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
    
    public static float \uc229\u5654\ub32d\u946b\ub19c\u7e3f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u92ee\u47c2\u74b1\u74b1\uff55 p1) {
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
    
    public static float \u6d69\u99f7\u120d\u759a\u4f4a\uc3e3(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_1_61 : int
        var_3_69 : int
        stack_86_0 : float [generated]
        
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
            var_1_61 = and:int(ldc:int(2075634651), ldc:int(-218759691))
            var_3_69 = invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049), p0:\ube23\u67d0\u64f2\u839e\u76bc)
            
            if (cmple:boolean(var_3_69:int, ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-558547985))
                stack_86_0 = ldc:float(0.0f)
            }
            else {
                stack_86_0 = invokestatic:float(\ucfaf\ud7e8\ub32d\u6435\u40a9::\u5bc4\uff55\u759a\u8cae\u3dd3\u6b0d, var_3_69:int)
            }
            
            return:float(stack_86_0:float)
        }
        
        goto(Label_0006)
    }
    
    public static void \ub171\u5654\u4179\ube23\ub19c\u7d52(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
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
    
    public static void \ud158\u7873\u3504\u960f\u4492\u6cfe(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
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
    
    public static int \u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_61 : int
        var_4_6C : Collection<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_2_78 : int
        var_5_80 : int
        var_6_89 : Iterator<Object>
        var_8_CA : int
        
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
        var_2_61 = and:int(ldc:int(-678842489), ldc:int(-1075990676))
        var_4_6C = invokeinterface:Collection<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:Iterable<Object>](Map<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::values, invokevirtual:Map<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u965f\u7043\ufcaf\uae87\u839e::\u36d3\u52d3\ube23\uc87f\u51b2\ua6bd, p0:\u965f\u7043\ufcaf\uae87\u839e, p1:\ube23\u67d0\u64f2\u839e\u76bc))
        
        if (cmpne:boolean(var_4_6C:Iterable<Object>, aconstnull:Iterable<Object>())) {
            var_2_78 = and:int(var_2_61:int, ldc:int(-1750861978))
            var_5_80 = and:int(ldc:int(20101), ldc:int(-20166))
            var_6_89 = invokeinterface:Iterator<Object>(Iterable<Object>::iterator, var_4_6C:Iterable<Object>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_89:Iterator<Object>)) {
                var_8_CA = invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, p0:\u965f\u7043\ufcaf\uae87\u839e, checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_6_89:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)))
                
                if (cmpgt:boolean(var_8_CA:int, var_5_80:int)) {
                    var_5_80 = var_8_CA:int
                }
                
                var_2_78 = and:int(var_2_78:int, ldc:int(800059241))
            }
            
            return:int(var_5_80:int)
        }
        
        return:int(and:int(ldc:int(-4066), ldc:int(4001)))
    }
    
    public static int \uc29a\u97e6\u8709\u6c52\ub102\u0b8e(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\ub8be\ud217\u4f52\u7006\u4e72\u960f), p0:\ube23\u67d0\u64f2\u839e\u76bc))
        }
        
        goto(Label_0006)
    }
    
    public static int \ud7e8\u760c\u960f\u7e3f\u3504\u4f4a(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u76bc\uc84e\u6198\u0c95\u40a9\ucb79), p0:\ube23\u67d0\u64f2\u839e\u76bc))
        }
        
        goto(Label_0006)
    }
    
    public static int \u61a4\u8413\u88c5\u36d3\u8308\ub6ab(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b), p0:\ube23\u67d0\u64f2\u839e\u76bc))
        }
        
        goto(Label_0006)
    }
    
    public static int \ub32d\u40a9\u3a62\ud51e\uafe7\u759a(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u7e3f\u6c56\u5d20\u3d64\ub171\ufcaf), p0:\ube23\u67d0\u64f2\u839e\u76bc))
        }
        
        goto(Label_0006)
    }
    
    public static int \uc246\u7bad\u600f\u6c56\u4d85\ub7dc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u3776\u71f1\ud171\u2dcc\u4cd9\u7d52), p0:\ube23\u67d0\u64f2\u839e\u76bc))
        }
        
        goto(Label_0006)
    }
    
    public static int \u516c\u836c\u8df4\ub1b9\u965f\u3504(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public static int \u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u4bc8\ub32d\u4daf\u759a\u9033\u7043), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public static int \u3e75\uc84e\u718f\u4ab3\u8640\u71f1(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u8308\uc87f\u3d64\u8aa5\u5245\u9033), p0:\ube23\u67d0\u64f2\u839e\u76bc))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u7043\ubff1\u8640\ub70c\u3d4b\u494c(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1083348509), ldc:int(415176543))
            
            if (cmple:boolean(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u5654\ubefe\uf9c5\u8258\u88c5\u3d4b), p0:\ube23\u67d0\u64f2\u839e\u76bc), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(45266329))
                stack_8D_0 = and:int(ldc:int(-16208), ldc:int(11086))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(11520), ldc:int(11521))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u4492\ubefe\u960f\u6d69\ub19c\u34df(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(534097458), ldc:int(1475772094))
            
            if (cmple:boolean(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u4bc8\u8d98\u71f1\u5245\u8cae\uceb8), p0:\ube23\u67d0\u64f2\u839e\u76bc), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-68748419))
                stack_8D_0 = and:int(ldc:int(-7009), ldc:int(7008))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(10384), ldc:int(10385))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u76bc\u8df4\ua61f\u759a\ua562\u9a18(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1693755335), ldc:int(-124012772))
            
            if (cmple:boolean(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\u9a18\u4bc8\u3776\u1833\u4f4a\u7e3f, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u74b1\u7e3f\u624e\u3504\u93a2\ub83f), p0:\ube23\u67d0\u64f2\u839e\u76bc), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1829772588))
                stack_8D_0 = and:int(ldc:int(8572), ldc:int(-8573))
            }
            else {
                stack_8D_0 = and:int(ldc:int(4129), ldc:int(577))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ud12e\u12cb\uc84e\u527a\u51b2\u4bc8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(86689503), ldc:int(-1086663026))
            
            if (cmple:boolean(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u647c\u183a\u8bb0\u5db4\u2dcc\u3a62), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1611465005))
                stack_8D_0 = and:int(ldc:int(17088), ldc:int(-17089))
            }
            else {
                stack_8D_0 = and:int(ldc:int(849), ldc:int(4105))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u98a4\u9a18\uc910\u946b\u5bc4\u7c6b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(600972381), ldc:int(-2069926952))
            
            if (cmple:boolean(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u5bc4\u385b\ubefe\u8cae\u97b7\u385b), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(182323819))
                stack_8D_0 = and:int(ldc:int(-5162), ldc:int(5161))
            }
            else {
                stack_8D_0 = and:int(ldc:int(17201), ldc:int(12353))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static int \u0b8e\u5245\u7873\u51fa\uc246\u4c04(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\ud171\u6c52\u71f1\u12cb\ubf56\u9033), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public static int \u8308\u6c56\u120d\u3711\ub102\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:int(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u2dcc\u4179\ub171\u873d\u6ec6\u7873), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u4c04\uc4d2\u4f52\u64f2\u3711\u6b5f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-47640497), ldc:int(1031782319))
            
            if (cmple:boolean(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\ub7dc\u97e6\u1187\u62da\u6198\uae5d), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1072798859))
                stack_8D_0 = and:int(ldc:int(-14203), ldc:int(13688))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(298), ldc:int(299))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map.Entry<\u12b2\u7049\u8df4\uc9f6\uae87.\u392e\uc3e3\uc910\u4c2b\u6c52, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> \ubf56\u3bc9\ucef1\u983f\u6198\u62da(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
    
    public static java.util.Map.Entry<\u12b2\u7049\u8df4\uc9f6\uae87.\u392e\uc3e3\uc910\u4c2b\u6c52, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> \u9033\u624e\u0c95\u392e\ub19c\ub83f(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, java.util.function.Predicate<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p2) {
        var_3_61 : int
        var_5_67 : Map<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_3_B3 : int
        var_6_7C : ArrayList
        var_7_8A : Iterator<Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>
        var_8_FE : Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_9_10A : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        stack_155_0 : Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> [generated]
        
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
        var_3_61 = and:int(ldc:int(1417014143), ldc:int(980851441))
        var_5_67 = invokevirtual:Map<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u965f\u7043\ufcaf\uae87\u839e::\u36d3\u52d3\ube23\uc87f\u51b2\ua6bd, p0:\u965f\u7043\ufcaf\uae87\u839e, p1:\ube23\u67d0\u64f2\u839e\u76bc)
        
        if (logicalnot:boolean(invokeinterface:boolean(Map::isEmpty, var_5_67:Map))) {
            var_3_B3 = and:int(var_3_61:int, ldc:int(-1644917829))
            var_6_7C = invokestatic:ArrayList(Lists::newArrayList)
            var_7_8A = invokeinterface:Iterator<Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>(Set<Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>::iterator, invokeinterface:Set<Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>(Map<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::entrySet, var_5_67:Map<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_7_8A:Iterator)) {
                var_8_FE = checkcast:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(java.util.Map.Entry<\u12b2\u7049\u8df4\uc9f6\uae87.\u392e\uc3e3\uc910\u4c2b\u6c52, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>.class, invokeinterface:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(Iterator<Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>::next, var_7_8A:Iterator<Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>))
                var_9_10A = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::getValue, var_8_FE:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_9_10A:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                    if (cmpgt:boolean(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, p0:\u965f\u7043\ufcaf\uae87\u839e, var_9_10A:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), ldc:int(0))) {
                        if (invokeinterface:boolean(Predicate<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::test, p2:Predicate<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_9_10A:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                            invokeinterface:boolean(List<Entry<K, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>::add, var_6_7C:ArrayList<Entry<K, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>[expected:List<Entry<K, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>], var_8_FE:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
                        }
                    }
                }
                
                var_3_B3 = and:int(var_3_B3:int, ldc:int(1450564091))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_B3:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_B3 = and:int(var_3_B3:int, ldc:int(-1749168457))
                    
                    if (invokeinterface:boolean(List::isEmpty, var_6_7C:ArrayList<Entry<K, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>>)) {
                        stack_155_0 = aconstnull:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>()
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_B3:int, ldc:int(16777216)), ldc:int(0))) {
                    stack_155_0 = checkcast:Entry(java.util.Map.Entry.class, invokeinterface:Entry(List<Entry>::get, var_6_7C:ArrayList<Entry>[expected:List<Entry>], invokevirtual:int(Random::nextInt, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, p1:\ube23\u67d0\u64f2\u839e\u76bc), invokeinterface:int(List<E>::size, var_6_7C:ArrayList<Object>[expected:List<Object>]))))
                    looporswitchbreak()
                }
                
                var_3_B3 = and:int(var_3_B3:int, ldc:int(1245630884))
            }
            
            return:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(stack_155_0:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
        }
        
        return:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(aconstnull:Entry<\u392e\uc3e3\uc910\u4c2b\u6c52, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>())
    }
    
    public static int \u56bd\u72f1\uc84e\u392e\u8aa5\u5f50(java.util.Random p0, int p1, int p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p3) {
        var_4_63 : int
        var_4_9C : int
        var_8_C4 : int
        var_4_10B : int
        stack_179_0 : int [generated]
        
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
        var_4_63 = and:int(ldc:int(633635281), ldc:int(-1351227393))
        
        if (cmple:boolean(invokevirtual:int(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u6bb9\u71ae\u4c04\uc4d2\u960f\u983f, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)), ldc:int(0))) {
            return:int(and:int(ldc:int(12393), ldc:int(-12394)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1668786079))
                
                if (cmpgt:boolean(p2:int, ldc:int(15))) {
                    p2 = ldc:int(15)
                }
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                looporswitchbreak()
            }
        }
        
        var_4_9C = and:int(var_4_63:int, ldc:int(-213334025))
        var_8_C4 = add:int(add:int(add:int(invokevirtual:int(Random::nextInt, p0:Random, ldc:int(8)), and:int(ldc:int(12417), ldc:int(2115))), shr:int(p2:int, and:int(ldc:int(22023), ldc:int(25)))), invokevirtual:int(Random::nextInt, p0:Random, add:int(p2:int, xor:int(ldc:int(1416), ldc:int(1417)))))
        
        if (cmpne:boolean(p1:int, ldc:int(0))) {
            loop {
                if (cmpeq:boolean(and:int(var_4_9C:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_10B = and:int(var_4_9C:int, ldc:int(1163923001))
                }
                else {
                    var_4_10B = and:int(var_4_9C:int, ldc:int(803340245))
                    
                    if (cmpeq:boolean(p1:int, and:int(ldc:int(2757), ldc:int(57)))) {
                        stack_179_0 = add:int(div:int(mul:int(var_8_C4:int, xor:int(ldc:int(-23549), ldc:int(-23551))), and:int(ldc:int(2115), ldc:int(12847))), xor:int(ldc:int(4248), ldc:int(4249)))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_10B:int, ldc:int(524288)), ldc:int(0))) {
                    var_4_10B = and:int(var_4_10B:int, ldc:int(-1183384653))
                    stack_179_0 = invokestatic:int(Math::max, var_8_C4:int, mul:int(p2:int, and:int(ldc:int(16518), ldc:int(7690))))
                    looporswitchbreak()
                }
                
                var_4_9C = and:int(var_4_10B:int, ldc:int(923951963))
            }
            
            return:int(stack_179_0:int)
        }
        
        return:int(invokestatic:int(Math::max, div:int(var_8_C4:int, xor:int(ldc:int(18720), ldc:int(18723))), xor:int(ldc:int(576), ldc:int(577))))
    }
    
    public static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \ud7e8\u12cb\u960f\u385b\u3d64\ub18d(java.util.Random p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, int p2, boolean p3) {
        var_4_63 : int
        var_6_6C : List<\u8c8a\u88c5\u0a06\ud51e\ub18d>
        stack_9D_0 : int [generated]
        var_4_9B : int
        var_7_9D : int
        var_4_FD : int
        var_8_B3 : Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>
        var_9_F0 : \u8c8a\u88c5\u0a06\ud51e\ub18d
        
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
            var_4_63 = and:int(ldc:int(595776212), ldc:int(2017451738))
            var_6_6C = invokestatic:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>(\u97e6\u647c\u93a2\uc87f\ud523::\u7873\u5245\u97e6\ud523\u6b5f\uc29a, p0:Random, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p2:int, p3:boolean)
            
            if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u2dcc\uc7fe\u836c\ua61f\uae5d\ud171))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-25887042))
                stack_9D_0 = and:int(ldc:int(20649), ldc:int(-21178))
            }
            else {
                stack_9D_0 = xor:int(ldc:int(2080), ldc:int(2081))
            }
            
            var_4_9B = and:int(var_4_63:int, ldc:int(-1692798242))
            var_7_9D = stack_9D_0:int
            
            if (cmpne:boolean(var_7_9D:int, ldc:int(0))) {
                p1 = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u7873\ua6bd\ube23\u8640\uff55\u9937))
            }
            
            var_4_FD = and:int(var_4_9B:int, ldc:int(-1144788289))
            var_8_B3 = invokeinterface:Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>(List<\u8c8a\u88c5\u0a06\ud51e\ub18d>::iterator, var_6_6C:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_8_B3:Iterator)) {
                var_9_F0 = checkcast:\u8c8a\u88c5\u0a06\ud51e\ub18d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8c8a\u88c5\u0a06\ud51e\ub18d.class, invokeinterface:\u8c8a\u88c5\u0a06\ud51e\ub18d(Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>::next, var_8_B3:Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>))
                
                if (cmpeq:boolean(var_7_9D:int, ldc:int(0))) {
                    var_4_FD = and:int(var_4_FD:int, ldc:int(1979764735))
                    invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u600f\u8df4\uff55\u51fa\u0a06\u8bb0, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, getfield:\u965f\u7043\ufcaf\uae87\u839e(\u8c8a\u88c5\u0a06\ud51e\ub18d::\uc31c\u4bc8\u52d3\ub18d\u7006\uc9f6, var_9_F0:\u8c8a\u88c5\u0a06\ud51e\ub18d), getfield:int(\u8c8a\u88c5\u0a06\ud51e\ub18d::\u0b8e\u8cae\u156b\u64ab\u5245\u6ec6, var_9_F0:\u8c8a\u88c5\u0a06\ud51e\ub18d))
                }
                else {
                    invokestatic:void(\u7af6\u392e\u8cae\u494c\ub8be\uf9c5::\uc3e3\u72f1\u3bd6\u5bc4\u4f4a\ucfaf, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_9_F0:\u8c8a\u88c5\u0a06\ud51e\ub18d)
                }
                
                var_4_FD = and:int(var_4_FD:int, ldc:int(1671100093))
            }
            
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8c8a\u88c5\u0a06\ud51e\ub18d> \u7873\u5245\u97e6\ud523\u6b5f\uc29a(java.util.Random p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, int p2, boolean p3) {
        var_4_63 : int
        var_6_68 : ArrayList
        var_8_75 : int
        var_4_82 : int
        var_10_EC : List<\u8c8a\u88c5\u0a06\ud51e\ub18d>
        
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
        var_4_63 = and:int(ldc:int(986938697), ldc:int(2059107661))
        var_6_68 = invokestatic:ArrayList(Lists::newArrayList)
        var_8_75 = invokevirtual:int(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u6bb9\u71ae\u4c04\uc4d2\u960f\u983f, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
        
        if (cmple:boolean(var_8_75:int, ldc:int(0))) {
            return:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>(var_6_68:ArrayList<T>)
        }
        
        var_4_82 = and:int(var_4_63:int, ldc:int(-75858571))
        p2 = add:int(add:int(add:int(p2:int, and:int(ldc:int(1633), ldc:int(2433))), invokevirtual:int(Random::nextInt, p0:Random, add:int(div:int(var_8_75:int, and:int(ldc:int(277), ldc:int(17028))), and:int(ldc:int(217), ldc:int(27143))))), invokevirtual:int(Random::nextInt, p0:Random, add:int(div:int(var_8_75:int, and:int(ldc:int(8468), ldc:int(1543))), and:int(ldc:int(2441), ldc:int(69)))))
        p2 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:int(Math::round, add:float(i2f:float(p2:int), mul:float(i2f:float(p2:int), mul:float(sub:float(add:float(invokevirtual:float(Random::nextFloat, p0:Random), invokevirtual:float(Random::nextFloat, p0:Random)), ldc:float(1.0f)), ldc:float(0.15f))))), xor:int(ldc:int(10257), ldc:int(10256)), ldc:int(2147483647))
        var_10_EC = invokestatic:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>(\u97e6\u647c\u93a2\uc87f\ud523::\u0c95\u385b\u88c5\u6d69\ud12e\ud171, p2:int, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p3:boolean)
        
        if (invokeinterface:boolean(List::isEmpty, var_10_EC:List)) {
            goto(Label_0248)
        }
        
        invokeinterface:boolean(List<\u8c8a\u88c5\u0a06\ud51e\ub18d>::add, var_6_68:ArrayList<\u8c8a\u88c5\u0a06\ud51e\ub18d>[expected:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>], invokestatic:\u8c8a\u88c5\u0a06\ud51e\ub18d(\u3bc9\u6ec6\u183a\u9a18\u9a18\u516c::\u9a18\ub171\u9255\u9255\u7043\u8640, p0:Random, var_10_EC:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>))
        Label_0306:
        
        while (cmpne:boolean(and:int(var_4_82:int, ldc:int(256)), ldc:int(0))) {
            var_4_82 = and:int(var_4_82:int, ldc:int(983494007))
            
            if (cmpgt:boolean(invokevirtual:int(Random::nextInt, p0:Random, ldc:int(50)), p2:int)) {
                looporswitchbreak()
            }
            
            invokestatic:void(\u97e6\u647c\u93a2\uc87f\ud523::\u7c6b\u4ab3\u8d90\ua6bd\u647c\ubff1, var_10_EC:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>, checkcast:\u8c8a\u88c5\u0a06\ud51e\ub18d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8c8a\u88c5\u0a06\ud51e\ub18d.class, invokestatic:\u8c8a\u88c5\u0a06\ud51e\ub18d(\ud217\u3504\u760c\uc29a\u97e6\ube23::\ubb2b\u647c\uff55\u3711\uc4d2\ua068, var_6_68:ArrayList<\u8c8a\u88c5\u0a06\ud51e\ub18d>[expected:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>])))
            
            if (invokeinterface:boolean(List::isEmpty, var_10_EC:List)) {
                looporswitchbreak()
            }
            
            var_4_82 = and:int(var_4_82:int, ldc:int(1064464207))
            invokeinterface:boolean(List<T>::add, var_6_68:ArrayList<T>[expected:List<T>], invokestatic:T(\u3bc9\u6ec6\u183a\u9a18\u9a18\u516c::\u9a18\ub171\u9255\u9255\u7043\u8640, p0:Random, var_10_EC:List<T>))
            p2 = div:int(p2:int, and:int(ldc:int(130), ldc:int(11579)))
        }
        
        Label_0248:
        
        if (cmpeq:boolean(and:int(var_4_82:int, ldc:int(134217728)), ldc:int(0))) {
            var_4_82 = and:int(var_4_82:int, ldc:int(1147052553))
            goto(Label_0306)
        }
        
        return:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>(var_6_68:ArrayList<T>)
    }
    
    public static void \u7c6b\u4ab3\u8d90\ua6bd\u647c\ubff1(java.util.List<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8c8a\u88c5\u0a06\ud51e\ub18d> p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8c8a\u88c5\u0a06\ud51e\ub18d p1) {
        var_2_61 : int
        var_4_68 : Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>
        
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
            var_2_61 = and:int(ldc:int(-825583907), ldc:int(-979728647))
            var_4_68 = invokeinterface:Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>(List<\u8c8a\u88c5\u0a06\ud51e\ub18d>::iterator, p0:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>)
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-554031537))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_68:Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>))) {
                    looporswitchbreak()
                }
                
                if (invokevirtual:boolean(\u965f\u7043\ufcaf\uae87\u839e::\ua562\u3711\u759a\u392e\u64ab\u6c52, getfield:\u965f\u7043\ufcaf\uae87\u839e(\u8c8a\u88c5\u0a06\ud51e\ub18d::\uc31c\u4bc8\u52d3\ub18d\u7006\uc9f6, p1:\u8c8a\u88c5\u0a06\ud51e\ub18d), getfield:\u965f\u7043\ufcaf\uae87\u839e(\u8c8a\u88c5\u0a06\ud51e\ub18d::\uc31c\u4bc8\u52d3\ub18d\u7006\uc9f6, checkcast:\u8c8a\u88c5\u0a06\ud51e\ub18d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8c8a\u88c5\u0a06\ud51e\ub18d.class, invokeinterface:\u8c8a\u88c5\u0a06\ud51e\ub18d(Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>::next, var_4_68:Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>))))) {
                    loopcontinue()
                }
                
                invokeinterface:void(Iterator<E>::remove, var_4_68:Iterator<\u8c8a\u88c5\u0a06\ud51e\ub18d>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ud158\u759a\u7af6\uff55\u4975\u4f52(java.util.Collection<\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e> p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p1) {
        var_2_61 : int
        var_4_68 : Iterator<\u965f\u7043\ufcaf\uae87\u839e>
        
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
        var_2_61 = and:int(ldc:int(-510625380), ldc:int(2113437627))
        var_4_68 = invokeinterface:Iterator<\u965f\u7043\ufcaf\uae87\u839e>(Collection<\u965f\u7043\ufcaf\uae87\u839e>::iterator, p0:Collection<\u965f\u7043\ufcaf\uae87\u839e>)
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1076461861))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_68:Iterator<\u965f\u7043\ufcaf\uae87\u839e>)) {
                    if (invokevirtual:boolean(\u965f\u7043\ufcaf\uae87\u839e::\ua562\u3711\u759a\u392e\u64ab\u6c52, checkcast:\u965f\u7043\ufcaf\uae87\u839e(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e.class, invokeinterface:\u965f\u7043\ufcaf\uae87\u839e(Iterator<\u965f\u7043\ufcaf\uae87\u839e>::next, var_4_68:Iterator<\u965f\u7043\ufcaf\uae87\u839e>)), p1:\u965f\u7043\ufcaf\uae87\u839e)) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-504038214))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(23326), ldc:int(-32544)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                return:boolean(xor:int[expected:boolean](ldc:int(-20416), ldc:int(-20415)))
            }
        }
    }
    
    public static java.util.List<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8c8a\u88c5\u0a06\ud51e\ub18d> \u0c95\u385b\u88c5\u6d69\ud12e\ud171(int p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, boolean p2) {
        var_3_61 : int
        var_5_65 : ArrayList
        var_6_6B : \u9af2\u1833\u156b\u12cb\u7d52\u6c52
        stack_98_0 : int [generated]
        var_3_100 : int
        var_7_98 : int
        var_8_A0 : Iterator<Object>
        var_9_E1 : \u965f\u7043\ufcaf\uae87\u839e
        var_10_179 : int
        
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
            var_3_61 = and:int(ldc:int(846822966), ldc:int(-1709449862))
            var_5_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_6B = invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            
            if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u2dcc\uc7fe\u836c\ua61f\uae5d\ud171))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(798195318))
                stack_98_0 = and:int(ldc:int(5483), ldc:int(-6124))
            }
            else {
                stack_98_0 = xor:int(ldc:int(4320), ldc:int(4321))
            }
            
            var_3_100 = and:int(var_3_61:int, ldc:int(1300032950))
            var_7_98 = stack_98_0:int
            var_8_A0 = invokevirtual:Iterator<Object>(Iterable<Object>::iterator, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u965f\u7043\ufcaf\uae87\u839e>[expected:Iterable<Object>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u3776\u3504\u4daf\u8753\u59ec\u7c6b))
            
            loop {
                if (cmpne:boolean(and:int(var_3_100:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_100 = and:int(var_3_100:int, ldc:int(-585531521))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_8_A0:Iterator<Object>)) {
                        var_9_E1 = checkcast:\u965f\u7043\ufcaf\uae87\u839e(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e.class, invokeinterface:\u965f\u7043\ufcaf\uae87\u839e(Iterator<\u965f\u7043\ufcaf\uae87\u839e>::next, var_8_A0:Iterator<\u965f\u7043\ufcaf\uae87\u839e>))
                        
                        if (invokevirtual:boolean(\u965f\u7043\ufcaf\uae87\u839e::\u52d3\u416d\ubb2b\u9af2\ubf56\u4492, var_9_E1:\u965f\u7043\ufcaf\uae87\u839e)) {
                            if (logicalnot:boolean(p2:boolean)) {
                                goto(Label_0265)
                            }
                        }
                        
                        Label_0235:
                        
                        if (cmpeq:boolean(and:int(var_3_100:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0333)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_100:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_100 = and:int(var_3_100:int, ldc:int(1677193150))
                            
                            if (invokevirtual:boolean(\u965f\u7043\ufcaf\uae87\u839e::\uafe7\uf9c5\u2dcc\u56bd\u4c2b\ub70c, var_9_E1:\u965f\u7043\ufcaf\uae87\u839e)) {
                                if (invokevirtual:boolean(\u8bb0\u527a\u4cd9\ub171\ud171::\u12b2\uc246\u4e72\u64ab\u6fb0\u36d3, getfield:\u8bb0\u527a\u4cd9\ub171\ud171(\u965f\u7043\ufcaf\uae87\u839e::\ub19c\u3e2a\u5f50\ua562\u759a\u759a, var_9_E1:\u965f\u7043\ufcaf\uae87\u839e), var_6_6B:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)) {
                                    goto(Label_0333)
                                }
                                
                                if (cmpne:boolean(var_7_98:int, ldc:int(0))) {
                                    goto(Label_0333)
                                }
                            }
                        }
                        
                        Label_0265:
                        
                        if (cmpeq:boolean(and:int(var_3_100:int, ldc:int(16777216)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_100:int, ldc:int(32)), ldc:int(0))) {
                                var_3_100 = and:int(var_3_100:int, ldc:int(-261598993))
                                goto(Label_0235)
                            }
                            
                            var_3_100 = and:int(var_3_100:int, ldc:int(1813147195))
                            loopcontinue()
                        }
                        
                        Label_0333:
                        
                        if (cmpne:boolean(and:int(var_3_100:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_100 = and:int(var_3_100:int, ldc:int(-1719563480))
                            goto(Label_0265)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_100:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_100 = and:int(var_3_100:int, ldc:int(-1068644289))
                            goto(Label_0235)
                        }
                        
                        var_3_100 = and:int(var_3_100:int, ldc:int(-721920074))
                        var_10_179 = invokevirtual:int(\u965f\u7043\ufcaf\uae87\u839e::\u99f7\ufe34\u8413\ub19c\u0800\u6cfe, var_9_E1:\u965f\u7043\ufcaf\uae87\u839e)
                        
                        while (cmpgt:boolean(var_10_179:int, sub:int(invokevirtual:int(\u965f\u7043\ufcaf\uae87\u839e::\u3504\u9a18\u9937\u4492\u6ec6\ub19c, var_9_E1:\u965f\u7043\ufcaf\uae87\u839e), and:int(ldc:int(25667), ldc:int(4157))))) {
                            if (logicaland:boolean(cmpge:boolean(p0:int, invokevirtual:int(\u965f\u7043\ufcaf\uae87\u839e::\u965f\u3e75\u8709\u4cd9\u0800\u0800, var_9_E1:\u965f\u7043\ufcaf\uae87\u839e, var_10_179:int)), cmple:boolean(p0:int, invokevirtual:int(\u965f\u7043\ufcaf\uae87\u839e::\uf995\u927d\u8c8a\u965f\ud217\u071d, var_9_E1:\u965f\u7043\ufcaf\uae87\u839e, var_10_179:int)))) {
                                invokeinterface:boolean(List<\u8c8a\u88c5\u0a06\ud51e\ub18d>::add, var_5_65:ArrayList<\u8c8a\u88c5\u0a06\ud51e\ub18d>[expected:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>], initobject:\u8c8a\u88c5\u0a06\ud51e\ub18d(\u8c8a\u88c5\u0a06\ud51e\ub18d::<init>, var_9_E1:\u965f\u7043\ufcaf\uae87\u839e, var_10_179:int))
                                looporswitchbreak()
                            }
                            
                            var_3_100 = and:int(var_3_100:int, ldc:int(1566072443))
                            inc:int(var_10_179, ldc:int(-1))
                        }
                        
                        goto(Label_0265)
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_100:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_100 = and:int(var_3_100:int, ldc:int(-369734476))
            }
            
            return:List<\u8c8a\u88c5\u0a06\ud51e\ub18d>(var_5_65:ArrayList<\u8c8a\u88c5\u0a06\ud51e\ub18d>)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4492\ub102\u7043\u76bc\ud217\u6435$6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(10883), ldc:int(65)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub83f\u6fb0\u34df\ub102\u4daf\uceb8$5(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p2, int p3) {
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
            invokevirtual:void(\u965f\u7043\ufcaf\uae87\u839e::\ub113\u5fe1\u946b\u7049\uc229\ub102, p2:\u965f\u7043\ufcaf\uae87\u839e, p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\u7d52\u718f\u3776\u6fb0\ub83f, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u12cb\u760c\u6198\ud7e8\uc31c\ud12e$4(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p2, int p3) {
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
            invokevirtual:void(\u965f\u7043\ufcaf\uae87\u839e::\u6435\u8bb0\ub32d\ub8be\u8709\ub171, p2:\u965f\u7043\ufcaf\uae87\u839e, p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\u7d52\u718f\u3776\u6fb0\ub83f, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uf94d\u92ff\u3dd3\ubefe\u74b1\u3e75$3(org.apache.commons.lang3.mutable.MutableFloat p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u92ee\u47c2\u74b1\u74b1\uff55 p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p2, int p3) {
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
            invokevirtual:void(MutableFloat::add, p0:MutableFloat, invokevirtual:float(\u965f\u7043\ufcaf\uae87\u839e::\u4492\u76bc\uc29a\u3e75\u9a18\u12b2, p2:\u965f\u7043\ufcaf\uae87\u839e, p3:int, p1:\u92ee\u47c2\u74b1\u74b1\uff55))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u76bc\u92ff\u6b0d\ubb2b\ubb2b\ud217$2(org.apache.commons.lang3.mutable.MutableInt p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u64f2\u718f\ub6ab\u9033\u8d90\u9033 p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p2, int p3) {
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
            invokevirtual:void(MutableInt::add, p0:MutableInt, invokevirtual:int(\u965f\u7043\ufcaf\uae87\u839e::\u8413\ub6ab\u67d0\u98a4\u8350\uc84e, p2:\u965f\u7043\ufcaf\uae87\u839e, p3:int, p1:\u64f2\u718f\ub6ab\u9033\u8d90\u9033))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ucfaf\u4492\u97b7\ud158\u3bd6\uc9f6$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ubded\u6c56\uae5d\u3a62\u3776 p0, int p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p2) {
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
            invokeinterface:void(\ubded\u6c56\uae5d\u3a62\u3776::\u156b\uc87f\ud36e\ud217\u9a18\ub6ab, p0:\ubded\u6c56\uae5d\u3a62\u3776, p2:\u965f\u7043\ufcaf\uae87\u839e, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ua3b4\u0b8e\u9af2\u4c2b\u88c5\uff55$0(java.util.Map p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p2) {
        var_5_7E : Integer
        
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
            var_5_7E = checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Map<\u965f\u7043\ufcaf\uae87\u839e, Integer>::put, p0:Map<\u965f\u7043\ufcaf\uae87\u839e, Integer>, p2:\u965f\u7043\ufcaf\uae87\u839e, invokestatic:Integer(Integer::valueOf, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u97e6\u647c\u93a2\uc87f\ud523::\u4f52\u99f7\u5245\u3dd3\u97e6\u40a9), and:int(ldc:int(1025), ldc:int(4901)))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_89 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_C8_0 : byte[] [generated]
        stack_E3_0 : byte[] [generated]
        stack_1D1_0 : byte[] [generated]
        stack_233_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_161 : byte[]
        var_4_162 : int
        expr_97 : int [generated]
        var_5_1B2 : int
        var_3_1B7 : byte[]
        var_4_1B8 : int
        expr_1D4 : byte [generated]
        var_0_229 : int
        expr_233 : byte [generated]
        stack_263_2 : byte [generated]
        expr_C8 : int [generated]
        var_3_EF : String
        stack_158_0 : String[] [generated]
        expr_101 : String[] [generated]
        
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
            var_0_89 = and:int(ldc:int(-755209437), ldc:int(-1864041482))
            expr_68 = var_2_6C = stack_95_0 = stack_97_0 = stack_C6_0 = stack_C8_0 = stack_E3_0 = stack_1D1_0 = stack_233_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AbR9f7n0vj54+3s+Pfq0/BuU"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_161 = newarray:byte[](byte.class, expr_70:int)
                var_4_162 = expr_70:int
                
                loop {
                    var_0_89 = and:int(var_0_89:int, ldc:int(-219838037))
                    var_4_162 = add:int(var_4_162:int, ldc:int(-1))
                    storeelement:byte(var_3_161:byte[], var_4_162:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_162:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_162:int, and:int(ldc:int(257), ldc:int(18533)))), ldc:int(2)), and:int(ldc:int(8447), ldc:int(16703)))))
                    
                    if (cmpne:boolean(var_4_162:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_C6_0 = stack_C8_0 = stack_E3_0 = stack_1D1_0 = stack_233_0 = var_3_161:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0205)
                }
                
                if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_89 = and:int(var_0_89:int, ldc:int(-1487098859))
                    goto(Label_0156)
                }
                
                var_0_89 = and:int(var_0_89:int, ldc:int(-1313415370))
                expr_97 = arraylength:int(stack_97_0:byte[])
                
                if (cmpeq:boolean(expr_97:int, ldc:int(0))) {
                    goto(Label_0156)
                }
                
                var_5_1B2 = expr_97:int
                var_3_1B7 = newarray:byte[](byte.class, expr_97:int)
                var_4_1B8 = expr_97:int
                Label_0442:
                
                while (cmpeq:boolean(and:int(var_0_89:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_89 = and:int(var_0_89:int, ldc:int(-1663731525))
                    var_4_1B8 = add:int(var_4_1B8:int, ldc:int(-1))
                    expr_1D4 = add:byte(loadelement:byte(stack_1D1_0:byte[], var_4_1B8:int), ldc:byte(17))
                    storeelement:byte(var_3_1B7:byte[], var_4_1B8:int, xor:int(or:int(and:int(shl:int(expr_1D4:byte, xor:int(ldc:int(21), ldc:int(17))), ldc:int(-16)), and:int(shr:int(expr_1D4:byte[expected:int], xor:int(ldc:int(3168), ldc:int(3172))), ldc:int(15))), ldc:int(5)))
                    
                    if (cmpne:boolean(var_4_1B8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_97_0 = stack_95_0 = stack_C6_0 = stack_C8_0 = stack_E3_0 = stack_1D1_0 = stack_233_0 = var_3_1B7:byte[]
                    goto(Label_0156)
                }
                
                Label_0540:
                
                while (cmpeq:boolean(and:int(var_0_89:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_229 = and:int(var_0_89:int, ldc:int(-174232134))
                    var_4_1B8 = add:int(var_4_1B8:int, ldc:int(-1))
                    expr_233 = loadelement:byte(stack_233_0:byte[], var_4_1B8:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_1B8:int, ldc:int(2)), neg:int(var_5_1B2:int)), ldc:int(0))) {
                        var_0_229 = and:int(var_0_229:int, ldc:int(-595232598))
                        stack_263_2 = add:byte(expr_233:byte, ldc:byte(2))
                    }
                    else {
                        stack_263_2 = add:byte(expr_233:byte, loadelement:byte(var_3_1B7:byte[], add:int(var_4_1B8:int, ldc:int(2))))
                    }
                    
                    var_0_89 = and:int(var_0_229:int, ldc:int(-88336337))
                    storeelement:byte(var_3_1B7:byte[], var_4_1B8:int, stack_263_2:byte)
                    
                    if (cmpne:boolean(var_4_1B8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_97_0 = stack_95_0 = stack_C6_0 = stack_C8_0 = stack_E3_0 = stack_1D1_0 = stack_233_0 = var_3_1B7:byte[]
                    goto(Label_0205)
                }
                
                goto(Label_0442)
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(2)), ldc:int(0))) {
                    var_0_89 = and:int(var_0_89:int, ldc:int(-938888775))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_89:int, ldc:int(16777216)), ldc:int(0))) {
                        var_0_89 = and:int(var_0_89:int, ldc:int(1969638623))
                        loopcontinue()
                    }
                    
                    var_0_89 = and:int(var_0_89:int, ldc:int(-1733407318))
                    expr_C8 = arraylength:int(stack_C8_0:byte[])
                    
                    if (cmpne:boolean(expr_C8:int, ldc:int(0))) {
                        var_5_1B2 = expr_C8:int
                        var_3_1B7 = newarray:byte[](byte.class, expr_C8:int)
                        var_4_1B8 = expr_C8:int
                        goto(Label_0540)
                    }
                }
                
                Label_0205:
                
                if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0156)
                }
                
                if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_EF = initobject:String(String::<init>, stack_E3_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_158_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3619), ldc:int(16583)))
            expr_101 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2077), ldc:int(2078)))
            storeelement:String(expr_101:String[], xor:int(ldc:int(803), ldc:int(801)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(26882), ldc:int(-26883)), and:int(ldc:int(2076), ldc:int(461))))
            storeelement:String(expr_101:String[], and:int(ldc:int(4887), ldc:int(-5912)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(156), ldc:int(9485)), xor:int(ldc:int(50), ldc:int(60))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(1088), ldc:int(1089)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(1534), ldc:int(25103)), and:int(ldc:int(2101), ldc:int(17691))))
            putstatic:String[](\u97e6\u647c\u93a2\uc87f\ud523::\u4f52\u99f7\u5245\u3dd3\u97e6\u40a9, expr_101:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6cfe\u3d4b\u0a06\u8d90\u3d64\u8753(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_678 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_683 : int
        
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
        var_3_678 = and:int(ldc:int(1907199857), ldc:int(-167969807))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u97e6\u647c\u93a2\uc87f\ud523[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4096)), ldc:int(0))) {
            var_3_678 = and:int(var_3_678:int, ldc:int(-2087422923))
        }
        else {
            var_3_678 = and:int(var_3_678:int, ldc:int(2112658401))
            var_5_8A = and:int(ldc:int(-17112), ldc:int(17031))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10890), ldc:int(-10891)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_678:int, ldc:int(1908404081))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(2085), ldc:int(1033)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(260), ldc:int(261)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_678 = and:int(var_3_D9:int, ldc:int(1907149687))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(258), ldc:int(259)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1551384252))
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1881765852))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1710540384))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(225548788))
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1511310076))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0868)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(905019164))
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(2075982829))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0868)
                        }
                    }
                    
                    Label_0426:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1452084548))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1341362099))
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(745880846))
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-441622043))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-239277193))
                            var_11_EA = and:int(ldc:int(-13107), ldc:int(13106))
                            goto(Label_1537)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0588:
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(128)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(310183910))
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(739907920))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(128)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1822739782))
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-407694148))
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(991617219))
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(1946021757))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0868)
                        }
                    }
                    
                    Label_0721:
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(2)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1153442636))
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-190725632))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-405164517))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1703502988))
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(64)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1860453738))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(128)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(2002660591))
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(2079248255))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0868:
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-463586601))
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0721)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(-5469207))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = xor:int(ldc:int(17154), ldc:int(17155))
                                goto(Label_1148)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(2016241922))
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(2)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1872538029))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(1526161628))
                            goto(Label_0868)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(1001385543))
                            goto(Label_0721)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(610828530))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1344668576))
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(64)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1867266161))
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(1907149819))
                        var_11_EA = and:int(ldc:int(-7521), ldc:int(7520))
                    }
                    
                    Label_1148:
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(662422950))
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1053848510))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1095572228))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-18542140))
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-2033412288))
                            goto(Label_0868)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0721)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1488562491))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(1940914171))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1412)
                            }
                        }
                    }
                    
                    Label_1288:
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(128)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(675920940))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1148)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(64)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(1546195604))
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0868)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0721)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(64)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1822523698))
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-138633363))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                            goto(Label_1537)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1412:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(64)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1167188303))
                        goto(Label_1548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(64)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1498062568))
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0868)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1040660918))
                        loopcontinue()
                    }
                    
                    var_3_678 = and:int(var_3_678:int, ldc:int(2079120225))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1537:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_683 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1548:
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1861960932))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(64)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1160061460))
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1348629466))
                        goto(Label_0721)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(256)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(12131364))
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-168955923))
                        var_17_683 = add:int(var_16_118:int, and:int(ldc:int(3107), ldc:int(29513)))
                        looporswitchbreak()
                    }
                }
                
                var_3_678 = and:int(var_3_678:int, ldc:int(-71316617))
                
                if (cmple:boolean(var_5_8A = var_17_683:int, sub:int(var_6_91:int, xor:int(ldc:int(5), ldc:int(4))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
