public class \ub113\uc4d2\u183a\u527a\u6435.\u3711\u97b7\u873d\u624e\ubefe {
    public void \u3711\u97b7\u873d\u624e\ubefe(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ubf56\u3c25\u76bc\ucfaf\u52d3 p0, double p1) {
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
            invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u3711\u97b7\u873d\u624e\ubefe)
            putfield:\ubf56\u3c25\u76bc\ucfaf\u52d3(\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe, p0:\ubf56\u3c25\u76bc\ucfaf\u52d3)
            putfield:double(\u3711\u97b7\u873d\u624e\ubefe::\u67d0\ucef1\u3e75\u8cae\u873d\u88c5, this:\u3711\u97b7\u873d\u624e\ubefe, p1:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_3_93 : List<\ubf56\u3c25\u76bc\ucfaf\u52d3>
        var_4_95 : \ubf56\u3c25\u76bc\ucfaf\u52d3
        var_5_9A : double
        var_7_A2 : Iterator<\ubf56\u3c25\u76bc\ucfaf\u52d3>
        var_8_EE : \ubf56\u3c25\u76bc\ucfaf\u52d3
        var_9_108 : double
        
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
        
        if (cmpge:boolean(invokevirtual:int(\u8bb0\u40a9\u74b1\ube23\u76bc::\u6ec6\uc246\u99f7\ud4fe\u385b\u8bb0, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u8bb0\u40a9\u74b1\ube23\u76bc](\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe)), ldc:int(0))) {
            return:boolean(and:int[expected:boolean](ldc:int(7846), ldc:int(-7872)))
        }
        
        var_3_93 = invokevirtual:List<\ubf56\u3c25\u76bc\ucfaf\u52d3>(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\u965f\ucef1\u34df\u4daf\u760c\u6d99, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e](\ubf56\u3c25\u76bc\ucfaf\u52d3::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3(\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe)), invokevirtual:Class<? extends \ubf56\u3c25\u76bc\ucfaf\u52d3>(\ubf56\u3c25\u76bc\ucfaf\u52d3::getClass, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3(\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe)), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe)), ldc:double(8.0), ldc:double(4.0), ldc:double(8.0)))
        var_4_95 = aconstnull:\ubf56\u3c25\u76bc\ucfaf\u52d3()
        var_5_9A = ldc:double(1.7976931348623157E308)
        var_7_A2 = invokeinterface:Iterator<\ubf56\u3c25\u76bc\ucfaf\u52d3>(List<\ubf56\u3c25\u76bc\ucfaf\u52d3>::iterator, var_3_93:List<\ubf56\u3c25\u76bc\ucfaf\u52d3>)
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_A2:Iterator<\ubf56\u3c25\u76bc\ucfaf\u52d3>)) {
            var_8_EE = checkcast:\ubf56\u3c25\u76bc\ucfaf\u52d3(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ubf56\u3c25\u76bc\ucfaf\u52d3.class, invokeinterface:\ubf56\u3c25\u76bc\ucfaf\u52d3(Iterator<\ubf56\u3c25\u76bc\ucfaf\u52d3>::next, var_7_A2:Iterator<\ubf56\u3c25\u76bc\ucfaf\u52d3>))
            
            if (cmplt:boolean(invokevirtual:int(\u8bb0\u40a9\u74b1\ube23\u76bc::\u6ec6\uc246\u99f7\ud4fe\u385b\u8bb0, var_8_EE:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u8bb0\u40a9\u74b1\ube23\u76bc]), ldc:int(0))) {
                loopcontinue()
            }
            
            var_9_108 = invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe), var_8_EE:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            
            if (cmpgt:boolean(var_9_108:double, var_5_9A:double)) {
                loopcontinue()
            }
            
            var_5_9A = var_9_108:double
            var_4_95 = var_8_EE:\ubf56\u3c25\u76bc\ucfaf\u52d3
        }
        
        if (cmpeq:boolean(var_4_95:\ubf56\u3c25\u76bc\ucfaf\u52d3, aconstnull:\ubf56\u3c25\u76bc\ucfaf\u52d3())) {
            return:boolean(and:int[expected:boolean](ldc:int(19348), ldc:int(-19349)))
        }
        
        if (cmpge:boolean(var_5_9A:double, ldc:double(9.0))) {
            putfield:\ubf56\u3c25\u76bc\ucfaf\u52d3(\u3711\u97b7\u873d\u624e\ubefe::\ub70c\u34df\u6bb9\ufcaf\u7bad\u1833, this:\u3711\u97b7\u873d\u624e\ubefe, var_4_95:\ubf56\u3c25\u76bc\ucfaf\u52d3)
            return:boolean(xor:int[expected:boolean](ldc:int(258), ldc:int(259)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-30328), ldc:int(30243)))
    }
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_5F : int
        var_1_75 : int
        var_1_9B : int
        var_3_A7 : double
        stack_FC_0 : int [generated]
        
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
        var_1_5F = and:int(ldc:int(-447465135), ldc:int(-67208759))
        
        if (cmpge:boolean(invokevirtual:int(\u8bb0\u40a9\u74b1\ube23\u76bc::\u6ec6\uc246\u99f7\ud4fe\u385b\u8bb0, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u8bb0\u40a9\u74b1\ube23\u76bc](\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe)), ldc:int(0))) {
            return:boolean(and:int[expected:boolean](ldc:int(20865), ldc:int(-20866)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
                var_1_75 = and:int(var_1_5F:int, ldc:int(-846055568))
            }
            else {
                var_1_75 = and:int(var_1_5F:int, ldc:int(-1407718945))
                
                if (logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u3711\u97b7\u873d\u624e\ubefe::\ub70c\u34df\u6bb9\ufcaf\u7bad\u1833, this:\u3711\u97b7\u873d\u624e\ubefe)))) {
                    return:boolean(and:int[expected:boolean](ldc:int(7806), ldc:int(-7807)))
                }
            }
            
            if (cmpne:boolean(and:int(var_1_75:int, ldc:int(1)), ldc:int(0))) {
                var_1_9B = and:int(var_1_75:int, ldc:int(-211997751))
                var_3_A7 = invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe), getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3711\u97b7\u873d\u624e\ubefe::\ub70c\u34df\u6bb9\ufcaf\u7bad\u1833, this:\u3711\u97b7\u873d\u624e\ubefe))
                
                if (logicaland:boolean(cmpge:boolean(var_3_A7:double, ldc:double(9.0)), cmple:boolean(var_3_A7:double, ldc:double(256.0)))) {
                    stack_FC_0 = and:int(ldc:int(20801), ldc:int(669))
                }
                else {
                    var_1_9B = and:int(var_1_9B:int, ldc:int(-325653561))
                    stack_FC_0 = and:int(ldc:int(-17585), ldc:int(17584))
                }
                
                return:boolean(stack_FC_0:int)
            }
            
            var_1_5F = and:int(var_1_75:int, ldc:int(1198647683))
        }
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
            putfield:int(\u3711\u97b7\u873d\u624e\ubefe::\u76bc\u7d52\u4d85\u97e6\ud217\uff55, this:\u3711\u97b7\u873d\u624e\ubefe, and:int(ldc:int(-18146), ldc:int(17121)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
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
            putfield:\ubf56\u3c25\u76bc\ucfaf\u52d3(\u3711\u97b7\u873d\u624e\ubefe::\ub70c\u34df\u6bb9\ufcaf\u7bad\u1833, this:\u3711\u97b7\u873d\u624e\ubefe, aconstnull:\ubf56\u3c25\u76bc\ucfaf\u52d3())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
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
            
            if (cmple:boolean(putfield:int(\u3711\u97b7\u873d\u624e\ubefe::\u76bc\u7d52\u4d85\u97e6\ud217\uff55, this:\u3711\u97b7\u873d\u624e\ubefe, sub:int(getfield:int(\u3711\u97b7\u873d\u624e\ubefe::\u76bc\u7d52\u4d85\u97e6\ud217\uff55, this:\u3711\u97b7\u873d\u624e\ubefe), xor:int(ldc:int(8304), ldc:int(8305)))), ldc:int(0))) {
                putfield:int(\u3711\u97b7\u873d\u624e\ubefe::\u76bc\u7d52\u4d85\u97e6\ud217\uff55, this:\u3711\u97b7\u873d\u624e\ubefe, ldc:int(10))
                invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u960f\u839e\u4ab3\ud523\u7af6\ud12e, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u3711\u97b7\u873d\u624e\ubefe::\u16f6\u51b2\u5140\ub1b9\u527a\u516c, this:\u3711\u97b7\u873d\u624e\ubefe)), getfield:\ubf56\u3c25\u76bc\ucfaf\u52d3[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3711\u97b7\u873d\u624e\ubefe::\ub70c\u34df\u6bb9\ufcaf\u7bad\u1833, this:\u3711\u97b7\u873d\u624e\ubefe), getfield:double(\u3711\u97b7\u873d\u624e\ubefe::\u67d0\ucef1\u3e75\u8cae\u873d\u88c5, this:\u3711\u97b7\u873d\u624e\ubefe))
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(1578158351), ldc:int(1582205247))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3711\u97b7\u873d\u624e\ubefe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-847126120))
        }
        else {
            var_3_641 = and:int(var_3_641:int, ldc:int(-941787181))
            var_5_85 = and:int(ldc:int(1985), ldc:int(-1990))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5059), ldc:int(-14308)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_641:int, ldc:int(-433423109))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(12289), ldc:int(1061)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2827), ldc:int(17)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_DA:int, ldc:int(-297008493))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(5121), ldc:int(347)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(133593637))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-692934380))
                        goto(Label_1079)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2130101494))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1856714591))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-911790156))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1910083588))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2102712278))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(981647434))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(777281475))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(898331441))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1475845379))
                            var_11_EB = and:int(ldc:int(-29525), ldc:int(29012))
                            goto(Label_1486)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1542393229))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-277838845))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1002373701))
                        goto(Label_1079)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1766016219))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1452474163))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-34020641))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1251844150))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1736064941))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(750732425))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-22681597))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-219922023))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-945119349))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-130230678))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(93308197))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1409677064))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-433666233))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(8705), ldc:int(6165))
                                goto(Label_1079)
                            }
                        }
                    }
                    
                    Label_0910:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(279345801))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-344136266))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1711615643))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-349149075))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1231784080))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(707938107))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-821189541))
                        var_11_EB = and:int(ldc:int(-18870), ldc:int(2485))
                    }
                    
                    Label_1079:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1459924981))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1932466584))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(2040689827))
                            goto(Label_0910)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-2058104818))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(165176769))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-21040130))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-700707169))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1213:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-270680573))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1672906502))
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0910)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1189195899))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(822725012))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-20711929))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1486)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1340:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1742343398))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(919603527))
                        goto(Label_1079)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(682471686))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1431364575))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1291162722))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-290016434))
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(2007489355))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1486:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1497:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1079)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1726171529))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-28841573))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(191389821))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(873700396))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-275817749))
                        var_17_64C = add:int(var_16_119:int, and:int(ldc:int(2613), ldc:int(257)))
                        looporswitchbreak()
                    }
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(-806851541))
                
                if (cmple:boolean(var_5_85 = var_17_64C:int, sub:int(var_6_8C:int, xor:int(ldc:int(4608), ldc:int(4609))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(1619923596))
            goto(Label_0106)
        }
    }
}
