public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u392e\u873d\u0b8e\u2dcc\u7006 {
    public void \u392e\u873d\u0b8e\u2dcc\u7006(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u4e72\ua6bd\u927d\uc238\ub8be p0) {
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
            putfield:\u4e72\ua6bd\u927d\uc238\ub8be(\u392e\u873d\u0b8e\u2dcc\u7006::\u3e75\u5140\uf9c5\ub70c\ubcb0, this:\u392e\u873d\u0b8e\u2dcc\u7006, p0:\u4e72\ua6bd\u927d\uc238\ub8be)
            invokespecial:Object(Object::<init>, this:\u392e\u873d\u0b8e\u2dcc\u7006)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int compare(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a p1) {
        var_5_64 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_6_6A : \u7d52\u718f\u3776\u6fb0\ub83f
        var_7_77 : boolean
        var_8_84 : boolean
        
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
        var_5_64 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, p0:\u8640\ud7e8\u8308\u4bc8\uc29a)
        var_6_6A = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, p1:\u8640\ud7e8\u8308\u4bc8\uc29a)
        var_7_77 = invokevirtual:boolean(\u7873\u4d85\u836c\ubff1\ubf56::\u946b\u3776\ufcaf\u7330\u1833, invokevirtual:\u7873\u4d85\u836c\ubff1\ubf56(\u6b0d\ua068\uc4d2\u5245\u4d85::\u760c\u98a4\u7c6b\u0b8e\u983f, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_5_64:\u7d52\u718f\u3776\u6fb0\ub83f)
        var_8_84 = invokevirtual:boolean(\u7873\u4d85\u836c\ubff1\ubf56::\u946b\u3776\ufcaf\u7330\u1833, invokevirtual:\u7873\u4d85\u836c\ubff1\ubf56(\u6b0d\ua068\uc4d2\u5245\u4d85::\u760c\u98a4\u7c6b\u0b8e\u983f, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_6_6A:\u7d52\u718f\u3776\u6fb0\ub83f)
        
        if (logicaland:boolean(var_7_77:boolean, logicalnot:boolean(var_8_84:boolean))) {
            return:int(ldc:int(-1))
        }
        
        if (logicaland:boolean(var_7_77:boolean, var_8_84:boolean)) {
            return:int(and:int(ldc:int(12436), ldc:int(-12439)))
        }
        
        return:int(xor:int(ldc:int(8840), ldc:int(8841)))
    }
    
    public int compare(java.lang.Object p0, java.lang.Object p1) {
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
            return:int(invokevirtual:int(\u392e\u873d\u0b8e\u2dcc\u7006::compare, this:\u392e\u873d\u0b8e\u2dcc\u7006, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, p0:Object[expected:\u8640\ud7e8\u8308\u4bc8\uc29a]), checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, p1:Object[expected:\u8640\ud7e8\u8308\u4bc8\uc29a])))
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
    
    public void \u516c\uc7fe\uc246\u97b7\ud523(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F0 : int
        
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
        var_3_5E5 = and:int(ldc:int(-792956490), ldc:int(2025642934))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u392e\u873d\u0b8e\u2dcc\u7006[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1535989622))
            var_5_7D = and:int(ldc:int(-32068), ldc:int(32066))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-909), ldc:int(908)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5E5:int, ldc:int(1357321086))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-32220), ldc:int(-32219)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(5120), ldc:int(5121)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_D2:int, ldc:int(-792373253))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(4117), ldc:int(8321)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1870951725))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1990792692))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1245818776))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-216530291))
                    }
                    else {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-90292965))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1085691276))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1871847903))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2011969366))
                            var_11_E3 = and:int(ldc:int(2408), ldc:int(-22905))
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(601038715))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1407553539))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-841709006))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1213725944))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1341588830))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1576318967))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1982227144))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-867652552))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1349733725))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-204210352))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(386831865))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-89362146))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-223012695))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2012375139))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-232926978))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-376730871))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-688931502))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(2049), ldc:int(2048))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-967998720))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1531866749))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1434982577))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1372638513))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2056624978))
                        var_11_E3 = and:int(ldc:int(-13326), ldc:int(5133))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1823230220))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1473961840))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-115126389))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1927068743))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1258399794))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1372887387))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2017968778))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1615833987))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-126141525))
                            goto(Label_1027)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1681650637))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-276422416))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-140701226))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1399)
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(721587966))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(87265198))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(414135792))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1077105014))
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2109594963))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1626722576))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(228593462))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1670165283))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-556515341))
                        var_17_5F0 = add:int(var_16_111:int, xor:int(ldc:int(-32256), ldc:int(-32255)))
                        looporswitchbreak()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-629691528))
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1592170906))
                
                if (cmple:boolean(var_5_7D = var_17_5F0:int, sub:int(var_6_84:int, and:int(ldc:int(12305), ldc:int(18979))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(812243642))
            goto(Label_0106)
        }
    }
}
