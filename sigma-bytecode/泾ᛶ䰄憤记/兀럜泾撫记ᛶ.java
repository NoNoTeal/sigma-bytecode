public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6 {
    public void \u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6() {
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
            invokespecial:Object(Object::<init>, this:\u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ud12e\u7c6b\u36d3\u5fe1\u64ab\u3bd6(java.lang.String p0, long p1) {
        var_3_64 : int
        var_5_69 : Map<String, Long>
        var_6_74 : long
        var_8_87 : Long
        var_9_1AF : long
        stack_2A7_0 : int [generated]
        stack_24F_0 : int [generated]
        
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
        var_3_64 = and:int(and:int(ldc:int(1072708227), ldc:int(-570868242)), ldc:int(-46778441))
        monitorenter(var_5_69 = getstatic:Map<String, Long>(\u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6::\ube23\u59ec\ucb79\ub7dc\u4ab3\u16f6))
        
        try {
            var_3_64 = and:int(var_3_64:int, ldc:int(-1118668873))
            var_6_74 = invokestatic:long(System::currentTimeMillis)
            var_3_64 = and:int(var_3_64:int, ldc:int(-551847997))
            var_8_87 = checkcast:Long(java.lang.Long.class, invokeinterface:Long(Map<String, Long>::get, getstatic:Map<String, Long>(\u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6::\ube23\u59ec\ucb79\ub7dc\u4ab3\u16f6), p0:String[expected:Object]))
            
            loop {
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0385)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1153074924))
                    goto(Label_0316)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(32)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(2047782973))
                    goto(Label_0248)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(928214773))
                }
                else {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1058451946))
                    
                    if (cmpne:boolean(var_8_87:Long, aconstnull:Long())) {
                        goto(Label_0385)
                    }
                }
                
                Label_0199:
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0385)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-343429209))
                    goto(Label_0316)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-865256308))
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1653065574))
                }
                
                Label_0248:
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-214928478))
                    goto(Label_0385)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(64)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1199678217))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-1612293525))
                        goto(Label_0199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(-34113306))
                    var_8_87 = initobject:Long(Long::<init>, var_6_74:long)
                }
                
                Label_0316:
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-2010298591))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-1726430193))
                        goto(Label_0248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-1890797942))
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1086982993))
                    invokeinterface:Long(Map<String, Long>::put, getstatic:Map<String, Long>(\u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6::\ube23\u59ec\ucb79\ub7dc\u4ab3\u16f6), p0:String, var_8_87:Long)
                }
                
                Label_0385:
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0316)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0248)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0199)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_64 = and:int(var_3_64:int, ldc:int(704223649))
            }
            
            var_3_64 = and:int(var_3_64:int, ldc:int(1029503406))
            var_9_1AF = invokevirtual:long(Long::longValue, var_8_87:Long)
            
            loop {
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0615)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(811319491))
                    goto(Label_0527)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-501943096))
                }
                else {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-546295622))
                    
                    if (cmpge:boolean(var_6_74:long, add:long(var_9_1AF:long, p1:long))) {
                        invokeinterface:Long(Map<String, Long>::put, getstatic:Map<String, Long>(\u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6::\ube23\u59ec\ucb79\ub7dc\u4ab3\u16f6), p0:String, initobject:Long(Long::<init>, var_6_74:long))
                        goto(Label_0615)
                    }
                }
                
                Label_0485:
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1505567221))
                    goto(Label_0615)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(1126753080))
                        loopcontinue()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(-579128409))
                }
                
                Label_0527:
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1109539887))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(2146807959))
                        stack_2A7_0 = stack_24F_0 = and(ldc(-22537), ldc(22536))
                        monitorexit(var_5_69:Map<String, Long>)
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0615:
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1530820304))
                    goto(Label_0527)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(16)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(235688912))
                    goto(Label_0485)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-574784337))
                    stack_2A7_0 = stack_24F_0 = and(ldc(257), ldc(17537))
                    monitorexit(var_5_69:Map<String, Long>)
                    goto(Label_0667)
                }
            }
            
            Label_0571:
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(64)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(536329362))
                return:boolean(stack_24F_0:boolean)
            }
            
            var_3_64 = and:int(var_3_64:int, ldc:int(1061700292))
            Label_0667:
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(131072)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(1070890943))
                return:boolean(stack_2A7_0:int)
            }
            
            goto(Label_0571)
        }
        finally {
            monitorexit(var_5_69:Map<String, Long>)
        }
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
            putstatic:Map<String, Long>(\u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6::\ube23\u59ec\ucb79\ub7dc\u4ab3\u16f6, initobject:HashMap<String, Long>[expected:Map<String, Long>](HashMap<K, V>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua61f\u51b2\ud51e\ub32d\u4e72\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_626 : int
        
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
        var_3_61B = and:int(ldc:int(1394310870), ldc:int(1919155927))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\ub7dc\u6cfe\u64ab\u8bb0\u16f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(1800918392))
        }
        else {
            var_3_61B = and:int(var_3_61B:int, ldc:int(-26120201))
            var_5_85 = and:int(ldc:int(3489), ldc:int(-3490))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15602), ldc:int(5361)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61B:int, ldc:int(-20910506))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(16913), ldc:int(1025)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(2244), ldc:int(2245)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61B = and:int(var_3_D2:int, ldc:int(1446149719))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(16720), ldc:int(16721)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1179241880))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1933733814))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1974685513))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-635701674))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1810088959))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-880945913))
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1604048264))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1464008756))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1467791166))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-2855330))
                        var_11_E3 = and:int(ldc:int(8359), ldc:int(-10680))
                        goto(Label_1457)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1602334487))
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-721683769))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1314927581))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1776879370))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-143570399))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(505953857))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-691181706))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(106156959))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(725298862))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1994586685))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(492734923))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-2140126775))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-163875081))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(138560827))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-933964044))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-2023434732))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(2030528443))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1062524429))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-685998210))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(5129), ldc:int(24833))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1871418052))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-854453205))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(366823197))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1256296541))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(2085997236))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-679350698))
                        var_11_E3 = and:int(ldc:int(28096), ldc:int(-28129))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-479480681))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1732292344))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-927225336))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2131656574))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1302)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1127953689))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-797268796))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-276096670))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-150801717))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1155446590))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1474230110))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1457)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1302:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1936915206))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1182897148))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(109519131))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1591634452))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-2081237176))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1150956026))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1722540479))
                        loopcontinue()
                    }
                    
                    var_3_61B = and:int(var_3_61B:int, ldc:int(-745504802))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1457:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_626 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1468:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-189584451))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-488658039))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1562038009))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2127292246))
                        var_17_626 = add:int(var_16_111:int, xor:int(ldc:int(553), ldc:int(552)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61B = and:int(var_3_61B:int, ldc:int(1384281855))
                
                if (cmple:boolean(var_5_85 = var_17_626:int, sub:int(var_6_8C:int, xor:int(ldc:int(8193), ldc:int(8192))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
