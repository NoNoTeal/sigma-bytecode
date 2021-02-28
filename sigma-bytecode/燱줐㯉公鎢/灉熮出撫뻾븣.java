public class \u71f1\uc910\u3bc9\u516c\u93a2.\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S> {
    public void \u7049\u71ae\u51fa\u64ab\ubefe\ube23(O p0) {
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
            invokespecial:Object(Object::<init>, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>)
            putfield:Map<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\uafe7\ub7dc\ub113\u759a\u8c8a\uceb8, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>, invokestatic:HashMap[expected:Map<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>](Maps::newHashMap))
            putfield:O(\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\u1833\u8c8a\uceb8\u4daf\u9a18\u67e9, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>, p0:O)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S> \u9af2\ua3b4\u3dd3\ub102\u3c25\uc31c(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[] p0) {
        var_2_5F : int
        var_5_66 : int
        var_6_6F : int
        var_7_8D : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>
        
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
            var_2_5F = and:int(ldc:int(-541032546), ldc:int(-1151829314))
            var_5_66 = arraylength:int(p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[])
            var_6_6F = and:int(ldc:int(25421), ldc:int(-29518))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-21698881))
                
                if (cmpge:boolean(var_6_6F:int, var_5_66:int)) {
                    looporswitchbreak()
                }
                
                var_7_8D = loadelement:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[], var_6_6F:int)
                invokespecial:void(\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>::\u8258\ubf56\u6d99\u9937\ubf56\u98a4, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>, var_7_8D:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>)
                invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>(Map<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>>::put, getfield:Map<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\uafe7\ub7dc\ub113\u759a\u8c8a\uceb8, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>), invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, var_7_8D:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>), var_7_8D:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>)
                inc:int(var_6_6F, ldc:int(1))
            }
            
            return:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>(this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>)
        }
        
        goto(Label_0006)
    }
    
    private void \u8258\ubf56\u6d99\u9937\ubf56\u98a4(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0) {
        var_2_5F : int
        var_4_64 : String
        var_2_78 : int
        var_5_7D : Collection<T>
        var_2_94 : int
        var_6_9C : Iterator<T>
        var_8_160 : String
        
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
        var_2_5F = and:int(ldc:int(1769990122), ldc:int(1768613886))
        var_4_64 = invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)
        
        if (logicalnot:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, invokestatic:Pattern(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::\ua61f\u3bc9\u6fb0\uceb8\u92ff\u0800), var_4_64:String[expected:CharSequence])))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:O[expected:Object](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\u1833\u8c8a\uceb8\u4daf\u9a18\u67e9, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>)), loadelement:String(getstatic:String[](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\ua562\uc7fe\u8cae\u7af6\u8753\u6198), and:int(ldc:int(-21368), ldc:int(21348)))), var_4_64:String))))
        }
        
        var_2_78 = and:int(var_2_5F:int, ldc:int(1174405099))
        var_5_7D = invokevirtual:Collection<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u12cb\u67e9\ud171\u6b5f\u6198\u36d3, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)
        
        if (cmpgt:boolean(invokeinterface:int(Collection::size, var_5_7D:Collection<T>), and:int(ldc:int(10373), ldc:int(41)))) {
            var_2_94 = and:int(var_2_78:int, ldc:int(-210835461))
            var_6_9C = invokeinterface:Iterator<T>(Collection<T>::iterator, var_5_7D:Collection<T>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_6_9C:Iterator)) {
                var_8_160 = invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, checkcast:T extends Comparable<T>(T extends java.lang.Comparable<T>.class, invokeinterface:T extends Comparable<T>(Iterator<T>::next, var_6_9C:Iterator<T>)))
                
                if (logicalnot:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, invokestatic:Pattern(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::\ua61f\u3bc9\u6fb0\uceb8\u92ff\u0800), var_8_160:String[expected:CharSequence])))) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:O[expected:Object](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\u1833\u8c8a\uceb8\u4daf\u9a18\u67e9, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>)), loadelement:String(getstatic:String[](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\ua562\uc7fe\u8cae\u7af6\u8753\u6198), xor:int(ldc:int(-26622), ldc:int(-26623)))), var_4_64:String), loadelement:String(getstatic:String[](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\ua562\uc7fe\u8cae\u7af6\u8753\u6198), xor:int(ldc:int(-16342), ldc:int(-16338)))), var_8_160:String))))
                }
                
                var_2_94 = and:int(var_2_94:int, ldc:int(-43336705))
            }
            
            do {
                if (cmpne:boolean(and:int(var_2_94:int, ldc:int(128)), ldc:int(0))) {
                    var_2_94 = and:int(var_2_94:int, ldc:int(1575744511))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\uafe7\ub7dc\ub113\u759a\u8c8a\uceb8, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>), var_4_64:String[expected:Object]))) {
                        loopcontinue()
                    }
                    
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:O[expected:Object](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\u1833\u8c8a\uceb8\u4daf\u9a18\u67e9, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>)), loadelement:String(getstatic:String[](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\ua562\uc7fe\u8cae\u7af6\u8753\u6198), and:int(ldc:int(1253), ldc:int(12309)))), var_4_64:String))))
                }
            } while (cmpeq:boolean(and:int(var_2_94:int, ldc:int(4194304)), ldc:int(0)))
            
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:O[expected:Object](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\u1833\u8c8a\uceb8\u4daf\u9a18\u67e9, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>)), loadelement:String(getstatic:String[](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\ua562\uc7fe\u8cae\u7af6\u8753\u6198), and:int(ldc:int(4993), ldc:int(1045)))), var_4_64:String), loadelement:String(getstatic:String[](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\ua562\uc7fe\u8cae\u7af6\u8753\u6198), xor:int(ldc:int(360), ldc:int(362)))))))
    }
    
    public \u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S> \u9af2\u62da\u983f\u47c2\u983f\uc4d2(java.util.function.Function<O, S> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6c56\u6b0d\u927d\u99f7\u4e72\u7049<O, S> p1) {
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
            return:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>(initobject:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::<init>, p0:Function<O, S>, getfield:O(\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\u1833\u8c8a\uceb8\u4daf\u9a18\u67e9, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>), p1:\u6c56\u6b0d\u927d\u99f7\u4e72\u7049<O, S>, getfield:Map<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\uafe7\ub7dc\ub113\u759a\u8c8a\uceb8, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2F0 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_217_0 : byte[] [generated]
        stack_27B_0 : byte[] [generated]
        stack_309_0 : byte[] [generated]
        stack_343_0 : byte[] [generated]
        var_4_1F3 : int
        var_3_1F8 : byte[]
        var_5_1F9 : int
        expr_217 : byte [generated]
        var_0_293 : int
        expr_27B : byte [generated]
        stack_2BF_2 : byte [generated]
        stack_296_0 : byte [generated]
        expr_96 : int [generated]
        expr_C9 : int [generated]
        var_2_FA : byte[]
        expr_FE : int [generated]
        var_3_332 : byte[]
        var_5_333 : int
        var_3_132 : String
        stack_1EC_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_2F0 = and:int(ldc:int(449400571), ldc:int(-604098673))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_126_0 = stack_217_0 = stack_27B_0 = stack_309_0 = stack_343_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Dk+QrH+UgOF/b0LttGtqtIBDQw/x6fCzepVPQ3ZfgPCEa0O5pG9qtIBDQw9Q4dHzt3qVX6ACmLCIQ7R/obDYbpxDhWNjZrSAQ0MPUOHR87d6lX+0YrSAQ0MPUOHRo1oKgJ1UALyAzHKvdrSk+KSssVeobrBDT+VzmAaAnYRLBpiwiEO0f6Gw2G6cQ4VzrGqwQ2DpJaIFjQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F3 = expr_6B:int
        var_3_1F8 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1F9 = expr_6B:int
        Label_0507:
        
        while (cmpne:boolean(and:int(var_0_2F0:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0607)
            }
            
            var_0_2F0 = and:int(var_0_2F0:int, ldc:int(2074348031))
            var_5_1F9 = add:int(var_5_1F9:int, ldc:int(-1))
            expr_217 = loadelement:byte(stack_217_0:byte[], var_5_1F9:int)
            storeelement:byte(var_3_1F8:byte[], var_5_1F9:int, xor:int(or:int(and:int(shl:int(expr_217:byte, and:int(ldc:int(6), ldc:int(30764))), ldc:int(-16)), and:int(shr:int(expr_217:byte[expected:int], and:int(ldc:int(2060), ldc:int(9477))), ldc:int(15))), ldc:int(11)))
            
            if (cmpne:boolean(var_5_1F9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_126_0 = stack_217_0 = stack_27B_0 = stack_309_0 = stack_343_0 = var_3_1F8:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0741)
        Label_0607:
        
        while (cmpne:boolean(and:int(var_0_2F0:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0507)
            }
            
            var_0_293 = and:int(var_0_2F0:int, ldc:int(2078997707))
            var_5_1F9 = add:int(var_5_1F9:int, ldc:int(-1))
            expr_27B = stack_2BF_2 = loadelement(stack_27B_0, var_5_1F9)
            
            if (cmplt:boolean(add:int(add:int(var_5_1F9:int, ldc:int(3)), neg:int(var_4_1F3:int)), ldc:int(0))) {
                stack_2BF_2 = stack_296_0 = add:byte(expr_27B:byte, loadelement:byte(var_3_1F8:byte[], add:int(var_5_1F9:int, ldc:int(3))))
                goto(Label_0678)
            }
            
            Label_0648:
            
            if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_293 = and:int(var_0_293:int, ldc:int(-121467906))
                stack_2BF_2 = stack_296_0 = add:byte(expr_27B:byte, ldc:byte(3))
            }
            
            Label_0678:
            
            if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(128)), ldc:int(0))) {
                var_0_293 = and:int(var_0_293:int, ldc:int(960228344))
                goto(Label_0648)
            }
            
            var_0_2F0 = and:int(var_0_293:int, ldc:int(-558008129))
            storeelement:byte(var_3_1F8:byte[], var_5_1F9:int, stack_2BF_2:byte)
            
            if (cmpne:boolean(var_5_1F9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_126_0 = stack_217_0 = stack_27B_0 = stack_309_0 = stack_343_0 = var_3_1F8:byte[]
            goto(Label_0155)
        }
        
        Label_0741:
        
        while (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2F0:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0507)
            }
            
            var_0_2F0 = and:int(var_0_2F0:int, ldc:int(1519618814))
            var_5_1F9 = add:int(var_5_1F9:int, ldc:int(-1))
            storeelement:byte(var_3_1F8:byte[], var_5_1F9:int, add:byte(loadelement:byte(stack_309_0:byte[], var_5_1F9:int), ldc:byte(42)))
            
            if (cmpne:boolean(var_5_1F9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_126_0 = stack_217_0 = stack_27B_0 = stack_309_0 = stack_343_0 = var_3_1F8:byte[]
            goto(Label_0206)
        }
        
        var_0_2F0 = and:int(var_0_2F0:int, ldc:int(-371250432))
        goto(Label_0607)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpne:boolean(and:int(var_0_2F0:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_2F0 = and:int(var_0_2F0:int, ldc:int(2088200530))
        }
        else {
            var_0_2F0 = and:int(var_0_2F0:int, ldc:int(1569446847))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_1F3 = expr_96:int
                var_3_1F8 = newarray:byte[](byte.class, expr_96:int)
                var_5_1F9 = expr_96:int
                goto(Label_0607)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(8)), ldc:int(0))) {
            var_0_2F0 = and:int(var_0_2F0:int, ldc:int(-965346052))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2F0:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_2F0 = and:int(var_0_2F0:int, ldc:int(794603896))
                goto(Label_0112)
            }
            
            var_0_2F0 = and:int(var_0_2F0:int, ldc:int(-1666069077))
            expr_C9 = arraylength:int(stack_C9_0:byte[])
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_4_1F3 = expr_C9:int
                var_3_1F8 = newarray:byte[](byte.class, expr_C9:int)
                var_5_1F9 = expr_C9:int
                goto(Label_0741)
            }
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2F0:int, ldc:int(256)), ldc:int(0))) {
                var_0_2F0 = and:int(var_0_2F0:int, ldc:int(-2109855604))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_2F0 = and:int(var_0_2F0:int, ldc:int(-572936839))
                goto(Label_0112)
            }
            
            var_0_2F0 = and:int(var_0_2F0:int, ldc:int(953239962))
            var_2_FA = stack_FA_0:byte[]
            expr_FE = add:int(arraylength:int(stack_FC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_332 = newarray:byte[](byte.class, expr_FE:int)
                var_5_333 = expr_FE:int
                
                loop {
                    var_0_2F0 = and:int(var_0_2F0:int, ldc:int(-637883937))
                    var_5_333 = add:int(var_5_333:int, ldc:int(-1))
                    storeelement:byte(var_3_332:byte[], var_5_333:int, add:int(shl:int(loadelement:byte(stack_343_0:byte[], var_5_333:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_FA:byte[], add:int(var_5_333:int, and:int(ldc:int(12421), ldc:int(2633)))), ldc:int(6)), xor:int(ldc:int(640), ldc:int(643)))))
                    
                    if (cmpne:boolean(var_5_333:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FA_0 = stack_FC_0 = stack_126_0 = stack_217_0 = stack_27B_0 = stack_309_0 = stack_343_0 = var_3_332:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_2F0:int, ldc:int(2048)), ldc:int(0))) {
            var_0_2F0 = and:int(var_0_2F0:int, ldc:int(1253183498))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_2F0:int, ldc:int(128)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1EC_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4246), ldc:int(9767)))
            expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(99), ldc:int(101)))
            storeelement:String(expr_144:String[], xor:int(ldc:int(257), ldc:int(256)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(27648), ldc:int(-27649)), xor:int(ldc:int(16665), ldc:int(16641))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(2130), ldc:int(2135)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(3100), ldc:int(8443)), and:int(ldc:int(11069), ldc:int(4337))))
            storeelement:String(expr_144:String[], and:int(ldc:int(-19636), ldc:int(3217)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(2357), ldc:int(185)), xor:int(ldc:int(-32064), ldc:int(-32112))))
            storeelement:String(expr_144:String[], and:int(ldc:int(1819), ldc:int(131)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(8790), ldc:int(7376)), xor:int(ldc:int(17078), ldc:int(17129))))
            storeelement:String(expr_144:String[], and:int(ldc:int(4742), ldc:int(16474)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(351), ldc:int(17023)), and:int(ldc:int(25209), ldc:int(249))))
            storeelement:String(expr_144:String[], and:int(ldc:int(6167), ldc:int(332)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(2162), ldc:int(2059)), xor:int(ldc:int(4470), ldc:int(4576))))
            putstatic:String[](\u7049\u71ae\u51fa\u64ab\ubefe\ube23::\ua562\uc7fe\u8cae\u7af6\u8753\u6198, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u4d85\ua6bd\uc229\u3c25\u4c2b\ud217(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_668 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_673 : int
        
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
        var_3_668 = and:int(ldc:int(-1579758912), ldc:int(1507761136))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<O, S>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
            var_3_668 = and:int(var_3_668:int, ldc:int(1104654207))
            var_5_7D = and:int(ldc:int(10395), ldc:int(-14492))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14581), ldc:int(6256)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_668:int, ldc:int(-33629500))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, xor:int(ldc:int(10240), ldc:int(10241)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, xor:int(ldc:int(-24571), ldc:int(-24572)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_668 = and:int(var_3_D6:int, ldc:int(467536634))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(25221), ldc:int(2081)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1073118142))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(907610320))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1249426011))
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(551688078))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1414316536))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(972958528))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0414:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1249623665))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1244900255))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-125340250))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(254436580))
                        goto(Label_0947)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(442005464))
                        goto(Label_0705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1377874988))
                            var_11_E7 = and:int(ldc:int(-15467), ldc:int(7274))
                            goto(Label_1519)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-164420981))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1917994028))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1851967953))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1032693307))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(299875270))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0705:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1493268589))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1572956410))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(821937228))
                        goto(Label_0947)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1983109611))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(339496148))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-34128037))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1447999936))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1790485916))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(1040072547))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = and:int(ldc:int(21225), ldc:int(9219))
                                goto(Label_1123)
                            }
                        }
                    }
                    
                    Label_0947:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-2128133372))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-326640901))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-382863033))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(497187234))
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(211554180))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(477717772))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-704746904))
                        var_11_E7 = and:int(ldc:int(1108), ldc:int(-1109))
                    }
                    
                    Label_1123:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-528981260))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0947)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(265682872))
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-479263391))
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1949807609))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(1778270049))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1388)
                            }
                        }
                    }
                    
                    Label_1246:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1497248096))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1123)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1165898190))
                            goto(Label_0947)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(693601336))
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-407829526))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1657425849))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1375757719))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                        goto(Label_1519)
                    }
                    
                    Label_1388:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-720885868))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1352336842))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(896127912))
                        goto(Label_0705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-322425014))
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_668 = and:int(var_3_668:int, ldc:int(-438403363))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1519:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_673 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1530:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1157676791))
                        goto(Label_0947)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1789267450))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1704285640))
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-201351554))
                        var_17_673 = add:int(var_16_115:int, xor:int(ldc:int(3332), ldc:int(3333)))
                        looporswitchbreak()
                    }
                    
                    var_3_668 = and:int(var_3_668:int, ldc:int(974858711))
                }
                
                var_3_668 = and:int(var_3_668:int, ldc:int(-1409872155))
                
                if (cmple:boolean(var_5_7D = var_17_673:int, sub:int(var_6_84:int, xor:int(ldc:int(20516), ldc:int(20517))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
            var_3_668 = and:int(var_3_668:int, ldc:int(-1826167875))
            goto(Label_0106)
        }
    }
}
