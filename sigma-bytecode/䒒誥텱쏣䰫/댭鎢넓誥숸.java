public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\ub32d\u93a2\ub113\u8aa5\uc238 {
    public void \ub32d\u93a2\ub113\u8aa5\uc238(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u416d\u4179\u5db4\u4179\u839e p0, java.lang.Class<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p2, boolean p3, boolean p4, java.util.function.Predicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p5) {
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
            putfield:\u416d\u4179\u5db4\u4179\u839e(\ub32d\u93a2\ub113\u8aa5\uc238::\u67d0\uc2bd\u0c95\ud171\u99f7\u8350, this:\ub32d\u93a2\ub113\u8aa5\uc238, p0:\u416d\u4179\u5db4\u4179\u839e)
            invokespecial:\u8709\ud12e\u7330\uc246\ud171<\ube23\u67d0\u64f2\u839e\u76bc>(\u8709\ud12e\u7330\uc246\ud171<\ube23\u67d0\u64f2\u839e\u76bc>::<init>, this:\ub32d\u93a2\ub113\u8aa5\uc238[expected:\u8709\ud12e\u7330\uc246\ud171<\ube23\u67d0\u64f2\u839e\u76bc>], p0:\u416d\u4179\u5db4\u4179\u839e[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], p2:Class<\ube23\u67d0\u64f2\u839e\u76bc>, ldc:int(10), p3:boolean, p4:boolean, p5:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_5F : int
        var_1_13B : int
        var_3_78 : Iterator<UUID>
        var_4_CA : UUID
        var_5_100 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_6_116 : \ube23\u67d0\u64f2\u839e\u76bc
        stack_16C_0 : int [generated]
        
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
        var_1_5F = and:int(ldc:int(-1564615397), ldc:int(-1479217159))
        
        if (logicaland:boolean(cmpgt:boolean(getfield:int(\ub32d\u93a2\ub113\u8aa5\uc238::\ub32d\ub70c\u0a06\u3a62\u7c6b\uc910, this:\ub32d\u93a2\ub113\u8aa5\uc238), ldc:int(0)), cmpne:boolean(invokevirtual:int(Random::nextInt, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc](\ub32d\u93a2\ub113\u8aa5\uc238::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, this:\ub32d\u93a2\ub113\u8aa5\uc238)), getfield:int(\ub32d\u93a2\ub113\u8aa5\uc238::\ub32d\ub70c\u0a06\u3a62\u7c6b\uc910, this:\ub32d\u93a2\ub113\u8aa5\uc238)), ldc:int(0)))) {
            return:boolean(and:int[expected:boolean](ldc:int(-8668), ldc:int(8665)))
        }
        
        var_1_13B = and:int(var_1_5F:int, ldc:int(-353728995))
        var_3_78 = invokeinterface:Iterator(List::iterator, invokestatic:List(\u416d\u4179\u5db4\u4179\u839e::\u7043\u3d4b\u0b8e\ub19c\u71ae\u5f50, getfield:\u416d\u4179\u5db4\u4179\u839e(\ub32d\u93a2\ub113\u8aa5\uc238::\u67d0\uc2bd\u0c95\ud171\u99f7\u8350, this:\ub32d\u93a2\ub113\u8aa5\uc238)))
        
        while (invokeinterface:boolean(Iterator::hasNext, var_3_78:Iterator)) {
            var_4_CA = checkcast:UUID(java.util.UUID.class, invokeinterface:UUID(Iterator<UUID>::next, var_3_78:Iterator<UUID>))
            
            if (cmpne:boolean(var_4_CA:UUID, aconstnull:UUID())) {
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u416d\u4179\u5db4\u4179\u839e::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u416d\u4179\u5db4\u4179\u839e(\ub32d\u93a2\ub113\u8aa5\uc238::\u67d0\uc2bd\u0c95\ud171\u99f7\u8350, this:\ub32d\u93a2\ub113\u8aa5\uc238)))) {
                    var_5_100 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uc238\u5140\u4cd9\u8aa5::\u3d64\u4daf\ud36e\u8d98\u927d\u6ec6, checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\ube23\uc238\u5140\u4cd9\u8aa5](\u416d\u4179\u5db4\u4179\u839e::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u416d\u4179\u5db4\u4179\u839e(\ub32d\u93a2\ub113\u8aa5\uc238::\u67d0\uc2bd\u0c95\ud171\u99f7\u8350, this:\ub32d\u93a2\ub113\u8aa5\uc238))), var_4_CA:UUID)
                    
                    if (instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_5_100:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        var_6_116 = checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_5_100:\ube23\u67d0\u64f2\u839e\u76bc)
                        putfield:\ube23\u67d0\u64f2\u839e\u76bc(\ub32d\u93a2\ub113\u8aa5\uc238::\u4cd9\u67e9\uc2e8\u36d3\u9af2\u67d0, this:\ub32d\u93a2\ub113\u8aa5\uc238, var_6_116:\ube23\u67d0\u64f2\u839e\u76bc)
                        putfield:\ube23\u67d0\u64f2\u839e\u76bc(\ub32d\u93a2\ub113\u8aa5\uc238::\u8350\u1833\u3504\u0800\u62da\u156b, this:\ub32d\u93a2\ub113\u8aa5\uc238, invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(\ube23\u67d0\u64f2\u839e\u76bc::\u4975\uc29a\u071d\u8413\u51b2\ua3b4, var_6_116:\ube23\u67d0\u64f2\u839e\u76bc))
                        
                        if (logicaland:boolean(cmpne:boolean(invokevirtual:int(\ube23\u67d0\u64f2\u839e\u76bc::\u6198\ubefe\u8d90\u7af6\u839e\uc31c, var_6_116:\ube23\u67d0\u64f2\u839e\u76bc), getfield:int(\ub32d\u93a2\ub113\u8aa5\uc238::\ub6ab\u600f\u7043\uc84e\u3bd6\ufe34, this:\ub32d\u93a2\ub113\u8aa5\uc238)), invokevirtual:boolean(\u16f6\u47c2\u12b2\u8709\u6d69::\u88c5\u385b\ubefe\u4d85\uafe7\ud12e, this:\ub32d\u93a2\ub113\u8aa5\uc238[expected:\u16f6\u47c2\u12b2\u8709\u6d69], getfield:\ube23\u67d0\u64f2\u839e\u76bc(\ub32d\u93a2\ub113\u8aa5\uc238::\u8350\u1833\u3504\u0800\u62da\u156b, this:\ub32d\u93a2\ub113\u8aa5\uc238), getfield:\uc246\u1187\u2dcc\u3a62\u392e(\ub32d\u93a2\ub113\u8aa5\uc238::\ucb79\u965f\uc910\u8cae\u4bc8\u4ab3, this:\ub32d\u93a2\ub113\u8aa5\uc238)))) {
                            stack_16C_0 = xor:int(ldc:int(384), ldc:int(385))
                        }
                        else {
                            var_1_13B = and:int(var_1_13B:int, ldc:int(-1148816679))
                            stack_16C_0 = and:int(ldc:int(-9923), ldc:int(9922))
                        }
                        
                        return:boolean(stack_16C_0:int)
                    }
                }
            }
            
            var_1_13B = and:int(var_1_13B:int, ldc:int(-1277521767))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-17880), ldc:int(17799)))
    }
    
    public void \ub7dc\u4c2b\ud523\ube23\u416d\u3776() {
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
            invokevirtual:void(\u8709\ud12e\u7330\uc246\ud171<T>::\ua068\u0b8e\u3776\u8df4\ub1b9\u5bc4, this:\ub32d\u93a2\ub113\u8aa5\uc238[expected:\u8709\ud12e\u7330\uc246\ud171<\ube23\u67d0\u64f2\u839e\u76bc>], getfield:\ube23\u67d0\u64f2\u839e\u76bc(\ub32d\u93a2\ub113\u8aa5\uc238::\u8350\u1833\u3504\u0800\u62da\u156b, this:\ub32d\u93a2\ub113\u8aa5\uc238))
            putfield:\ube23\u67d0\u64f2\u839e\u76bc(\ub32d\u93a2\ub113\u8aa5\uc238::\ucfaf\u4492\u97b7\ud158\u3bd6\uc9f6, this:\ub32d\u93a2\ub113\u8aa5\uc238, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\ub32d\u93a2\ub113\u8aa5\uc238::\u8350\u1833\u3504\u0800\u62da\u156b, this:\ub32d\u93a2\ub113\u8aa5\uc238))
            
            if (cmpne:boolean(getfield:\ube23\u67d0\u64f2\u839e\u76bc(\ub32d\u93a2\ub113\u8aa5\uc238::\u4cd9\u67e9\uc2e8\u36d3\u9af2\u67d0, this:\ub32d\u93a2\ub113\u8aa5\uc238), aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())) {
                putfield:int(\ub32d\u93a2\ub113\u8aa5\uc238::\ub6ab\u600f\u7043\uc84e\u3bd6\ufe34, this:\ub32d\u93a2\ub113\u8aa5\uc238, invokevirtual:int(\ube23\u67d0\u64f2\u839e\u76bc::\u6198\ubefe\u8d90\u7af6\u839e\uc31c, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\ub32d\u93a2\ub113\u8aa5\uc238::\u4cd9\u67e9\uc2e8\u36d3\u9af2\u67d0, this:\ub32d\u93a2\ub113\u8aa5\uc238)))
            }
            
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uc246\u4c2b\u51b2\u4f4a\u9a18\u99f7, getfield:\u416d\u4179\u5db4\u4179\u839e[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ub32d\u93a2\ub113\u8aa5\uc238::\u67d0\uc2bd\u0c95\ud171\u99f7\u8350, this:\ub32d\u93a2\ub113\u8aa5\uc238), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u8df4\u983f\u7af6\u71ae\u120d\u718f), ldc:float(1.0f), ldc:float(1.0f))
            invokestatic:void(\u416d\u4179\u5db4\u4179\u839e::\u7043\u4ab3\u52d3\u64ab\u4179\ub19c, getfield:\u416d\u4179\u5db4\u4179\u839e(\ub32d\u93a2\ub113\u8aa5\uc238::\u67d0\uc2bd\u0c95\ud171\u99f7\u8350, this:\ub32d\u93a2\ub113\u8aa5\uc238), xor:int[expected:boolean](ldc:int(394), ldc:int(395)))
            invokestatic:void(\u416d\u4179\u5db4\u4179\u839e::\u1833\u6ec6\u3e75\u69d9\u92ee\ubff1, getfield:\u416d\u4179\u5db4\u4179\u839e(\ub32d\u93a2\ub113\u8aa5\uc238::\u67d0\uc2bd\u0c95\ud171\u99f7\u8350, this:\ub32d\u93a2\ub113\u8aa5\uc238))
            invokespecial:void(\u8709\ud12e\u7330\uc246\ud171<T>::\ub7dc\u4c2b\ud523\ube23\u416d\u3776, this:\ub32d\u93a2\ub113\u8aa5\uc238[expected:\u8709\ud12e\u7330\uc246\ud171<\ube23\u67d0\u64f2\u839e\u76bc>])
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_600 : int
        
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
        var_3_5F5 = and:int(ldc:int(-1145572469), ldc:int(1035761395))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub32d\u93a2\ub113\u8aa5\uc238[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-907637288))
        }
        else {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1653312773))
            var_5_85 = and:int(ldc:int(-13308), ldc:int(12377))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30372), ldc:int(26147)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F5:int, ldc:int(-1153571877))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(17922), ldc:int(17923)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(6145), ldc:int(9265)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F5 = and:int(var_3_D2:int, ldc:int(2134893487))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16419), ldc:int(8977)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1970403157))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(612562546))
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1065137375))
                        goto(Label_0651)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-654453189))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1145180185))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(288973078))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1616578976))
                        goto(Label_1037)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1266556850))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-745470959))
                        goto(Label_0651)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1496675283))
                            var_11_E3 = and:int(ldc:int(-17996), ldc:int(1611))
                            goto(Label_1416)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2123959899))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(88067795))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2099810989))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1001906911))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0651:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-55416810))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(202388336))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-609540578))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-828285861))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(993290927))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-110836838))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0651)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-148449274))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2071818199))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(2563), ldc:int(2562))
                                goto(Label_1037)
                            }
                        }
                    }
                    
                    Label_0877:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1402515366))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1827719929))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1997134248))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-707881683))
                            goto(Label_0651)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1999252633))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1060960139))
                        var_11_E3 = and:int(ldc:int(-9392), ldc:int(9388))
                    }
                    
                    Label_1037:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(725456634))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-963803148))
                            goto(Label_0877)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1778618902))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0651)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(436076239))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1198619887))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(822897173))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1037)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1002933291))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1402361551))
                            goto(Label_0651)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-124823595))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1619755341))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1416)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1401447144))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-134969353))
                        goto(Label_0651)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1185809880))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-437368021))
                        loopcontinue()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2134667263))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1416:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_600 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1427:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2117350080))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(654056090))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0651)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(714138872))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1078007877))
                        var_17_600 = add:int(var_16_111:int, and:int(ldc:int(28995), ldc:int(2177)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-4445))
                
                if (cmple:boolean(var_5_85 = var_17_600:int, sub:int(var_6_8C:int, xor:int(ldc:int(-16379), ldc:int(-16380))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
