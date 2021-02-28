public interface \u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3 {
    int \u67e9\u16f6\uc7fe\uc238\u7e3f\ubff1();
    
    \u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3 \u7ce1\u183a\u8413\u5f50\uae5d\u6cfe();
    
    java.lang.String \u9af2\u92ee\u8640\ua562\u5bc4\ud523();
    
    boolean \u071d\u3e2a\u960f\u983f\ub70c\uafe7(\u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3[] p0) {
        var_2_5F : int
        var_5_66 : int
        var_6_6F : int
        
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
        var_2_5F = and:int(ldc:int(2128661851), ldc:int(-53958805))
        var_5_66 = arraylength:int(p0:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3[])
        var_6_6F = and:int(ldc:int(2892), ldc:int(-2893))
        
        loop {
            var_2_5F = and:int(var_2_5F:int, ldc:int(922586443))
            
            if (cmpge:boolean(var_6_6F:int, var_5_66:int)) {
                return:boolean(and:int[expected:boolean](ldc:int(977), ldc:int(-3040)))
            }
            
            if (invokeinterface:boolean(\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3::\u071d\u3e2a\u960f\u983f\ub70c\uafe7, this:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3, loadelement:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3(p0:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3[], var_6_6F:int))) {
                return:boolean(xor:int[expected:boolean](ldc:int(2098), ldc:int(2099)))
            }
            
            inc:int(var_6_6F, ldc:int(1))
        }
    }
    
    boolean \u071d\u3e2a\u960f\u983f\ub70c\uafe7(\u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3 p0) {
        var_2_5F : int
        stack_84_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(260748305), ldc:int(1061486294))
            
            if (cmpne:boolean(this:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3, p0:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-351423049))
                stack_84_0 = and:int(ldc:int(-32226), ldc:int(32161))
            }
            else {
                stack_84_0 = xor:int(ldc:int(-32320), ldc:int(-32319))
            }
            
            return:boolean(stack_84_0:int)
        }
        
        goto(Label_0006)
    }
    
    boolean \u8753\u6c56\u8bb0\uf995\u416d\uc910(\u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3 p0) {
        var_2_5F : int
        var_4_61 : \ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3
        var_2_67 : int
        
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
        var_2_5F = and:int(ldc:int(1948675311), ldc:int(2134539765))
        var_4_61 = this:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3
        
        loop {
            var_2_67 = and:int(var_2_5F:int, ldc:int(1743900101))
            
            if (invokevirtual:boolean(Object::equals, var_4_61:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3[expected:Object], p0:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3[expected:Object])) {
                return:boolean(xor:int[expected:boolean](ldc:int(9250), ldc:int(9251)))
            }
            
            var_2_5F = and:int(var_2_67:int, ldc:int(-1079620627))
            var_4_61 = invokeinterface:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3(\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3::\u7ce1\u183a\u8413\u5f50\uae5d\u6cfe, var_4_61:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3)
            
            if (cmpne:boolean(var_4_61:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3, aconstnull:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3())) {
                loopcontinue()
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(5276), ldc:int(-5277)))
        }
    }
}
