public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u6c52\ube23\ucb79\u494c\u8d98 {
    public void \u6c52\ube23\ucb79\u494c\u8d98() {
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
            invokespecial:Object(Object::<init>, this:\u6c52\ube23\ucb79\u494c\u8d98)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u873d\u3c25\ud158\u6435\u6c56\u3a62(java.lang.String p0, java.lang.Class<T> p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u836c\u6198\ua6bd\u071d\u47c2<T> p2) {
        var_5_68 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_6_99 : \u4975\u92ee\u5d20\u120d\u7873<T>
        
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
        var_5_68 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p0:String)
        
        if (invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<Class<?>, \u4975\u92ee\u5d20\u120d\u7873<?>>(\u6c52\ube23\ucb79\u494c\u8d98::\u3e75\u6c52\ub7dc\ud51e\ua562\u7ce1), p1:Class<?>[expected:Object])) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(1388), ldc:int(-1901)))), invokevirtual:String(Class<T>::getName, p1:Class<?>)), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(16785), ldc:int(1)))))))
        }
        
        if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4975\u92ee\u5d20\u120d\u7873<?>>(\u6c52\ube23\ucb79\u494c\u8d98::\u8308\ub32d\uc4d2\uc4d2\uf94d\u4f52), var_5_68:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))) {
            var_6_99 = initobject:\u4975\u92ee\u5d20\u120d\u7873(\u4975\u92ee\u5d20\u120d\u7873::<init>, p1:Class<?>, p2:\u836c\u6198\ua6bd\u071d\u47c2<T>, var_5_68:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u3bd6\ub18d\u7043\u71f1\u4f52())
            invokeinterface:\u4975\u92ee\u5d20\u120d\u7873<?>(Map<Class<?>, \u4975\u92ee\u5d20\u120d\u7873<?>>::put, getstatic:Map<Class<?>, \u4975\u92ee\u5d20\u120d\u7873<?>>(\u6c52\ube23\ucb79\u494c\u8d98::\u3e75\u6c52\ub7dc\ud51e\ua562\u7ce1), p1:Class<?>, var_6_99:\u4975\u92ee\u5d20\u120d\u7873<?>)
            invokeinterface:\u4975\u92ee\u5d20\u120d\u7873<?>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4975\u92ee\u5d20\u120d\u7873<?>>::put, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4975\u92ee\u5d20\u120d\u7873<?>>(\u6c52\ube23\ucb79\u494c\u8d98::\u8308\ub32d\uc4d2\uc4d2\uf94d\u4f52), var_5_68:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_6_99:\u4975\u92ee\u5d20\u120d\u7873<?>)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(318), ldc:int(14531)))), var_5_68:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(16392), ldc:int(16395)))))))
    }
    
    public static void \u494c\uc9f6\u4c2b\uc238\uff55\u8bb0() {
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
            invokestatic:void(\u3a62\uc31c\ubded\u8cae\u99f7::\u8350\u6435\u8d90\ub7dc\u6bb9\u4c04)
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(-32766), ldc:int(-32762))), ldc:Class<\u600f\u9937\ub8be\ud171\u624e>(\u56bd\u8413\u647c\u5bc4\ud158.\u600f\u9937\ub8be\ud171\u624e.class), initobject:\u7bad\ufcaf\u6cfe\ub1b9\u3c25[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::<init>))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(115), ldc:int(118))), ldc:Class<\ubf56\u7e3f\ua61f\u8753\u5f50>(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u7e3f\ua61f\u8753\u5f50.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\ubf56\u7e3f\ua61f\u8753\u5f50>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(1030), ldc:int(1024))), ldc:Class<\u8413\uc2e8\u3e2a\u7043\uc9f6>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8413\uc2e8\u3e2a\u7043\uc9f6.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u8413\uc2e8\u3e2a\u7043\uc9f6>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(1153), ldc:int(1158))), ldc:Class<\u4f4a\u7e3f\u5fe1\u8350\ub8be>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4f4a\u7e3f\u5fe1\u8350\ub8be.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u4f4a\u7e3f\u5fe1\u8350\ub8be>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(106), ldc:int(19096))), ldc:Class<\u4f52\u873d\u5bc4\u647c\u4c2b>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u4f52\u873d\u5bc4\u647c\u4c2b.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u4f52\u873d\u5bc4\u647c\u4c2b>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(2073), ldc:int(717))), ldc:Class<\u8cae\u4cd9\u3dd3\u5fe1\u4daf>(\u59ec\u8413\u97e6\uc229\u3776.\u8cae\u4cd9\u3dd3\u5fe1\u4daf.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u8cae\u4cd9\u3dd3\u5fe1\u4daf>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(74), ldc:int(27658))), ldc:Class<\ub1b9\u59ec\u9033\u8389\u62da>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ub1b9\u59ec\u9033\u8389\u62da.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\ub1b9\u59ec\u9033\u8389\u62da>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(-32200), ldc:int(-32205))), ldc:Class<\u8bb0\u5f50\u760c\u7af6\u760c>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u8bb0\u5f50\u760c\u7af6\u760c.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u8bb0\u5f50\u760c\u7af6\u760c>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(8204), ldc:int(16412))), ldc:Class<\uf94d\u983f\u40a9\u6fb0\u12b2>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uf94d\u983f\u40a9\u6fb0\u12b2.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\uf94d\u983f\u40a9\u6fb0\u12b2>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(2463), ldc:int(17421))), ldc:Class<\u760c\ua61f\ub7dc\u12b2\u12cb>(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u760c\ua61f\ub7dc\u12b2\u12cb.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u760c\ua61f\ub7dc\u12b2\u12cb>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(1070), ldc:int(8415))), ldc:Class<\u8d98\u3bd6\u3d4b\u3bc9\ub102>(\u36d3\u9033\u6b0d\u983f\u8d90.\u8d98\u3bd6\u3d4b\u3bc9\ub102.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u8d98\u3bd6\u3d4b\u3bc9\ub102>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(-31672), ldc:int(-31673))), ldc:Class<\u6d69\ub83f\u7e3f\ud51e\uafe7>(\u59ec\u8413\u97e6\uc229\u3776.\u6d69\ub83f\u7e3f\ud51e\uafe7.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u6d69\ub83f\u7e3f\ud51e\uafe7>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(278), ldc:int(25745))), ldc:Class<\u3c25\u5140\u7049\uae5d\ub32d>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3c25\u5140\u7049\uae5d\ub32d.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u3c25\u5140\u7049\uae5d\ub32d>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(8757), ldc:int(8740))), ldc:Class<\u61a4\u6c52\u4ab3\u4ab3\u4c04>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u61a4\u6c52\u4ab3\u4ab3\u4c04.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u61a4\u6c52\u4ab3\u4ab3\u4c04>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(18), ldc:int(3219))), ldc:Class<\u12b2\u873d\u56bd\ua3b4\u4f4a>(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u12b2\u873d\u56bd\ua3b4\u4f4a.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u12b2\u873d\u56bd\ua3b4\u4f4a>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(2861), ldc:int(2878))), ldc:Class<\u64ab\u7d52\u5f50\uc3e3\ubb2b>(\u51fa\u12cb\u7330\u74b1\u6c52.\u64ab\u7d52\u5f50\uc3e3\ubb2b.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u64ab\u7d52\u5f50\uc3e3\ubb2b>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(7484), ldc:int(87))), ldc:Class<\u6cfe\uc4d2\u3711\ubf56\ubf56>(\ub113\ufcaf\u3c25\u071d\u97b7.\u6cfe\uc4d2\u3711\ubf56\ubf56.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u6cfe\uc4d2\u3711\ubf56\ubf56>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(1143), ldc:int(24597))), ldc:Class<\u0b8e\u527a\ubcb0\u56bd\u873d>(\u5d20\u97b7\u8753\u873d\u16f6.\u0b8e\u527a\ubcb0\u56bd\u873d.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u0b8e\u527a\ubcb0\u56bd\u873d>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(726), ldc:int(5142))), ldc:Class<\u8709\u183a\ubefe\u62da\u8308>(\u3d64\u7af6\uae87\uc238\u7d52.\u8709\u183a\ubefe\u62da\u8308.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u8709\u183a\ubefe\u62da\u8308>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(8631), ldc:int(16479))), ldc:Class<\ub19c\u51b2\ud12e\u0b8e\ua6bd>(\u59ec\u8413\u97e6\uc229\u3776.\ub19c\u51b2\ud12e\u0b8e\ua6bd.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\ub19c\u51b2\ud12e\u0b8e\ua6bd>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(16590), ldc:int(16598))), ldc:Class<\u6b0d\u3bd6\uff55\u8258\u93a2>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u6b0d\u3bd6\uff55\u8258\u93a2.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u6b0d\u3bd6\uff55\u8258\u93a2>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(23611), ldc:int(8285))), ldc:Class<\ubff1\u5140\u8d98\u92ff\u718f>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\ubff1\u5140\u8d98\u92ff\u718f.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\ubff1\u5140\u8d98\u92ff\u718f>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(2458), ldc:int(9310))), ldc:Class<\u8709\u7043\ub83f\uf94d\u416d>(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u8709\u7043\ub83f\uf94d\u416d.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u8709\u7043\ub83f\uf94d\u416d>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(12827), ldc:int(1179))), ldc:Class<\uc2e8\u40a9\u0c95\u9937\ud36e>(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\uc2e8\u40a9\u0c95\u9937\ud36e.class), initobject:\u6b5f\u5f50\u7330\ud36e\u7ce1[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\u6b5f\u5f50\u7330\ud36e\u7ce1::<init>))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(16977), ldc:int(16973))), ldc:Class<\u4d85\u6435\u7bad\u3dd3\u9937>(\u36d3\u9033\u6b0d\u983f\u8d90.\u4d85\u6435\u7bad\u3dd3\u9937.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u4d85\u6435\u7bad\u3dd3\u9937>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(-11768), ldc:int(-11755))), ldc:Class<\u67d0\u416d\u7bad\uc3e3\u7d52>(\u6b0d\u12cb\u156b\u4179\u8bb0.\u67d0\u416d\u7bad\uc3e3\u7d52.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u67d0\u416d\u7bad\uc3e3\u7d52>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(12367), ldc:int(12369))), ldc:Class<\u67e9\u3504\u3bd6\u7006\ub18d>(\u12b2\u7049\u8df4\uc9f6\uae87.\u67e9\u3504\u3bd6\u7006\ub18d.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u67e9\u3504\u3bd6\u7006\ub18d>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(4287), ldc:int(28255))), ldc:Class<\u59ec\u92ee\u7c6b\u34df\u8d98>(\u12b2\u7049\u8df4\uc9f6\uae87.\u59ec\u92ee\u7c6b\u34df\u8d98.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u59ec\u92ee\u7c6b\u34df\u8d98>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(61), ldc:int(8226))), ldc:Class<\u3776\uc7fe\u8258\u99f7\u8709>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3776\uc7fe\u8258\u99f7\u8709.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u3776\uc7fe\u8258\u99f7\u8709>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(-29178), ldc:int(-29145))), ldc:Class<\u6c52\ucef1\ub19c\u960f\u0b8e>(\u56bd\u8413\u647c\u5bc4\ud158.\u6c52\ucef1\ub19c\u960f\u0b8e.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u6c52\ucef1\ub19c\u960f\u0b8e>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(4726), ldc:int(4692))), ldc:Class<\u67d0\u98a4\uc910\u4f4a\u8c8a>(\u5d20\u97b7\u8753\u873d\u16f6.\u67d0\u98a4\uc910\u4f4a\u8c8a.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u67d0\u98a4\uc910\u4f4a\u8c8a>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(1046), ldc:int(1077))), ldc:Class<\u6c52\ub1b9\uc7fe\ucfaf\u5d20>(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u6c52\ub1b9\uc7fe\ucfaf\u5d20.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u6c52\ub1b9\uc7fe\ucfaf\u5d20>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(-30441), ldc:int(-30413))), ldc:Class<\u3bd6\ub171\uc4d2\u6b5f\u6bb9>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3bd6\ub171\uc4d2\u6b5f\u6bb9.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u3bd6\ub171\uc4d2\u6b5f\u6bb9>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(293), ldc:int(8941))), ldc:Class<\u5d20\uc238\u12b2\u8640\ub83f>(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u5d20\uc238\u12b2\u8640\ub83f.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u5d20\uc238\u12b2\u8640\ub83f>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(4455), ldc:int(8230))), ldc:Class<\u527a\u4ab3\u62da\u8bb0\u5140>(\ub113\ufcaf\u3c25\u071d\u97b7.\u527a\u4ab3\u62da\u8bb0\u5140.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u527a\u4ab3\u62da\u8bb0\u5140>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(129), ldc:int(166))), ldc:Class<\ub1b9\u7330\u3e2a\ud171\u0800>(\u59ec\u8413\u97e6\uc229\u3776.\ub1b9\u7330\u3e2a\ud171\u0800.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\ub1b9\u7330\u3e2a\ud171\u0800>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(559), ldc:int(519))), ldc:Class<\u99f7\u7bad\uc87f\uc910\uc9f6>(\ub113\ufcaf\u3c25\u071d\u97b7.\u99f7\u7bad\uc87f\uc910\uc9f6.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u99f7\u7bad\uc87f\uc910\uc9f6>(get:()Ljava/util/function/Supplier;)))
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(3226), ldc:int(3251))), ldc:Class<\u5140\u8bb0\uc84e\u4179\ubcb0>(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5140\u8bb0\uc84e\u4179\ubcb0.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u5140\u8bb0\uc84e\u4179\ubcb0>(get:()Ljava/util/function/Supplier;)))
            
            if (getstatic:boolean(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\uc31c\ub8be\u52d3\u5fe1\uceb8\u7006)) {
                invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(195), ldc:int(233))), ldc:Class<\u5140\u61a4\u7873\ud217\u5db4>(\u36d3\u9033\u6b0d\u983f\u8d90.\u5140\u61a4\u7873\ud217\u5db4.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u5140\u61a4\u7873\ud217\u5db4>(get:()Ljava/util/function/Supplier;)))
                invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u873d\u3c25\ud158\u6435\u6c56\u3a62, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(28), ldc:int(55))), ldc:Class<\u8413\u92ff\u8cae\u392e\u51fa>(\ub113\uc4d2\u183a\u527a\u6435.\u8413\u92ff\u8cae\u392e\u51fa.class), initobject:\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>[expected:\u836c\u6198\ua6bd\u071d\u47c2<ArgumentType>](\ubefe\u3776\u9a18\u8cae\ua6bd<ArgumentType>::<init>, invokedynamic:Supplier<\u8413\u92ff\u8cae\u392e\u51fa>(get:()Ljava/util/function/Supplier;)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4975\u92ee\u5d20\u120d\u7873<?> \ub6ab\u7c6b\u120d\u960f\u7af6\u647c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u4975\u92ee\u5d20\u120d\u7873<?>(checkcast:\u4975\u92ee\u5d20\u120d\u7873<?>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4975\u92ee\u5d20\u120d\u7873<?>.class, invokeinterface:\u4975\u92ee\u5d20\u120d\u7873<?>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4975\u92ee\u5d20\u120d\u7873<?>>::get, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4975\u92ee\u5d20\u120d\u7873<?>>(\u6c52\ube23\ucb79\u494c\u8d98::\u8308\ub32d\uc4d2\uc4d2\uf94d\u4f52), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4975\u92ee\u5d20\u120d\u7873<?> \ub6ab\u7c6b\u120d\u960f\u7af6\u647c(com.mojang.brigadier.arguments.ArgumentType<?> p0) {
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
            return:\u4975\u92ee\u5d20\u120d\u7873<?>(checkcast:\u4975\u92ee\u5d20\u120d\u7873<?>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4975\u92ee\u5d20\u120d\u7873<?>.class, invokeinterface:\u4975\u92ee\u5d20\u120d\u7873<?>(Map<Class<?>, \u4975\u92ee\u5d20\u120d\u7873<?>>::get, getstatic:Map<Class<?>, \u4975\u92ee\u5d20\u120d\u7873<?>>(\u6c52\ube23\ucb79\u494c\u8d98::\u3e75\u6c52\ub7dc\ud51e\ua562\u7ce1), invokevirtual:Class<? extends ArgumentType>[expected:Object](ArgumentType<?>::getClass, p0:ArgumentType<?>))))
        }
        
        goto(Label_0006)
    }
    
    public static void \u3bc9\u3a62\ud217\u5f50\u8350\uf995(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, T extends com.mojang.brigadier.arguments.ArgumentType<?> p1) {
        var_2_61 : int
        var_4_66 : \u4975\u92ee\u5d20\u120d\u7873<?>
        
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
            var_2_61 = and:int(ldc:int(1129574858), ldc:int(-987531807))
            var_4_66 = invokestatic:\u4975\u92ee\u5d20\u120d\u7873<?>(\u6c52\ube23\ucb79\u494c\u8d98::\ub6ab\u7c6b\u120d\u960f\u7af6\u647c, p1:T extends ArgumentType<?>[expected:ArgumentType<?>])
            
            if (cmpne:boolean(var_4_66:\u4975\u92ee\u5d20\u120d\u7873<?>, aconstnull:\u4975\u92ee\u5d20\u120d\u7873<?>())) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1207924683))
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u5bc4\u67d0\u7043\uc246\ubf56\ufe34, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4975\u92ee\u5d20\u120d\u7873::\u759a\ua068\u92ee\ud523\u71f1\u416d, var_4_66:\u4975\u92ee\u5d20\u120d\u7873<?>))
                invokeinterface:void(\u836c\u6198\ua6bd\u071d\u47c2<?>::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, getfield:\u836c\u6198\ua6bd\u071d\u47c2<?>(\u4975\u92ee\u5d20\u120d\u7873::\u8753\u8df4\u624e\u6b5f\u6c56\u5d20, var_4_66:\u4975\u92ee\u5d20\u120d\u7873<?>), p1:T extends ArgumentType<?>[expected:?], p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            else {
                invokeinterface:void(Logger::error, getstatic:Logger(\u6c52\ube23\ucb79\u494c\u8d98::\u7bad\u516c\u8709\uc84e\uc31c\ud171), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(21568), ldc:int(21612))), p1:T extends ArgumentType<?>[expected:Object], invokevirtual:Class<? extends ArgumentType>[expected:Object](ArgumentType<?>::getClass, p1:T extends ArgumentType<?>[expected:ArgumentType<?>]))
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u5bc4\u67d0\u7043\uc246\ubf56\ufe34, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(-29941), ldc:int(-29914)))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.brigadier.arguments.ArgumentType<?> \uc238\uc246\ub6ab\u6198\ufcaf\u4bc8(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_3_66 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_4_6B : \u4975\u92ee\u5d20\u120d\u7873<?>
        
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
        var_3_66 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u98a4\uafe7\uc3e3\ua6bd\u8640::\uf94d\u93a2\u6ec6\u6d69\ub8be\u8350, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
        var_4_6B = invokestatic:\u4975\u92ee\u5d20\u120d\u7873<?>(\u6c52\ube23\ucb79\u494c\u8d98::\ub6ab\u7c6b\u120d\u960f\u7af6\u647c, var_3_66:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        
        if (cmpne:boolean(var_4_6B:\u4975\u92ee\u5d20\u120d\u7873<?>, aconstnull:\u4975\u92ee\u5d20\u120d\u7873<?>())) {
            return:ArgumentType<?>(invokeinterface:?(\u836c\u6198\ua6bd\u071d\u47c2<?>::\ud51e\u4c04\u4492\u3d64\u92ee\u97e6, getfield:\u836c\u6198\ua6bd\u071d\u47c2<?>(\u4975\u92ee\u5d20\u120d\u7873::\u8753\u8df4\u624e\u6b5f\u6c56\u5d20, var_4_6B:\u4975\u92ee\u5d20\u120d\u7873<?>), p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
        }
        
        invokeinterface:void(Logger::error, getstatic:Logger(\u6c52\ube23\ucb79\u494c\u8d98::\u7bad\u516c\u8709\uc84e\uc31c\ud171), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(1370), ldc:int(1396))), var_3_66:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
        return:ArgumentType<?>(aconstnull:ArgumentType<?>())
    }
    
    private static void \u3bc9\u3a62\ud217\u5f50\u8350\uf995(com.google.gson.JsonObject p0, T extends com.mojang.brigadier.arguments.ArgumentType<?> p1) {
        var_2_61 : int
        var_4_66 : \u4975\u92ee\u5d20\u120d\u7873<?>
        var_5_AB : JsonObject
        
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
            var_2_61 = and:int(ldc:int(-1145320945), ldc:int(-1264603633))
            var_4_66 = invokestatic:\u4975\u92ee\u5d20\u120d\u7873<?>(\u6c52\ube23\ucb79\u494c\u8d98::\ub6ab\u7c6b\u120d\u960f\u7af6\u647c, p1:T extends ArgumentType<?>[expected:ArgumentType<?>])
            
            if (cmpne:boolean(var_4_66:\u4975\u92ee\u5d20\u120d\u7873<?>, aconstnull:\u4975\u92ee\u5d20\u120d\u7873<?>())) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1273250437))
                invokevirtual:void(JsonObject::addProperty, p0:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(9479), ldc:int(9527))), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(16627), ldc:int(4658))))
                invokevirtual:void(JsonObject::addProperty, p0:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(1086), ldc:int(1037))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4975\u92ee\u5d20\u120d\u7873::\u759a\ua068\u92ee\ud523\u71f1\u416d, var_4_66:\u4975\u92ee\u5d20\u120d\u7873<?>)))
                var_5_AB = initobject:JsonObject(JsonObject::<init>)
                invokeinterface:void(\u836c\u6198\ua6bd\u071d\u47c2<?>::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, getfield:\u836c\u6198\ua6bd\u071d\u47c2<?>(\u4975\u92ee\u5d20\u120d\u7873::\u8753\u8df4\u624e\u6b5f\u6c56\u5d20, var_4_66:\u4975\u92ee\u5d20\u120d\u7873<?>), p1:T extends ArgumentType<?>[expected:?], var_5_AB:JsonObject)
                
                if (cmpgt:boolean(invokevirtual:int(JsonObject::size, var_5_AB:JsonObject), ldc:int(0))) {
                    invokevirtual:void(JsonObject::add, p0:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(4798), ldc:int(16501))), var_5_AB:JsonElement)
                }
            }
            else {
                invokeinterface:void(Logger::error, getstatic:Logger(\u6c52\ube23\ucb79\u494c\u8d98::\u7bad\u516c\u8709\uc84e\uc31c\ud171), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(815), ldc:int(22703))), p1:T extends ArgumentType<?>[expected:Object], invokevirtual:Class<? extends ArgumentType>[expected:Object](ArgumentType<?>::getClass, p1:T extends ArgumentType<?>[expected:ArgumentType<?>]))
                invokevirtual:void(JsonObject::addProperty, p0:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(1072), ldc:int(22896))), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(9907), ldc:int(16693))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.google.gson.JsonObject \u3bc9\u3a62\ud217\u5f50\u8350\uf995(com.mojang.brigadier.CommandDispatcher<S> p0, com.mojang.brigadier.tree.CommandNode<S> p1) {
        var_2_61 : int
        var_4_69 : JsonObject
        var_2_1AE : int
        var_5_1B6 : JsonObject
        var_6_1C1 : Iterator<CommandNode>
        var_7_2AB : CommandNode
        var_2_292 : int
        var_6_306 : Collection
        var_7_320 : JsonArray
        var_8_329 : Iterator<String>
        
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
        var_2_61 = and:int(ldc:int(-1758986326), ldc:int(-104890645))
        var_4_69 = initobject:JsonObject(JsonObject::<init>)
        
        if (instanceof:boolean(com.mojang.brigadier.tree.RootCommandNode.class, p1:CommandNode)) {
            invokevirtual:void(JsonObject::addProperty, var_4_69:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(1163), ldc:int(1211))), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(16481), ldc:int(16468))))
            goto(Label_0401)
        }
        
        Label_0114:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(64)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1460873469))
            goto(Label_0401)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0224)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-143131948))
            
            if (instanceof:boolean(com.mojang.brigadier.tree.LiteralCommandNode.class, p1:CommandNode)) {
                invokevirtual:void(JsonObject::addProperty, var_4_69:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(112), ldc:int(5936))), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(2359), ldc:int(20662))))
                goto(Label_0401)
            }
        }
        
        Label_0160:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-25834360))
            goto(Label_0401)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1856749772))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1820787857))
                goto(Label_0114)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-1623762036))
            
            if (instanceof:boolean(com.mojang.brigadier.tree.ArgumentCommandNode.class, p1:CommandNode)) {
                invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u3bc9\u3a62\ud217\u5f50\u8350\uf995, var_4_69:JsonObject, invokevirtual:ArgumentType(ArgumentCommandNode::getType, checkcast:ArgumentCommandNode(com.mojang.brigadier.tree.ArgumentCommandNode.class, p1:ArgumentCommandNode)))
                goto(Label_0401)
            }
        }
        
        Label_0224:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1218797088))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0160)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0114)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-1188045167))
            invokeinterface:void(Logger::error, getstatic:Logger(\u6c52\ube23\ucb79\u494c\u8d98::\u7bad\u516c\u8709\uc84e\uc31c\ud171), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(16575), ldc:int(1591))), p1:ArgumentCommandNode[expected:Object], invokevirtual:Class<? extends CommandNode>[expected:Object](CommandNode<S>::getClass, p1:CommandNode<S>))
            invokevirtual:void(JsonObject::addProperty, var_4_69:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), xor:int(ldc:int(-21481), ldc:int(-21465))), loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(5301), ldc:int(19059))))
        }
        
        Label_0401:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0224)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0160)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2048)), ldc:int(0))) {
            var_2_1AE = and:int(var_2_61:int, ldc:int(-1711841389))
            var_5_1B6 = initobject:JsonObject(JsonObject::<init>)
            var_6_1C1 = invokeinterface:Iterator<CommandNode>(Collection<CommandNode>::iterator, invokevirtual:Collection(CommandNode::getChildren, p1:CommandNode))
            
            loop {
                if (cmpne:boolean(and:int(var_2_1AE:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0611)
                }
                
                if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0556)
                }
                
                if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_1AE = and:int(var_2_1AE:int, ldc:int(-1465627430))
                }
                else {
                    var_2_1AE = and:int(var_2_1AE:int, ldc:int(-680034562))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_1C1:Iterator<CommandNode>)) {
                        var_7_2AB = checkcast:CommandNode(com.mojang.brigadier.tree.CommandNode.class, invokeinterface:CommandNode(Iterator<CommandNode>::next, var_6_1C1:Iterator<CommandNode>))
                        invokevirtual:void(JsonObject::add, var_5_1B6:JsonObject, invokevirtual:String(CommandNode::getName, var_7_2AB:CommandNode), invokestatic:JsonObject(\u6c52\ube23\ucb79\u494c\u8d98::\u3bc9\u3a62\ud217\u5f50\u8350\uf995, p0:CommandDispatcher, var_7_2AB:CommandNode))
                        loopcontinue()
                    }
                }
                
                Label_0500:
                
                if (cmpne:boolean(and:int(var_2_1AE:int, ldc:int(4)), ldc:int(0))) {
                    var_2_1AE = and:int(var_2_1AE:int, ldc:int(-1054120985))
                    goto(Label_0611)
                }
                
                if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_1AE = and:int(var_2_1AE:int, ldc:int(1953003101))
                        loopcontinue()
                    }
                    
                    var_2_1AE = and:int(var_2_1AE:int, ldc:int(-785917042))
                    
                    if (cmpgt:boolean(invokevirtual:int(JsonObject::size, var_5_1B6:JsonObject), ldc:int(0))) {
                        invokevirtual:void(JsonObject::add, var_4_69:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(5432), ldc:int(120))), var_5_1B6:JsonElement)
                    }
                }
                
                Label_0556:
                
                if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_1AE = and:int(var_2_1AE:int, ldc:int(208162602))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(128)), ldc:int(0))) {
                        var_2_1AE = and:int(var_2_1AE:int, ldc:int(387496959))
                        goto(Label_0500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_1AE = and:int(var_2_1AE:int, ldc:int(-538445176))
                    
                    if (cmpne:boolean(invokevirtual:Command(CommandNode::getCommand, p1:CommandNode), aconstnull:Command())) {
                        invokevirtual:void(JsonObject::addProperty, var_4_69:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(1149), ldc:int(14651))), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(25), ldc:int(21381))))
                    }
                }
                
                Label_0611:
                
                if (cmpne:boolean(and:int(var_2_1AE:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0556)
                }
                
                if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(128)), ldc:int(0))) {
                    var_2_1AE = and:int(var_2_1AE:int, ldc:int(-729956469))
                    goto(Label_0500)
                }
                
                if (cmpeq:boolean(and:int(var_2_1AE:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_1AE = and:int(var_2_1AE:int, ldc:int(-1475362654))
            }
            
            var_2_292 = and:int(var_2_1AE:int, ldc:int(-5775690))
            
            if (cmpne:boolean(invokevirtual:CommandNode(CommandNode::getRedirect, p1:CommandNode), aconstnull:CommandNode())) {
                var_6_306 = invokevirtual:Collection(CommandDispatcher::getPath, p0:CommandDispatcher, invokevirtual:CommandNode(CommandNode::getRedirect, p1:CommandNode))
                
                if (logicalnot:boolean(invokeinterface:boolean(Collection::isEmpty, var_6_306:Collection))) {
                    var_7_320 = initobject:JsonArray(JsonArray::<init>)
                    var_8_329 = invokeinterface:Iterator<String>(Collection<String>::iterator, var_6_306:Collection<String>)
                    
                    loop {
                        var_2_292 = and:int(var_2_292:int, ldc:int(-1116733442))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_329:Iterator<String>))) {
                            looporswitchbreak()
                        }
                        
                        invokevirtual:void(JsonArray::add, var_7_320:JsonArray, checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_8_329:Iterator<String>)))
                    }
                    
                    invokevirtual:void(JsonObject::add, var_4_69:JsonObject, loadelement:String(getstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c), and:int(ldc:int(10811), ldc:int(186))), var_7_320:JsonElement)
                }
            }
            
            return:JsonObject(var_4_69:JsonObject)
        }
        
        goto(Label_0114)
    }
    
    public static boolean \uc4d2\u5db4\u624e\uc246\u0a06\u6fb0(com.mojang.brigadier.arguments.ArgumentType<?> p0) {
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
            var_1_61 = and:int(ldc:int(-1076061400), ldc:int(-1076131546))
            
            if (cmpeq:boolean(invokestatic:\u4975\u92ee\u5d20\u120d\u7873<?>(\u6c52\ube23\ucb79\u494c\u8d98::\ub6ab\u7c6b\u120d\u960f\u7af6\u647c, p0:ArgumentType<?>), aconstnull:\u4975\u92ee\u5d20\u120d\u7873<?>())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2144907750))
                stack_8A_0 = and:int(ldc:int(-10876), ldc:int(2683))
            }
            else {
                stack_8A_0 = and:int(ldc:int(8721), ldc:int(4105))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Set<com.mojang.brigadier.arguments.ArgumentType<?>> \u3d64\ucb79\ucef1\u8aa5\ud7e8\ubf56(com.mojang.brigadier.tree.CommandNode<T> p0) {
        var_3_65 : Set
        var_4_69 : HashSet
        
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
            var_3_65 = invokestatic:Set(Sets::newIdentityHashSet)
            var_4_69 = invokestatic:HashSet(Sets::newHashSet)
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\uc246\u7043\u9af2\ud4fe\u4179\u51fa, p0:CommandNode, var_4_69:HashSet<ArgumentType<?>>[expected:Set<ArgumentType<?>>], var_3_65:Set<CommandNode>)
            return:Set<ArgumentType<?>>(var_4_69:HashSet<ArgumentType<?>>)
        }
        
        goto(Label_0006)
    }
    
    private static void \uc246\u7043\u9af2\ud4fe\u4179\u51fa(com.mojang.brigadier.tree.CommandNode<T> p0, java.util.Set<com.mojang.brigadier.arguments.ArgumentType<?>> p1, java.util.Set<com.mojang.brigadier.tree.CommandNode<T>> p2) {
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
    
    private static void lambda$\uc7fe\ud523\u3e2a\u446c\u4bc8\u6b0d$0(java.util.Set p0, java.util.Set p1, com.mojang.brigadier.tree.CommandNode p2) {
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
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\uc246\u7043\u9af2\ud4fe\u4179\u51fa, p2:CommandNode, p0:Set<ArgumentType<?>>, p1:Set<CommandNode>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_954 : int
        expr_6E : int [generated]
        stack_AD_0 : byte[] [generated]
        stack_AF_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_128_0 : byte[] [generated]
        stack_12A_0 : byte[] [generated]
        stack_160_0 : byte[] [generated]
        stack_162_0 : byte[] [generated]
        stack_1A9_0 : byte[] [generated]
        stack_84F_0 : byte[] [generated]
        stack_8A0_0 : byte[] [generated]
        stack_918_0 : byte[] [generated]
        stack_96F_0 : byte[] [generated]
        stack_9F6_0 : byte[] [generated]
        var_4_81F : int
        var_3_824 : byte[]
        var_5_825 : int
        expr_84F : byte [generated]
        var_0_989 : int
        expr_96F : byte [generated]
        stack_9C1_2 : byte [generated]
        stack_995_0 : byte [generated]
        var_2_AD : byte[]
        expr_B1 : int [generated]
        var_3_88E : byte[]
        var_5_88F : int
        expr_E0 : int [generated]
        expr_12A : int [generated]
        expr_162 : int [generated]
        var_3_9E4 : byte[]
        var_5_9E5 : int
        var_3_1B5 : String
        stack_806_0 : String[] [generated]
        expr_1C7 : String[] [generated]
        
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
        var_0_954 = and:int(ldc:int(271189629), ldc:int(2002706163))
        expr_6E = arraylength:int(stack_AD_0 = stack_AF_0 = stack_DE_0 = stack_E0_0 = stack_128_0 = stack_12A_0 = stack_160_0 = stack_162_0 = stack_1A9_0 = stack_84F_0 = stack_8A0_0 = stack_918_0 = stack_96F_0 = stack_9F6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("YLyhufq2uqS3ofiyYcxwqLOqyqC969nk73OJtXigvmK8obn6tvGlaKx7uMCys5iv8bawwXOos6rKoL3rubiqcq/hza+lf5XwoKjOsaGru2LMs62zqsqg7b2v3nOip5LwoKjOsbGsu3Oos6rKoO2tqal/vJW+uuLOy+K1ubGxqLiZf3WW8KCozrGxrLtzqLOqyqDtrZy8YuzPxfi2ubGxqLiZf3WW8KCozrGxrLtzqLOqyqDtva/+trmxsajZ335zeHLlqKy+uaGt63WuvnjtxLLgZa65Z7y26bm1kX6mrc6mxrGVvrqivLqgstjOsLV5rrWhsdjOwKJ3rKiwxaG1sqa2s9i+zaCLnK+yqry6sKelv6K0usCirb6kvrfSvqa/fK2ys7S1oqmzrLu9orC3t7W3ka+8vMbCpqC8ocHC1qapl4e4s62vu6zKwta2t5CNo6WoyaarzKG1taKqoLynvsXTvr6hd5muvLq6w6O9sJauuaPqybK8d6qop7uuvOm3qK53mb65u7PZq7Coi7i1waCsvbGxxaKq2LvFpHmsqLDFobW7rrDZu7Kqj6y7qavYu8Kifa2pucmgt6upuZm+v6qtn6+3s+anqap9u8OzucTQprykmLC1u5DtsaKujqKz7rm/soGos7DRuruSjqGzuKO9v8Kgr6aovaG9v8Kg36a3tY2sv7GhtLejxaCvva20tKW5vpzMsKPDpK+or6ewyqLOlryxrLixsKO1oruxsbK2scGhps6kodunt7Vzv7m3tbSju7G7sbGspL+ntrSit7Gd77WotHqstL66sreRv7KhwqTvsa+3hryxtre7qqyll6a8ubGxv9q2tZKOu5W+urK6sbzRtqOohM2xuamXv8GxvrGQrLaot6i+uquvu6ChB7OxsbEQKyrYCA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_81F = expr_6E:int
        var_3_824 = newarray:byte[](byte.class, expr_6E:int)
        var_5_825 = expr_6E:int
        Label_2087:
        
        while (cmpeq:boolean(and:int(var_0_954:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_954:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_2279)
            }
            
            var_0_954 = and:int(var_0_954:int, ldc:int(298724921))
            var_5_825 = add:int(var_5_825:int, ldc:int(-1))
            expr_84F = loadelement:byte(stack_84F_0:byte[], var_5_825:int)
            storeelement:byte(var_3_824:byte[], var_5_825:int, or:int(and:int(shl:int(expr_84F:byte, xor:int(ldc:int(273), ldc:int(277))), ldc:int(-16)), and:int(shr:int(expr_84F:byte[expected:int], xor:int(ldc:int(2240), ldc:int(2244))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_825:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DE_0 = stack_E0_0 = stack_128_0 = stack_12A_0 = stack_160_0 = stack_162_0 = stack_1A9_0 = stack_84F_0 = stack_8A0_0 = stack_918_0 = stack_96F_0 = stack_9F6_0 = var_3_824:byte[]
            goto(Label_0115)
        }
        
        var_0_954 = and:int(var_0_954:int, ldc:int(-436499635))
        goto(Label_2375)
        Label_2279:
        
        while (cmpeq:boolean(and:int(var_0_954:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(131072)), ldc:int(0))) {
                var_0_954 = and:int(var_0_954:int, ldc:int(-30169784))
                goto(Label_2087)
            }
            
            var_0_954 = and:int(var_0_954:int, ldc:int(476290875))
            var_5_825 = add:int(var_5_825:int, ldc:int(-1))
            storeelement:byte(var_3_824:byte[], var_5_825:int, add:byte(loadelement:byte(stack_918_0:byte[], var_5_825:int), ldc:byte(79)))
            
            if (cmpne:boolean(var_5_825:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DE_0 = stack_E0_0 = stack_128_0 = stack_12A_0 = stack_160_0 = stack_162_0 = stack_1A9_0 = stack_84F_0 = stack_8A0_0 = stack_918_0 = stack_96F_0 = stack_9F6_0 = var_3_824:byte[]
            goto(Label_0229)
        }
        
        var_0_954 = and:int(var_0_954:int, ldc:int(1378579871))
        Label_2375:
        
        while (cmpne:boolean(and:int(var_0_954:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_2087)
            }
            
            var_0_989 = and:int(var_0_954:int, ldc:int(-599007307))
            var_5_825 = add:int(var_5_825:int, ldc:int(-1))
            expr_96F = stack_9C1_2 = loadelement(stack_96F_0, var_5_825)
            
            if (cmplt:boolean(add:int(add:int(var_5_825:int, ldc:int(4)), neg:int(var_4_81F:int)), ldc:int(0))) {
                stack_9C1_2 = stack_995_0 = add:byte(expr_96F:byte, loadelement:byte(var_3_824:byte[], add:int(var_5_825:int, ldc:int(4))))
                goto(Label_2469)
            }
            
            Label_2428:
            
            if (cmpne:boolean(and:int(var_0_989:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_989 = and:int(var_0_989:int, ldc:int(-1333252124))
            }
            else {
                var_0_989 = and:int(var_0_989:int, ldc:int(-1741195713))
                stack_9C1_2 = stack_995_0 = add:byte(expr_96F:byte, ldc:byte(4))
            }
            
            Label_2469:
            
            if (cmpeq:boolean(and:int(var_0_989:int, ldc:int(32)), ldc:int(0))) {
                var_0_989 = and:int(var_0_989:int, ldc:int(251731288))
                goto(Label_2428)
            }
            
            var_0_954 = and:int(var_0_989:int, ldc:int(2115997309))
            storeelement:byte(var_3_824:byte[], var_5_825:int, stack_9C1_2:byte)
            
            if (cmpne:boolean(var_5_825:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DE_0 = stack_E0_0 = stack_128_0 = stack_12A_0 = stack_160_0 = stack_162_0 = stack_1A9_0 = stack_84F_0 = stack_8A0_0 = stack_918_0 = stack_96F_0 = stack_9F6_0 = var_3_824:byte[]
            goto(Label_0303)
        }
        
        var_0_954 = and:int(var_0_954:int, ldc:int(-1432002941))
        goto(Label_2279)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(2)), ldc:int(0))) {
            var_0_954 = and:int(var_0_954:int, ldc:int(-833138350))
            goto(Label_0359)
        }
        
        if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0229)
        }
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(65536)), ldc:int(0))) {
            var_0_954 = and:int(var_0_954:int, ldc:int(-1733336048))
        }
        else {
            var_0_954 = and:int(var_0_954:int, ldc:int(486184507))
            var_2_AD = stack_AD_0:byte[]
            expr_B1 = add:int(arraylength:int(stack_AF_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B1:int, ldc:int(0))) {
                var_3_88E = newarray:byte[](byte.class, expr_B1:int)
                var_5_88F = expr_B1:int
                
                loop {
                    var_0_954 = and:int(var_0_954:int, ldc:int(997623807))
                    var_5_88F = add:int(var_5_88F:int, ldc:int(-1))
                    storeelement:byte(var_3_88E:byte[], var_5_88F:int, add:int(shl:int(loadelement:byte(stack_8A0_0:byte[], var_5_88F:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_AD:byte[], add:int(var_5_88F:int, xor:int(ldc:int(-30460), ldc:int(-30459)))), ldc:int(4)), and:int(ldc:int(9887), ldc:int(15)))))
                    
                    if (cmpne:boolean(var_5_88F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_DE_0 = stack_E0_0 = stack_128_0 = stack_12A_0 = stack_160_0 = stack_162_0 = stack_1A9_0 = stack_84F_0 = stack_8A0_0 = stack_918_0 = stack_96F_0 = stack_9F6_0 = var_3_88E:byte[]
            }
        }
        
        Label_0182:
        
        if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0359)
        }
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_954:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_954 = and:int(var_0_954:int, ldc:int(-1629342159))
            expr_E0 = arraylength:int(stack_E0_0:byte[])
            
            if (cmpne:boolean(expr_E0:int, ldc:int(0))) {
                var_4_81F = expr_E0:int
                var_3_824 = newarray:byte[](byte.class, expr_E0:int)
                var_5_825 = expr_E0:int
                goto(Label_2279)
            }
        }
        
        Label_0229:
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0359)
        }
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_954 = and:int(var_0_954:int, ldc:int(-2006713353))
        }
        else {
            if (cmpne:boolean(and:int(var_0_954:int, ldc:int(2)), ldc:int(0))) {
                var_0_954 = and:int(var_0_954:int, ldc:int(-1465478456))
                goto(Label_0182)
            }
            
            if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(32)), ldc:int(0))) {
                var_0_954 = and:int(var_0_954:int, ldc:int(-1603811394))
                goto(Label_0115)
            }
            
            var_0_954 = and:int(var_0_954:int, ldc:int(-1693575491))
            expr_12A = arraylength:int(stack_12A_0:byte[])
            
            if (cmpne:boolean(expr_12A:int, ldc:int(0))) {
                var_4_81F = expr_12A:int
                var_3_824 = newarray:byte[](byte.class, expr_12A:int)
                var_5_825 = expr_12A:int
                goto(Label_2375)
            }
        }
        
        Label_0303:
        
        if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(1)), ldc:int(0))) {
                var_0_954 = and:int(var_0_954:int, ldc:int(-371529464))
                goto(Label_0229)
            }
            
            if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0182)
            }
            
            if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_954 = and:int(var_0_954:int, ldc:int(2050183099))
            expr_162 = arraylength:int(stack_162_0:byte[])
            
            if (cmpne:boolean(expr_162:int, ldc:int(0))) {
                var_3_9E4 = newarray:byte[](byte.class, expr_162:int)
                var_5_9E5 = expr_162:int
                
                loop {
                    var_0_954 = and:int(var_0_954:int, ldc:int(-1132038209))
                    var_5_9E5 = add:int(var_5_9E5:int, ldc:int(-1))
                    storeelement:byte(var_3_9E4:byte[], var_5_9E5:int, xor:byte(loadelement:byte(stack_9F6_0:byte[], var_5_9E5:int), ldc:byte(24)))
                    
                    if (cmpne:boolean(var_5_9E5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_DE_0 = stack_E0_0 = stack_128_0 = stack_12A_0 = stack_160_0 = stack_162_0 = stack_1A9_0 = stack_84F_0 = stack_8A0_0 = stack_918_0 = stack_96F_0 = stack_9F6_0 = var_3_9E4:byte[]
            }
        }
        
        Label_0359:
        
        if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(2)), ldc:int(0))) {
            var_0_954 = and:int(var_0_954:int, ldc:int(-1673686535))
            goto(Label_0229)
        }
        
        if (cmpne:boolean(and:int(var_0_954:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_954 = and:int(var_0_954:int, ldc:int(1671137464))
            goto(Label_0182)
        }
        
        if (cmpeq:boolean(and:int(var_0_954:int, ldc:int(1024)), ldc:int(0))) {
            var_0_954 = and:int(var_0_954:int, ldc:int(-225521069))
            goto(Label_0115)
        }
        
        var_3_1B5 = initobject:String(String::<init>, stack_1A9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_806_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(219), ldc:int(224)))
        expr_1C7 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12859), ldc:int(2107)))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(45), ldc:int(19117)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(11400), ldc:int(-11401)), and:int(ldc:int(29091), ldc:int(-29100))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(-32416), ldc:int(-32415)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(-31312), ldc:int(29263)), xor:int(ldc:int(1063), ldc:int(1085))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(4102), ldc:int(8467)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(24602), ldc:int(2682)), xor:int(ldc:int(16405), ldc:int(16398))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(24859), ldc:int(35)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-20476), ldc:int(-20449)), and:int(ldc:int(1093), ldc:int(8440))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(18249), ldc:int(-20426)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(256), ldc:int(320)), xor:int(ldc:int(5164), ldc:int(5226))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(2326), ldc:int(2360)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(8743), ldc:int(8801)), xor:int(ldc:int(295), ldc:int(377))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(10270), ldc:int(10289)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-12244), ldc:int(-12174)), and:int(ldc:int(25507), ldc:int(3203))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(8695), ldc:int(22583)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(63), ldc:int(188)), xor:int(ldc:int(2064), ldc:int(2228))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(-24310), ldc:int(-24282)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-29564), ldc:int(-29664)), and:int(ldc:int(2781), ldc:int(8701))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(250), ldc:int(1049)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(8925), ldc:int(7389)), and:int(ldc:int(486), ldc:int(9459))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(17706), ldc:int(17688)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(25827), ldc:int(6378)), and:int(ldc:int(8698), ldc:int(1258))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(10759), ldc:int(470)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(25339), ldc:int(1262)), xor:int(ldc:int(-31043), ldc:int(-31154))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(20515), ldc:int(20520)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(18675), ldc:int(13811)), xor:int(ldc:int(4652), ldc:int(4910))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(4106), ldc:int(4096)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(18754), ldc:int(4994)), and:int(ldc:int(781), ldc:int(20877))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(17599), ldc:int(632)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-31462), ldc:int(-31721)), and:int(ldc:int(7541), ldc:int(25365))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(-32107), ldc:int(-32101)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(9981), ldc:int(10216)), and:int(ldc:int(4926), ldc:int(8602))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(8705), ldc:int(8710)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(19174), ldc:int(19452)), xor:int(ldc:int(12334), ldc:int(12554))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(22550), ldc:int(22553)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(357), ldc:int(19748)), xor:int(ldc:int(4685), ldc:int(4960))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(20903), ldc:int(2087)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(876), ldc:int(577)), xor:int(ldc:int(-8099), ldc:int(-7829))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(3650), ldc:int(3654)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(8694), ldc:int(822)), and:int(ldc:int(382), ldc:int(5436))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(-32731), ldc:int(-32761)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(317), ldc:int(1532)), xor:int(ldc:int(4289), ldc:int(4488))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(310), ldc:int(29222)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(16730), ldc:int(16403)), xor:int(ldc:int(326), ldc:int(16))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(3449), ldc:int(57)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(1022), ldc:int(17751)), and:int(ldc:int(1888), ldc:int(12649))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(2620), ldc:int(4197)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(285), ldc:int(125)), xor:int(ldc:int(6903), ldc:int(7068))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(4165), ldc:int(4196)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(1387), ldc:int(379)), xor:int(ldc:int(141), ldc:int(510))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(8897), ldc:int(8900)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(2419), ldc:int(12791)), and:int(ldc:int(1023), ldc:int(1407))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(6179), ldc:int(419)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(3967), ldc:int(383)), xor:int(ldc:int(348), ldc:int(212))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(1125), ldc:int(20775)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(16430), ldc:int(16806)), xor:int(ldc:int(8321), ldc:int(8473))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(8207), ldc:int(589)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(8208), ldc:int(8584)), xor:int(ldc:int(-32716), ldc:int(-32366))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(16926), ldc:int(9246)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(1462), ldc:int(12782)), xor:int(ldc:int(13149), ldc:int(13042))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(1097), ldc:int(1093)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(18564), ldc:int(18731)), xor:int(ldc:int(156), ldc:int(293))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(8753), ldc:int(8711)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(1905), ldc:int(1736)), and:int(ldc:int(464), ldc:int(4036))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(4118), ldc:int(4102)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(1993), ldc:int(16848)), xor:int(ldc:int(6657), ldc:int(7110))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(5152), ldc:int(160)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(2503), ldc:int(5087)), and:int(ldc:int(465), ldc:int(5077))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(526), ldc:int(543)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(8671), ldc:int(16881)), and:int(ldc:int(497), ldc:int(13295))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(512), ldc:int(531)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(20675), ldc:int(20770)), and:int(ldc:int(489), ldc:int(3561))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(5146), ldc:int(54)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(467), ldc:int(58)), xor:int(ldc:int(300), ldc:int(220))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(25876), ldc:int(575)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-15680), ldc:int(-15568)), and:int(ldc:int(13305), ldc:int(19965))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(85), ldc:int(10389)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(16889), ldc:int(2555)), and:int(ldc:int(523), ldc:int(17007))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(-24298), ldc:int(-24320)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(976), ldc:int(475)), and:int(ldc:int(9174), ldc:int(21012))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(307), ldc:int(4155)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(17300), ldc:int(6686)), xor:int(ldc:int(8687), ldc:int(9205))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(6167), ldc:int(16415)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(17178), ldc:int(606)), xor:int(ldc:int(1904), ldc:int(1362))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(564), ldc:int(1332)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(8754), ldc:int(1583)), xor:int(ldc:int(1065), ldc:int(1541))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(3643), ldc:int(314)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(637), ldc:int(16940)), and:int(ldc:int(16950), ldc:int(8764))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(-12259), ldc:int(-12286)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(756), ldc:int(12854)), and:int(ldc:int(19183), ldc:int(1605))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(12349), ldc:int(55)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(4562), ldc:int(5015)), and:int(ldc:int(1753), ldc:int(16969))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(16902), ldc:int(16927)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(16589), ldc:int(17028)), and:int(ldc:int(593), ldc:int(2039))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(1027), ldc:int(1048)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(6129), ldc:int(593)), and:int(ldc:int(605), ldc:int(23135))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(10326), ldc:int(10316)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(8925), ldc:int(861)), xor:int(ldc:int(-24274), ldc:int(-23742))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(4140), ldc:int(4144)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(19235), ldc:int(18767)), and:int(ldc:int(8819), ldc:int(763))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(2578), ldc:int(2575)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(260), ldc:int(887)), and:int(ldc:int(18039), ldc:int(4727))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(24618), ldc:int(555)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(19327), ldc:int(759)), and:int(ldc:int(1751), ldc:int(4740))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(171), ldc:int(26991)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(20594), ldc:int(21238)), and:int(ldc:int(17070), ldc:int(9870))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(5930), ldc:int(120)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(4782), ldc:int(20110)), and:int(ldc:int(4850), ldc:int(10139))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(10379), ldc:int(10427)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(589), ldc:int(223)), and:int(ldc:int(8118), ldc:int(734))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(22595), ldc:int(22642)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(23230), ldc:int(8855)), and:int(ldc:int(735), ldc:int(957))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(1465), ldc:int(10283)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(8861), ldc:int(18333)), xor:int(ldc:int(1444), ldc:int(1797))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(9), ldc:int(4475)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(681), ldc:int(20193)), and:int(ldc:int(2751), ldc:int(17381))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(18510), ldc:int(4136)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(17381), ldc:int(693)), xor:int(ldc:int(19735), ldc:int(20414))))
        putstatic:String[](\u6c52\ube23\ucb79\u494c\u8d98::\uc87f\u71f1\u36d3\ud171\u7e3f\u494c, expr_1C7:String[])
        putstatic:Logger(\u6c52\ube23\ucb79\u494c\u8d98::\u7bad\u516c\u8709\uc84e\uc31c\ud171, invokestatic:Logger(LogManager::getLogger))
        putstatic:Map<Class<?>, \u4975\u92ee\u5d20\u120d\u7873<?>>(\u6c52\ube23\ucb79\u494c\u8d98::\u3e75\u6c52\ub7dc\ud51e\ua562\u7ce1, invokestatic:HashMap[expected:Map<Class<?>, \u4975\u92ee\u5d20\u120d\u7873<?>>](Maps::newHashMap))
        putstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4975\u92ee\u5d20\u120d\u7873<?>>(\u6c52\ube23\ucb79\u494c\u8d98::\u8308\ub32d\uc4d2\uc4d2\uf94d\u4f52, invokestatic:HashMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4975\u92ee\u5d20\u120d\u7873<?>>](Maps::newHashMap))
    }
    
    public void \uafe7\u6b0d\u6c52\u0c95\ubcb0\u8308(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_669 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_674 : int
        
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
        var_3_669 = and:int(ldc:int(933815269), ldc:int(1009646564))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c52\ube23\ucb79\u494c\u8d98[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(1949889473))
            var_5_81 = and:int(ldc:int(-28882), ldc:int(28881))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9942), ldc:int(-9943)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_669:int, ldc:int(-1137444898))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(3108), ldc:int(3109)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(9), ldc:int(833)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_669 = and:int(var_3_D1:int, ldc:int(-144114733))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-29694), ldc:int(-29693)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2126824666))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-929873715))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-900600696))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1537519140))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2091751143))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1659673451))
                    }
                    else {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1271795724))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1166687116))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(394827673))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1949818326))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(2146434031))
                            var_11_E2 = and:int(ldc:int(-2089), ldc:int(2088))
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-137328725))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1647871085))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(93043700))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(431086732))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(745665477))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-2070390736))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1714391647))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1857683452))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1528401918))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1247452111))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1662737697))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(2084365271))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(16832), ldc:int(16833))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0932:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1620085157))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1696078470))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(533552659))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-213991576))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1013602173))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(901446647))
                        var_11_E2 = and:int(ldc:int(5257), ldc:int(-5274))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(529587024))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1641672009))
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(2070398964))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-2030714931))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-299827213))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1371)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2019290963))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(309613732))
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1316196786))
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1644450131))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(2078903923))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(2101212130))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1371:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1915751878))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1157413289))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1333404353))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-518777354))
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2012838164))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(-1259932712))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_674 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(389486837))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1898823018))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1850632231))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1385235462))
                        var_17_674 = add:int(var_16_110:int, and:int(ldc:int(9361), ldc:int(22543)))
                        looporswitchbreak()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(-404329148))
                }
                
                var_3_669 = and:int(var_3_669:int, ldc:int(1998840781))
                
                if (cmple:boolean(var_5_81 = var_17_674:int, sub:int(var_6_88:int, xor:int(ldc:int(8392), ldc:int(8393))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
