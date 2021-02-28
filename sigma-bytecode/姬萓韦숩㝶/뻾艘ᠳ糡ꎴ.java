public class \u59ec\u8413\u97e6\uc229\u3776.\ubefe\u8258\u1833\u7ce1\ua3b4 {
    public void \ubefe\u8258\u1833\u7ce1\ua3b4(\u5d20\u97b7\u8753\u873d\u16f6.\u624e\u446c\u62da\uc2bd\u4179 p0, java.lang.String p1) {
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
        invokespecial:Object(Object::<init>, this:\ubefe\u8258\u1833\u7ce1\ua3b4)
        invokestatic:void(ARBShaderObjects::glShaderSourceARB, putfield:int(\ubefe\u8258\u1833\u7ce1\ua3b4::\uafe7\uc229\ubefe\u64ab\ub102, this:\ubefe\u8258\u1833\u7ce1\ua3b4, invokestatic:int(ARBShaderObjects::glCreateShaderObjectARB, getfield:int(\u624e\u446c\u62da\uc2bd\u4179::\u74b1\u8cae\u3d4b\u873d\uc910, p0:\u624e\u446c\u62da\uc2bd\u4179))), p1:String[expected:CharSequence])
        invokestatic:void(ARBShaderObjects::glCompileShaderARB, getfield:int(\ubefe\u8258\u1833\u7ce1\ua3b4::\uafe7\uc229\ubefe\u64ab\ub102, this:\ubefe\u8258\u1833\u7ce1\ua3b4))
        
        if (cmpeq:boolean(invokestatic:int(ARBShaderObjects::glGetObjectParameteriARB, getfield:int(\ubefe\u8258\u1833\u7ce1\ua3b4::\uafe7\uc229\ubefe\u64ab\ub102, this:\ubefe\u8258\u1833\u7ce1\ua3b4), ldc:int(35713)), ldc:int(0))) {
            return:void()
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, invokestatic:String(ARBShaderObjects::glGetInfoLogARB, getfield:int(\ubefe\u8258\u1833\u7ce1\ua3b4::\uafe7\uc229\ubefe\u64ab\ub102, this:\ubefe\u8258\u1833\u7ce1\ua3b4))))
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
    
    public void \uae5d\u64ab\u6d69\ud12e\u5db4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5BD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5C8 : int
        
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
        var_3_5BD = and:int(ldc:int(-1066275918), ldc:int(-131404936))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubefe\u8258\u1833\u7ce1\ua3b4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1580420605))
            var_5_7D = and:int(ldc:int(23723), ldc:int(-31920))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14083), ldc:int(-14152)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5BD:int, ldc:int(-18035720))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(20485), ldc:int(20484)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(3), ldc:int(2161)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5BD = and:int(var_3_CA:int, ldc:int(1119223730))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16433), ldc:int(16432)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(188765516))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2077671488))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(288808534))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1294653715))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1974649271))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(233242283))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1624951737))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-881120466))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-2054293497))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-969801871))
                        var_11_DB = and:int(ldc:int(-13419), ldc:int(13418))
                        goto(Label_1359)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-163092624))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1126729742))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(483786880))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-2115126751))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1165417946))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1144278037))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(807016493))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-924135595))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1172294719))
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1009470739))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-150067344))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-608581594))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-312117675))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(14255905))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1323593077))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(4115), ldc:int(19393))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1152918165))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-30637208))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-705896643))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1380896613))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1870121264))
                        var_11_DB = and:int(ldc:int(-17463), ldc:int(17462))
                    }
                    
                    Label_1019:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1190672034))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1083782765))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1413340021))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1236)
                            }
                        }
                    }
                    
                    Label_1114:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-737284353))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-300351127))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(120694143))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(265152911))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1261403600))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1359)
                    }
                    
                    Label_1236:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1213277949))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-308657784))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1970339657))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-379210576))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(1252641556))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1359:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1370:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1335724754))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1856667202))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-868054774))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1552694256))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-39039073))
                        var_17_5C8 = add:int(var_16_109:int, xor:int(ldc:int(-24540), ldc:int(-24539)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5BD = and:int(var_3_5BD:int, ldc:int(-383202372))
                
                if (cmple:boolean(var_5_7D = var_17_5C8:int, sub:int(var_6_84:int, and:int(ldc:int(17153), ldc:int(3233))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
