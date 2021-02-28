public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u873d\u7d52\u7006\ubded\u3bc9 {
    public void \u873d\u7d52\u7006\ubded\u3bc9(float p0, float p1, float p2, float p3, float p4) {
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
            invokespecial:Object(Object::<init>, this:\u873d\u7d52\u7006\ubded\u3bc9)
            putfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, this:\u873d\u7d52\u7006\ubded\u3bc9, p0:float)
            putfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, this:\u873d\u7d52\u7006\ubded\u3bc9, p1:float)
            putfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, this:\u873d\u7d52\u7006\ubded\u3bc9, p2:float)
            putfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, this:\u873d\u7d52\u7006\ubded\u3bc9, p3:float)
            putfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u0800\u3e2a\u983f\u960f\u3e75\u0a06, this:\u873d\u7d52\u7006\ubded\u3bc9, p4:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_19F : int
        var_4_BA : \u873d\u7d52\u7006\ubded\u3bc9
        var_2_E4 : int
        stack_1E7_0 : int [generated]
        
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
        var_2_19F = and:int(ldc:int(641958285), ldc:int(-61803585))
        
        if (cmpeq:boolean(this:\u873d\u7d52\u7006\ubded\u3bc9[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(2343), ldc:int(17481)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_19F:int, ldc:int(512)), ldc:int(0))) {
                var_2_19F = and:int(var_2_19F:int, ldc:int(-467834541))
            }
            else {
                var_2_19F = and:int(var_2_19F:int, ldc:int(-975767609))
                
                if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                    if (cmpeq:boolean(invokevirtual:Class<? extends \u873d\u7d52\u7006\ubded\u3bc9>(\u873d\u7d52\u7006\ubded\u3bc9::getClass, this:\u873d\u7d52\u7006\ubded\u3bc9), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                        var_4_BA = checkcast:\u873d\u7d52\u7006\ubded\u3bc9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u873d\u7d52\u7006\ubded\u3bc9.class, p0:Object[expected:\u873d\u7d52\u7006\ubded\u3bc9])
                        
                        if (cmpeq:boolean(invokestatic:int(Float::compare, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, var_4_BA:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, this:\u873d\u7d52\u7006\ubded\u3bc9)), ldc:int(0))) {
                            loop {
                                if (cmpne:boolean(and:int(var_2_19F:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_0374)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_19F:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_0317)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_19F:int, ldc:int(512)), ldc:int(0))) {
                                    var_2_E4 = and:int(var_2_19F:int, ldc:int(1310506991))
                                }
                                else {
                                    var_2_E4 = and:int(var_2_19F:int, ldc:int(1148114375))
                                    
                                    if (cmpne:boolean(invokestatic:int(Float::compare, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, var_4_BA:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, this:\u873d\u7d52\u7006\ubded\u3bc9)), ldc:int(0))) {
                                        return:boolean(and:int[expected:boolean](ldc:int(-19736), ldc:int(19731)))
                                    }
                                }
                                
                                Label_0252:
                                
                                if (cmpne:boolean(and:int(var_2_E4:int, ldc:int(524288)), ldc:int(0))) {
                                    var_2_19F = and:int(var_2_E4:int, ldc:int(-154240648))
                                    goto(Label_0374)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_E4:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_19F = and:int(var_2_E4:int, ldc:int(-761727615))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_E4:int, ldc:int(128)), ldc:int(0))) {
                                        var_2_19F = and:int(var_2_E4:int, ldc:int(411986574))
                                        loopcontinue()
                                    }
                                    
                                    var_2_19F = and:int(var_2_E4:int, ldc:int(99137533))
                                    
                                    if (cmpne:boolean(invokestatic:int(Float::compare, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, var_4_BA:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, this:\u873d\u7d52\u7006\ubded\u3bc9)), ldc:int(0))) {
                                        return:boolean(and:int[expected:boolean](ldc:int(30908), ldc:int(-30974)))
                                    }
                                }
                                
                                Label_0317:
                                
                                if (cmpeq:boolean(and:int(var_2_19F:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_2_19F = and:int(var_2_19F:int, ldc:int(-1845363398))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_19F:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_2_E4 = and:int(var_2_19F:int, ldc:int(625498981))
                                        goto(Label_0252)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_19F:int, ldc:int(32)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_19F = and:int(var_2_19F:int, ldc:int(1826214901))
                                    
                                    if (cmpeq:boolean(invokestatic:int(Float::compare, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, var_4_BA:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, this:\u873d\u7d52\u7006\ubded\u3bc9)), ldc:int(0))) {
                                        stack_1E7_0 = xor:int(ldc:int(12), ldc:int(13))
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_0374:
                                
                                if (cmpeq:boolean(and:int(var_2_19F:int, ldc:int(128)), ldc:int(0))) {
                                    var_2_19F = and:int(var_2_19F:int, ldc:int(1793096228))
                                    goto(Label_0317)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_19F:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_E4 = and:int(var_2_19F:int, ldc:int(1528465843))
                                    goto(Label_0252)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_19F:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_19F = and:int(var_2_19F:int, ldc:int(-1268130417))
                                    stack_1E7_0 = and:int(ldc:int(13257), ldc:int(-13274))
                                    looporswitchbreak()
                                }
                            }
                            
                            return:boolean(stack_1E7_0:int)
                        }
                        
                        return:boolean(and:int[expected:boolean](ldc:int(1654), ldc:int(-9847)))
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_19F:int, ldc:int(128)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(1146), ldc:int(-1147)))
            }
        }
    }
    
    public int hashCode() {
        var_1_5F : int
        stack_88_0 : int [generated]
        var_1_14E : int
        stack_125_0 : int [generated]
        stack_D2_0 : int [generated]
        stack_169_0 : int [generated]
        stack_125_1 : int [generated]
        stack_D2_1 : int [generated]
        stack_169_1 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1595879506), ldc:int(-1362237508))
            
            if (cmpeq:boolean(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, this:\u873d\u7d52\u7006\ubded\u3bc9), ldc:float(0.0f))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1379670083))
                stack_88_0 = and:int(ldc:int(21769), ldc:int(-21770))
            }
            else {
                stack_88_0 = invokestatic:int(Float::floatToIntBits, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, this:\u873d\u7d52\u7006\ubded\u3bc9))
            }
            
            var_1_14E = and:int(var_1_5F:int, ldc:int(-310650946))
            stack_125_0 = stack_D2_0 = stack_169_0 = mul(ldc(31), stack_88_0)
            
            if (cmpne:boolean(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, this:\u873d\u7d52\u7006\ubded\u3bc9), ldc:float(0.0f))) {
                stack_125_1 = stack_D2_1 = invokestatic(Float::floatToIntBits, getfield(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, this))
                goto(Label_0190)
            }
            
            Label_0150:
            
            if (cmpne:boolean(and:int(var_1_14E:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0308)
            }
            
            if (cmpeq:boolean(and:int(var_1_14E:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0225)
            }
            
            var_1_14E = and:int(var_1_14E:int, ldc:int(-1569792056))
            stack_125_1 = stack_D2_1 = and(ldc(24660), ldc(-24661))
            Label_0190:
            
            if (cmpne:boolean(and:int(var_1_14E:int, ldc:int(16)), ldc:int(0))) {
                var_1_14E = and:int(var_1_14E:int, ldc:int(396765779))
                goto(Label_0273)
            }
            
            var_1_14E = and:int(var_1_14E:int, ldc:int(904320989))
            stack_125_0 = stack_D2_0 = stack_169_0 = mul:int(ldc:int(31), add:int(stack_D2_0:int, stack_D2_1:int))
            
            if (cmpne:boolean(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, this:\u873d\u7d52\u7006\ubded\u3bc9), ldc:float(0.0f))) {
                stack_125_1 = stack_D2_1 = invokestatic(Float::floatToIntBits, getfield(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, this))
                goto(Label_0273)
            }
            
            Label_0225:
            
            if (cmpne:boolean(and:int(var_1_14E:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_14E = and:int(var_1_14E:int, ldc:int(-1874028224))
                goto(Label_0308)
            }
            
            if (cmpeq:boolean(and:int(var_1_14E:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0150)
            }
            
            var_1_14E = and:int(var_1_14E:int, ldc:int(-1192769620))
            stack_125_1 = stack_D2_1 = and(ldc(9452), ldc(-25838))
            Label_0273:
            
            if (cmpne:boolean(and:int(var_1_14E:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_14E = and:int(var_1_14E:int, ldc:int(641576457))
                goto(Label_0190)
            }
            
            var_1_14E = and:int(var_1_14E:int, ldc:int(583464895))
            stack_125_0 = stack_D2_0 = stack_169_0 = mul:int(ldc:int(31), add:int(stack_125_0:int, stack_125_1:int))
            
            if (cmpne:boolean(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, this:\u873d\u7d52\u7006\ubded\u3bc9), ldc:float(0.0f))) {
                stack_169_1 = invokestatic:int(Float::floatToIntBits, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, this:\u873d\u7d52\u7006\ubded\u3bc9))
                return:int(add:int(stack_169_0:int, stack_169_1:int))
            }
            
            Label_0308:
            
            if (cmpeq:boolean(and:int(var_1_14E:int, ldc:int(8)), ldc:int(0))) {
                var_1_14E = and:int(var_1_14E:int, ldc:int(-1148876544))
                goto(Label_0225)
            }
            
            if (cmpne:boolean(and:int(var_1_14E:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0150)
            }
            
            var_1_14E = and:int(var_1_14E:int, ldc:int(1877469097))
            stack_169_1 = and:int(ldc:int(-19919), ldc:int(19906))
            return:int(add:int(stack_169_0:int, stack_169_1:int))
        }
        
        goto(Label_0006)
    }
    
    public float \ucef1\u183a\u4e72\u59ec\ucfaf\ubf56(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u873d\u7d52\u7006\ubded\u3bc9 p0) {
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
            return:float(add:float(add:float(add:float(add:float(mul:float(sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, p0:\u873d\u7d52\u7006\ubded\u3bc9)), sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, p0:\u873d\u7d52\u7006\ubded\u3bc9))), mul:float(sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, p0:\u873d\u7d52\u7006\ubded\u3bc9)), sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, p0:\u873d\u7d52\u7006\ubded\u3bc9)))), mul:float(sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, p0:\u873d\u7d52\u7006\ubded\u3bc9)), sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, p0:\u873d\u7d52\u7006\ubded\u3bc9)))), mul:float(sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, p0:\u873d\u7d52\u7006\ubded\u3bc9)), sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, p0:\u873d\u7d52\u7006\ubded\u3bc9)))), mul:float(sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u0800\u3e2a\u983f\u960f\u3e75\u0a06, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u0800\u3e2a\u983f\u960f\u3e75\u0a06, p0:\u873d\u7d52\u7006\ubded\u3bc9)), sub:float(getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u0800\u3e2a\u983f\u960f\u3e75\u0a06, this:\u873d\u7d52\u7006\ubded\u3bc9), getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u0800\u3e2a\u983f\u960f\u3e75\u0a06, p0:\u873d\u7d52\u7006\ubded\u3bc9)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\ufcaf\ub1b9\u97e6\u8413\u4d85\uc7fe$5(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.lang.Float lambda$\u6ec6\u92ee\u7e3f\u4492\u7049\u3bc9$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u873d\u7d52\u7006\ubded\u3bc9 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u0800\u3e2a\u983f\u960f\u3e75\u0a06, p0:\u873d\u7d52\u7006\ubded\u3bc9)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\ub70c\u5db4\u927d\u5db4\u5245\u6d69$3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u873d\u7d52\u7006\ubded\u3bc9 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u4d85\ucb79\u836c\u67e9\u6c56\u8bb0, p0:\u873d\u7d52\u7006\ubded\u3bc9)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u9af2\u1187\uc31c\u34df\u983f\u4f4a$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u873d\u7d52\u7006\ubded\u3bc9 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\ub19c\u718f\u6b0d\u7c6b\u7d52\u6435, p0:\u873d\u7d52\u7006\ubded\u3bc9)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u3504\u64ab\u946b\u600f\u7af6\u3d64$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u873d\u7d52\u7006\ubded\u3bc9 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u59ec\u72f1\u56bd\u6c52\uc84e\u965f, p0:\u873d\u7d52\u7006\ubded\u3bc9)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u4daf\u6c52\u446c\uceb8\ubcb0\u3711$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u873d\u7d52\u7006\ubded\u3bc9 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u873d\u7d52\u7006\ubded\u3bc9::\u5d20\ud217\u99f7\u8753\u873d\u7049, p0:\u873d\u7d52\u7006\ubded\u3bc9)))
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
    
    public void \u16f6\u4daf\ua6bd\u7006\u40a9\u8bb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C0 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6CB : int
        
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
        var_3_6C0 = and:int(ldc:int(1923154613), ldc:int(-89845263))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u873d\u7d52\u7006\ubded\u3bc9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2048)), ldc:int(0))) {
            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1651757246))
        }
        else {
            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(2012055806))
            var_5_8A = and:int(ldc:int(21892), ldc:int(-21894))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18300), ldc:int(-20477)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6C0:int, ldc:int(2007964144))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(17), ldc:int(16)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(12329), ldc:int(1)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6C0 = and:int(var_3_DA:int, ldc:int(-139361039))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(641), ldc:int(9)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1546915998))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-599888113))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(2101425221))
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(865616645))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0587)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1995641016))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0587)
                            }
                            
                            goto(Label_0844)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(385440575))
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1476572843))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1101908741))
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(626000815))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-938028123))
                        goto(Label_0844)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-354216871))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-71973893))
                            var_11_EB = and:int(ldc:int(-8270), ldc:int(8269))
                            goto(Label_1596)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0587:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1607)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1475201385))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1135961055))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-810414225))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(893740234))
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(2146641661))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0844)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1607)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1207422147))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(730067766))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(877635032))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0587)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1275654882))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1607721709))
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-138698568))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0844:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1394999901))
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-61758016))
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(361249816))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1997500067))
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-2056858209))
                            goto(Label_0587)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1332223789))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-88663627))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(2049), ldc:int(24675))
                                goto(Label_1157)
                            }
                        }
                    }
                    
                    Label_0983:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(563152028))
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-696008698))
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-186744417))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-344169822))
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1179875302))
                            goto(Label_0587)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1401157488))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-72367942))
                        var_11_EB = and:int(ldc:int(-21723), ldc:int(17626))
                    }
                    
                    Label_1157:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1800078169))
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(423622187))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(156592993))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(131788049))
                            goto(Label_0983)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0844)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(719644135))
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1219673363))
                            goto(Label_0587)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-422222509))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1500158262))
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-17059846))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1438)
                            }
                        }
                    }
                    
                    Label_1314:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(85303954))
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1157)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1037503568))
                            goto(Label_0587)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1123802481))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1995382774))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1596)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1438:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1233977488))
                        goto(Label_1607)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1143730247))
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(2068037397))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1578855800))
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(231478072))
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(307605659))
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0587)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(151098666))
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-72749896))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1596:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CB = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1607:
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(809385897))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1050624195))
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1534141393))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-344258461))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0587)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(2074301361))
                        var_17_6CB = add:int(var_16_119:int, and:int(ldc:int(12341), ldc:int(1163)))
                        looporswitchbreak()
                    }
                    
                    var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-880094054))
                }
                
                var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-72670275))
                
                if (cmple:boolean(var_5_8A = var_17_6CB:int, sub:int(var_6_91:int, and:int(ldc:int(99), ldc:int(3585))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
