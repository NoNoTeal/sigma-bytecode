public abstract class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\ufcaf\ubf56\uc246\u3711\u5140\uc238 {
    public void \ufcaf\ubf56\uc246\u3711\u5140\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1 p0) {
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
        invokespecial:Object(Object::<init>, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238)
        
        if (cmpne:boolean(p0:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1, aconstnull:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1())) {
            putfield:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1(\ufcaf\ubf56\uc246\u3711\u5140\uc238::\u6b5f\ud51e\u8308\u7006\ud217\ucfaf, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238, p0:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("delegate == null")))
    }
    
    public final \u6ec6\ubb2b\uf94d\u6d99\u4f52.\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1 \ub83f\u67e9\ub7dc\ub19c\uc3e3\ud7e8() {
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
            return:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1(getfield:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1(\ufcaf\ubf56\uc246\u3711\u5140\uc238::\u6b5f\ud51e\u8308\u7006\ud217\ucfaf, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238))
        }
        
        goto(Label_0006)
    }
    
    public long \ua068\u873d\ucef1\u3e2a\u446c\u74b1(\u3d64\u7af6\uae87\uc238\u7d52.\u3711\u34df\ubded\u3d64\u494c\u6198 p0, long p1) {
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
            return:long(invokeinterface:long(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::\ua068\u873d\ucef1\u3e2a\u446c\u74b1, getfield:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1(\ufcaf\ubf56\uc246\u3711\u5140\uc238::\u6b5f\ud51e\u8308\u7006\ud217\ucfaf, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238), p0:\u3711\u34df\ubded\u3d64\u494c\u6198, p1:long))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe \u3e2a\ub32d\uc29a\ub83f\u9937\u927d() {
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
            return:\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe(invokeinterface:\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::\u3e2a\ub32d\uc29a\ub83f\u9937\u927d, getfield:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1(\ufcaf\ubf56\uc246\u3711\u5140\uc238::\u6b5f\ud51e\u8308\u7006\ud217\ucfaf, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238)))
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            invokeinterface:void(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::close, getfield:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1(\ufcaf\ubf56\uc246\u3711\u5140\uc238::\u6b5f\ud51e\u8308\u7006\ud217\ucfaf, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238))
            return:void()
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(Class<T>::getSimpleName, invokevirtual:Class<? extends \ufcaf\ubf56\uc246\u3711\u5140\uc238>(\ufcaf\ubf56\uc246\u3711\u5140\uc238::getClass, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238))), ldc:String("(")), invokevirtual:String(Object::toString, getfield:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1[expected:Object](\ufcaf\ubf56\uc246\u3711\u5140\uc238::\u6b5f\ud51e\u8308\u7006\ud217\ucfaf, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238))), ldc:String(")"))))
        }
        
        goto(Label_0006)
    }
    
    public void \u67e9\u0b8e\ufe34\ud523\u4d85\u4daf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_5E5 = and:int(ldc:int(1784556007), ldc:int(-591495169))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufcaf\ubf56\uc246\u3711\u5140\uc238[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-787626582))
        }
        else {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-903872651))
            var_5_85 = and:int(ldc:int(-5836), ldc:int(5833))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3464), ldc:int(-3465)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5E5:int, ldc:int(-843134467))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(-11776), ldc:int(-11775)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1152), ldc:int(1153)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_DA:int, ldc:int(-597816851))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1117), ldc:int(35)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-910860818))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-796056284))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(364138961))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2052851383))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1671188750))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-642263410))
                    }
                    else {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1574935917))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1885572464))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-629031505))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1780216030))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(173666116))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1218445165))
                        var_11_EB = and:int(ldc:int(10337), ldc:int(-10338))
                        goto(Label_1399)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1793635629))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1144158790))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-275382423))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-536941705))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(290311108))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-407549929))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1764368352))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(187617021))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-323057169))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1974352467))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1467661326))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1231423926))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1463069499))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-42115096))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1545510383))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(8211), ldc:int(8210))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1097770057))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-557495265))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1853645006))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2044599661))
                        var_11_EB = and:int(ldc:int(24626), ldc:int(-24627))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-226404191))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(542063357))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1048518392))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1188788671))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1841277797))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(462285415))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-655400259))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(917923321))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(810912381))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1811822965))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-389227748))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1078193282))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(476739965))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-413700102))
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1782503791))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(109334100))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2011705414))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1147496693))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2028910993))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1249841013))
                        var_17_5F0 = add:int(var_16_119:int, and:int(ldc:int(10241), ldc:int(5153)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-891367563))
                
                if (cmple:boolean(var_5_85 = var_17_5F0:int, sub:int(var_6_8C:int, xor:int(ldc:int(136), ldc:int(137))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(381162316))
            goto(Label_0106)
        }
    }
}
