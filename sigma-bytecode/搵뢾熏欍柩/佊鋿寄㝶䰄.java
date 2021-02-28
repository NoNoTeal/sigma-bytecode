public class \u6435\ub8be\u718f\u6b0d\u67e9.\u4f4a\u92ff\u5bc4\u3776\u4c04<T> {
    public void \u4f4a\u92ff\u5bc4\u3776\u4c04(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, java.util.function.Predicate<T> p1, java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p2, java.util.function.Consumer<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> p3) {
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
            invokespecial:Object(Object::<init>, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>)
            putfield:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u839e\u1187\ub83f\u624e\u960f\u4c04, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, invokestatic:HashSet[expected:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](Sets::newHashSet))
            putfield:TreeSet<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\ub6ab\u51fa\u6c56\u8bb0\ub6ab\ua61f, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, invokestatic:TreeSet(Sets::newTreeSet, invokestatic:Comparator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>>(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>::\ub70c\uc7fe\u600f\u6bb9\u40a9\u8640)))
            putfield:Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u071d\u8413\u385b\ub1b9\u7e3f\ud523, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, invokestatic:ArrayDeque[expected:Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](Queues::newArrayDeque))
            putfield:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u8df4\u4f4a\ud12e\u6cfe\u0a06\u8df4, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, invokestatic:ArrayList[expected:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](Lists::newArrayList))
            putfield:Predicate<T>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\uc87f\u34df\u5fe1\ubb2b\u6c56\ud523, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, p1:Predicate<T>)
            putfield:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u8413\uff55\u1833\ubded\u52d3\u183a, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, p2:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
            putfield:\ube23\uc238\u5140\u4cd9\u8aa5(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, p0:\ube23\uc238\u5140\u4cd9\u8aa5)
            putfield:Consumer<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u8df4\uc31c\u385b\u51fa\ubcb0\u5bc4, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, p3:Consumer<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\u3bc9\u97e6\ubff1\u8640\u8df4() {
        var_1_64 : int
        var_3_6C : int
        var_1_219 : int
        var_4_221 : \u69d9\u759a\u64ab\ua3b4\u6b0d
        var_1_365 : int
        var_5_22F : Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>
        var_6_370 : \u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>
        var_1_F43 : int
        var_8_F54 : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_7_F3C : Throwable
        var_1_F5B : int
        var_9_F6C : \u446c\u67d0\ua562\u97b7\u6c56\u59ec
        var_1_F7A : int
        
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
        var_1_64 = and:int(and:int(ldc:int(871366586), ldc:int(1909455658)), ldc:int(1064286779))
        var_3_6C = invokevirtual:int(TreeSet<E>::size, getfield:TreeSet<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\ub6ab\u51fa\u6c56\u8bb0\ub6ab\ua61f, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(-2111665256))
                goto(Label_0466)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0399)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(1463422166))
                goto(Label_0343)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0242)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(-3484))
                
                if (cmpeq:boolean(var_3_6C:int, invokeinterface:int(Set<E>::size, getfield:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u839e\u1187\ub83f\u624e\u960f\u4c04, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>)))) {
                    if (cmpgt:boolean(var_3_6C:int, ldc:int(65536))) {
                        goto(Label_0343)
                    }
                    
                    goto(Label_0466)
                }
            }
            
            Label_0178:
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(-2111671061))
                goto(Label_0466)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0399)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0343)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(-1472989142))
            }
            else {
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(85279155))
                    loopcontinue()
                }
                
                var_1_64 = and:int(var_1_64:int, ldc:int(-1881162041))
            }
            
            Label_0242:
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(262144)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(-1797594958))
                goto(Label_0466)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(468756283))
                goto(Label_0399)
            }
            
            if (cmpne:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-150331902))
                    goto(Label_0178)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-110791846))
                    loopcontinue()
                }
                
                athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), and:int(ldc:int(5682), ldc:int(-5811)))))
            }
            
            Label_0343:
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(1692360859))
                goto(Label_0466)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(1)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0242)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1522044693))
                    goto(Label_0178)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(4194304)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_64 = and:int(var_1_64:int, ldc:int(477095853))
            }
            
            Label_0399:
            
            if (cmpne:boolean(and:int(var_1_64:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(1951700359))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-741459615))
                    goto(Label_0343)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0242)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0178)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-777739858))
                    loopcontinue()
                }
                
                var_1_64 = and:int(var_1_64:int, ldc:int(1096790934))
                var_3_6C = ldc:int(65536)
            }
            
            Label_0466:
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(524288)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(487509583))
                goto(Label_0399)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(488052791))
                goto(Label_0343)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(32768)), ldc:int(0))) {
                var_1_64 = and:int(var_1_64:int, ldc:int(2125542497))
                goto(Label_0242)
            }
            
            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0178)
            }
            
            if (cmpne:boolean(and:int(var_1_64:int, ldc:int(262144)), ldc:int(0))) {
                var_1_219 = and:int(var_1_64:int, ldc:int(-1546673352))
                var_4_221 = invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>))
                var_1_365 = and:int(var_1_219:int, ldc:int(-1537235208))
                var_5_22F = invokevirtual:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(TreeSet<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::iterator, getfield:TreeSet<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\ub6ab\u51fa\u6c56\u8bb0\ub6ab\ua61f, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1594438787))
                        goto(Label_0750)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1038171553))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1884286588))
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>)), loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), xor:int(ldc:int(5633), ldc:int(5632))))
                    }
                    
                    Label_0640:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_2640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0750)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1522203609))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(-464537707))
                        
                        if (cmple:boolean(var_3_6C:int, ldc:int(0))) {
                            goto(Label_2617)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_2640)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1589272161))
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0640)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(2013248264))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_22F:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>))) {
                            goto(Label_2617)
                        }
                    }
                    
                    Label_0750:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_2640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1046887840))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1975826197))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0640)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1038678466))
                            loopcontinue()
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(-981484605))
                    }
                    
                    Label_0814:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1426651289))
                        goto(Label_2640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1239251706))
                        goto(Label_0750)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_365 = and:int(var_1_365:int, ldc:int(166716415))
                    var_6_370 = checkcast:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>.class, invokeinterface:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::next, var_5_22F:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>))
                    Label_0882:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_4261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_4062)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_3101)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1231241654))
                        goto(Label_2916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(766515722))
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1068440469))
                        goto(Label_2411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(535990216))
                        goto(Label_2218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(77675537))
                        goto(Label_2034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(2091736549))
                        goto(Label_1814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(2004218997))
                        goto(Label_1617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(2020866716))
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(726655575))
                        
                        if (cmple:boolean(getfield:long(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u74b1\u760c\u56bd\u0b8e\ub102\u92ee, var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>)))) {
                            if (invokevirtual:boolean(\u69d9\u759a\u64ab\ua3b4\u6b0d::\uceb8\u385b\ub7dc\u3e2a\uc246\u446c, var_4_221:\u69d9\u759a\u64ab\ua3b4\u6b0d, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>))) {
                                goto(Label_1437)
                            }
                            
                            goto(Label_2411)
                        }
                    }
                    
                    Label_1079:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_4261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(333094415))
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1961296065))
                        goto(Label_3101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_2916)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_2411)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_2218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1506040155))
                        goto(Label_2034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(891429882))
                        goto(Label_1814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(2057604727))
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1098472306))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(902804269))
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(122125690))
                        goto(Label_4261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-165886793))
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-697846505))
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_3101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_2916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(272750214))
                        goto(Label_2411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1314998448))
                        goto(Label_2218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-492360846))
                        goto(Label_2034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1079)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-2106325499))
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1001406678))
                        goto(Label_2617)
                    }
                    
                    Label_1437:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(509668174))
                        goto(Label_4261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1622922327))
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(950547574))
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1980274276))
                        goto(Label_3101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_2916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(828111445))
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_2411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2218)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_2034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-554170171))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(285539155))
                            goto(Label_1244)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(1736419145))
                    }
                    
                    Label_1617:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_4261)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(352142388))
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1950543962))
                        goto(Label_3101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_2916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-164349907))
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(706586079))
                        goto(Label_2411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1305473588))
                        goto(Label_2218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1302641294))
                        goto(Label_2034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1882332799))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1244)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-696206614))
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(729786173))
                        invokeinterface:void(Iterator<E>::remove, var_5_22F:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>)
                    }
                    
                    Label_1814:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_4261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1659141051))
                        goto(Label_4062)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1367006535))
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_3255)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1962448601))
                        goto(Label_3101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1043445366))
                        goto(Label_2411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1995974526))
                        goto(Label_2218)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-590598594))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-513180963))
                            goto(Label_1617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1437)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(2108765351))
                            goto(Label_1244)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(483033106))
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-29239928))
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1125127538))
                        invokeinterface:boolean(Set<E>::remove, getfield:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u839e\u1187\ub83f\u624e\u960f\u4c04, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>[expected:Object])
                    }
                    
                    Label_2034:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_4261)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1404938269))
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1842768691))
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1224145226))
                        goto(Label_3101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(581650210))
                        goto(Label_2916)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_2726)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_2411)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1408452109))
                            goto(Label_1437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1244)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1291076032))
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(-36700327))
                        invokeinterface:boolean(Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::add, getfield:Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u071d\u8413\u385b\ub1b9\u7e3f\ud523, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)
                    }
                    
                    Label_2218:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1750367960))
                        goto(Label_4261)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1299143417))
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_3101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2916)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-870280350))
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1089131813))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-1197921200))
                            goto(Label_2034)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-204204628))
                            goto(Label_1617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-144123034))
                            goto(Label_1437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1244)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1079)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-671798367))
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1881147419))
                        inc:int(var_3_6C, ldc:int(-1))
                    }
                    
                    Label_2411:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-2029548795))
                        goto(Label_4261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(2016301628))
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1591612765))
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1036769263))
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1041770451))
                        goto(Label_3101)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_2916)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(781416646))
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1617876886))
                        goto(Label_2218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_2034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1974927665))
                        goto(Label_1814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1049262555))
                        goto(Label_1617)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-805307736))
                        goto(Label_0640)
                    }
                    
                    goto(Label_0882)
                    Label_2617:
                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>)), loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), xor:int(ldc:int(-32256), ldc:int(-32254))))
                    Label_2640:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-612069707))
                        goto(Label_0750)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(750193698))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-134204262))
                        loopcontinue()
                    }
                    
                    var_1_365 = and:int(var_1_365:int, ldc:int(844102520))
                    
                    if (cmpeq:boolean(var_6_370 = checkcast:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>.class, invokeinterface:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::poll, getfield:Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u071d\u8413\u385b\ub1b9\u7e3f\ud523, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>))), aconstnull:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>())) {
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>)))
                        goto(Label_4062)
                    }
                    
                    Label_2726:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_4261)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(197990995))
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-938495379))
                        goto(Label_3255)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1396203725))
                        goto(Label_3101)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-744166621))
                            goto(Label_2411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(486468257))
                            goto(Label_2218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_2034)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1730754595))
                            goto(Label_1244)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-1364709353))
                            goto(Label_1079)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1316364029))
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(477094409))
                    }
                    
                    Label_2916:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_4261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_3255)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(2007828154))
                            goto(Label_2726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_2411)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(2003418440))
                            goto(Label_2218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1065411652))
                            goto(Label_2034)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1780296226))
                            goto(Label_1437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-835984492))
                            goto(Label_1244)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1079)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-530318851))
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(1626324694))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u69d9\u759a\u64ab\ua3b4\u6b0d::\uceb8\u385b\ub7dc\u3e2a\uc246\u446c, var_4_221:\u69d9\u759a\u64ab\ua3b4\u6b0d, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)))) {
                            goto(Label_4022)
                        }
                    }
                    
                    Label_3101:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1069386245))
                        goto(Label_4261)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1557494270))
                            goto(Label_2916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_2726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(427769958))
                            goto(Label_2411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_2218)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_2034)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1394563711))
                            goto(Label_1617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1437)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1244)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1079)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(1341125403))
                    }
                    
                    try {
                        Label_3255:
                        
                        while (cmpne:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_4062)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_365 = and:int(var_1_365:int, ldc:int(-2106572812))
                                goto(Label_3676)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                                var_1_365 = and:int(var_1_365:int, ldc:int(-689070063))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Block_292)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Block_293)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_2726)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                                    goto(Label_2411)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_2218)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                                    goto(Block_297)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_1814)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Block_299)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                                    goto(Block_300)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_1244)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                                    goto(Label_1079)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Block_303)
                                }
                                
                                var_1_365 = and:int(var_1_365:int, ldc:int(-1200622820))
                                invokeinterface:boolean(List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::add, getfield:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u8df4\u4f4a\ud12e\u6cfe\u0a06\u8df4, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)
                            }
                            
                            Label_3457:
                            
                            if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Block_304)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_4062)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                                    var_1_365 = and:int(var_1_365:int, ldc:int(-1112969967))
                                    loopcontinue()
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Block_308)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Block_309)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Block_310)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Block_311)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_2218)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Block_313)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_1814)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                                    goto(Block_315)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Block_316)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_1244)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Block_318)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_0882)
                                }
                                
                                var_1_365 = and:int(var_1_365:int, ldc:int(1072671558))
                                invokeinterface:void(Consumer<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::accept, getfield:Consumer<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u8df4\uc31c\u385b\u51fa\ubcb0\u5bc4, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)
                            }
                            
                            Label_3676:
                            
                            if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Block_320)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Block_321)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                                var_1_365 = and:int(var_1_365:int, ldc:int(1083614761))
                                goto(Label_3457)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Block_323)
                            }
                        }
                        
                        goto(Label_4261)
                        Block_292:
                        var_1_365 = and:int(var_1_365:int, ldc:int(906259574))
                        goto(Label_3101)
                        Block_293:
                        var_1_365 = and:int(var_1_365:int, ldc:int(-47810496))
                        goto(Label_2916)
                        Block_297:
                        var_1_365 = and:int(var_1_365:int, ldc:int(-884061979))
                        goto(Label_2034)
                        Block_299:
                        var_1_365 = and:int(var_1_365:int, ldc:int(581305155))
                        goto(Label_1617)
                        Block_300:
                        var_1_365 = and:int(var_1_365:int, ldc:int(1990281762))
                        goto(Label_1437)
                        Block_303:
                        var_1_365 = and:int(var_1_365:int, ldc:int(1756363705))
                        goto(Label_0882)
                        Block_304:
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1137901616))
                        goto(Label_4261)
                        Block_308:
                        var_1_365 = and:int(var_1_365:int, ldc:int(1795276501))
                        goto(Label_3101)
                        Block_309:
                        var_1_365 = and:int(var_1_365:int, ldc:int(988225584))
                        goto(Label_2916)
                        Block_310:
                        var_1_365 = and:int(var_1_365:int, ldc:int(109117095))
                        goto(Label_2726)
                        Block_311:
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1521336606))
                        goto(Label_2411)
                        Block_313:
                        var_1_365 = and:int(var_1_365:int, ldc:int(37024084))
                        goto(Label_2034)
                        Block_315:
                        var_1_365 = and:int(var_1_365:int, ldc:int(-450743768))
                        goto(Label_1617)
                        Block_316:
                        var_1_365 = and:int(var_1_365:int, ldc:int(646271526))
                        goto(Label_1437)
                        Block_318:
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1905949747))
                        goto(Label_1079)
                        Block_320:
                        var_1_365 = and:int(var_1_365:int, ldc:int(584710131))
                        goto(Label_4261)
                        Block_321:
                        var_1_365 = and:int(var_1_365:int, ldc:int(323686635))
                        goto(Label_4062)
                        Block_323:
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-646185139))
                            goto(Label_3101)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1680018937))
                            goto(Label_2916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_2726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-1164926152))
                            goto(Label_2411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_2218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_2034)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1669924973))
                            goto(Label_1814)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(365517290))
                            goto(Label_1617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(920035438))
                            goto(Label_1244)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1234849181))
                            goto(Label_1079)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-1652019100))
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1334838619))
                        goto(Label_2640)
                    }
                    catch (java.lang.Throwable var_7_F3C) {
                        var_1_F43 = and:int(var_1_365:int, ldc:int(1985999660))
                        var_8_F54 = invokestatic:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubcb0\u59ec\u6d99\u156b\u0800\u946b, var_7_F3C:Throwable, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), xor:int(ldc:int(-24560), ldc:int(-24557))))
                        var_1_F5B = and:int(var_1_F43:int, ldc:int(-1420820851))
                        var_9_F6C = invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u8c8a\u6b0d\uae87\u7330\u446c\uc9f6, var_8_F54:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), xor:int(ldc:int(2), ldc:int(6))))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_F5B:int, ldc:int(512)), ldc:int(0))) {
                                var_1_F7A = and:int(var_1_F5B:int, ldc:int(-523952754))
                            }
                            else {
                                var_1_F7A = and:int(var_1_F5B:int, ldc:int(441446219))
                                invokestatic:void(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\ucfaf\uae5d\u839e\uf9c5\u8308\u97b7, var_9_F6C:\u446c\u67d0\ua562\u97b7\u6c56\u59ec, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>), checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()))
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_F7A:int, ldc:int(1)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_F5B = and:int(var_1_F7A:int, ldc:int(-1527202576))
                        }
                        
                        athrow(initobject:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::<init>, var_8_F54:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
                    }
                    
                    Label_4022:
                    invokevirtual:void(\u8258\uc238\u7e3f\u36d3\uc238<T>::\u71ae\u4bc8\u74b1\u97b7\u67e9\ud217, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>[expected:\u8258\uc238\u7e3f\u36d3\uc238<T>], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>), invokevirtual:T(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>::\u7af6\u4492\u718f\uc31c\u4c2b\u97b7, var_6_370:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>), and:int(ldc:int(-32329), ldc:int(31304)))
                    goto(Label_2640)
                    Label_4062:
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_3676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_3457)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_3255)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_3101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1606437889))
                            goto(Label_2916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-115559302))
                            goto(Label_2726)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_2411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_2218)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1264542999))
                            goto(Label_2034)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(368843859))
                            goto(Label_1814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(106326268))
                            goto(Label_1617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-1611647243))
                            goto(Label_1244)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(-1968876165))
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                            var_1_365 = and:int(var_1_365:int, ldc:int(1686897391))
                            goto(Label_0882)
                        }
                        
                        var_1_365 = and:int(var_1_365:int, ldc:int(1735388749))
                        invokeinterface:void(List<E>::clear, getfield:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u8df4\u4f4a\ud12e\u6cfe\u0a06\u8df4, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>))
                    }
                    
                    Label_4261:
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1217730380))
                        goto(Label_4062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-430681504))
                        goto(Label_3676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_3457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(2041259427))
                        goto(Label_3255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1510381101))
                        goto(Label_3101)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_2916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(2062942394))
                        goto(Label_2726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(1309251328))
                        goto(Label_2411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_2218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_2034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(-1285189239))
                        goto(Label_1814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_365 = and:int(var_1_365:int, ldc:int(769090039))
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_365:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_365:int, ldc:int(512)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    goto(Label_0882)
                }
                
                invokeinterface:void(Collection<E>::clear, getfield:Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>[expected:Collection<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u071d\u8413\u385b\ub1b9\u7e3f\ud523, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>))
                return:void()
            }
            
            var_1_64 = and:int(var_1_64:int, ldc:int(1847183903))
        }
    }
    
    public boolean \u759a\u836c\ud4fe\uf995\u5db4\u8350(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, T p1) {
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
            return:boolean(invokeinterface:boolean(Collection<E>::contains, getfield:Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>[expected:Collection<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u071d\u8413\u385b\ub1b9\u7e3f\ud523, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), initobject:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>[expected:Object](\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:T[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> \u4975\u5f50\ud51e\ucef1\ub6ab\uf94d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, boolean p1, boolean p2) {
        var_6_79 : int
        var_7_88 : int
        var_8_9E : int
        
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
            var_6_79 = sub:int(shl:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), xor:int(ldc:int(2128), ldc:int(2132))), and:int(ldc:int(12463), ldc:int(1298)))
            var_7_88 = add:int(add:int(var_6_79:int, ldc:int(16)), and:int(ldc:int(874), ldc:int(5122)))
            var_8_9E = sub:int(shl:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), and:int(ldc:int(516), ldc:int(4493))), and:int(ldc:int(2082), ldc:int(17283)))
            return:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(invokevirtual:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\u4975\u5f50\ud51e\ucef1\ub6ab\uf94d, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, var_6_79:int, and:int(ldc:int(29952), ldc:int(-29953)), var_8_9E:int, var_7_88:int, xor:int(ldc:int(4273), ldc:int(4529)), add:int(add:int(var_8_9E:int, ldc:int(16)), and:int(ldc:int(130), ldc:int(27651)))), p1:boolean, p2:boolean))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> \u4975\u5f50\ud51e\ucef1\ub6ab\uf94d(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p0, boolean p1, boolean p2) {
        var_4_F0 : int
        var_6_73 : List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>
        stack_13A_0 : List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> [generated]
        
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
            var_4_F0 = and:int(ldc:int(655868280), ldc:int(1944032124))
            var_6_73 = invokespecial:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\uf9c5\u4f52\u5245\uf9c5\u6435\u4bc8, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, checkcast:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(java.util.List<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>.class, aconstnull:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>()), getfield:TreeSet<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>[expected:Collection<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](\u4f4a\u92ff\u5bc4\u3776\u4c04::\ub6ab\u51fa\u6c56\u8bb0\ub6ab\ua61f, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), p0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p1:boolean)
            
            if (p1:boolean) {
                if (cmpne:boolean(var_6_73:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>, aconstnull:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>())) {
                    invokeinterface:boolean(Set<E>::removeAll, getfield:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u839e\u1187\ub83f\u624e\u960f\u4c04, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), var_6_73:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>[expected:Collection<?>])
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_4_F0:int, ldc:int(32)), ldc:int(0))) {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(-1344749808))
                    goto(Label_0206)
                }
                
                if (cmpne:boolean(and:int(var_4_F0:int, ldc:int(262144)), ldc:int(0))) {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(993496569))
                    var_6_73 = invokespecial:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\uf9c5\u4f52\u5245\uf9c5\u6435\u4bc8, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, var_6_73:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>, getfield:Queue<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>[expected:Collection<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u071d\u8413\u385b\ub1b9\u7e3f\ud523, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), p0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p1:boolean)
                    
                    if (logicalnot:boolean(p2:boolean)) {
                        var_6_73 = invokespecial:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\uf9c5\u4f52\u5245\uf9c5\u6435\u4bc8, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, var_6_73:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>, getfield:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>[expected:Collection<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u8df4\u4f4a\ud12e\u6cfe\u0a06\u8df4, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), p0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p1:boolean)
                    }
                }
                
                Label_0175:
                
                if (cmpne:boolean(and:int(var_4_F0:int, ldc:int(8)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_F0:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(-1557281287))
                    
                    if (cmpeq:boolean(var_6_73:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>, aconstnull:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>())) {
                        stack_13A_0 = invokestatic:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(Collections::emptyList)
                        looporswitchbreak()
                    }
                }
                
                Label_0206:
                
                if (cmpne:boolean(and:int(var_4_F0:int, ldc:int(128)), ldc:int(0))) {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(659114841))
                    goto(Label_0175)
                }
                
                if (cmpeq:boolean(and:int(var_4_F0:int, ldc:int(512)), ldc:int(0))) {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(-90330771))
                    stack_13A_0 = var_6_73:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>
                    looporswitchbreak()
                }
            }
            
            return:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(stack_13A_0:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>)
        }
        
        goto(Label_0006)
    }
    
    private java.util.List<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> \uf9c5\u4f52\u5245\uf9c5\u6435\u4bc8(java.util.List<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> p0, java.util.Collection<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> p1, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p2, boolean p3) {
        var_7_6B : Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>
        var_8_87 : \u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>
        var_9_8E : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_7_6B = invokeinterface:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(Collection<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::iterator, p1:Collection<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_6B:Iterator)) {
                var_8_87 = checkcast:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>.class, invokeinterface:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::next, var_7_6B:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>))
                var_9_8E = getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_8_87:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)
                
                if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_9_8E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, p2:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                    loopcontinue()
                }
                
                if (cmpge:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_9_8E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ube23\uc7fe\u927d\u873d\ud36e\u8cae, p2:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                    loopcontinue()
                }
                
                if (cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_9_8E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, p2:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                    loopcontinue()
                }
                
                if (cmpge:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_9_8E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4daf\u3bc9\u98a4\u6ec6\u16f6\u3d64, p2:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                    loopcontinue()
                }
                
                if (p3:boolean) {
                    invokeinterface:void(Iterator::remove, var_7_6B:Iterator)
                }
                
                if (cmpeq:boolean(var_1_106:ArrayList<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>, aconstnull:ArrayList<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>())) {
                    var_1_106 = invokestatic:ArrayList(Lists::newArrayList)
                }
                
                invokeinterface:boolean(List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::add, var_1_106:ArrayList<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>[expected:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>], var_8_87:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)
            }
            
            return:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(var_1_106:ArrayList<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>)
        }
        
        goto(Label_0006)
    }
    
    public void \ub19c\uc229\u071d\u40a9\u6b5f\u8308(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        var_3_61 : int
        var_5_7A : Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>
        var_6_B9 : \u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>
        
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
            var_3_61 = and:int(ldc:int(1188473082), ldc:int(-950031885))
            var_5_7A = invokeinterface:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::iterator, invokevirtual:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\u4975\u5f50\ud51e\ucef1\ub6ab\uf94d, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, p0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, and:int[expected:boolean](ldc:int(-12497), ldc:int(12496)), and:int[expected:boolean](ldc:int(-12456), ldc:int(12453))))
            
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1240135317))
                }
                else {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1337666814))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_7A:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>)) {
                        var_6_B9 = checkcast:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>.class, invokeinterface:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::next, var_5_7A:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>))
                        
                        if (invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc29a\u4f52\u93a2\u8753\u51b2\u16f6, p0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_6_B9:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>))) {
                            invokespecial:void(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\u8d98\u6d99\u71f1\u5bc4\u7330\uf94d, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, initobject:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_6_B9:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:T(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>::\u7af6\u4492\u718f\uc31c\u4c2b\u97b7, var_6_B9:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>), getfield:long(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u74b1\u760c\u56bd\u0b8e\ub102\u92ee, var_6_B9:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>), getfield:\ud158\uae87\ubefe\u5245\u7873(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u4f52\u62da\u62da\ub19c\u385b\u6198, var_6_B9:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)))
                        }
                        
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1610958085))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e \u5654\ufe34\u6198\u97e6\u7af6\u67e9(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
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
            return:\ud158\u8308\u76bc\u0a06\ud36e(invokestatic:\ud158\u8308\u76bc\u0a06\ud36e(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\uae87\ud171\u0c95\uc246\ub171\u8aa5, getfield:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u8413\uff55\u1833\ubded\u52d3\u183a, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), invokevirtual:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>[expected:Iterable<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>](\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\u4975\u5f50\ud51e\ucef1\ub6ab\uf94d, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, and:int[expected:boolean](ldc:int(9762), ldc:int(-9771)), xor:int[expected:boolean](ldc:int(-32746), ldc:int(-32745))), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>))))
        }
        
        goto(Label_0006)
    }
    
    private static \u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e \uae87\ud171\u0c95\uc246\ub171\u8aa5(java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0, java.lang.Iterable<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> p1, long p2) {
        var_4_63 : int
        var_6_6C : \ud158\u8308\u76bc\u0a06\ud36e
        var_7_74 : Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>
        var_8_A1 : \u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>
        var_9_AA : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
            var_4_63 = and:int(ldc:int(-973966976), ldc:int(1174077367))
            var_6_6C = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
            var_7_74 = invokeinterface:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(Iterable<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::iterator, p1:Iterable<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>)
            
            loop {
                var_4_63 = and:int(var_4_63:int, ldc:int(-33687128))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_74:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>))) {
                    looporswitchbreak()
                }
                
                var_8_A1 = checkcast:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>.class, invokeinterface:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::next, var_7_74:Iterator<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>))
                var_9_AA = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_9_AA:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), and:int(ldc:int(5), ldc:int(18455))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::apply, p0:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>, invokevirtual:T(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>::\u7af6\u4492\u718f\uc31c\u4c2b\u97b7, var_8_A1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)))))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_9_AA:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), xor:int(ldc:int(-28538), ldc:int(-28544))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_8_A1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_9_AA:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), xor:int(ldc:int(-24044), ldc:int(-24045))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_8_A1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_9_AA:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), xor:int(ldc:int(-16346), ldc:int(-16338))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, var_8_A1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_9_AA:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), xor:int(ldc:int(1251), ldc:int(1258))), l2i:int(sub:long(getfield:long(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u74b1\u760c\u56bd\u0b8e\ub102\u92ee, var_8_A1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>), p2:long)))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_9_AA:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8), and:int(ldc:int(16430), ldc:int(2587))), invokevirtual:int(\ud158\uae87\ubefe\u5245\u7873::\u4179\uae5d\u9937\ufe34\u16f6\u97e6, getfield:\ud158\uae87\ubefe\u5245\u7873(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u4f52\u62da\u62da\ub19c\u385b\u6198, var_8_A1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)))
                invokevirtual:boolean(AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>::add, var_6_6C:AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>, var_9_AA:\uc31c\uc87f\uc246\u3776\ub7dc)
            }
            
            return:\ud158\u8308\u76bc\u0a06\ud36e(var_6_6C:\ud158\u8308\u76bc\u0a06\ud36e)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud4fe\ube23\u93a2\u6bb9\u965f\u3bc9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, T p1) {
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
            return:boolean(invokeinterface:boolean(Set<E>::contains, getfield:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u839e\u1187\ub83f\u624e\u960f\u4c04, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), initobject:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>[expected:Object](\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:T[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public void \u71ae\u4bc8\u74b1\u97b7\u67e9\ud217(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, T p1, int p2, \u3bc9\u67e9\uc87f\u47c2\u5f50.\ud158\uae87\ubefe\u5245\u7873 p3) {
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
            
            if (logicalnot:boolean(invokeinterface:boolean(Predicate<T>::test, getfield:Predicate<T>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\uc87f\u34df\u5fe1\ubb2b\u6c56\ud523, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), p1:T))) {
                invokespecial:void(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\u8d98\u6d99\u71f1\u5bc4\u7330\uf94d, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>, initobject:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:T, add:long(i2l:long(p2:int), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>))), p3:\ud158\uae87\ubefe\u5245\u7873))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8d98\u6d99\u71f1\u5bc4\u7330\uf94d(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T> p0) {
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
            
            if (logicalnot:boolean(invokeinterface:boolean(Set<E>::contains, getfield:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u839e\u1187\ub83f\u624e\u960f\u4c04, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>[expected:Object]))) {
                invokeinterface:boolean(Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::add, getfield:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u839e\u1187\ub83f\u624e\u960f\u4c04, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)
                invokevirtual:boolean(TreeSet<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>::add, getfield:TreeSet<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\ub6ab\u51fa\u6c56\u8bb0\ub6ab\ua61f, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>), p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8c8a\u839e\uc7fe\u36d3\u9033\u16f6() {
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
            return:int(invokeinterface:int(Set<E>::size, getfield:Set<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>>(\u4f4a\u92ff\u5bc4\u3776\u4c04::\u839e\u1187\ub83f\u624e\u960f\u4c04, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_28E : int
        expr_6E : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_CA_0 : byte[] [generated]
        stack_CC_0 : byte[] [generated]
        stack_F8_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_2A9_0 : byte[] [generated]
        stack_2FA_0 : byte[] [generated]
        stack_35F_0 : byte[] [generated]
        stack_3B0_0 : byte[] [generated]
        var_4_27A : int
        var_3_27F : byte[]
        var_5_280 : int
        expr_2A9 : byte [generated]
        var_0_3A6 : int
        expr_3B0 : byte [generated]
        stack_3E0_2 : byte [generated]
        var_2_9A : byte[]
        expr_9E : int [generated]
        var_3_2E8 : byte[]
        var_5_2E9 : int
        expr_CC : int [generated]
        expr_FA : int [generated]
        var_3_132 : String
        stack_273_0 : String[] [generated]
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
        var_0_28E = and:int(ldc:int(1218544329), ldc:int(1768376017))
        expr_6E = arraylength:int(stack_9A_0 = stack_9C_0 = stack_CA_0 = stack_CC_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_2A9_0 = stack_2FA_0 = stack_35F_0 = stack_3B0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MIuFtbHg0aPPBHUhQTgrTQYkP8dkL144wMOCo1FmDwT1kU6Cg0SDgkPpbO9MZsqD1CcONCBONOA/UBfP1cbTSsNjAgjExbOxsbCwMqD+sYCCwkWCo22vTM2LTw/O")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_27A = expr_6E:int
        var_3_27F = newarray:byte[](byte.class, expr_6E:int)
        var_5_280 = expr_6E:int
        Label_0642:
        
        while (cmpne:boolean(and:int(var_0_28E:int, ldc:int(1)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0833)
            }
            
            var_0_28E = and:int(var_0_28E:int, ldc:int(-340844423))
            var_5_280 = add:int(var_5_280:int, ldc:int(-1))
            expr_2A9 = loadelement:byte(stack_2A9_0:byte[], var_5_280:int)
            storeelement:byte(var_3_27F:byte[], var_5_280:int, or:int(and:int(shl:int(expr_2A9:byte, xor:int(ldc:int(8203), ldc:int(8207))), ldc:int(-16)), and:int(shr:int(expr_2A9:byte[expected:int], xor:int(ldc:int(3106), ldc:int(3110))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_280:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_CA_0 = stack_CC_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_2A9_0 = stack_2FA_0 = stack_35F_0 = stack_3B0_0 = var_3_27F:byte[]
            goto(Label_0115)
        }
        
        var_0_28E = and:int(var_0_28E:int, ldc:int(-89907608))
        goto(Label_0913)
        Label_0833:
        
        while (cmpeq:boolean(and:int(var_0_28E:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0642)
            }
            
            var_0_28E = and:int(var_0_28E:int, ldc:int(-48794279))
            var_5_280 = add:int(var_5_280:int, ldc:int(-1))
            storeelement:byte(var_3_27F:byte[], var_5_280:int, xor:byte(add:byte(loadelement:byte(stack_35F_0:byte[], var_5_280:int), ldc:byte(23)), ldc:byte(39)))
            
            if (cmpne:boolean(var_5_280:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_CA_0 = stack_CC_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_2A9_0 = stack_2FA_0 = stack_35F_0 = stack_3B0_0 = var_3_27F:byte[]
            goto(Label_0209)
        }
        
        Label_0913:
        
        while (cmpeq:boolean(and:int(var_0_28E:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0642)
            }
            
            var_0_3A6 = and:int(var_0_28E:int, ldc:int(-567859725))
            var_5_280 = add:int(var_5_280:int, ldc:int(-1))
            expr_3B0 = loadelement:byte(stack_3B0_0:byte[], var_5_280:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_280:int, ldc:int(5)), neg:int(var_4_27A:int)), ldc:int(0))) {
                var_0_3A6 = and:int(var_0_3A6:int, ldc:int(-611492369))
                stack_3E0_2 = add:byte(expr_3B0:byte, ldc:byte(5))
            }
            else {
                stack_3E0_2 = add:byte(expr_3B0:byte, loadelement:byte(var_3_27F:byte[], add:int(var_5_280:int, ldc:int(5))))
            }
            
            var_0_28E = and:int(var_0_3A6:int, ldc:int(2033165299))
            storeelement:byte(var_3_27F:byte[], var_5_280:int, stack_3E0_2:byte)
            
            if (cmpne:boolean(var_5_280:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_CA_0 = stack_CC_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_2A9_0 = stack_2FA_0 = stack_35F_0 = stack_3B0_0 = var_3_27F:byte[]
            goto(Label_0255)
        }
        
        goto(Label_0833)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0255)
        }
        
        if (cmpeq:boolean(and:int(var_0_28E:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0209)
        }
        
        if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(4)), ldc:int(0))) {
            var_0_28E = and:int(var_0_28E:int, ldc:int(1380589682))
        }
        else {
            var_0_28E = and:int(var_0_28E:int, ldc:int(-859866031))
            var_2_9A = stack_9A_0:byte[]
            expr_9E = add:int(arraylength:int(stack_9C_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_3_2E8 = newarray:byte[](byte.class, expr_9E:int)
                var_5_2E9 = expr_9E:int
                
                loop {
                    var_0_28E = and:int(var_0_28E:int, ldc:int(1795777503))
                    var_5_2E9 = add:int(var_5_2E9:int, ldc:int(-1))
                    storeelement:byte(var_3_2E8:byte[], var_5_2E9:int, add:int(shl:int(loadelement:byte(stack_2FA_0:byte[], var_5_2E9:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9A:byte[], add:int(var_5_2E9:int, and:int(ldc:int(2053), ldc:int(20553)))), ldc:int(2)), and:int(ldc:int(4479), ldc:int(3647)))))
                    
                    if (cmpne:boolean(var_5_2E9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_CA_0 = stack_CC_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_2A9_0 = stack_2FA_0 = stack_35F_0 = stack_3B0_0 = var_3_2E8:byte[]
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0255)
        }
        
        if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_28E:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_28E = and:int(var_0_28E:int, ldc:int(1799982383))
                goto(Label_0115)
            }
            
            var_0_28E = and:int(var_0_28E:int, ldc:int(1832349909))
            expr_CC = arraylength:int(stack_CC_0:byte[])
            
            if (cmpne:boolean(expr_CC:int, ldc:int(0))) {
                var_4_27A = expr_CC:int
                var_3_27F = newarray:byte[](byte.class, expr_CC:int)
                var_5_280 = expr_CC:int
                goto(Label_0833)
            }
        }
        
        Label_0209:
        
        if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(262144)), ldc:int(0))) {
                var_0_28E = and:int(var_0_28E:int, ldc:int(1494930455))
                goto(Label_0115)
            }
            
            var_0_28E = and:int(var_0_28E:int, ldc:int(1292711135))
            expr_FA = arraylength:int(stack_FA_0:byte[])
            
            if (cmpne:boolean(expr_FA:int, ldc:int(0))) {
                var_4_27A = expr_FA:int
                var_3_27F = newarray:byte[](byte.class, expr_FA:int)
                var_5_280 = expr_FA:int
                goto(Label_0913)
            }
        }
        
        Label_0255:
        
        if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0209)
        }
        
        if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_28E:int, ldc:int(1)), ldc:int(0))) {
            var_0_28E = and:int(var_0_28E:int, ldc:int(649369463))
            goto(Label_0115)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_273_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16463), ldc:int(9243)))
        expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4773), ldc:int(4782)))
        storeelement:String(expr_144:String[], and:int(ldc:int(8740), ldc:int(21581)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-22782), ldc:int(22685)), and:int(ldc:int(8219), ldc:int(18))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(4129), ldc:int(4130)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(1055), ldc:int(16658)), and:int(ldc:int(4137), ldc:int(10489))))
        storeelement:String(expr_144:String[], and:int(ldc:int(-900), ldc:int(899)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(8381), ldc:int(17003)), xor:int(ldc:int(3080), ldc:int(3151))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(4272), ldc:int(4273)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(16071), ldc:int(16759)), xor:int(ldc:int(-16104), ldc:int(-16041))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(1681), ldc:int(1684)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(8399), ldc:int(127)), and:int(ldc:int(8304), ldc:int(4050))))
        storeelement:String(expr_144:String[], and:int(ldc:int(8462), ldc:int(26)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(10588), ldc:int(241)), and:int(ldc:int(209), ldc:int(625))))
        storeelement:String(expr_144:String[], and:int(ldc:int(8265), ldc:int(1049)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(-8056), ldc:int(-7975)), and:int(ldc:int(8666), ldc:int(1110))))
        storeelement:String(expr_144:String[], and:int(ldc:int(22722), ldc:int(262)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(2139), ldc:int(25430)), and:int(ldc:int(347), ldc:int(1753))))
        storeelement:String(expr_144:String[], and:int(ldc:int(12358), ldc:int(19367)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(1553), ldc:int(1608)), and:int(ldc:int(16990), ldc:int(123))))
        storeelement:String(expr_144:String[], and:int(ldc:int(2567), ldc:int(17799)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(227), ldc:int(185)), xor:int(ldc:int(48), ldc:int(107))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(-28604), ldc:int(-28596)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(91), ldc:int(13019)), xor:int(ldc:int(1622), ldc:int(1546))))
        putstatic:String[](\u4f4a\u92ff\u5bc4\u3776\u4c04::\u64ab\ua562\u7ce1\u3a62\uc246\uc2e8, expr_144:String[])
    }
    
    public void \ua3b4\u8753\ud523\u4c04\u9255\ud7e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_642 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_64D : int
        
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
        var_3_642 = and:int(ldc:int(-504487541), ldc:int(786326415))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f4a\u92ff\u5bc4\u3776\u4c04<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(524288)), ldc:int(0))) {
            var_3_642 = and:int(var_3_642:int, ldc:int(1457686380))
        }
        else {
            var_3_642 = and:int(var_3_642:int, ldc:int(-344168945))
            var_5_89 = and:int(ldc:int(-32342), ldc:int(30292))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6540), ldc:int(-6541)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_642:int, ldc:int(-126020869))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(11392), ldc:int(11393)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(16641), ldc:int(8261)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_642 = and:int(var_3_E2:int, ldc:int(769531963))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(9), ldc:int(35)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-126382183))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1188707657))
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1592538846))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1869655652))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1555411938))
                    }
                    else {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1318177361))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1330106363))
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-690434755))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1174557585))
                        var_11_F3 = and:int(ldc:int(-3821), ldc:int(3596))
                        goto(Label_1472)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(774637369))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-637234828))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(2008775577))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(1072466427))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0681:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-370417464))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1680028539))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-605279338))
                        goto(Label_0942)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1291005381))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(615770902))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(1626196043))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(42006012))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-731930697))
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(926833071))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(110591530))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(914267615))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = xor:int(ldc:int(-32064), ldc:int(-32063))
                                goto(Label_1105)
                            }
                        }
                    }
                    
                    Label_0942:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-608521821))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1764522610))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-673987925))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-107571165))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1625647720))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-219326053))
                        var_11_F3 = and:int(ldc:int(-28890), ldc:int(28889))
                    }
                    
                    Label_1105:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(10915283))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1594849606))
                            goto(Label_0942)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(205190521))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1043467495))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1333816357))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1227:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(633827470))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(674410140))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1105)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0942)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-646835485))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1460918465))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1472)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1962679076))
                        goto(Label_0942)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-893066595))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1104866242))
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_642 = and:int(var_3_642:int, ldc:int(-1166077621))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1472:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64D = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1483:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(49178826))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1854837228))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-820915802))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1283212557))
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(755491923))
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1328660517))
                        var_17_64D = add:int(var_16_121:int, and:int(ldc:int(2913), ldc:int(11)))
                        looporswitchbreak()
                    }
                }
                
                var_3_642 = and:int(var_3_642:int, ldc:int(763208655))
                
                if (cmple:boolean(var_5_89 = var_17_64D:int, sub:int(var_6_90:int, xor:int(ldc:int(-16384), ldc:int(-16383))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
            var_3_642 = and:int(var_3_642:int, ldc:int(95619520))
            goto(Label_0108)
        }
    }
}
