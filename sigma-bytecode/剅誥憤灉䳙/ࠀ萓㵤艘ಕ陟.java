public class \u5245\u8aa5\u61a4\u7049\u4cd9.\u0800\u8413\u3d64\u8258\u0c95\u965f {
    public void \u0800\u8413\u3d64\u8258\u0c95\u965f(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u983f\ucfaf\u927d\u93a2\ubded\u873d p0) {
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
            putfield:\u983f\ucfaf\u927d\u93a2\ubded\u873d(\u0800\u8413\u3d64\u8258\u0c95\u965f::\uc84e\uf995\uc2bd\u3bc9\u98a4\u416d, this:\u0800\u8413\u3d64\u8258\u0c95\u965f, p0:\u983f\ucfaf\u927d\u93a2\ubded\u873d)
            invokespecial:Object(Object::<init>, this:\u0800\u8413\u3d64\u8258\u0c95\u965f)
            putfield:ArrayList<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>(\u0800\u8413\u3d64\u8258\u0c95\u965f::\u7043\uceb8\u74b1\uc4d2\u51fa\u8c8a, this:\u0800\u8413\u3d64\u8258\u0c95\u965f, initobject:ArrayList<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>(ArrayList<E>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_CD : int
        var_3_FE : long
        var_5_10B : Iterator<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>
        var_6_149 : \u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6
        
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
            var_1_CD = and:int(ldc:int(-984254456), ldc:int(-1487587021))
            
            loop {
                Label_0096:
                
                if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0397)
                }
                
                if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(64)), ldc:int(0))) {
                    var_1_CD = and:int(var_1_CD:int, ldc:int(-642256736))
                    goto(Label_0194)
                }
                
                if (cmpeq:boolean(and:int(var_1_CD:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_CD = and:int(var_1_CD:int, ldc:int(378460525))
                }
                else {
                    var_1_CD = and:int(var_1_CD:int, ldc:int(-750932856))
                    invokevirtual:void(ArrayList<E>::clear, getfield:ArrayList<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>(\u0800\u8413\u3d64\u8258\u0c95\u965f::\u7043\uceb8\u74b1\uc4d2\u51fa\u8c8a, this:\u0800\u8413\u3d64\u8258\u0c95\u965f))
                }
                
                try {
                    Label_0145:
                    
                    while (cmpne:boolean(and:int(var_1_CD:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_1_CD = and:int(var_1_CD:int, ldc:int(-741643760))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(16)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_1_CD = and:int(var_1_CD:int, ldc:int(-738199474))
                            invokevirtual:boolean(ArrayList<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>::addAll, getfield:ArrayList<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>(\u0800\u8413\u3d64\u8258\u0c95\u965f::\u7043\uceb8\u74b1\uc4d2\u51fa\u8c8a, this:\u0800\u8413\u3d64\u8258\u0c95\u965f), invokevirtual:Collection<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>(\u983f\ucfaf\u927d\u93a2\ubded\u873d::\ud7e8\u760c\u3776\u97e6\u67e9\u156b, getfield:\u983f\ucfaf\u927d\u93a2\ubded\u873d(\u0800\u8413\u3d64\u8258\u0c95\u965f::\uc84e\uf995\uc2bd\u3bc9\u98a4\u416d, this:\u0800\u8413\u3d64\u8258\u0c95\u965f)))
                        }
                        
                        Label_0194:
                        
                        if (cmpeq:boolean(and:int(var_1_CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Block_13)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Block_14)
                        }
                    }
                    
                    goto(Label_0397)
                    Block_13:
                    var_1_CD = and:int(var_1_CD:int, ldc:int(126973409))
                    goto(Label_0397)
                    Block_14:
                    
                    if (cmpeq:boolean(and:int(var_1_CD:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_CD = and:int(var_1_CD:int, ldc:int(-394595443))
                        loopcontinue()
                    }
                    
                    var_1_CD = and:int(var_1_CD:int, ldc:int(-744543656))
                    var_3_FE = d2l:long(sub:double(l2d:double(invokestatic:long(System::nanoTime)), mul:double(l2d:double(invokestatic:long(\u983f\ucfaf\u927d\u93a2\ubded\u873d::\u7006\u69d9\u4c04\u7e3f\ud51e\u12b2, getfield:\u983f\ucfaf\u927d\u93a2\ubded\u873d(\u0800\u8413\u3d64\u8258\u0c95\u965f::\uc84e\uf995\uc2bd\u3bc9\u98a4\u416d, this:\u0800\u8413\u3d64\u8258\u0c95\u965f))), ldc:double(1.5))))
                    var_1_CD = and:int(var_1_CD:int, ldc:int(-71357234))
                    var_5_10B = invokevirtual:Iterator<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>(ArrayList<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>::iterator, getfield:ArrayList<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>(\u0800\u8413\u3d64\u8258\u0c95\u965f::\u7043\uceb8\u74b1\uc4d2\u51fa\u8c8a, this:\u0800\u8413\u3d64\u8258\u0c95\u965f))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_CD:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_CD = and:int(var_1_CD:int, ldc:int(-478087951))
                        }
                        else {
                            var_1_CD = and:int(var_1_CD:int, ldc:int(-686428269))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_10B:Iterator))) {
                                looporswitchbreak()
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_CD = and:int(var_1_CD:int, ldc:int(1924800302))
                        }
                        else {
                            var_1_CD = and:int(var_1_CD:int, ldc:int(-1791152783))
                            var_6_149 = checkcast:\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6(\u5d20\u7043\u88c5\u5db4\uf94d.\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6.class, invokeinterface:\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6(Iterator<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>::next, var_5_10B:Iterator<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_CD = and:int(var_1_CD:int, ldc:int(-1388728350))
                                }
                                else {
                                    var_1_CD = and:int(var_1_CD:int, ldc:int(-204001955))
                                    invokestatic:void(\u983f\ucfaf\u927d\u93a2\ubded\u873d::\ud36e\u183a\u8413\u8753\ub18d\uae87, getfield:\u983f\ucfaf\u927d\u93a2\ubded\u873d(\u0800\u8413\u3d64\u8258\u0c95\u965f::\uc84e\uf995\uc2bd\u3bc9\u98a4\u416d, this:\u0800\u8413\u3d64\u8258\u0c95\u965f), var_6_149:\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6, var_3_FE:long)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_CD:int, ldc:int(33554432)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_1_CD = and:int(var_1_CD:int, ldc:int(-184298324))
                            }
                            
                            var_1_CD = and:int(var_1_CD:int, ldc:int(-1313494119))
                        }
                    }
                }
                catch (java.lang.Exception stack_18B_0) {
                }
                
                Label_0397:
                
                if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_CD = and:int(var_1_CD:int, ldc:int(-926400685))
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_CD = and:int(var_1_CD:int, ldc:int(-262208668))
                    goto(Label_0145)
                }
                
                if (cmpeq:boolean(and:int(var_1_CD:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_CD = and:int(var_1_CD:int, ldc:int(-725095147))
            }
            
            invokevirtual:void(ArrayList<E>::clear, getfield:ArrayList<\u69d9\u8c8a\u99f7\u4ab3\ube23\u97e6>(\u0800\u8413\u3d64\u8258\u0c95\u965f::\u7043\uceb8\u74b1\uc4d2\u51fa\u8c8a, this:\u0800\u8413\u3d64\u8258\u0c95\u965f))
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
    
    public void \u3d64\u6bb9\ub113\u6c56\u0800\ubb2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_622 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_62D : int
        
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
        var_3_622 = and:int(ldc:int(454629902), ldc:int(-1699783783))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0800\u8413\u3d64\u8258\u0c95\u965f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_622 = and:int(var_3_622:int, ldc:int(2050560454))
        }
        else {
            var_3_622 = and:int(var_3_622:int, ldc:int(-1102096743))
            var_5_85 = and:int(ldc:int(8853), ldc:int(-9878))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30442), ldc:int(18081)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_622:int, ldc:int(1048441374))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(2667), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4129), ldc:int(10561)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_622 = and:int(var_3_DA:int, ldc:int(-14977427))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32616), ldc:int(-32615)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-17926770))
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-864404887))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1505118602))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1759490577))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(2130698156))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1872637116))
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1917082175))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1077552494))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(2038202366))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-562500142))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(457576289))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-539239671))
                            var_11_EB = and:int(ldc:int(28852), ldc:int(-29877))
                            goto(Label_1446)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1456980083))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-2140463994))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1841426799))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(1580971550))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-877842296))
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(545168724))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-806553197))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-628062906))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-2134926976))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(2075103966))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1188287213))
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(134999501))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-839965731))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-381242821))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1602928421))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(1591680649))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(101), ldc:int(1297))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(889600794))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1145652756))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(20575912))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1195101230))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(995041215))
                        var_11_EB = and:int(ldc:int(-17914), ldc:int(1273))
                    }
                    
                    Label_1059:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1375340809))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1092008249))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(730612662))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(490432026))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1892713038))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1682073048))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1180:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(2002272219))
                            goto(Label_1059)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1890193907))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(117008220))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-192299076))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(1597870814))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1446)
                    }
                    
                    Label_1308:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1406865381))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(623644743))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1697163501))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-396050663))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-673046764))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_622 = and:int(var_3_622:int, ldc:int(-1075855635))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1446:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1457:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-289550787))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(321812424))
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1658773086))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-129312974))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1254461973))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(525933262))
                        var_17_62D = add:int(var_16_119:int, and:int(ldc:int(21121), ldc:int(8457)))
                        looporswitchbreak()
                    }
                }
                
                var_3_622 = and:int(var_3_622:int, ldc:int(-1617053127))
                
                if (cmple:boolean(var_5_85 = var_17_62D:int, sub:int(var_6_8C:int, and:int(ldc:int(9729), ldc:int(16501))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
            var_3_622 = and:int(var_3_622:int, ldc:int(2105898499))
            goto(Label_0106)
        }
    }
}
