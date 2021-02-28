public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae {
    public void \u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae(java.lang.String p0, java.lang.Runnable p1, java.lang.Runnable p2, boolean p3) {
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
            invokespecial:\u9033\u12b2\u516c\u97e6\u6d99\ua3b4(\u9033\u12b2\u516c\u97e6\u6d99\ua3b4::<init>, this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae, p0:String, p1:Runnable, p2:Runnable)
            putfield:boolean(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::\u946b\ud51e\u6c52\u8aa5\u7ce1\u64f2, this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae, p3:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        var_2_D4 : int
        stack_EF_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(1892534491), ldc:int(-122170209))
        
        if (cmpeq:boolean(this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(20765), ldc:int(161)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                var_2_D4 = and:int(var_2_5F:int, ldc:int(605620777))
            }
            else {
                var_2_D4 = and:int(var_2_5F:int, ldc:int(-90208546))
                
                if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                    if (cmpeq:boolean(invokevirtual:Class<? extends \u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae>(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::getClass, this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                        if (cmpne:boolean(getfield:boolean(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::\u946b\ud51e\u6c52\u8aa5\u7ce1\u64f2, this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae), getfield:boolean(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::\u946b\ud51e\u6c52\u8aa5\u7ce1\u64f2, checkcast:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae.class, p0:Object[expected:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae])))) {
                            var_2_D4 = and:int(var_2_D4:int, ldc:int(-241212786))
                            stack_EF_0 = and:int(ldc:int(4548), ldc:int(-4549))
                        }
                        else {
                            stack_EF_0 = xor:int(ldc:int(-24571), ldc:int(-24572))
                        }
                        
                        return:boolean(stack_EF_0:int)
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_D4:int, ldc:int(8192)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-18191), ldc:int(17422)))
            }
            
            var_2_5F = and:int(var_2_D4:int, ldc:int(-1249619387))
        }
    }
    
    public int hashCode() {
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
            return:int(invokestatic:int(Boolean::hashCode, getfield:boolean(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::\u946b\ud51e\u6c52\u8aa5\u7ce1\u64f2, this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::\ub83f\ub19c\u8350\u759a\u071d\u3504, this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae)), ldc:char(91)), getfield:boolean(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::\u946b\ud51e\u6c52\u8aa5\u7ce1\u64f2, this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae)), ldc:char(93))))
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
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(1772500422), ldc:int(-310947392))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1953174143))
        }
        else {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1957276769))
            var_5_85 = and:int(ldc:int(17080), ldc:int(-21433))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22495), ldc:int(6096)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5DD:int, ldc:int(220158407))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(28961), ldc:int(1753)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(21506), ldc:int(21507)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_DA:int, ldc:int(-819530298))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16553), ldc:int(13057)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-527575992))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1097063884))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(789343785))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1830802049))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(976749855))
                    }
                    else {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-374409803))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(835852868))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-309241889))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-23225293))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-720507070))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-292530277))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1570232800))
                        var_11_EB = and:int(ldc:int(-9564), ldc:int(9499))
                        goto(Label_1399)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1836511415))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1778891241))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(130453654))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1253835667))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1838027257))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(589117623))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1501862137))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(2048407766))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(95698357))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1300716973))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1513345443))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1959207314))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1065208832))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1355365266))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(655364648))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-282078816))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(1170), ldc:int(1171))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1579764359))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1293710476))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(2136138070))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1331370687))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1278187041))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2039373763))
                        var_11_EB = and:int(ldc:int(25618), ldc:int(-25619))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1869675565))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-902247643))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(53424457))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(690289747))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1566238838))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(501619632))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1069752166))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(210579581))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-807462492))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1143008400))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1925547484))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1087424053))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1580165944))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2063807326))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2044630446))
                        var_17_5E8 = add:int(var_16_119:int, xor:int(ldc:int(-32712), ldc:int(-32711)))
                        looporswitchbreak()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(1428389995))
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(1073110472))
                
                if (cmple:boolean(var_5_85 = var_17_5E8:int, sub:int(var_6_8C:int, and:int(ldc:int(9857), ldc:int(2305))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1699802556))
            goto(Label_0106)
        }
    }
}
